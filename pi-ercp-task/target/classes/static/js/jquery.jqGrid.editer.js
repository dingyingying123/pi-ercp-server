/**
 * Created by 33925
 */

//设置各种编辑器
///edit
(function($) {
	$.jgrid.util = {};
	$.extend($.jgrid.util,{
		getColDefineByName:function(p,colName){
			
			var cols = p.colModel ;
			for(i=0;i<cols.length;i++){
				var colDefine = cols[i];
				if(colDefine["name"] == colName){
					return colDefine;
				}
			}
		}
	
	});
	
	$.jgrid.editer = $.jgrid.editer || {};
	
	$.extend($.jgrid.editer,{
		///普通文本输入款
		text:{ 
			custom_element:function(value,options){
				var elem = document.createElement("input");
				$(elem).css({width:"96%"});
				$(elem).addClass("form-control");
				$(elem).val(value);
				$(elem).attr("oldValue",value);
				var rowEditAbleSet =  $(this).getGridParam("rowEditAbleSet");
				var setValue =true;
				if(rowEditAbleSet!=undefined){
					setValue = rowEditAbleSet.call(this,options.rowId,options.name);
				}
				if(setValue != true){
			    	$(elem).attr("readonly","readonly");
			    }else{
			    	 //获取列定义
					var colDefine = $.jgrid.util.getColDefineByName(this.p,options.name);
			    	if(colDefine.keyUp!=undefined){
						$(elem).on("blur",function(){
							colDefine.keyUp($(elem),this);
						})
					}
			    	//设置数据类型，及验证类型
			    	if(options.dataType != undefined){
			    		$(elem).attr("dataType",options.dataType);
			    	}
			    	//设置验证
			    	if(options.valid != undefined){
			    		$.each(options.valid, function(key, value){
			    			$(elem).attr(key,value);
						});
			    	}
			    	var iVal = value; 
			    	$(elem).on("keypress",function(event){
			    		iVal = $(elem).val();
			    	});
			    	
			    	$(elem).keydown(function(){
			    		if(event.keyCode == 13 ||event.which == 13){
							if(colDefine.keyUp!=undefined){
								colDefine.keyUp($(elem),this);
							}
						}
			    	});
			    	
			    	$(elem).keyup(function(){
			    		
			    		
			    		//验证值是否为数字
			    		if(options.dataType =="number"){
			    			//验证是否数字
			    			if(!(!isNaN($(elem).val()) || !isNaN($(elem).val()+"0")) ){
			    				$(elem).val(iVal);
			    			}
			    			//验证最大值
			    			if(options.valid && options.valid.maxVal){
			    				if(parseFloat($(elem).val())>options.valid.maxVal){
			    					$(elem).val(iVal);
			    				}
			    			}
			    		}else if(options.dataType  =="string"){
			    			//验证输入长度
			    			if(options.valid && options.valid.maxLen){
			    				if($(elem).val().length>options.valid.maxLen){
			    					$(elem).val(iVal);
			    				}
			    			}
			    		}
			    	});
			    	
			    	setTimeout(function(){
						elem.focus();
					})
			    }
				
				return elem;
			},custom_value:function(elem){
				return elem.val();
			}
		},
		//搜索框编辑器
		popSelect:{ 
			custom_element:function(value,options){
				var elem = document.createElement("input");
				$(elem).css({width:"96%"});
				$(elem).addClass("form-control"); 
				$(elem).css({"padding-right":"14px"});
				$(elem).val(value);
				
				var rowEditAbleSet =  $(this).getGridParam("rowEditAbleSet");
				var setValue =true;
				if(rowEditAbleSet!=undefined){
					setValue = rowEditAbleSet.call(this,options.rowId,options.name);
				}
				
				$(elem).attr("readonly","readonly");
				
				if(!(setValue != true)){
			    	var elemi = document.createElement("i");
					$(elemi).css({position:"absolute",top:"9px",right:"14px",color:"blue",cursor: "pointer"});
					$(elemi).addClass("glyphicon glyphicon-search "+options.name+"-popSelect");
				    //获取列定义
					var colDefine = $.jgrid.util.getColDefineByName(this.p,options.name);
					if(colDefine.popup!=undefined){
						$(elemi).on("click",function(){
							colDefine.popup($(elem),options.rowId,options.name);
						})
					}
			    }
				
				//聚焦时给input标签后面加一个搜索图标
		    	$(elem).focus(function(){
		    		$(elem).after(elemi)
		    		
		    	})
		    	setTimeout(function(){
					elem.focus();
				})
				
				
				
				return elem;
			},custom_value:function(elem){
				return elem.val();
			}
		},
		//日期编辑器
		pickDate:{ 
			custom_element:function(value,options){
				var elem = document.createElement("input");
				$(elem).css({width:"96%"});
				$(elem).addClass("form-control");
				$(elem).val(value);
				var rowEditAbleSet =  $(this).getGridParam("rowEditAbleSet");
				var setValue =true;
				if(rowEditAbleSet!=undefined){
					setValue = rowEditAbleSet.call(this,options.rowId,options.name);
				}
				if(setValue == true){
					$(elem).removeAttr("readonly");
					$(elem).attr("data-date-format","yyyy-mm-dd");	 
					$(elem).datetimepicker({
						autoclose: true,
						minView: 2,
						language: "zh-CN",
						todayBtn: "linked"
					});
					setTimeout(function(){
						elem.focus();
					})
			    }else{
			    	$(elem).attr("readonly","readonly");
			    }
				return elem;
			},custom_value:function(elem){
				return elem.val();
			}
		},
		//日期编辑器
		pickDateAfter:{ 
			custom_element:function(value,options){
				var elem = document.createElement("input");
				$(elem).css({width:"96%"});
				$(elem).addClass("form-control");
				$(elem).val(value);
				var rowEditAbleSet =  $(this).getGridParam("rowEditAbleSet");
				var setValue =true;
				if(rowEditAbleSet!=undefined){
					setValue = rowEditAbleSet.call(this,options.rowId,options.name);
				}
				if(setValue == true){
					$(elem).removeAttr("readonly");
					$(elem).attr("data-date-format","yyyy-mm-dd");	 
					$(elem).datetimepicker({
						autoclose: true,
						minView: 2,
						language: "zh-CN",
						todayBtn: "linked",
						initialDate :new Date(),
						startDate: new Date()
						
					});
					setTimeout(function(){
						elem.focus();
					})
				}else{
					$(elem).attr("readonly","readonly");
				}
				return elem;
			},custom_value:function(elem){
				return elem.val();
			}
		},
		//下拉选择
		select:{
			custom_element:function(value,options){
				var elem = document.createElement("select");
				
				$(elem).css({width:"96%"});
				$(elem).addClass("form-control");
				$(elem).addClass("colsel");
				$(elem).append("<option></option>");
				
				//设置数据源
				var colDefine = $.jgrid.util.getColDefineByName(this.p,options.name);
				if(colDefine.keyUp!=undefined){
					$(elem).on("blur",function(){
						colDefine.keyUp($(elem),this);
					})
				}
				if(colDefine.dataSource!=undefined){
					var source  = colDefine.dataSource;
					//如是函数
					if(typeof colDefine.dataSource === "function"){
						source = colDefine.dataSource(options.rowId ,options.name);
					}
					for(i = 0;i<source.length;i++){
						var item = source[i];
						if(typeof item=='string'){
							$(elem).append("<option value='"+item+"'>"+item+"</option>");
						}else{
							if(!$.isEmptyStr(item["valueExt"])){
								$(elem).append("<option valueExt='"+item["valueExt"]+"' value='"+item["value"]+"'>"+item["label"]+"</option>");
							}else{
								$(elem).append("<option value='"+item["value"]+"'>"+item["label"]+"</option>");
							}
						}
					}
				}
				
				if(colDefine.change!=undefined){
					$(elem).on("change",function(){
						colDefine.change($(elem),this);
					});
				}
				//设置值
				$(elem).val(value);
				var rowEditAbleSet =  $(this).getGridParam("rowEditAbleSet");
				var setValue =true;
				if(rowEditAbleSet!=undefined){
					setValue = rowEditAbleSet.call(this,options.rowId,options.name);
				}
				if(setValue == true){
					$(elem).removeAttr("readonly");
					setTimeout(function(){
						elem.focus();
					})
			    }else{
			    	$(elem).attr("readonly","readonly");
			    }
				//select 选中事件传递
				$(elem).on("change",function(){
					if(colDefine.select!=undefined){
						colDefine.select($(elem),this);
					}
				})
				return elem;
			},custom_value:function(elem){
				return elem.val();
			}
		}
		
	});

	
	//设置格式化模式
	$.jgrid.format = {};
	$.jgrid.unformat = {};
	$.extend($.jgrid.format,{
		select :function (cellvalue,options,rowObjectt) { 
			
			if(cellvalue == null && cellvalue == undefined){ return "";}
			
			var display = cellvalue;
			var colDefine = options.colModel;
			if(colDefine.dataSource!=undefined){
				var source  = colDefine.dataSource;
				//如是函数
				if(typeof colDefine.dataSource === "function"){
					source = colDefine.dataSource(options.rowId ,options.name);
				}
				for(i = 0;i<source.length;i++){
					var item = source[i];
					if(typeof item=='string'){
						break;
					}else{
						if(item["value"] == cellvalue){
							display = item["label"];
							break;
						}
					}
				}
			}
			return "<label val='"+cellvalue+"'>"+display+"</label>";
		}
	});
	
	$.extend($.jgrid.unformat,{
		select : function ( cellvalue, options, cell){
			return $('label', cell).attr('val');
		}
	});
	
	
})(jQuery);
