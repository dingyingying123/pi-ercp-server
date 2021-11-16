<@override name="content" >

		
			<form class="form form-horizontal" id="editf" style="width: 400px">
				<div class="form-group1 clearfix mb-20">
					<label class="col-xs-3 col-sm-3 text-right control-label">账户
						<span class="required">*</span>
					</label>
					<div class="col-xs-8 col-sm-8">
						<input type="text" id="userId" name="userId" width="100%"
							class="form-control input-sm radius" required readonly="readonly">
					</div>
				</div>
				<div class="form-group1 clearfix mb-20">
					<label class="col-xs-3 col-sm-3 text-right control-label">密码
						<span class="required">*</span>
					</label>
					<div class="col-xs-8 col-sm-8">
						<input type="password" id="password" name="password"
							class="form-control input-sm radius" required>
					</div>
				</div>
				<div style="text-align: center;">
					<button type="button" class="btn  btn-success radius" id="save">登录</button>
				</div>
			</form>

</@override> 
<@override name="customScript">
<script type="text/javascript">
//登录
	var userCode = $(window.top.document).find("header #user_code").html();
    if(userCode){
        $('#userId').val($.trim(userCode));
    }else {
    	window.top.location.href = "/showLogin";
    }
    
	$("#save").click(function(){
		var user = new Object();
	    user.userId = $.trim(userCode);
	    user.pwd = $.trim($("#password").val());
	    remote.call(app_path+"/login",user,function (result) {
	        if(result.success==true){//登录成功
	        	document.getElementById("editf").reset();
	        	
	        	parent.layer.closeAll()
	        	rememberUser(user);
	        	
		       // creatIframe(href,title);
	        }else{
	            layer.alert(result.message);
	        }
	    })
	    
	})

</script>
</@override> 
<@extends name="base_main.ftl"/>
	