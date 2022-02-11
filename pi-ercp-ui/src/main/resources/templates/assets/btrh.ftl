<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>困境儿童和留守儿童基本信息采集表</title>
	<link rel="stylesheet" href="/css/difficulttable.css"/>
	<script type="text/javascript" src="/js/jquery-1.2.6.min.js"></script>
	<style>
			.image_list li {
				float: left;
			}

			.image_list  img {
				height: 120px;
			}

			.mbt {
				margin-right: 20px;
				margin-top: 20px;
				margin-left: 20px;
				float: right;
				height: 40px;
				width: 80px;
				border-radius: 6px;
				border: 1px cornflowerblue solid;
				background-color: dodgerblue;
				color: white;
			}
    </style>
</head>

<body>
<div class="main_body">
	<div style="height: 30px;"></div>
	<h1 class="main_tit">困境儿童和留守儿童基本信息采集表</h1>
	<div class="main_head">

		<div class="pull_left" >
			<span class="main_info">包头</span>市
			<span class="main_info" id="btcounty"></span>区
			<span class="main_info" id="bttowns"></span>乡（镇）
			<span class="main_info" id="btvillage"></span>村（居、街）委会
		</div>
		<div class="pull_right">
			<span>调查时间：</span>
			<span class="main_info wid50" id="year"></span>年
			<span class="main_info wid50" id="month"></span>月
			<span class="main_info wid50" id="day"></span>日
		</div>
	</div>
	<table class="main_table">
		<tbody>
		<tr>
			<td width="90" rowspan="12">儿童基本信息</td>
			<td >姓 名：</td>
			<td id="name"></td>
			<td colspan="2" >身份证号</td>
			<td colspan="1" id="homemembercount"></td>
			<td colspan="7" >其中：城市人口  <span class="main_info" id="cityCount"></span>农村人口  <span class="main_info" id="countyCount"></span></td>
		</tr>
		<tr>
			<td>户籍地址</th>
			<td colspan="11" id="haddr"></td>
		</tr>
		<tr>
			<td>实际居住地</th>
			<td  colspan="11" id="addr"></td>
		</tr>

		<tr>
			<td rowspan="3" colspan="2">家庭财产情况</td>
			<td colspan="4" >房屋</td>
			<td colspan="2" >车辆</td>
			<td colspan="2" >土地</td>
			<td colspan="1" rowspan="2">非生活必<br>需品</td>
			<td colspan="1" rowspan="2">其他</td>
		</tr>
		<tr>
			<td colspan="2" >房屋性质</td>
			<td>面积</td>
			<td>套数</td>
			<td>品牌</td>
			<td>价格</td>
			<td>亩数</td>
			<td>收入</td>
		</tr>
		<tr>
			<td colspan="2" id="fwxz" ></td>
			<td id="fwmj"></td>
			<td id="fwsl"></td>
			<td id="clpp"></td>
			<td id="cljg"></td>
			<td id="tdms"></td>
			<td id="tdsr"></td>
			<td id="fshbxp"></td>
			<td id="jtccqt"></td>
		</tr>
		<tr>
			<td colspan="12" style="text-align: left;">1.家庭成员基本情况信息</td>
		</tr>
		<tr>
			<td>姓名</td>
			<td>性别</td>
			<td colspan="2">与户主<br/>关系</td>
			<td>年龄</td>
			<td>重病病种</td>
			<td>残疾类型</td>
			<td>残疾等级</td>
			<td>工作单位及<br/>职业/上学</td>
			<td>社保金</td>
			<td>其他收入</td>
			<td>月收入</td>
		</tr>
		<tbody id="memBean" class="main_table">

		</tbody>
		<tr>
			<td colspan="12" style="text-align: left;">2.法定赡（抚、扶）养义务人信息</td>
		</tr>

		<tr>
			<td>姓名</td>
			<td>性别</td>
			<td colspan="2">与户主<br/>关系</td>
			<td>年龄</td>
			<td colspan="2">病种、残疾类型、残疾等级</td>
			<td colspan="2">工作单位及职业</td>
			<td>社保金</td>
			<td>其他收入</td>
			<td>月赡养费</td>
		</tr>
		<tbody id="sfyBean" class="main_table">

		</tbody>
		<tr>
			<td colspan="2"> 家庭困难<br>综合情况</td>
			<td colspan="10" id="jtknzhqk"></td>
		</tr>
		<tr>
			<td colspan="2"rowspan="2"> 实际居住环境</td>
			<td colspan="2">装修情况</td>
			<td colspan="8" id="zxqkname"></td>
		</tr>
		<tr>
			<td colspan="2">家用电器</td>
			<td colspan="8" id="jdqt"></td>
		</tr>
		<tr>
			<td colspan="2"rowspan="2"> 日常支出</td>
			<td colspan="2">水、电、气，月总支出金额</td>
			<td colspan="8" id="shuifei"></td>
		</tr>
		<tr>
			<td colspan="2">家庭通讯费月中支出金额</td>
			<td colspan="8" id="txf"></td>
		</tr>
		<tr>
			<td colspan="2"rowspan="4"> 其他</td>
			<td colspan="2">机动车辆、大型农机<br>具等非生活必需品</td>
			<td colspan="8" id="jdcdfshbxp"></td>
		</tr>
		<tr>
			<td colspan="2">子女择校就读情况</td>
			<td colspan="8" id="znzxjdqk"></td>
		</tr>
		<tr>
			<td colspan="2">饲养高档宠物、购置贵重<br>首饰或其他贵重物品</td>
			<td colspan="8" id="gdscp"></td>
		</tr>
		<tr>
			<td colspan="2">其他不能享受低保表中得情形</td>
			<td colspan="8" id="qtbnxsqx"></td>
		</tr>
		<div>
			<tr>
				<td colspan="12" style="text-align: left;">
					3.是否与申请材料一致：是
					<span class="check_box" style="margin: 2px;"><input type="checkbox" disabled="disabled" id="type_sfysqclyz_yes" /></span>否
					<span class="check_box" style="margin: 2px;"><input type="checkbox" disabled="disabled" id="type_sfysqclyz_no" /></span>
					<br/>
					说明原因：<span id="smreasion"></span>
				</td>
			</tr>
			<tr>
				<td colspan="12" style="text-align: left;height:180px;padding: 10px 4px;">
					<span   style="display: inline-block;vertical-align: top;margin-right: 30px;">第三方：</span>

					<!-- <ul class="image_list" id="workerimages" style="display: inline-block;height:170px;"> -->

					<!-- </ul> -->
				</td>
			</tr>
			<img src="/images/bt_chapter.png" style="height:252px;/* float:left; */position: absolute;display: inline-block;bottom: 250px;left: 104px;">
		</div>
		<tr>
			<td colspan="12" style="text-align:left; padding: 10px 4px;height:180px;">
				<div >
					<p>以上入户调查填写情况<span style="padding-left: 20px;" id="rhqk"></span></p>
					<p style="height: 30px;">属实：</p>
				</div>

				<div style="width: 35%; float: right; display: block;"><a onclick="setmembersignature()" href="#"  style="color: #0000FF;">被调查人签字：</a>
					<img id="image_member_s" onclick="setmembersignature()" style="display: inline-block;width: 50%;vertical-align: middle;"/>
				</div>
			</td>
		</tr>
		</tbody>

	</table>

	<div><br/><br/><br/><br/><br/><br/></div>
