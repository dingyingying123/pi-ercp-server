<@override name="content" >
    <@showNav path="定时器管理/执行日志查看"/>
<div class="page-container">
    <div class="container-fluid">
        <div class="row clearfix">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                <div class="panel panel-default panel-media">
                    <div class="panel-body re-padd form-inline fixed-width">
                        <div class="form-invoice pt-5">
                            <span class="span">查询条件</span>
                            <button type="button" class="btn btn-success btn-sm radius ml-20" id="query_btn">查询</button>
                            <button type="button" class="btn btn-danger btn-sm radius" id="clear_btn">清除</button>
                        </div>

                        <div class="form-inline pd-0">
                        
                            <div class="row clearfix">
                              <div class="form-group form-container col-lg-3">
                                    <label>定时器任务:</label>
                                    <input class="form-control input-sm radius clear" id="jobName"/>
  
                             </div>
                                <div class="form-group form-container col-lg-3">
                                    <label>执行时间:</label>
                                    <input type="text" class="form-control radius clear" id="createTime">
<!--                                     <input type="hidden" class="time-range form-control radius clear" id="endTime">
 -->                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div>
            <div class="jqGrid_wrapper">
                <table id="operation_table" class="table table-bordered table-bg table-hover table-sort"  style="text-align: center;">
                </table>
            </div>
        </div>
    </div>
</div>

</@override>

<@override name="customScript">
<script type="text/javascript">


    $(window).bind("resize", function() {
        var width = $(".jqGrid_wrapper").width();
        $("#operation_table").setGridWidth(width)
    })

    function addEbeln(ebeln){
        $("#poNum").val(ebeln);
    }


	/* 时间区间初始化 */
    //var startNode = $("#createTime");
   // var endNode = $("#endTime");
   // $.dateTimeRange(startNode, endNode);
   
    $("#createTime").datetimepicker({
		autoclose : true,
		minView : 2,
		format : 'yyyy-mm-dd',
		initialDate : new Date(),
		language : "zh-CN",
		todayBtn : "linked"
	});
    //定列
    var qrGridExt = null;
    var qrGrid = null;
    var coldfs = new  JqGridColumnDfs(false);
    coldfs.push(new JqGridColumn()._title("任务名称")._data("jobName")._width(150));
    coldfs.push(new JqGridColumn()._title("任务描述")._data("jobDescription")._width(200));
    coldfs.push(new JqGridColumn()._title("开始时间")._data("startTime")._width(200));
    coldfs.push(new JqGridColumn()._title("结束时间")._data("endTime")._width(200));
    coldfs.push(new JqGridColumn()._title("执行结果")._data("execResult")._width(250));
    coldfs.push(new JqGridColumn()._title("创建时间")._data("createTime")._width(200));

    var setting = $.extend(coldfs._cols(),{height:350,multiselect: false});

    qrGridExt = $("#operation_table").jqGridExt(setting,{page:true});
    qrGrid = qrGridExt.jqGrid;
    var param = new Object();
    param["createTime"]  = getFormatDate();
    qrGridExt.load("/job/jobManager/getJobLog",param);



    //查询日志信息
    $("#query_btn").on("click", function() {
        var param = new Object();
        
        var createTime = $("#createTime").val();
        if (!$.isEmptyStr(createTime)){
            param["createTime"] = $("#createTime").val();
        }else{
        	param["createTime"] = getFormatDate();
        }

        var jobName = $("#jobName").val();
        if (!$.isEmptyStr(jobName)){
            param["jobName"] = jobName;
        }

        qrGridExt.load("/job/jobManager/getJobLog",param );
        
    });
    //清除
    $("#clear_btn").on("click", function(){
       // location.reload();
        $(".clear").val("");
        qrGridExt.setDataSource(null);
        qrGridExt.PageElement.Paginate("updateOptions", null);
    });
    
    function getFormatDate(){  
        var nowDate = new Date();   
        var year = nowDate.getFullYear();  
        var month = nowDate.getMonth() + 1 < 10 ? "0" + (nowDate.getMonth() + 1) : nowDate.getMonth() + 1;  
        var date = nowDate.getDate() < 10 ? "0" + nowDate.getDate() : nowDate.getDate();  
        // var hour = nowDate.getHours()< 10 ? "0" + nowDate.getHours() : nowDate.getHours();  
        // var minute = nowDate.getMinutes()< 10 ? "0" + nowDate.getMinutes() : nowDate.getMinutes();  
        // var second = nowDate.getSeconds()< 10 ? "0" + nowDate.getSeconds() : nowDate.getSeconds();  
        return year + "-" + month + "-" + date;  
    }  

</script>
</@override>

<@extends name="../base.ftl"/>
