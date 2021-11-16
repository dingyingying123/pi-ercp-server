/**
 * Created by hufy on 2016/12/21.
 */
(function($) {
    $.fn.DataTableExt = function(options, editOpts) {
        var $this = this;
        var editSetting = {
            page: true,
            pageSize: 10,
            edit_row: null,
            delete_row: null,
            load_url: null,
            add_url: null,
            update_url: null,
            delete_url: null,
            edit_template: null,
            after_update_edit: null,
            after_addRow: null,
        }
        $.extend(editSetting, editOpts);

        //        $this.addClass("row-border");
        var initDataTable = function(opts) {
            var defaults = {
                "bPaginate": false,
                "bInfo": false,
                "bFilter": false,
                "bDeferRender": true,
                "bSort": false,
                "autoWidth": false,
                "order": [],
                "oLanguage": {
                    "sLengthMenu": "每页显示 _MENU_ 条记录",
                    "sZeroRecords": "对不起，没有匹配的数据",
                    "sInfo": "第 _START_ - _END_ 条 / 共 _TOTAL_ 条数据",
                    "sInfoEmpty": "没有匹配的数据",
                    "sInfoFiltered": "(数据表中共 _MAX_ 条记录)",
                    "sProcessing": "正在加载中...",
                    "sSearch": "全文搜索：",
                    "oPaginate": {
                        "sFirst": "第一页",
                        "sPrevious": " 上一页 ",
                        "sNext": " 下一页 ",
                        "sLast": " 最后一页 "
                    }
                },
            };
            $.extend(defaults, opts);
            //初始化DataTable
            $this.DataTable = $this.DataTable(defaults);

            $this.find("thead th #select_all").on("click", function() {
                var isChecked = this.checked
                $this.find("tbody td .sel_row").each(function() {
                    this.checked = isChecked;
                    if (isChecked) {
                        $(this).closest('tr').addClass('tr-selected');
                    } else {
                        $(this).closest('tr').removeClass('tr-selected');
                    }
                });
            });
            
            $this.on("click", "tbody td .sel_row", function(){
            	if(this.checked) {
            		$(this).closest('tr').addClass('tr-selected');
            	}else {
            		$(this).closest('tr').removeClass('tr-selected');
            	}
            })
            
            $this.on("click", "tbody td .up_btn", function() {
                var tr = $(this).closest("tr");
                var nowData = $this.DataTable.row(tr).data();
                var prevRowData = null;
                var prevTR = tr.prev();
                if (prevTR.length > 0) {
                    prevRowData = $this.DataTable.row(prevTR).data();
                    $this.DataTable.row(tr).data(prevRowData);
                    $this.DataTable.row(prevTR).data(nowData);
                }
                $this.DataTable.draw();
            });
            $this.on("click", "tbody td .down_btn", function() {
                var tr = $(this).closest("tr");
                var nowData = $this.DataTable.row(tr).data();
                var nextRowData = null;
                var nextTR = tr.next();
                if (nextTR.length > 0) {
                    nextRowData = $this.DataTable.row(nextTR).data();
                    $this.DataTable.row(tr).data(nextRowData);
                    $this.DataTable.row(nextTR).data(nowData);
                }
                $this.DataTable.draw();
            });
        };

        var AddPageElement = function(opts) {
            //增加分页对象
            $this.PageElement = $("<div></div>");
            $this.closest(".dataTables_wrapper").after($this.PageElement);
            $this.PageElement.Paginate(opts);
        };


        //设置数据源
        $this.setDataSource = function(dataSource) {
            var $dataTable = $this.DataTable;
            $dataTable.clear();
            var listData = dataSource;
            if (listData) {
                for (var i = 0; i < listData.length; i++) {
                    var row_data = listData[i];
                    $dataTable.row.add(row_data);
                }
            }
            $dataTable.draw();
        };

        //获取数据源
        $this.data = function() {
            var tableData = $this.DataTable.data();
            var newRowData = new Array();
            for (var i = 0; i < tableData.length; i++) {
                var rowData = tableData[i];
                newRowData.push(rowData);
            }
            return newRowData;
        }

        //加载数据
        $this.load = function(url, para, call_back, pageNo) {
            var page_url = url;
            if (page_url.indexOf("?") < 0) {
                page_url = page_url + "?"
            }
            if (pageNo) {
                page_url = page_url + "pageNumber=" + pageNo;
            }
            page_url = page_url + "&pageSize=" + editSetting.pageSize;

            remote.call(page_url, para, function(pageData) {
                if (editSetting.page != true) {
                    $this.setDataSource(pageData); //填数据
                } else {
                    var resultList = pageData["list"];
                    $this.setDataSource(resultList); //填数据
                    //获取分页配置
                    var opts = new Object(); //生成或者更新页码控件
                    opts.total_count = pageData["total"];
                    opts.page_count = pageData["pages"];
                    opts.page_no = pageData["pageNum"];
                    opts.callback = function(pageNo) {
                        $this.load(url, para, call_back, pageNo);
                    };
                    $this.PageElement.Paginate("updateOptions", opts);
                }
                //执行回调函数
                if (call_back) {
                    call_back.call($this, pageData);
                }
            });
        };

        //删除行
        this.deleteRow = function(url, del_row, call_back) {
            var $dataTable = $this.DataTable;
            if (url) {
                layer.confirm("确定要删除吗？", function() {
                    var oldRowData = $dataTable.row(del_row).data();
                    remote.call(url, oldRowData, function(result) {
                        layer.alert("数据删除成功!", function() {
                            $dataTable.row(del_row).remove().draw();
                            //执行回调函数
                            if (call_back) {
                                call_back.call(this, result);
                            }
                            layer.closeAll('dialog');
                        });
                    });
                })
            } else {
                $dataTable.row(del_row).remove().draw();
            }

        };

        //获取选中行
        this.selectedRow = function() {
            return $this.find("tbody td .sel_row:checked").closest("tr");
        }

        //新增行
        this.addRow = function(row_data) {
            $this.DataTable.row.add(row_data);
            $this.DataTable.draw();
        }

        //更新行
        this.updateRow = function(dom_tr, row_data) {
            $this.DataTable.row(dom_tr).data(row_data);
            $this.DataTable.draw();
        }

        //获取行数据
        this.getRowData = function(dom_tr) {
            return $this.DataTable.row(dom_tr).data();
        }

        initDataTable(options);
        if (editSetting.page == true) {
            AddPageElement();
        }
        return this;
    };
})(jQuery);


