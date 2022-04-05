<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1"/>
    <link rel="stylesheet" type="text/css" href="/css/application150621Form.css"/>
    <script type="text/javascript" src="/js/jquery-1.8.3.min.js"></script>
    <script language="javascript" type="text/javascript" src="/js/calculate150621NewApp.js"></script>
    <title>困境儿童和留守儿童基本信息采集表</title>
</head>
<body><!--  onload="getInfo()"	 -->
<style>
    /* 布局纵向 */
    .a4-endwise{
        width: 1075px;
        height: 1568px;
        border: 1px #000 solid;
    }
    /* 布局横向 */
    .a4-broadwise{
        width: 1569px;
        height: 1075px;
        border: 1px #000 solid;
    }
</style>
<div class="bigContent">
    <!--<div class="titleImg" id="titleImg"></div>-->
    <div class="content" id="content">
        <div class="contentW">
            <br>
            <p class="titleS" id="titleS">困境儿童和留守儿童基本信息采集表</p>
            <br><br>
<#--            <div class="fs20h20lh20">苏木镇（街道办事处）-->
<#--                <input type="text" class="w200h20hs20h20lh20bb1s" value="" readonly="readonly"-->
<#--                       id="XJName"/>嘎查村（居委会）-->
<#--                <input type="text" class="w200h20hs20h20lh20bb1s" value="" readonly="readonly"-->
<#--                       id="XZName"/>-->
<#--                &nbsp;&nbsp;&nbsp;&nbsp;入户时间：-->
<#--                <input type="text" class="w80h20fs20lh20bb1s" id="years" readonly="readonly"/>年-->
<#--                <input type="text" class="w50h20fs20lh20bb1s" id="month" readonly="readonly"/>月-->
<#--                <input type="text" class="w50h20fs20lh20bb1s" id="day" readonly="readonly"/>日-->
<#--            </div>-->
<#--            <br>-->
            <!-- 申请类型 -->
