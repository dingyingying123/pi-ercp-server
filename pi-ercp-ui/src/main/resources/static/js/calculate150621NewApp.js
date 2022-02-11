
//加载页面数据
function getInfo(homeInfo){

	giveTime();
//  var homeData = '{"apply_hid":"402886f666be51260166bf432817002e","business_address":"","business_company_name":"","business_farming":0,"business_land":0,"business_money":"","business_name":"","business_other":0,"business_time":"","business_total":0,"car_money":0,"car_name":"","car_number":"","car_time":"","car_type":"","createTime":"2018-10-29 17:59:01.0","createtime":"2018-10-29 17:59:01.0","dbType":"B","dbtype":"B","dependencyType":"dcb_dalate_examinetable_dependency","difficult_minor":0,"difficult_paralysis":0,"difficult_subtract":0,"dltEconomicMemberInfos":[{"apply_hid":"402886f666be51260166bf432817002e","coefficient":"","disabilityGrade":"","disabilityType":"","disabilitygrade":"","disabilitytype":"","disease":"","farming":"","hh_id":"d6ad106f449a41d0bb8194b275fa8a8f","idCard":"610601199609236106","idcard":"610601199609236106","income":"","iscity":"","land":"","marriage":"未婚","member_id":"31115a470ba9483a9603008afdd7aa13","member_name":"表格","occupation":"","relationship":"本人","seriously":"","unit_id":"150621001001"}],"dltEconomicSupportMemberInfos":[{"apply_hid":"","hh_id":"d6ad106f449a41d0bb8194b275fa8a8f","idCard":"44172319560830508X","idcard":"44172319560830508X","member_id":"402886f666be51260166bf432837002f","member_name":"抚养一","noSupport":"无","nosupport":"无","suppermoneylist":["706.27","2112.00","55.00","0.00","1689.60","792.00","0.00"],"suppernamelist":["务农","有车辆","财政供养","养殖业","个体经营","无固定工作","有固定工作"],"supportMoney":"5354.87","supportmoney":"5354.87","unit_id":"150621001001","workingType":"","workingtype":""}],"dlt_money_art":0,"family_total":5354.87,"hhType":"0","hh_address":"tt","hh_id":"d6ad106f449a41d0bb8194b275fa8a8f","hh_name":"表格","hhtype":"0","house_address":"","house_area":"","house_name":"","house_nature":"","house_time":"","house_type":"","improve_disability":0,"improve_old":0,"improve_small":0,"improve_total":0,"insurance":0,"insurance_house":0,"insurance_medical":0,"insurance_old":0,"insurance_total":0,"isnew":true,"memberType":"dcb_dalate_examinetable_member","money_bank":0,"money_bond":0,"money_collection":0,"money_insurance":0,"money_securities":0,"now_address":"fr","property_house":0,"property_land":0,"property_other":0,"property_storage":0,"property_total":0,"signature_identified_house_list":[],"signature_identified_list":[],"spending_benke":0,"spending_disability":0,"spending_disease":0,"spending_life":0,"spending_other":0,"spending_total":0,"spending_zhuanke":0,"total_houseincome":5354.87,"total_housepeople":0,"total_housespending":0,"total_improve_money":0,"total_month":0,"total_monthaverage":0,"total_securitypeople":0,"transfer_food":0,"transfer_grass":0,"transfer_other":0,"transfer_raising":5354.87,"transfer_total":5354.87,"type":"dcb_dalate_examinetable","unitID":"150621001001","unitName":"展旦召苏木","unitName2":"黄木独村","unitid":"150621001001","unitname":"展旦召苏木","unitname2":"黄木独村","wage":0,"wage_old":0,"wage_other":0,"wage_retired":0,"wage_total":0}'
//    var homeInfo = JSON.parse(homeData);

    //户信息
    $("#XJName").val(homeInfo.unitname);
    $("#XZName").val(homeInfo.unitname2);
    if(homeInfo.hhtype == '0'){
    	$("#NCDB").attr("checked",'checked'); 
    }else if(homeInfo.hhtype == '1'){
    	$("#CZDB").attr("checked",'checked'); 
    }
    
    $("#hhName").val(homeInfo.hh_name);
    $("#memberHomeAddr").val(homeInfo.hh_address);
    $("#homeHomeAddress").val(homeInfo.now_address);
    $("#ensureTypeN").val(homeInfo.dbtype);
    $("#ensurecall").val(homeInfo.hhcall);
    //家庭财产
    $("#bankDeposit").val(homeInfo.money_bank);
    $("#commercial").val(homeInfo.money_insurance);
    $("#carName").val(homeInfo.car_name);
    $("#carType").val(homeInfo.car_type);
    $("#carNum").val(homeInfo.car_number);
    $("#purchaseTime").val(homeInfo.car_time);
    $("#purchaseNum").val(homeInfo.car_money);
    $("#money_collection").val(homeInfo.money_collection);
    $("#dlt_money_art").val(homeInfo.dlt_money_art);
    $("#money_securities").val(homeInfo.money_securities);
    $("#money_bond").val(homeInfo.money_bond);  

    
    $("#securities	").val("");

    $("#bond").val("");
    $("#registrantName").val(homeInfo.business_name);

    $("#registrantUnitName").val(homeInfo.business_company_name);
    $("#registrantTime").val(homeInfo.business_time);
    $("#registrantMoney").val(homeInfo.business_money);
    $("#registrantAddress").val(homeInfo.business_address);
    
    $("#houseMemberId").val(homeInfo.house_name);

    $("#homeBuiltupArea").val(homeInfo.house_area);
    $("#houseType").val(homeInfo.house_natureName);
    $("#houseNature").val(homeInfo.house_typeName);
    $("#purchaseHouseTime").val(homeInfo.house_time);
    $("#houseAddress").val(homeInfo.house_address);

    //家庭收入认定
    $("#landOperat").val(homeInfo.business_land);
    $("#breedOperat").val(homeInfo.business_farming);
    $("#otherOperat").val(homeInfo.business_other);

    $("#All0").val(homeInfo.business_total);

    //工资性收入
    $("#workWage").val(homeInfo.wage);
    $("#pensionWage").val(homeInfo.wage_old);
    $("#retiredWage").val(homeInfo.wage_retired);
    $("#otherWage").val(homeInfo.wage_other);
    $("#All1").val(homeInfo.wage_total);
  //财产性收入
    $("#houseProperty").val(homeInfo.property_house);
    $("#landProperty").val(homeInfo.property_land);
    $("#storageproperty").val(homeInfo.property_storage);
    $("#otherPoperty").val(homeInfo.property_other);
    $("#All2").val(homeInfo.property_total);
  //转移性收入
    $("#supportTransfer").val(homeInfo.transfer_raising);
    $("#foodTransfer").val(homeInfo.transfer_food);
    $("#returntransfer").val(homeInfo.transfer_grass);
    $("#otherTransfer").val(homeInfo.transfer_other);
    $("#All3").val(homeInfo.transfer_total);
    //家庭总收入
    $("#familyTotal").val(homeInfo.family_total);
  //各类社会保险支出
    $("#social").val(homeInfo.insurance);
    $("#medical").val(homeInfo.insurance_medical);
    $("#endowment").val(homeInfo.insurance_old);
    $("#houseEfund").val(homeInfo.insurance_house);
    $("#payTaxes").val(homeInfo.insurance_total);

  //"特殊困难家庭核减金额情况
    $("#familyDisability").val(homeInfo.difficult_paralysis);
    $("#widowedSingle").val(homeInfo.difficult_minor);
    $("#downMoney").val(homeInfo.difficult_subtract);
  //"特殊困难家庭核减金额情况
    $("#familyDisabilitylsjz").val(homeInfo.succour_difficult_paralysis);
    $("#downMoneylsjz").val(homeInfo.succour_difficult_subtract);
  //家庭刚性支出情况
    $("#multipledidability").val(homeInfo.spending_disability);
    $("#milddisability").val(homeInfo.spending_disease);
    $("#undergraduate").val(homeInfo.spending_benke);
    $("#specialty").val(homeInfo.spending_zhuanke);
    $("#necessity").val(homeInfo.spending_life);
    $("#wecMoney").val(homeInfo.spending_other);
    $("#homeIncome").val(homeInfo.spending_total);
  //支出型家庭支出情况
    $("#multipledidabilitylsjz").val(homeInfo.succour_spending_disease);
    $("#milddisabilitylsjz").val(homeInfo.succour_spending_preschool);
    $("#undergraduatelsjz").val(homeInfo.succour_spending_highschool);
    $("#specialtylsjz").val(homeInfo.succour_spending_university);
    $("#necessitylsjz").val(homeInfo.succour_spending_other);
    $("#shbxplsjz").val(homeInfo.succour_spending_otherbx);
    $("#homeIncomelsjz").val(homeInfo.succour_spending_total);
  //急难型家庭支出情况
    $("#succour_difficult_naturaldisaster").val(homeInfo.succour_difficult_naturaldisaster);
    $("#succour_difficult_accident").val(homeInfo.succour_difficult_accident);
    $("#succour_difficult_tdjb").val(homeInfo.succour_difficult_tdjb);
    $("#succour_difficult_total").val(homeInfo.succour_difficult_total);
//临时救助各类合计
    $("#succour_total_peoincome").val(homeInfo.succour_total_peoincome);
    $("#succour_total_housespending").val(homeInfo.succour_total_housespending);
    $("#succour_total_income").val(homeInfo.succour_total_income);
//救助金额
    $("#succour_spending_money").val(homeInfo.succour_spending_money);
    $("#succour_difficult_money").val(homeInfo.succour_difficult_money);
  //在享低保家庭提高救助水平
    $("#max1").val(homeInfo.improve_disability);
    $("#max2").val(homeInfo.improve_old);
    $("#max3").val(homeInfo.improve_small);
    $("#max").val(homeInfo.improve_total);
  //各类合计
    $("#domination").val(homeInfo.total_houseincome);
    $("#expenditure").val(homeInfo.total_housespending);
    $("#pepNum").val(homeInfo.total_housepeople);
    $("#perCapitaSupplement").val(homeInfo.total_monthaverage);
    $("#securityNumber").val(homeInfo.total_securitypeople);
    $("#TGJE").val(homeInfo.total_improve_money);
    $("#ActualFamilySupplement").val(homeInfo.total_month);


    var memberListInfo = homeInfo.dltEconomicMemberInfos;

    document.getElementById("memberTRLength").rowSpan=parseInt(memberListInfo.length)+parseInt(2);
    var relationships=["","本人","配偶","养子女","儿子","女儿","父母","祖父母","兄弟姐妹","孙子女","（外）祖父母","儿媳","女婿","侄儿(女)","外甥子(女)","其他"];
      var marriageNames =["","未婚","已婚","离异","丧偶"];
                 for(var  i = 0;i<memberListInfo.length;i++){
             		var marriage= "";
             		if(memberListInfo[i].marriage == 99){
             			marriage="未说明的婚姻状态";
             		}else{
             			marriage=marriageNames[memberListInfo[i].marriage];
             		}
                 var str = '<tr><form id="memberF'+i+'"> '+
                 	   	'<td colspan="2">'+memberListInfo[i].member_name+'</td>'+
                 	   	'<td colspan="1">'+relationships[memberListInfo[i].relationship]+'</td>'+
                 	   	'<td colspan="1">'+marriage+'</td>'+
                 	   	'<td colspan="2">'+memberListInfo[i].idcard+'</td>'+
                 	   	'<td colspan="1">'+getAge(memberListInfo[i].idcard)+'</td>'+
                 	   	'<td colspan="1">'+memberListInfo[i].seriouslyName+'</td>'+
                 		'<td colspan="1">'+memberListInfo[i].diseaseName+'</td>'+
                 		'<td colspan="1">'+memberListInfo[i].disabilitytypeName+'</td>'+
                 		'<td colspan="1">'+memberListInfo[i].disabilitygradeName+'</td>'+
                 	   	'<td colspan="1">'+memberListInfo[i].coefficient+'</td>'+
                 	   	'<td colspan="1">'+memberListInfo[i].occupationName+'</td>'+
                 	   	'<td colspan="1">'+memberListInfo[i].income+'</td>'+
                 	   	'</form></tr>'
                 	   	$("#memberInfoTbody").append(str);
                     }

    var supportListInfo = homeInfo.dltEconomicSupportMemberInfos;
    document.getElementById("tdLength").rowSpan=parseInt(supportListInfo.length)+parseInt(2);
    for(var j = 0;j<supportListInfo.length;j++){
    	var supperMoneyInfo = supportListInfo[j].suppermoneylist;
    	var supperMoneySum = 0;
    	for(var k = 0;k<supperMoneyInfo.length;k++){
    		supperMoneySum = parseFloat(supperMoneyInfo[k]) + parseFloat(supperMoneySum);
    	}
    	var str = '<tr>'+
		'<td colspan="2"  class="w160" ><input type="text" class="w160  fs20lh30tac" readonly="readonly" value = "'+supportListInfo[j].member_name+'"  /></td>'+
		'<td colspan="2"  class="w160" ><input type="text" class="w160  fs16lh30tac" name="peopleIdNum" readonly="readonly" value = "'+supportListInfo[j].idcard+'"  /></td>'+
		'<td colspan="2"  class="w160" ><input type="text" class="w160  fs16lh30tac" name="supportType" readonly="readonly"  value = "'+supportListInfo[j].nosupportName+'"  /></td>'+
		'<td colspan="1"  class="w80" ><input type="text" class="w80  fs20lh30tac" name ="farming" readonly="readonly" value = "'+supperMoneyInfo[0]+'" /></td>'+
		'<td colspan="1"  class="w80" ><input type="text" class="w80  fs20lh30tac" name ="haveCar" readonly="readonly" value = "'+supperMoneyInfo[1]+'"  /></td>'+
		'<td colspan="1"  class="w80" ><input type="text" class="w80  fs20lh30tac" name="financial" readonly="readonly" value = "'+supperMoneyInfo[2]+'"  /></td>'+
		'<td colspan="1"  class="w80" ><input type="text" class="w80  fs20lh30tac" name="aquaculture" readonly="readonly" value = "'+supperMoneyInfo[3]+'"  /></td>'+
		'<td colspan="1"  class="w80" ><input type="text" class="w80  fs20lh30tac" name="individual" readonly="readonly" value = "'+supperMoneyInfo[4]+'"  /></td>'+
		'<td colspan="1"  class="w80" ><input type="text" class="w80  fs20lh30tac" name="noFixedWork" readonly="readonly" value = "'+supperMoneyInfo[5]+'"  /></td>'+
		'<td colspan="1"  class="w80" ><input type="text" class="w80  fs20lh30tac"  name="fixedWork" readonly="readonly" value = "'+supperMoneyInfo[6]+'"  /></td>'+
		'<td colspan="1"  class="w80" ><input type="text" class="w80  fs20lh30tac" readonly="readonly" readonly="readonly"  value = "'+supperMoneySum+'"  /></td>'+
		'</tr>'
		$("#trValue").append(str);   
    }
    
}
//盖章给时间
function getNowFormatDate() {
    var date = new Date();
    var seperator1 = "-";
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = year + seperator1 + month + seperator1 + strDate;
    return currentdate;
}
//获取当前时间
function  giveTime(){
	var dateVal  = getNowFormatDate();
	var years = dateVal.substring(0,4);
	var month = dateVal.substring(5,7);
	var day = dateVal.substring(8,10);
	$("#years").val(years);
	$("#month").val(month);
	$("#day").val(day);
}
//身份证计算年龄
function getAge(ic){
	var myDate = new Date();  
    var month = myDate.getMonth() + 1;  
	var day = myDate.getDate();  
	var age = myDate.getFullYear() - ic.substring(6, 10) - 1;  
	if (ic.substring(10, 12) < month || ic.substring(10, 12) == month && ic.substring(12, 14) <= day) {  
	     age++;  
    } 
  return age
}
