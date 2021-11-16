/**
 * Created by hufy on 2016/12/21.
 */

(function($) {
  $.isEmptyStr = function(str) {
    if (str && $.trim(str) != "") {
      return false;
    }
    return true;
  };

  $.cloneObj = function(source) {
    var desnt = new Object();
    for (var key in source) {
      if (source.hasOwnProperty(key)) {
        desnt[key] = source[key];
      }
    }
    return desnt;
  };

  $.exportExcel = function(url, para, callBack) {
    var $_PageElement = $("<div id='excle_import_dialog'></div>");
    $_PageElement.dialogExt({
      title: "EXCEL导入",
      height: 160,
      target: app_path + "/component/excel_import.html",
      target_data: {
        "url": url,
        "callBack": callBack,
        "dialog": $_PageElement,
        "form_data": para
      },
      buttons: [{
        text: "导入",
        class: "btn btn-green btn_import",
        click: function() {
          return;
        }
      }, {
        text: "取消",
        class: "btn  btn-default",
        click: function() {
          $_PageElement.closeDialog();
        }
      }]
    });
  }

  $.getFormData = function($form) {
    var para = new Object();
    //暂时去掉disabled，不然serializeArray不会取这些
    var disabled = $form.find(':disabled');
    disabled.removeAttr('disabled');
    //serialize our form (which excludes file inputs)
    $.each($form.find("input:not(:checkbox),select,textarea").serializeArray(), function(i, item) {
      para[item.name] = item.value;
    });
    //checkbox，生成数组
    $.each($form.find(":checkbox").serializeArray(), function(i, item) {
      var arrobj = para[item.name];
      if (arrobj == undefined) {
        arrobj = new Array();
      }
      arrobj.push(item.value);
      para[item.name] = arrobj;
    });
    disabled.attr('disabled', true);
    return para;
  }


  $.setFormData = function($form, rowData) {
    for (var key in rowData) {
      if (rowData.hasOwnProperty(key)) {
        $form.find("[name='" + key + "']").val(rowData[key]);
      }
    }
  }
  //弹出新浏览器窗口
  $.openNewFrame = function(owurl, newTitle) {
    var tmp = window.open("about:blank", newTitle, "fullscreen=1")
    tmp.moveTo(0, 0);
    tmp.resizeTo(screen.width + 20, screen.height);
    tmp.focus();
    tmp.location = owurl;
  }
  //点击放大镜弹出子页面
  $.showName = function(colName, elementId) {
    $.getUserLayer('800px', '500px', colName + "查询", "/baseData/show/" + colName + "/" + elementId);
  }
  /*判断弹窗引入url时或点击刷新按钮是否登陆*/
  $.getUserLayer = function(w, h, title, url) {
    $.ajax({
      url: '/get_user',
      type: 'get',
      success: function(userAndmenu) {
        var user = userAndmenu["user"];
        if (user) {
          if (!$.isEmptyStr(title) && !$.isEmptyStr(w) && !$.isEmptyStr(url)) {
            index = layer.open({
              title: title,
              type: 2,
              area: [w, h],
              content: url
            });
          } else {
            window.location.reload()
          }

        } else {

          layer.open({
            title: "登录",
            type: 2,
            area: ['400px'],
            content: "/showPopLogin"
          });
        }
      }
    })
  }
  /** 
   * 转换时间格式
   * time:String 时间，目前仅支持格式 yyyymmdd 的转换
   * space:String 期望的间隔符，例如 "-", 输出结果 yyyy-mm-dd
   */
  $.transTime = function(time, space) {
    if (time && space && time.length == 8) {
      var tempArr = [];
      tempArr.push(time.slice(0, 4), time.slice(4, 6), time.slice(6));
      return tempArr.join(space);
    } else {
      layer.alert("请正确传入参数！")
    }
  }
  /** 
   * 起始结束时间区间情况方法
   * sNode：jQuery DOM对象，起始时间的input
   * eNode：jQuery DOM对象，结束时间的input
   * option: Object 可选参数，datetimepicker控件的配置项，例如：{autoclose: false, format:'yyyy/mm/dd'}
   */
  $.dateTimeRange = function(sNode, eNode, option) {
    if (sNode && sNode instanceof jQuery && eNode && eNode instanceof jQuery) {
      var _option = {
        autoclose: true,
        minView: 2,
        format: 'yyyymmdd',
        initialDate: new Date(),
        language: "zh-CN",
        todayBtn: "linked"
      };
      if (option) {
        for (var k in option) {
          _option[k] = option[k];
        }
      };
      // 起始时间初始化
      sNode.datetimepicker(_option)
        .on("show", function(e) {
          var sTempVal = sNode.val();
          var eTempVal = eNode.val();
          sTempVal && sNode.val($.transTime(sTempVal, "-"));
          sNode.datetimepicker('update');
          eTempVal && sNode.datetimepicker("setEndDate", $.transTime(eTempVal, "-"));
        });
      // 结束时间初始化
      eNode.datetimepicker(_option)
        .on("show", function(e) {
          var sTempVal = sNode.val();
          var eTempVal = eNode.val();
          eTempVal && eNode.val($.transTime(eTempVal, "-"));
          eNode.datetimepicker('update');
          sTempVal && eNode.datetimepicker("setStartDate", $.transTime(sTempVal, "-"))
        })

    } else {
      layer.alert("请正确传入参数！")
    }

  }

})(jQuery);