<#--            <p class="w100Bh20lh20fs20">-->
<#--                申请救助类型：<input type="checkbox" class="h15w15" id="CZDB" disabled="disabled"/>&nbsp;城镇低保&nbsp;&nbsp;&nbsp;&nbsp;<input-->
<#--                    type="checkbox" id="NCDB" class="h15w15" disabled="disabled"/>&nbsp;农村低保-->
<#--            </p>-->
            <br>
            <table class="sheet">
                <tr>
                    <td width="90" rowspan="6">儿童基本信息</td>
                    <td class="w80  fs20lh30tac">姓  名</td>
                    <td class="w160">${(info.childName)!}</td>
                    <td class="w160  fs20lh30tac">身份证号</td>
                    <td class="w160">${(info.childIdNo)!}</td>
                    <td class="w160  fs20lh30tac">联系电话</td>
                    <td colspan="1" class="w240">${(info.childTelNo)!}</td>
                </tr>
                <tr>
                    <td colspan="1" class="w160  fs20lh30tac">民  族</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.childNationality)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">性  别</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.childMale)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">入户情况</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.homeSituation)!}</td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">户口地址</td>
                    <td colspan="5" class="w160  fs20lh30tac">${(info.childAccountProvince)!}省${(info.childAccountCity)!}${(info.childAccountCounty)!}${(info.childAccountTown)!}${(info.childAccountAddress)!}</td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">现住址</td>
                    <td colspan="5" class="w80  fs20lh30tac">${(info.childCurrentProvince)!}省${(info.childCurrentCity)!}${(info.childCurrentCounty)!}${(info.childCurrentTown)!}${(info.childCurrentAddress)!}</td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">健康状况</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.childHealthStatus)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">上报类型</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.childEscalationType)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">残疾类型</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.childDisabilityType)!}</td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">残疾等级</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.childDisabilityLevel)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">患病病种</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.childDiseaseType)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">就学情况</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.childSchoolAttendance)!}</td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">其他情况</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.childOtherCases)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">社会福利救助扶贫落实情况</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.childPovertyAlleviationImplementation)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">遭受监护人侵害的情形</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.childViolationGuardian)!}</td>
                </tr>
                <tr>
                    <td width="90" rowspan="5">父亲基本情况</td>
                    <td class="w80  fs20lh30tac">姓  名</td>
                    <td class="w160">${(info.fatherGuardian.name)!}</td>
                    <td class="w160  fs20lh30tac">身份证号</td>
                    <td class="w160">${(info.fatherGuardian.idNo)!}</td>
                    <td class="w160  fs20lh30tac">联系电话</td>
                    <td colspan="1" class="w240">${(info.fatherGuardian.telNo)!}
                    </td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">户口地址</td>
                    <td colspan="5" class="w80  fs20lh30tac">${(info.fatherGuardian.accountProvince)!}${(info.fatherGuardian.accountCity)!}${(info.fatherGuardian.accountCounty)!}${(info.fatherGuardian.accountTown)!}${(info.fatherGuardian.accountAddress)!}</td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">现 /务工住址</td>
                    <td colspan="5" class="w80  fs20lh30tac">${(info.fatherGuardian.currentProvince)!}${(info.fatherGuardian.currentCity)!}${(info.fatherGuardian.currentCounty)!}${(info.fatherGuardian.currentTown)!}${(info.fatherGuardian.currentAddress)!}</td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">健康状况</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.fatherGuardian.healthStatus)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">残疾类型</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.fatherGuardian.disabilityType)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">残疾级别</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.fatherGuardian.disabilityLevel)!}</td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">患病类型</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.fatherGuardian.diseaseType)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">家庭经济来源</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.fatherGuardian.familyIncome)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">其他情况</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.fatherGuardian.otherCases)!}</td>
                </tr>
                <tr>
                    <td width="90" rowspan="5">母亲基本情况</td>
                    <td class="w80  fs20lh30tac">姓  名</td>
                    <td class="w160">${(info.matherGuardian.name)!}</td>
                    <td class="w160  fs20lh30tac">身份证号</td>
                    <td class="w160">${(info.matherGuardian.idNo)!}</td>
                    <td class="w160  fs20lh30tac">联系电话</td>
                    <td colspan="1" class="w240"><input type="text" class="w240  fs20lh30tac"
                                                        id="homeHomeAddress" readonly="readonly">${(info.matherGuardian.telNo)!}
                    </td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">户口地址</td>
                    <td colspan="5" class="w80  fs20lh30tac">${(info.matherGuardian.accountProvince)!}${(info.matherGuardian.accountCity)!}${(info.matherGuardian.accountCounty)!}${(info.matherGuardian.accountTown)!}${(info.matherGuardian.accountAddress)!}</td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">现 /务工住址</td>
                    <td colspan="5" class="w80  fs20lh30tac">${(info.matherGuardian.currentProvince)!}${(info.matherGuardian.currentCity)!}${(info.matherGuardian.currentCounty)!}${(info.matherGuardian.currentTown)!}${(info.matherGuardian.currentAddress)!}</td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">健康状况</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.matherGuardian.healthStatus)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">残疾类型</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.matherGuardian.disabilityType)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">残疾级别</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.matherGuardian.disabilityLevel)!}</td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">患病类型</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.matherGuardian.diseaseType)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">家庭经济来源</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.matherGuardian.familyIncome)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">其他情况</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.matherGuardian.otherCases)!}</td>
                </tr>
                <tr>
                    <td width="90" rowspan="3">其他监护人情况</td>
                    <td class="w80  fs20lh30tac">监护人姓名</td>
                    <td class="w160">${(info.otherGuardian.name)!}</td>
                    <td class="w160  fs20lh30tac">身份证号</td>
                    <td class="w160">${(info.otherGuardian.idNo)!}</td>
                    <td class="w160  fs20lh30tac">联系电话</td>
                    <td colspan="1" class="w240">${(info.otherGuardian.telNo)!}
                    </td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">与儿童关系</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.otherGuardian.relationship)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">健康状况</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.otherGuardian.healthStatus)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">残疾类型</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.otherGuardian.disabilityType)!}</td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">残疾级别</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.otherGuardian.disabilityLevel)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">患病类型</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.otherGuardian.diseaseType)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">其他监护人原由</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.otherGuardian.reasons)!}</td>
                </tr>
                <tr>
                    <td width="90" rowspan="2">机构</td>
                    <td class="w80  fs20lh30tac">机构名称</td>
                    <td class="w160">${(info.organizationName)!}</td>
                    <td class="w160  fs20lh30tac">负责人</td>
                    <td class="w160">${(info.organizationPrincipal)!}</td>
                    <td class="w160  fs20lh30tac">联系电话</td>
                    <td colspan="1" class="w240">${(info.organizationTelNo)!}
                    </td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">单位性质</td>
                    <td colspan="1" class="w80  fs20lh30tac">${(info.organizationNature)!}</td>
                    <td colspan="1" class="w80  fs20lh30tac">居住地址</td>
                    <td colspan="3" class="w80  fs20lh30tac">${(info.organizationResidentialProvince)!}${(info.organizationResidentialCity)!}${(info.organizationResidentialCounty)!}${(info.organizationResidentialTown)!}${(info.organizationResidentialAddress)!}</td>
                </tr>
                <tr>
                    <td colspan="2" class="w80  fs20lh30tac">帮扶计划</td>
                    <td colspan="4" class="w80  fs20lh30tac">${(info.helpSuggestions)!}</td>
                </tr>
                <tr>
                    <td width="90" rowspan="2">保障费发放情况</td>
                    <td class="w80  fs20lh30tac">领取方式</td>
                    <td class="w160">${(info.securityFeeCollectionMethod)!}</td>
                    <td class="w160  fs20lh30tac">领取人（开户人）</td>
                    <td class="w160">${(info.securityFeeCollector)!}</td>
                    <td class="w160  fs20lh30tac">领取人与儿童关系</td>
                    <td colspan="1" class="w240">${(info.securityFeeRecipientRelationship)!}
                    </td>
                </tr>
                <tr>
                    <td colspan="1" class="w80  fs20lh30tac">保障标准</td>
                    <td colspan="5" class="w80  fs20lh30tac"> ${(info.securityFeeGuaranteeStandard)!}  （每人每月发放多少补助资金）</td>
                </tr>
                <tr style="height: 100px;">
                    <td colspan="1" class="w80  fs20lh30tac fw600">申请人签字</td>
                    <td colspan="14" >
                        <ul class="image_list" id="memberimager">
                            <#if applyfile??>
                                <img id="image_member_r"  src="/file/download/${(applyfile)!}"/>
                                <#else >
                                <img id="image_member_r" src="#"/>
                            </#if>

                            <button class="mbt" onclick="android.Sign('${(childId)!}')">签 字</button>
