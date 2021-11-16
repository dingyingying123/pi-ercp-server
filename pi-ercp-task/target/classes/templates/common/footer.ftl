<script type="text/javascript" language="javascript" src="/plugins/jquery/jquery-3.1.1.min.js"></script> 
<script type="text/javascript" language="javascript" src="/plugins/jquery/jquery.json.min.js"></script>
<script type="text/javascript" language="javascript" src="/plugins/jstree/jstree.min.js"></script>
<script type="text/javascript" language="javascript" src="/plugins/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script type="text/javascript" language="javascript" src="/plugins/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" language="javascript" src="/plugins/layer/2.4/layer.js"></script>
<script type="text/javascript" language="javascript" src="/js/utils.js"></script>
<script type="text/javascript" language="javascript" src="/js/date.js"></script>
<script type="text/javascript" language="javascript" src="/js/RemoteService.js"></script>
<script type="text/javascript" language="javascript" src="/js/paginate.js"></script>
<script type="text/javascript" language="javascript" src="/js/jquery.datatable.extends.js"></script>

<script type="text/javascript" language="javascript" src="/plugins/jquery.jqgrid/src/jquery.jqGrid.js"></script>
<script type="text/javascript" language="javascript" src="/plugins/jquery.jqgrid/js/i18n/grid.locale-cn.js"></script>
<script type="text/javascript" language="javascript" src="/js/jquery.jqGrid.editer.js"></script>
<script type="text/javascript" language="javascript" src="/js/jquery.jqGrid.column.js"></script>
<script type="text/javascript" language="javascript" src="/js/jquery.jqGrid.extends.js"></script>
<script type="text/javascript" language="javascript" src="/plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" language="javascript" src="/plugins/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>

<script type="text/javascript" language="javascript" src="/plugins/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" language="javascript" src="/plugins/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript" language="javascript" src="/js/jquery.cxselect.js"></script>
<script type="text/javascript" language="javascript" src="/js/validate-methods.js"></script>
<script type="text/javascript" language="javascript" src="/plugins/webuploader/webuploader.js"></script>
<script type="text/javascript" language="javascript" src="/js/webuploader.extends.js"></script>

<script type="text/javascript" language="javascript" src="/plugins/fileupload/ajaxfileupload.js"></script>
<script type="text/javascript" language="javascript" src="/plugins/Kalendae/build/kalendae.standalone.js" charset="gbk"></script>
<script type="text/javascript" language="javascript" src="/plugins/lodop/LodopFuncs.js" charset="gbk"></script>
<script type="text/javascript" language="javascript" src="/plugins/jquery.qrcode/jquery.qrcode.min.js" charset="gbk"></script>
<!--[if lt IE 9]>
<script type="text/javascript" src="/plugins/jquery-cookie/jquery.cookie.js"></script>
<![endif]-->
	
<script type="text/javascript" language="javascript">
	var  app_path = "${base}";
	$(".portlet .tools .col-exp").on("click", function(){
		$(this).text()=='收起' ? $(this).html('展开<i class="glyphicon glyphicon-chevron-down">').closest(".portlet-title").siblings(".portlet-body").slideUp() : $(this).html('收起<i class="glyphicon glyphicon-chevron-up">').closest(".portlet-title").siblings(".portlet-body").slideDown();
		
	});
</script> 