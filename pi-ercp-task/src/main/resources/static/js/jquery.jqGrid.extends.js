/**
 * Created by 33925
 */
(function($) {
    $.extend($.jgrid.defaults, {
        styleUI: "Bootstrap",
        datatype : "local",
        autowidth: true,
        shrinkToFit: false,
        autoScroll: true,
        rowNum:  -1,
        hidegrid: false,
        multiselect: true,
        viewrecords: true,
        cellEdit: false,
    	cellsubmit: 'clientArray'
    });

    $.jgrid.extend({
    	//触发取消编辑
    	saveLastCell:function(){
    		return this.each(function (){
    			var $t = this;
    			$($t).jqGrid("saveCell",$t.p.iRow, $t.p.iCol);
    		});
    	},
    	//获取表格抬头，用于导出excel
    	getColHead:function(){
    		var $t = this;
    		var colModel = $($t).jqGrid("getGridParam","colModel");
    		var colNames = $($t).jqGrid("getGridParam","colNames");
    		
    		
    		var rs = new Array();
    		if(colModel.length>0){
    			for(var i=0 ;i<colModel.length ;i++ ){
    				if("cb"!=colModel[i]["name"] ){
    					var obj = new Object();
        				obj["colName"] = colModel[i]["name"] ;
        				obj["colText"] = colNames[i];
        				rs.push(obj);
    				}
    			}
    		}
    		return rs;
    	}
    });

    $.fn.jqGridExt = function(options, editOpts) {
        var $this = this;
        var editSetting = {
            page: true,
            pageSize: 10
        }
        
        $.extend(editSetting, editOpts);
        
        var lastOid = 1;
        var initJqGrid = function(opts) {
            $this.jqGrid = $this.jqGrid(opts).jqGrid('setFrozenColumns');
        };

        var AddPageElement = function(opts) {
            //增加分页对象
            $this.PageElement = $("<div></div>");
            $this.after($this.PageElement);
            $this.PageElement.Paginate(opts);
        };
        
        //设置数据源
        $this.setDataSource = function(dataSource) {
            var $grid = $this.jqGrid;
            $grid.clearGridData();
            $($grid[0]).jqGrid("setGridParam",{data:dataSource});
            $grid[0].addJSONData(dataSource);
            var ids = $grid.getDataIDs();
            lastOid = ids.length+1;
        };

        //加载数据
        $this.load = function(url, para, call_back, pageNo) {
            var page_url = url;
            if (page_url.indexOf("?") < 0) {
                page_url = page_url + "?"
            }
            if (pageNo) {
                page_url = page_url + "pageNumber=" + pageNo;
            }
            
            var pageSize = 0;
            if(editSetting.page){
            	pageSize = editSetting.pageSize
            }
            page_url = page_url + "&pageSize=" + pageSize;
            remote.call(page_url, para, function(pageData) {
            	if(pageData){
            		if($.isArray(pageData)){
            			$this.setDataSource(pageData); //填数据
            		}else{
            			var resultList = pageData["list"];
                        $this.setDataSource(resultList); //填数据
            		}
                    
                    if(editSetting.page){
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
                }
                //执行回调函数
                if (call_back) {
                    call_back.call($this, pageData);
                }
            });
        };

        //删除行
        this.deleteRow = function(url, row_id, call_back) {
            var $grid = $this.jqGrid;
            if (row_id == undefined) {
                //获取选中的行
                var selectedIds = $grid.getSelectRowID();
                if (selectedIds.length <= 0) {
                    layer.alert("请选择行！");
                    return;
                }

                if (selectedIds.length > 1) {
                    layer.alert("每次只能删除一行！");
                    return;
                }
                row_id = selectedIds[0]
            }

            layer.confirm("确定要删除吗？", function() {
                var oldRowData = $grid.getRowData(row_id);
                remote.call(url, oldRowData, function(result) {
                    layer.alert("数据删除成功!", function() {
                        $grid.delRowData(row_id);
                        //执行回调函数
                        if (call_back) {
                            call_back.call(this, result);
                        }
                        layer.closeAll('dialog');
                    });
                });
            })
        };

        //新增行
        this.addRow = function(row_data) {
            var $grid = $this.jqGrid;
            lastOid = lastOid + 1;
            $grid.addRowData(lastOid, row_data);
            return lastOid;
        }

        //更新行
        this.updateRow = function(row_id, row_data) {
            var $grid = $this.jqGrid;
            $grid.setRowData(row_id, row_data);
        }

        //更新行
        this.removeRow = function(row_id) {
            var $grid = $this.jqGrid;
            $grid.delRowData(row_id);
        }
        if (editSetting.page == true) {
            AddPageElement();
        }
        initJqGrid(options);
        return this;

    };

})(jQuery);