<#--                            <button class="mbt" onclick="android.Sign('812b2d486e7c446eb52c86c0b3f122e6')">签 字</button>-->
                        </ul>
                    </td>
                </tr>
                <tr style="height: 100px;">
                    <td colspan="1" class="w80  fs20lh30tac fw600">核查人签字</td>
                    <td colspan="14" class="w80">
                        <ul class="image_list" id="image_worker_s">
                            <h2>${(user.userName)!}</h2>
<#--                            <img id="image_worker_s" src="${(approvefile)!}" onclick="setshsignature()"/>-->
                        </ul>
<#--                        <button class="mbt" onclick="setworksignature()">签字</button>-->
                    </td>
                </tr>
                <!-- <tr>
                <td colspan="10" class="w800h80">
                <div class="w100bh80db">
                <form id="textId">
                <input type="hidden" id="text1" name ="text1" />
                <input type="hidden" id="text2" name ="text2" />
                <input type="hidden" id="text3" name ="text3" />
                <input type="hidden" id="text4" name ="text4" />
                <input type="hidden" id="text5" name ="text5" />指纹
                </form>
                <form id="imgId">
                <input type="hidden" id="gz1" />
                <input type="hidden" id="gz2" />
                </form>
                <ul>
                <li class="w300h100bdbfs20fw600fllh80"><a href="javascript:void(0);" onclick="SignText(0)">认定人签字：（两人以上）</a></li>
                <li class="w160h80fl"><span id="sgin2"></span></li>
                <li class="w160h80fl"><span id="sgin3"></span></li>
                <li class="w160h80fl"><span id="sgin4"></span></li>
                </ul>
                </div>
                </td>
                <td colspan="5"  class="w400h80">
                <div class="w100bh80db">
                <span class="w200h100bdbfw600fllh80"><a href="javascript:void(0);" onclick="SignText(1)">被认定人签字</a><a href="javascript:void(0);" onclick="fingerprint(8)" >/指纹：</a></span>
                <span class="w200h100bdbfl" id="sgin1"></span>
                <div style="position:relative;">
                            <div id="fingerprintDiv" style="position:absolute;right: 150px;top:10px;">
                                <img onclick="fingerprint(8)" style="position:absolute;top:-10px; height: 75px;display: none" id="fingerprintImg8" title="点击重新录入指纹" src="">
                                <form action="" method="post" name="form1" id="form1">
                                      <object classid="clsid:87772C8D-3C8C-4E55-A886-5BA5DA384424" id="ZAZFingerActivex" name="ZAZFingerActivex" width="0"  height="0"   accesskey="a" tabindex="0"  title="finger"></object>
                                  </form>
                            </div>
                </div>
                </div>
                </td>
                </tr> -->
            </table>
            <br>
            <br>
        </div>
    </div>
