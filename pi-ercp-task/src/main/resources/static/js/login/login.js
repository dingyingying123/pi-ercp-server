   	//判断IE版本
    	function IEVersion() {
    	    var userAgent = navigator.userAgent;
    	    var isIE = userAgent.indexOf("compatible") > -1 && userAgent.indexOf("MSIE") > -1; //判断是否IE<11浏览器  
    	    if(isIE) {
    	 	   var regIE = new RegExp("MSIE (\\d+\\.\\d+);");
    	 	   regIE.test(userAgent);
    	 	   var IEVersion = parseFloat(RegExp["$1"]);
    	 	   if(IEVersion < 9) {
    	 		  layer.alert('您的IE浏览器版本过低，为了不影响使用功能，请更新或选用其他较新的浏览器。', {icon: 6});
    	 	   }else {
    	 		   return;
    	 	   }
    	    }
    	};
    	IEVersion();
        //记住用户14天
        var rememberUser = function(user){
            $.cookie('gw_loginName', user.userId, { expires: 14 });
            $.cookie('gw_pwd', user.pwd, { expires: 14 });
        };

        var removeUserFromCookie = function(){
            $.cookie('gw_loginName','', { expires: -1 });
            $.cookie('gw_pwd', '', { expires: -1 });
        };

        var  getUserFromCookie = function(){
            var loginName=$.cookie('gw_loginName');
            if(typeof(loginName)!='undefined'&&loginName!=null&&loginName!='null'){
                $('#loginName').val(loginName);
                $('#pwd').val($.cookie('gw_pwd'));
                $('#rememberMe').attr("checked", true);
            }
        };

        getUserFromCookie();//从cookie中获得用户登录信息
        var validate =function(){
            var name = $.trim($("#loginName").val());
            if (name == "") {
                layer.alert("请输入用户名！");
                $("#loginName").focus();
                return false;
            }
            var pwd = $("#pwd").val();
            if (pwd == "") {
                layer.alert("请输入密码！");
                $("#pwd").focus();
                return false;
            }
            return true;
        };

        $("#loginBtn").on("click",function(){
            if(validate()){
                var user = new Object();
                user.userId = $.trim($("#loginName").val());
                user.pwd = $.trim($("#pwd").val());
                // md5加密替代上句
               // user.pwd = md5($.trim($("#pwd").val()));
                
                remote.call(app_path+"/login",user,function (result) {
                    if(result.success==true){//登录成功
                    	rememberUser(user);
                        window.location.href = "/";
                    }else{
                        layer.alert(result.message);
                    }
                });
            }

            return false;
        });
        $("#forget").on("click",function(){
        	window.open("/showForgetPwd","_self");
        });