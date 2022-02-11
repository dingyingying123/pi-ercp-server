<@override name="customStyle" > 
<style type="text/css">
		*{
			padding: 0;
			margin: 0;
		}
		a{
			text-decoration: none;
		}
		body{
			background: #f5f5f5;
			font-family: "微软雅黑", Arial, "Trebuchet MS", Verdana, Georgia,Baskerville,Palatino,Times;
    		font-size: 16px;
		}
		h1{
			font-size: 44px;
		    color: #0188DE;
		    padding: 20px 0px 10px 0px;
		    font-weight: normal;
    		font-family: "微软雅黑", Arial, "Trebuchet MS", Helvetica, Verdana;
		}
		h2 {
		    color: #0188DE;
		    font-size: 16px;
		    padding: 10px 0px 40px 0px;
		}
		h1, h2, h3, h4 {
		    margin: 0;
		    font-weight: normal;
		    font-family: "微软雅黑", Arial, "Trebuchet MS", Helvetica, Verdana;
		}
		p{
			color: #666;
		}
		#page {
		    width: 910px;
		    padding: 20px 20px 40px 20px;
		    margin: 80px auto;
		    border-style: dashed;
		    border-color: #e4e4e4;
		    line-height: 30px;
		}
		.button {
		    width: 180px;
		    height: 28px;
		    margin-left: 0px;
		    margin-top: 10px;
		    background: #009CFF;
		    border-bottom: 4px solid #0188DE;
		    text-align: center;
		}
		.button a {
		    width: 180px;
		    height: 28px;
		    display: block;
		    font-size: 14px;
		    color: #fff;
		}
	</style>
</@override> 

<@override name="content" >

<div class="page-container">
</div>
	<div id="page">
		<h1>用户不存在！</h1>
		<br>
	</div>
</@override> 

<@override name="customScript">
<script type="text/javascript">
</script>
</@override> 

<@extends name="../base.ftl"/>