</div>
<!-- 盖章隐藏域 -->
<!--<form id="imgId">
    <input id="imgGZVal0" name="imgTestVal0" type="hidden">
    <input id="imgGZVal1" name="imgTestVal1" type="hidden">
</form>-->
<!-- 盖章隐藏域 -->
<!--<object id="printWB" style="dispaly:none" classid="clsid:8856F961-340A-11D0-A96B-00C04FD705A2" height="0"></object>--%>
<script type="text/javascript"  src="/pages/paperlessHtml/js/finger.js"></script> --%>
   -->
<script type="text/javascript">
	    //设置调查人员签字 进入form时加载用
		function setSignDcrData(imgpathstring) {
			var imgpaths=imgpathstring.split(",");
			$("#image_worker_s").html("");
			for (var i = 0; i < imgpaths.length; i++) {
				$("#image_worker_s").append("<img style=\"float: left; margin - right: 5 px;\" src='" + imgpaths[i] + "' onclick= editworksignature(\'"+ imgpaths[i]+"') />");
			}
		}
        //设置调查人员签字 新加签字或者删除时用
		function setSignDcrDataString(imgpathstring) {
            $("#image_worker_s").html('');
            var imgpaths=imgpathstring.split(",");
            for (var i = 0; i < imgpaths.length; i++) {
                $("#image_worker_s").append("<img style=\"float: left; margin - right: 5 px;\" src='" + imgpaths[i] + "' onclick= editworksignature(\'"+ imgpaths[i]+"') />");
            }
		}
		//调查人员签字
		function setworksignature() {
			android.dcrSign();
		}
		//申请人签字
		function sethcsignature() {
            window.android.Sign();
		}
		 //修改核查人员签字
		function editworksignature(imgpath1) {
            window.android.deletePic(imgpath1);
		}

		function reload() {
            window.location.reload();
		}
</script>
</body>
</html>