</div>
<script type="text/javascript">

				function initData(data) {

				    setMemberSignatureData(data.dbsign);
					setMemberFingerprintData(data.dbfingerprint);

					var myDate =  new Date;
					var year = myDate.getFullYear(); //获取当前年
					var mon = myDate.getMonth() + 1; //获取当前月
					var day= myDate.getDate(); //获取当前日
					$("#year").html(year);
					$("#month").html(mon);
					$("#day").html(day);

 					$("#btcounty").html(data.county);
					$("#bttowns").html(data.towns);
					$("#btvillage").html(data.village_name);

					$("#name").html(data.name);
					$("#homemembercount").html(data.homemembercount);
					$("#cityCount").html(data.cityMemberCount);
					$("#countyCount").html(data.countyMemberCount);
					$("#haddr").html(data.haddr);
					$("#addr").html(data.addr);
					$("#fwxz").html(data.btfwxz);
					$("#fwmj").html(data.homearea);
					$("#fwsl").html(data.homecount);
					$("#clpp").html(data.carBrand);
					$("#cljg").html(data.carMoney);
					$("#tdms").html(data.landCount);
					$("#tdsr").html(data.landIncome);
					$("#fshbxp").html(data.nonNecessities);
					$("#jtccqt").html(data.btOtherProperty);
					$("#zxqkname").html(data.decorate_info_name);
					$("#jdqt").html(data.jydq);
					$("#shuifei").html(data.sdmqf);
					$("#txf").html(data.tellFee);
					$("#jdcdfshbxp").html(data.fshbxp);
					$("#znzxjdqk").html(data.znzxjd);
					$("#gdscp").html(data.sygdcw);
					$("#qtbnxsqx").html(data.qtbnxsdbqx);
					$("#jtknzhqk").html(data.jtknzhqk);
					if(data.sfysqclyz=="是"){
						$("#type_sfysqclyz_yes").attr("checked", true);
					}else if(data.sfysqclyz=="否"){
						$("#type_sfysqclyz_no").attr("checked", true);
					}
					$("#smreasion").html(data.sfysqclyz_remark);
					$("#rhqk").html(data.rhdetail);

					var sexs = ["","男","女"];
					var works=["务工","务农","固定工作","无工作","离退休人员","在职人员","在读小学","在读初中","在读高中","在读大学","其他"];
							var relations=["","本人","配偶","养子女","儿子","女儿","父母","祖父母","兄弟姐妹","孙子女","（外）祖父母","儿媳","女婿","侄儿（女）","外甥子（女）","其他"];

							if(data.memBeans.length>0){
								for(var i = 0; i < data.memBeans.length; i++) {
									var name,sex,relation,age,serious_illnessName,mem_ensure_typeName,mem_ensure_levelName,work,btsbMoney,otherMoney,memmoney;

									name=data.memBeans[i].name;
									if(name == undefined){
										name="";
									}
									relation=relations[data.memBeans[i].relationid];
									if(relation == undefined){
										relation="";
									}else{
										if(relation=="儿子"){
											relation="子"
										}else if(relation=="女儿"){
											relation="女"
										}else if(relation=="孙子女"){
											relation="孙子、孙女或外孙子、外孙女"
										}else if(relation=="祖父母" ||relation=="（外）祖父母"){
											relation="祖父母或外祖父母"
										}else if(relation=="兄弟姐妹" ){
											relation="兄、弟、姐、妹"
										}else if(relation=="本人" ){
											relation="本人"
										}else if(relation=="配偶" ){
											relation="配偶"
										}else if(relation=="父母" ){
											relation="父母"
										}else if(relation=="儿媳" || relation=="女婿"){
											relation="子女配偶"
										}else{
											relation="其他"
										}
									}
									sex=sexs[data.memBeans[i].gender_id];
									if(sex == undefined){
										sex="";
									}
									age=data.memBeans[i].age;
									if(age == undefined){
										age="";
									}
									serious_illnessName=data.memBeans[i].serious_illnessName;
									if(serious_illnessName == undefined){
										serious_illnessName="";
									}
									mem_ensure_typeName=data.memBeans[i].mem_ensure_typeName;
									if(mem_ensure_typeName == undefined){
										mem_ensure_typeName="";
									}
									mem_ensure_levelName=data.memBeans[i].mem_ensure_levelName;
									if(mem_ensure_levelName == undefined){
										mem_ensure_levelName="";
									}
									work=works[data.memBeans[i].mem_work]
									if(work == undefined || work==''){
										work="无";
									}
									btsbMoney=data.memBeans[i].btsbMoney;
									if(btsbMoney == undefined){
										btsbMoney="";
									}
									otherMoney=data.memBeans[i].otherMoney;
									if(otherMoney == undefined){
										otherMoney="";
									}
									memmoney=(data.memBeans[i].memmoney/12).toFixed(2);
									if(memmoney == undefined){
										memmoney="";
									}

									var smember1 = '<tr><td>' +
										name+
										' </td><td>' +
										sex +
										'</td><td colspan="2">' +
										relation+
										'</td><td>' +
										age+
										'</td><td>' +
										serious_illnessName+
										'</td><td>' +
										mem_ensure_typeName+
										'</td><td>' +
										mem_ensure_levelName+
										'</td><td>' +
										work +
										'</td><td>' +
										btsbMoney +
										'</td><td>' +
										otherMoney +
										'</td><td>' +
										memmoney +
										'</td></tr>';
										$("#memBean").append(smember1);
								}

							}else{
								var smember = '<tr><td>' +
									' </td><td>' +
									'</td><td colspan="2">' +
									'</td><td>' +
									'</td><td>' +
									'</td><td>' +
									'</td><td>' +
									'</td><td>' +
									'</td><td>' +
									'</td><td>' +
									'</td><td>' +
									'</td></tr>';
									$("#memBean").append(smember)
							}
				if(data.memJhrBeans.length>0){
						for(var i = 0; i < data.memJhrBeans.length; i++) {
						var name,sex,relation,age,bzcjlx,work,btsbMoney,otherMoney,memmoney;
						name=data.memJhrBeans[i].name;
									if(name == undefined){
										name="";
									}
									relation=relations[data.memJhrBeans[i].relationid];
									if(relation == undefined){
										relation="";
									}else{
										if(relation=="儿子"){
											relation="子"
										}else if(relation=="女儿"){
											relation="女"
										}else if(relation=="孙子女"){
											relation="孙子、孙女或外孙子、外孙女"
										}else if(relation=="祖父母" ||relation=="（外）祖父母"){
											relation="祖父母或外祖父母"
										}else if(relation=="兄弟姐妹" ){
											relation="兄、弟、姐、妹"
										}else if(relation=="本人" ){
											relation="本人"
										}else if(relation=="配偶" ){
											relation="配偶"
										}else if(relation=="父母" ){
											relation="父母"
										}else if(relation=="儿媳" || relation=="女婿"){
											relation="子女配偶"
										}else{
											relation="其他"
										}
									}
									sex=sexs[data.memJhrBeans[i].gender_id];
									if(sex == undefined){
										sex="";
									}
									age=data.memJhrBeans[i].age;
									if(age == undefined){
										age="";
									}
									bzcjlx=data.memJhrBeans[i].memdisease;
									if(bzcjlx == undefined){
										bzcjlx="";
									}

									work=works[data.memJhrBeans[i].mem_work]
									if(work == undefined || work==''){
										work="无";
									}

									btsbMoney=data.memJhrBeans[i].btsbMoney;
									if(btsbMoney == undefined){
										btsbMoney="";
									}
									otherMoney=data.memJhrBeans[i].otherMoney;
									if(otherMoney == undefined){
										otherMoney="";
									}
									memmoney=(data.memJhrBeans[i].memsyf/12).toFixed(2);
									if(memmoney == undefined){
										memmoney="";
									}
									var smember = '<tr><td>' +
									name +
									' </td><td>' +
									sex +
									'</td><td colspan="2">' +
									relation +
									'</td><td>' +
									age +
									'</td><td colspan="2">' +
									bzcjlx +
									'</td><td colspan="2">' +
									work +
									'</td><td>' +
									btsbMoney +
									'</td><td>' +
									otherMoney +
									'</td><td>' +
									memmoney +
									'</td></tr>';
									$("#sfyBean").append(smember)
						}
				}else{
				var smember = '<tr><td>' +
									' </td><td>' +
									'</td><td colspan="2">' +
									'</td><td>' +
									'</td><td colspan="2">' +
									'</td><td colspan="2">' +
									'</td><td>' +
									'</td><td>' +
									'</td><td>' +
									'</td></tr>';
									$("#sfyBean").append(smember)
				}


					}

					//申请人签字
					function setmembersignature() {
						android.memberSingature();
					}
					//申请人指纹
					function setmemberfingerprint() {
						android.memberFingerprint();
					}

					//核查人员签字
					function setworksignature() {
						android.workSingature();
					}

					//设置申请人签字
					function setMemberSignatureData(imgpath) {
						$('#image_member_s').attr("src", imgpath);
					}
					//设置申请人指紋
					function setMemberFingerprintData(imgpath) {
						$('#image_member_f').attr("src", imgpath);
					}




    </script>

</body>

</html>