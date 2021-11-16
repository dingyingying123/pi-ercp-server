<#assign base = request.contextPath />
<#assign appName = "${app_name}" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="initial-scale=1.0, maximum-scale=2.0">
	<title><@block name="title">${appName}</@block></title>
	<#include "/common/header_login.ftl"/>
    <@block name="customStyle"></@block>
</head>
<body  >
    <@block name="content"></@block>
    
    <#include "/common/footer_login.ftl"/>
    <@block name="customScript"></@block>
</body>
</html>