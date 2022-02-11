<style type="text/css"> 
body{background-color:#fcfcfc;}
.error-box{width:100%;height:128px;text-align: center;}
.error-box .error-code{display: inline-block; letter-spacing: -10px;line-height: 128px;font-size: 128px;font-weight: 300;position: relative;top: 0px;margin-top: 0;margin-bottom: 10px;color: #32c5d2;text-align: right;}
.error-box .details{margin-left: 40px;display: inline-block;padding-top: 0;text-align: left;}
.error-box .details p{margin-top: 5px;margin-bottom:5px;}
.error-box .details p.auto{font-size:12px;}
.error-box .details p a{text-decoration: none;color:#3366CC;}
.error-box .details p a:hover{border-bottom:1px solid #3366CC;}
.error-box .details .auto span{color:#FF0033;}
</style> 
<body>
	<div class="error-box">
		<div class="error-code"> 404 </div>
		<div class="details">
			<h2>抱歉！未找到当前页面</h2>
			<p>您访问的页面不存在或已被删除，请选择<a href="javascript:history.back(-1)">返回上一页</a>或<a href="/">首页</a></p>
			<p class="auto"><span>5</span> 秒后自动返回上一页</p>
		</div>
	</div>
</body>
 <script type="text/javascript" src="/plugins/jquery/jquery-3.1.1.min.js"></script>
 <script type="text/javascript">
$(function(){
	var winHeight = $(window).height();
	$(".error-box").css({marginTop: winHeight*0.1+"px"});
	//延时
	var count = 5;
	function delay(){
		if(count <= '-1'){
			count = 5;
			window.history.back();
		}else {
			$("p.auto span").text(count)
			count--;
			setTimeout(function(){
				delay();
			}, 1000)
		}
	};
	delay();
	
})

 </script>