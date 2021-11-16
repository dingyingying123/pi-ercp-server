	    //动态创建 menu 列表 begin
	    var menuListBox = $(".Hui-aside .menu_dropdown");
	    var creatMenu = function() {
	
    			menuListBox.append(
    				'<dl id="task">' +
    				'<dt><i class="iconfont"></i> <span>定时任务配置</span><i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>' +
    				'<dd>' +
    				'<ul>' +
    				'</ul>' +
    				'</dd>' +
    				'</dl>'
    			);
    			var subMenuListBox = menuListBox.find("dd>ul");
				subMenuListBox.append(
    					'<li><a data-href="/job/jobManager/init" data-title="定时任务配置" href="javascript:void(0)"><span>定时任务配置</span></a></li>'
						

				).append(
    					'<li><a data-href="/job/jobManager/initLog" data-title="执行日志查看" href="javascript:void(0)"><span>执行日志查看</span></a></li>'

    			);

	    
	
	    };

	    // 获取 menu 数据
	    $.get("/user_rule?" + new Date().getTime(), function(userAndmenu) {
	    	//创建 menu 列表
	    	var user = userAndmenu["user"];
	    	$("#user-info-show").text(user.userName);
    		$("#user_id").text(user.userId.toLowerCase());
    		$("#changpwd").parent("li").remove();

	    	var menuData = userAndmenu["menu"];
	    	creatMenu();
	    	$(".Hui-aside").Huifold({
	    		titCell: '.menu_dropdown dl dt',
	    		mainCell: '.menu_dropdown dl dd',
	    	});
	    });

    	


	    // 动态创建 menu 列表  end

	    //个人信息
	    //	    $("#myselfinfo").on("click", function() {
	    //	    	layer.open({
	    //	    		type: 1,
	    //	    		area: ['400px', '300px'],
	    //	    		fix: false, //不固定
	    //	    		maxmin: true,
	    //	    		shade: 0.4,
	    //	    		title: '查看信息',
	    //	    		content: '<div>管理员信息</div>'
	    //	    	});
	    //	    });

	    //关闭弹窗
	    $("#close_btn").on("click", function() {
	    	layer.close(index);
	    });
	    //提交数据
	    $("#save_btn").on("click", function() {
	    	var oldpwd = $("#oldpwd").val();
	    	var newpwd = $("#newpwd").val();
	    	var twicepwd = $("#twicepwd").val();
	    	if ($("#chpwdForm").valid()) {
	    		remote.call("/chaPwd?oldpwd=" + oldpwd + "&newpwd=" + newpwd, null, function(result) {
	    			if (result != null) {
	    				if (result.success == "true") {
	    					layer.alert("密码更新成功！", layer.close(index));
	    				} else {
	    					layer.alert(result.message);
	    				}
	    			}
	    		});
	    	};

	    });

	    //修改密码
	    var index = null;
	    $("#changpwd").on("click", function() {
	    	index = layer.open({
	    		title: "修改密码",
	    		type: 1,
	    		area: ['400px'],
	    		content: $("#chpwd-edit")
	    	});
	    });

	    //验证信息
	    var tipMassage = {
	    	"newpwd": "密码长度要大于等于8位,并至少包含数字,小写字母和大写字母",
	    	"twicepwd": "密码要和新密码保持一致"
	    };
	    $(".ques-sign").on("mouseenter", function() {
	    	var $_attr = $(this).attr("attr");
	    	layer.tips(tipMassage[$_attr], $(this), {
	    		tips: [1, '#3595CC'],
	    		time: 4000
	    	});
	    });