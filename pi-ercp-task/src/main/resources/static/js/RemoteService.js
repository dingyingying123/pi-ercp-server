var LoadingPop = function() {
};

LoadingPop.prototype = {
	constructor : LoadingPop,
	show : function() {
		var popbody = $("<div class=\"loading-pop\"><div class=\"pop_content\"><img src=\"/images/loading-gif.gif\" width=\"65\"></div></div>");
		//if(this.popwin !=undefined){
			this.popwin = popbody.appendTo('body');
		//}
	},

	remove : function() {
		if(this.popwin !=undefined){
			this.popwin.remove();
		}
	}
};


function RemoteService(){
	this.type="POST";
	this.async=true; 
	this.dataType="json";
	this.contentType="application/json;charset=utf-8";
};

RemoteService.prototype.call=function(url,para,call_back){
	var ro = this;
	if(para == undefined ){
		para= new Object();
	}
	var loading = new LoadingPop();
	loading.show();
	$.ajax({
		type : ro.type,
		async : ro.async,
		url : url,
		data : $.toJSON(para),
		dataType : ro.dataType,
		contentType : ro.contentType,
		success : function(result) {
			loading.remove();
			if(result && result["NOT_LOGIN_CODE"] == 'true'){
				layer.open({
					title:"登录",
				  type: 2
				   ,area: ['400px','220px'] 
				  ,content: "/showPopLogin"
				});
				return ;
			}
			if(call_back !=undefined && call_back!=null){
				call_back.call(this,result);
			}
			
		},
		error : function(data,textstatus) {
			layer.alert(data.responseText+textstatus,{icon:2}); 
			loading.remove();
		}
	});
};

RemoteService.prototype.syncCall=function(url,para,call_back){
	var ro = this;
	if(para == undefined ){
		para= new Object();
	}
	var loading = new LoadingPop();
	loading.show();
	$.ajax({
		type : ro.type,
		async : false,
		url : url,
		data : $.toJSON(para),
		dataType : ro.dataType,
		contentType : ro.contentType,
		success : function(result) {
			loading.remove();
			if(call_back !=undefined && call_back!=null){
				call_back.call(this,result);
			}
			
		},
		error : function(data,textstatus) {
			layer.alert(data.responseText); 
			loading.remove();
		}
	});
};

RemoteService.prototype.postForm=function(url,formData,call_back){
	var ro = this;
	if(formData == undefined ){
		formData= new FormData();
	}
	var loading = new LoadingPop();
	loading.show();
	$.ajax({
		type : ro.type,
		async : ro.async,
		url : url,
		data : formData,
		dataType : ro.dataType,
		contentType :false,
		processData: false,//不转换参数格式
		success : function(result) {
			loading.remove();
			if(call_back !=undefined && call_back!=null){
				call_back.call(this,result);
			}
			
		},
		error : function(data,textstatus) {
			layer.alert(data.responseText);  
			loading.remove();
		}
	});
};

var remote= new RemoteService();