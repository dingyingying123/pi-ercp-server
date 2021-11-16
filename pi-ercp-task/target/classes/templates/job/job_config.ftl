<@override name="content" >
<@showNav path="定时器管理/定时器配置"/>

<div class="page-container">
	<div class="container-fluid">
		<div class="row  clearfix">
			<div class="condition top-tools col-sm-12 col-md-12 col-lg-12">
				<div class="navbar-form" style="float: left">
					<button class="btn btn-success btn-sm radius" id="add_btn">新增</button>					
<!-- 					<button class="btn btn-info btn-sm radius" id="edit_btn">编辑</button>
					<button class="btn btn-danger btn-sm radius" id="del_btn">删除</button> -->
				</div>
<!-- 				<div class="navbar-form f-12" style="float: right;">
 					<div class="form-group mr-5">
						<label>同步平台:</label> 
						<input type="text" id="configPara" class="form-control input-sm radius">
					</div> 
					<button type="button" class="btn  btn-success btn-sm radius" id="query_btn">查询</button>
				</div> -->
			</div>
		</div>

		<div class="row">
			<div class="condition top-tools col-sm-12 col-md-12 col-lg-12">
				<table id="user_table"
					class="table table-bordered table-bg table-hover table-sort"
					style="text-align: center;">
				</table>
			</div>
		</div>

		<div id="config-edit" class="edit_template pt-10 pb-10" title="配置信息编辑" width="400">
			<form class="form form-horizontal" role="form" id="editForm">	
				<input type="hidden" id="job_name_edit_old" name="job_name_edit_old"  >
				<input type="hidden" id="job_group_edit_old" name="job_group_edit_old">
					
				<div class="form-group clearfix mb-20">
					<label class="col-xs-3 col-sm-3 text-right control-label">计划名<span class="required">*</span></label>
					<div class="col-xs-8 col-sm-8">
						<input type="text" id="sched_name_edit" name="sched_name_edit" class="form-control input-sm radius" required>
					</div>
				</div>
				<div class="form-group clearfix mb-20" id = "destShow">
					<label class="col-xs-3 col-sm-3 text-right control-label">任务名称<span class="required">*</span></label>
					<div class="col-xs-8 col-sm-8">
						<input type="text" id="job_name_edit" name="job_name_edit" class="form-control input-sm radius" required>
					</div>
				</div>
				<div class="form-group clearfix mb-20">
					<label class="col-xs-3 col-sm-3 text-right control-label">任务分组<span class="required">*</span></label>
					<div class="col-xs-8 col-sm-8">
						<input type="text" id="job_group_edit" name="job_group_edit" class="form-control input-sm radius" required>
					</div>
				</div>
				<div class="form-group clearfix mb-20">
					<label class="col-xs-3 col-sm-3 text-right control-label">Cron<span class="required">*</span></label>
					<div class="col-xs-8 col-sm-8">
						<input type="text" id="cron_edit" name="cron_edit" class="form-control input-sm radius" required>
					</div>
				</div>
				<div class="form-group clearfix mb-20">
					<label class="col-xs-3 col-sm-3 text-right control-label">执行类<span class="required">*</span></label>
					<div class="col-xs-8 col-sm-8">
						<input type="text" id="job_class_edit" name="job_class_edit" class="form-control input-sm radius" required>
					</div>
				</div>
				<div class="form-group clearfix mb-20">
					<label class="col-xs-3 col-sm-3 text-right control-label">描述</label>
					<div class="col-xs-8 col-sm-8">
						<input type="text" id="descprition_edit" name="descprition_edit" class="form-control input-sm radius" >
					</div>
				</div>
				<div class="tools form-group clearfix" style="text-align: center;">
					<button type="button" class="btn  btn-success radius" id="save_btn">保存</button>
					<button type="button" class="btn  btn-default radius ml-10"
						id="close_btn">关闭</button>
				</div>
			</form>
		</div>
		
		
		
		<div id="config-add" class="edit_template pt-10 pb-10" title="配置信息新增" width="400">
			<form class="form form-horizontal" role="form" id="addForm">						
				<div class="form-group clearfix mb-20">
					<label class="col-xs-3 col-sm-3 text-right control-label">计划名<span class="required">*</span></label>
					<div class="col-xs-8 col-sm-8">
						<input type="text" id="sched_name_add" name="sched_name_add" class="form-control input-sm radius" required>
					</div>
				</div>
				<div class="form-group clearfix mb-20" id = "destShow">
					<label class="col-xs-3 col-sm-3 text-right control-label">任务名称<span class="required">*</span></label>
					<div class="col-xs-8 col-sm-8">
						<input type="text" id="job_name_add" name="job_name_add" class="form-control input-sm radius" required>
					</div>
				</div>
				<div class="form-group clearfix mb-20">
					<label class="col-xs-3 col-sm-3 text-right control-label">任务分组<span class="required">*</span></label>
					<div class="col-xs-8 col-sm-8">
						<input type="text" id="job_group_add" name="job_group_add" class="form-control input-sm radius" required>
					</div>
				</div>
				<div class="form-group clearfix mb-20">
					<label class="col-xs-3 col-sm-3 text-right control-label">Cron<span class="required">*</span></label>
					<div class="col-xs-8 col-sm-8">
						<input type="text" id="cron_add" name="cron_add" class="form-control input-sm radius" required>
					</div>
				</div>
				<div class="form-group clearfix mb-20">
					<label class="col-xs-3 col-sm-3 text-right control-label">执行类<span class="required">*</span></label>
					<div class="col-xs-8 col-sm-8">
						<input type="text" id="job_class_add" name="job_class_add" class="form-control input-sm radius" required>
					</div>
				</div>
				<div class="form-group clearfix mb-20">
					<label class="col-xs-3 col-sm-3 text-right control-label">描述</label>
					<div class="col-xs-8 col-sm-8">
						<input type="text" id="descprition_add" name="descprition_add" class="form-control input-sm radius" >
					</div>
				</div>
				<div class="tools form-group clearfix" style="text-align: center;">
					<button type="button" class="btn  btn-success radius" id="save_btn_add">添加</button>
					<button type="button" class="btn  btn-default radius ml-10"
						id="close_btn_add">关闭</button>
				</div>
			</form>
		</div>
		
		
	</div>