function DataTableColumnDfs() {
    var cols = new Array();

    this.push = function(col) {
        var i = cols.length;
        col._targets(i);
        cols.push(col);
    }
    this._cols = function() {
        return cols;
    }
}

function DataTableColumn() {
    var $this = this;
    this.visible = true;
    this.bSortable = false;
    this.col_type = "text"
    this.col_type_opts = null;
    this.format = undefined;
    var renderFunction = function(data, type, full) {
        if (data && $this.format) {
            data = $.format.date(data, $this.format);
        }
        if ($this.col_type == "select") {
            return "<div style='text-align: center'><input type='checkbox' class='sel_row' value='" + data + "'/></div>";
        } else if ($this.col_type == "operate") {
            if ($this.col_type_opts) {
                var html = "<div style='text-align: center'>";
                var ops = $this.col_type_opts.split("|");
                if ($.inArray("edit", ops) >= 0) {
                    html += "<button class='edit_btn  btn  btn-xs btn-primary'>编辑</button>";
                }
                if ($.inArray("delete", ops) >= 0) {
                    html += "<button class='delete_btn btn  btn-xs btn-danger'>删除</button>";
                }
                if ($.inArray("up", ops) >= 0) {
                    html += "<button class='up_btn  btn  btn-xs btn-primary'><i class='icon iconfont icon-bianji'></i></button>";
                }
                if ($.inArray("down", ops) >= 0) {
                    html += "<button class='download_btn btn  btn-xs btn-danger'><i class=' icon iconfont icon-41download'></i></button>";
                }
                if ($.inArray("reset", ops) >= 0) {
                	html += "<button class='reset_btn btn  btn-xs btn-danger'>重置密码</button>";
                }
                if ($.inArray("start", ops) >= 0) {
                    html += "<button class='start_btn  btn  btn-xs btn-primary'>启动</button>";
                }
                if ($.inArray("pause", ops) >= 0) {
                    html += "<button class='pause_btn  btn  btn-xs btn-primary'>暂停</button>";
                }
                if ($.inArray("resume", ops) >= 0) {
                    html += "<button class='resume_btn  btn  btn-xs btn-success'>还原</button>";
                }
                if ($.inArray("editip", ops) >= 0) {
                    html += "<button class='resume_btn  btn  btn-xs btn-success'>修改ip域名</button>";
                }
                html += "</div>";
                return html;
            }
        } else if ($this.col_type == "link") {
            var css = "";
            var label = "";
            if ($this.col_type_opts) {
                if ($this.col_type_opts.css) {
                    css = $this.col_type_opts.css;
                }
                if ($this.col_type_opts.label) {
                    label = $this.col_type_opts.label;
                }
            }
            if ($.isEmptyStr(label)) {
                label = data;
            }
            return "<a class='link_btn " + css + "' href='javascript:'>" + label + "</a>"
        } else {
            return data;
        }
    }

    this._col_type = function(_col_type, opts) {
        this.col_type = _col_type;
        if (_col_type) {
            this.render = renderFunction;
            if (_col_type == "select") {
                this.title = "<div style='text-align: center'><input type='checkbox'  id='select_all'/></div>";
            } else if (_col_type == "operate") {
                this.title = "操作";
                this.col_type_opts = opts;
            } else if (_col_type == "link") {
                this.col_type_opts = opts;
            }
        }
        return this;
    }

    this._format = function(_format) {
        this.render = _format;
        return this;
    }

    this._title = function(_title) {
        this.title = _title;
        return this;
    }

    this._name = function(_name) {
        this.name = _name;
        return this;
    }

    this._data = function(_data) {
        this.data = _data;
        return this;
    }

    this._width = function(_width) {
        this.width = _width;
        return this;
    }

    this._targets = function(_targets) {
        this.targets = _targets;
        return this;
    }

    this._visible = function(_visible) {
        this.visible = _visible;
        return this;
    }

    this._className = function(_className) {
        this.className = _className;
        return this;
    }

};