<#macro showNav path>  
    <nav class="breadcrumb clearfix"><i class="glyphicon glyphicon-home"></i> 首页
    <#list path?split("/") as name>  
          <span class="c-gray en">&gt;</span> ${name}  
    </#list> <!-- location.replace(location.href) --><!-- location.reload() -->
	<a class="btn btn-link pull-right" style="line-height:1.6em;margin-top: 6px;" href="#" onclick="$.getUserLayer('','','','')" title="刷新" >刷新 <i class="glyphicon glyphicon-refresh"></i></a></nav> 
</#macro>