</div>
</@override> <@override name="customScript">
<script type="text/javascript">
var method;
var message;
var row_tr;
var flag=false;
	function startOrPause(cellvalue, col, rowobj) {

		var param = rowobj["jobName"] +","+ rowobj["jobGroup"]
		if("WAITING" == cellvalue){
			return "<a href='javascript:;' value ='"+param+"'  title='暂停' class='pauseOpr'><i class='glyphicon glyphicon-pause'></i></a>"; 

		}else if("PAUSED" == cellvalue){
			return "<a href='javascript:;'   value ='"+param+"' title='启动' class='playOpr'><i class='glyphicon glyphicon-play'></i></a>"; 

		}

	}

	$(function(){
		
				
		
		var dataTableExt = null;
        //定列
        var cols=null;
        var coldfs = new  DataTableColumnDfs();
        coldfs.push(new DataTableColumn()._title("任务名称")._data("jobName")._width(260));
        
        coldfs.push(new DataTableColumn()._title("计划名称")._data("schedName")._width(120)._visible(false));
        coldfs.push(new DataTableColumn()._title("className")._data("jobClassName")._width(120)._visible(false));

        coldfs.push(new DataTableColumn()._title("任务分组")._data("jobGroup")._width(120));
        coldfs.push(new DataTableColumn()._title("cron")._data("cronExpression")._width(160));
        coldfs.push(new DataTableColumn()._title("描述")._data("description")._width(340));
        coldfs.push(new DataTableColumn()._title("任务状态")._data("triggerState")._width(100));
        coldfs.push(new DataTableColumn()._title("上次执行时间")._data("prevFireTime")._width(100));
        coldfs.push(new DataTableColumn()._title("下次执行时间")._data("nextFireTime")._width(100));
		coldfs.push(new DataTableColumn()._title("操作")._data("triggerState")._format(startOrPause)._width(70));
		coldfs.push(new DataTableColumn()._title("编辑")._col_type("operate","edit")._width(70));
		//coldfs.push(new DataTableColumn()._title("暂停")._col_type("operate","pause")._width(70));
		//coldfs.push(new DataTableColumn()._title("还原")._col_type("operate","resume")._width(70));
		coldfs.push(new DataTableColumn()._title("删除")._col_type("operate","delete")._width(70));


		cols = coldfs._cols();

		dataTableExt = $('#user_table').DataTableExt({
			"columnDefs" : coldfs._cols()
		});

		var para = new Object();
		dataTableExt.load("/job/jobManager/getJobTask", para);
	

		var index = null;

		var openEditor = function() {
			index = layer.open({
				type : 1,
				title:'编辑配置',
				area : [ '600px','400px' ],
				content : $("#config-edit")
			});
		}

		var openAdd = function() {
			index = layer.open({
				type : 1,
				title:'新增配置',
				area : [ '600px','400px' ],
				content : $("#config-add")
			});
		}
		
		$("#add_btn").on("click", function() {
			method = "addAccount";
			//document.getElementById("editForm").reset();
			//$("#comEmail").removeAttr("readonly");
			openAdd();
		});

		$("#close_btn").on("click", function() {
			layer.close(index);
		});
		$("#close_btn_add").on("click", function() {
			layer.close(index);
		});
		$("#save_btn_add").on("click", function() {
			var paraAdd = new Object();
			if($.isEmptyStr($("#sched_name_add").val())){
				layer.alert("计划名不得为空");
				return;
			}else{
				paraAdd["schedName"] = $("#sched_name_add").val();
			}
			if($.isEmptyStr($("#job_name_add").val())){
				layer.alert("任务名称不得为空");
				return;
			}else{
				paraAdd["jobName"] = $("#job_name_add").val();
			}
			if($.isEmptyStr($("#job_group_add").val())){
				layer.alert("任务分组不得为空");
				return;
			}else{
				paraAdd["jobGroup"] = $("#job_group_add").val();
			}
			if($.isEmptyStr($("#cron_add").val())){
				layer.alert("cron不得为空");
				return;
			}else{
				paraAdd["cronExpression"] = $("#cron_add").val();
			}
			if($.isEmptyStr($("#job_class_add").val())){
				layer.alert("执行类不得为空");
				return;
			}else{
				paraAdd["jobClassName"] = $("#job_class_add").val();
			}
			if(!$.isEmptyStr($("#descprition_add").val())){
				paraAdd["description"] = $("#descprition_add").val();
			}
			
			
			remote.call("/job/jobManager/save", paraAdd, function(result) {
				if(result.success == true) {
					layer.alert("添加成功", layer.close(index));
					var para = new Object();
					document.getElementById("addForm").reset();
					dataTableExt.load("/job/jobManager/getJobTask", para);
				} else {
					layer.alert("添加失败");
				}
			});
		

		});
		
		$("#save_btn").on("click", function() {
			
			var paraEdit = new Object();
			if($.isEmptyStr($("#sched_name_edit").val())){
				layer.alert("计划名不得为空");
				return;
			}else{
				paraEdit["schedName"] = $("#sched_name_edit").val();
			}
			
			if($.isEmptyStr($("#job_name_edit_old").val())){
				layer.alert("原任务名称不得为空");
				return;
			}else{
				paraEdit["oldJobName"] = $("#job_name_edit_old").val();
			}
			if($.isEmptyStr($("#job_group_edit_old").val())){
				layer.alert("原任务分组不得为空");
				return;
			}else{
				paraEdit["oldJobGroup"] = $("#job_group_edit_old").val();
			}
			
			if($.isEmptyStr($("#job_name_edit").val())){
				layer.alert("任务名称不得为空");
				return;
			}else{
				paraEdit["jobName"] = $("#job_name_edit").val();
			}
			if($.isEmptyStr($("#job_group_edit").val())){
				layer.alert("任务分组不得为空");
				return;
			}else{
				paraEdit["jobGroup"] = $("#job_group_edit").val();
			}
			
			if($.isEmptyStr($("#cron_edit").val())){
				layer.alert("cron不得为空");
				return;
			}else{
				paraEdit["cronExpression"] = $("#cron_edit").val();
			}
			if($.isEmptyStr($("#job_class_edit").val())){
				layer.alert("执行类不得为空");
				return;
			}else{
				paraEdit["jobClassName"] = $("#job_class_edit").val();
			}
			if(!$.isEmptyStr($("#descprition_edit").val())){
				paraEdit["description"] = $("#descprition_edit").val();
			}
			
			remote.call("/job/jobManager/save", paraEdit, function(result) {
				if(result.success == true) {
					layer.alert("修改成功", layer.close(index));
					var paraSearch = new Object();
					dataTableExt.load("/job/jobManager/getJobTask", paraSearch);
				} else {
					layer.alert("修改失败");
				}
			});

		});

		
		//弹出编辑
		$("#user_table").on("click",".edit_btn", function(){
			var row_tr = $(this).parent().parent().parent();
			console.log(row_tr);
			var row_data = dataTableExt.getRowData(row_tr);
			//设置弹窗数据
			$("#sched_name_edit").val(row_data["schedName"]);
			$("#job_name_edit").val(row_data["jobName"]);
			$("#job_group_edit").val(row_data["jobGroup"]);
			$("#job_name_edit_old").val(row_data["jobName"]);
			$("#job_group_edit_old").val(row_data["jobGroup"]);
			$("#cron_edit").val(row_data["cronExpression"]);
			$("#job_class_edit").val(row_data["jobClassName"]);
			$("#descprition_edit").val(row_data["description"]);
			openEditor();
		});
		
		//启动
		$("#user_table").on("click",".playOpr", function(){
			var jn = $(this).attr("value").split(",")[0];
			var jg = $(this).attr("value").split(",")[1];
			var row_data = new Object();
			row_data["jobName"] = jn;
			row_data["jobGroup"] = jg;
			
	           layer.confirm("确定要恢复运行吗？", function() {
	   			remote.call("/job/jobManager/resume", row_data, function(result) {
	   				if(result.success == true) {
	   					layer.alert("恢复成功", layer.close(index));
	   					var para = new Object();
	   					dataTableExt.load("/job/jobManager/getJobTask", para);
	   				} else {
	   					layer.alert("恢复失败");
	   				}
	   			});
	         })
		});
		//暂停
		$("#user_table").on("click",".pauseOpr", function(){
			var jn = $(this).attr("value").split(",")[0];
			var jg = $(this).attr("value").split(",")[1];
			var row_data = new Object();
			row_data["jobName"] = jn;
			row_data["jobGroup"] = jg;
	
			console.log(row_data);
	           layer.confirm("确定要暂停吗？", function() {
	   			remote.call("/job/jobManager/pause", row_data, function(result) {
	   				if(result.success == true) {
	   					layer.alert("暂停成功", layer.close(index));
	   					var para = new Object();
	   					dataTableExt.load("/job/jobManager/getJobTask", para);
	   				} else {
	   					layer.alert("暂停失败");
	   				}
	   			});
	         })
		});
		//还原
		$("#user_table").on("click",".resume_btn", function(){
			var row_tr = $(this).parent().parent().parent();
			var row_data = dataTableExt.getRowData(row_tr);
			console.log(row_data);
	           layer.confirm("确定要还原吗？", function() {
	   			remote.call("/job/jobManager/resume", row_data, function(result) {
	   				if(result.success == true) {
	   					layer.alert("还原成功", layer.close(index));
	   					var para = new Object();
	   					dataTableExt.load("/job/jobManager/getJobTask", para);
	   				} else {
	   					layer.alert("还原失败");
	   				}
	   			});
	         })
		});
		//删除
		$("#user_table").on("click",".delete_btn", function(){
			var row_tr = $(this).parent().parent().parent();
			var row_data = dataTableExt.getRowData(row_tr);
			
	           layer.confirm("确定要删除吗？", function() {
	   			remote.call("/job/jobManager/remove", row_data, function(result) {
	   				if(result.success == true) {
	   					layer.alert("删除成功", layer.close(index));
	   					var para = new Object();
	   					dataTableExt.load("/job/jobManager/getJobTask", para);
	   				} else {
	   					layer.alert("删除失败");
	   				}
	   			});
	         })
		});

	});
	
</script>
</@override>
 <@extends name="../base.ftl"/>
