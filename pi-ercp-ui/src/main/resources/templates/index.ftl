<@override name="content" >
<style>
.form-horizontal .form-group{display: block;}
label.error{top:auto;}
.user-info>a{height:44px;line-height:44px;color:#fff;}
.user-info .userIcon{display: inline-block;vertical-align: middle;}
.user-info img{width:28px;}
.user-info .menu{margin-top:0px;}
.dropDown.open>.dropDown-menu{left:auto;right:-1px;}
#myselfinfo:focus{background-color: rgba(255,255,255,0.2);text-decoration: none;}
.menu>li a{padding-top:6px;padding-bottom:6px;}
.dropdown-menu>li>a{padding-left:25px;}
.user-info .iconfont{font-size:14px;}
.menu .iconfont{position:absolute;left:5px;line-height:32px;color:#999;}
</style>
<header class="navbar-wrapper">
	<div class="navbar navbar-fixed-top" id="max">
		<div class="container-fluid cl">
			<a class="logo -navbarlogo f-l mr-10 hidden-xs" ><img src="/plugins/h-ui.admin/images/logo.png" alt=""><span><@spring.message "login.logo"/></span></a>
			<a class="logo navbar-logo-m f-l mr-10 visible-xs">GW</a>
			<!-- <span class="logo navbar-slogan f-l mr-10 hidden-xs">v3.1</span> -->
			<a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
			<nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
				<ul class="cl">
					
					<li class="dropDown dropDown_hover user-info">
						<a href="javascript:;" class="dropDown_A" id="myselfinfo">
							<!-- 添加用户头像 -->
							<span class="userIcon"><img src="/plugins/h-ui.admin/images/userIcon.png"></span>
							<span id="user-info-show"></span>
							<i class="iconfont icon-down"></i>
						    
						</a>
						<ul class="dropDown-menu menu radius box-shadow">
							<li class="pos-r"><i class="iconfont icon-user"></i><a href="javascript:;" id="user_id"></a></li>
							<!-- <li class="pos-r"><i class="iconfont icon-userId"></i><a href="javascript:;" id="user_code"></a></li> -->
							<li class="pos-r"><i class="iconfont icon-editPwd"></i><a href="javascript:;" id="changpwd"><@spring.message "login.changePassword"/></a></li>
						</ul>
					</li>
					
					<li class="user-roles"><a href="/loginOut"><@spring.message "login.loginOut"/><i class="iconfont icon-tuch"></i></a></li>
				</ul>
			</nav>
		</div>
		
	</div>
</header>
<aside class="Hui-aside">
	<div class="menu_dropdown bk_2">
	</div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
	<div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
		<div class="Hui-tabNav-wp">
			<ul id="min_title_list" class="acrossTab cl">
				<li class="active">
					<span title="我的桌面" ><@spring.message "login.myTable"/></span>
					<em></em></li>
			</ul>
		</div>
		<div class="Hui-tabNav-more btn-group" style="position:absolute;"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
	</div>
	<div id="iframe_box" class="Hui-article">
		<div class="show_iframe">
			<div style="display:none" class="loading"></div>
			<iframe scrolling="yes" frameborder="0" src="/welcome"></iframe>
		</div>
	</div>
</section>

<div class="contextMenu" id="Huiadminmenu">
	<ul>
		<li id="closethis"><@spring.message "login.closeCurrentPage"/></li>
		<li id="closeall"><@spring.message "login.closeAllPage"/></li>
	</ul>
</div>
<div class="page-container">
	<div class="container-fluid">
      <div id="chpwd-edit" class="edit_template pt-10 pb-10" title="修改密码" width="400" >
         <form id="chpwdForm" class="form form-horizontal" role="form">
            <div class="form-group clearfix mb-20">
                <label class="col-sm-3 text-right control-label"><@spring.message "login.oldPassword"/><span class="required">*</span></label>
                <div class="col-sm-8">
                	<input type="password"  name="oldpwd" id="oldpwd"  class="form-control input-sm radius" required maxlength="30">
                </div>
            </div>
            <div class="form-group clearfix mb-20">
                <label class="col-sm-3 text-right control-label"><@spring.message "login.newPassword"/><span class="required">*</span></label>
                <div class="col-sm-8">
                	<input type="password"  name="newpwd" id="newpwd" class="form-control input-sm radius" required isRegPwd=true maxlength="30">
                	<i class="glyphicon glyphicon-question-sign ques-sign" attr="newpwd"></i>
                </div>
            </div>
            <div class="form-group clearfix mb-20">
                <label class="col-sm-3 text-right control-label"><@spring.message "login.confirmPassword"/><span class="required">*</span></label>
                <div class="col-sm-8">
                	<input type="password"  name="twicepwd" id="twicepwd"  class="form-control input-sm radius" required isEqualTo="#newpwd">
                	<i class="glyphicon glyphicon-question-sign ques-sign" attr="twicepwd"></i>
                </div>
            </div>
	        <div class="tools form-group clearfix" style="text-align:center;">
            	<button type="button" class="btn  btn-success radius" id="save_btn"><@spring.message "common.saveButton"/></button>
            	<button type="button" class="btn  btn-default radius ml-10" id="close_btn"><@spring.message "common.closeButton"/></button>
	        </div>
        </form>
     </div>
    </div>
    </div> 
<!--_footer 作为公共模版分离出去-->
 <!--/_footer 作为公共模版分离出去-->
</@override> 

<@override name="customScript">
<script type="text/javascript" src="/js/index/index.min.js?v=${.now?long}">
</script>
</@override> 

<@extends name="base_main.ftl"/>