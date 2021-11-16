<#assign base = request.contextPath />
<#assign appName = "${app_name}" />
<#include "/macro/common_macro.ftl"/>
 <#include "/macro/common_query_macro.ftl"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="initial-scale=1.0, maximum-scale=2.0">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="renderer" content="webkit">
	<title><@block name="title">${appName}</@block></title>
	<#include "/common/header.ftl"/>
    <@block name="customStyle"></@block>
</head>
<body>
    <@block name="content">
    </@block>
     
    <#include "/common/footer.ftl"/>
    <@block name="customScript"></@block>
</body>
</html>