<@override name="content" >
<div class="bg">
    <div class="logo visible-xs-block">
      <img src="/images/logo.svg">
    </div>
    <div class="m-page-title visible-xs-block">
        <h1 class="title">${app_name}</h1>
    </div>
    <div class="dim-box">
        <div class="cont-box">
            <div class="logo-box hidden-xs">
                <img src="/images/logo.svg" alt="logo" height="60" >
            </div>
            <div class="lt hidden-xs">
                <h1 class="page-title">${app_name}</h1>
            </div>
            <div class="mt hidden-xs"></div>
            <div class="rt">
              <div class="title-box">
                <h2 class="title">登录</h2><small>Login</small>
              </div>
                <div class="form-box form-horizontal">
                    <div class="form-group">
                        <div class="col-sm-12">
                            <input type="text" class="form-control" id="loginName" name="" placeholder="账户" required>
                            <i class="glyphicon glyphicon-user"></i>
                        </div>
                     </div>
                     <div class="form-group">
                        <div class="col-sm-12">
                            <input type="password" class="form-control" id="pwd" name="" placeholder="密码" required>
                            <i class="glyphicon glyphicon-lock"></i>
                        </div>
                     </div>
                     <div class="checkbox">
                        <label>
                            <input type="checkbox" id="rememberMe" name="online" value=""> 记住账号
                        </label>
                      </div>
                      <div class="buttons">
                          <button id="loginBtn" class="login-btn">登 录</button>
                          <div class="f-pwd">
                              <a href="/un/password/showResetPc">忘记密码?</a>
                          </div>
                      </div>
                </div>
            </div>
        </div>
    </div>

</div>
</@override> 

<@override name="customScript">
<script type="text/javascript" src="/js/login/login.min.js">
</script>
</@override> 

<@extends name="base_login.ftl"/>