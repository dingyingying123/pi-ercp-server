<#macro queryDiv colName elementId>  
    <#if colName=="物料"||colName=="项目" >
    <label class="lab-style">${colName}编码：<i id="search_icon" class="pos-a glyphicon glyphicon-search search" onclick="$.showName('${colName}','${elementId}')"></i></label> <input type="text" class="form-control radius" id="${elementId}"> 
    <#else>
    <label class="lab-style">${colName}名称：<i id="search_icon" class="pos-a glyphicon glyphicon-search search" onclick="$.showName('${colName}','${elementId}')"></i></label> <input type="text" class="form-control radius" id="${elementId}"> 
    </#if>
	
	
</#macro>