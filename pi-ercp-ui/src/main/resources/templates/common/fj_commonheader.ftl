<!-- header -->

<div class="header">
    <div class="width-limit clearfix">
        <div style="float: left;color: white;margin-top: 5px;margin-left: 15px;">风电产业集团<br>Wind Power Business Group</div>
        <div class="nav fl-l">
            <ul id="nav-lis" class="clearfix">
                <li><a id="homeUrl" href="/FDSpace/goHome?flag=home" onclick="openJump(this)"><span><@spring.message "commontheader.navigation.group"/></span><@spring.message "commontheader.navigation.homepage"/></a></li>
                <li><a href="/cyclopedia/cyclopedia"><@spring.message "commontheader.navigation.cyclopedia"/></a></li>
                <li><a href="/apps"><@spring.message "commontheader.navigation.app"/></a></li>
                <#--<li><a id="addressbook" href="javascript:void(0)"><@spring.message "commontheader.navigation.addressbook"/></a></li>-->
                <li><a href="/addressList/addressList"><@spring.message "commontheader.navigation.addressbook"/></a></li>
                <li id="special"><a><@spring.message "commontheader.navigation.Forum"/></a>
                    <ul>
                        <li><a href="/ssopcts/OAIPD" target="_blank"><@spring.message "commontheader.navigation.IPD"/></a></li>
                        <li><a href="/ssopcts/OALTC" target="_blank"><@spring.message "commontheader.navigation.LTC"/></a></li>
                        <li><a href="/leanIndex" target="_blank"><@spring.message "commontheader.navigation.lean"/></a></li>
                    </ul>
                </li>
                <li><a href="/itSpace/index" target="_blank"><@spring.message "commontheader.navigation.DIG"/></a></li>
            </ul>
        </div>
        <div class="login-tools fl-r">
            <div class="info" id="user_info">
                <a href="#">
                    <img id="user_avatar" src="/images/male.png" alt="用户头像" height="26">
                    <span id="user_id" class="user-name"></span>
                    <span id="userId" style="display:none"></span>
                </a>
            </div>
            <div class="lang clearfix round-der">
                <div id="message_div" ></div><#--class="round" -->
                <a href="javascript:;" id="message-btn">
                    <img src="/images/message.png"  height="20">
                </a>
            </div>
            <div class="lang clearfix" id="system">
                <a href="javascript:;" id="system-set">
                    <img src="/images/system-set.png"  height="20">
                </a>
                <ul>
                    <li id="password-btn">
                        <img src="/images/password.svg">
                        <span style="font-weight:bold;">&nbsp;<@spring.message "commontheader.navigation.resetPassword"/></span>
                    </li>
                    <#if "true"=="${userRole}">
                        <li onclick="openManage()">
                            <img src="/images/manage.png">
                            <span style="font-weight:bold;">&nbsp;<@spring.message "commontheader.navigation.manage"/></span>
                        </li>
                    </#if>
                    <li >
                        <a href="javascript:;" id="lang-btn">
                            <img src="/images/language.svg">
                            <span style="font-weight:bold;">&nbsp;<@spring.message "commontheader.navigation.languageSwitch"/></span>
                        </a>
                        <ul id="lang-ul" class="angle-wrapper">
                            <li value="CN"><img src="/images/CN.svg"><span style="font-weight:bold;">&nbsp;中文</span></li>
                            <li value="EN"><img src="/images/EN.svg"><span style="font-weight:bold;">&nbsp;English</span></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <#--<div class="lang clearfix">
                <a href="javascript:;" id="lang-btn" class="lang-btn">
                    CN
                </a>
                <ul>
                    <li value="CN"><i class="gwfont gw-lang-cn"></i>中文</li>
                    <li value="EN"><i class="gwfont gw-lang-en"></i>English</li>
                </ul>
            </div>-->
            <#--<div class="tools" style="display:none;" id="identity">-->
                <#--<a href="/admin/index" class="login-out"><span>切换到管理员</span></a>-->
            <#--</div>-->
            <div class="tools">
                <a href="/loginOut" class="login-out"><i class="gwfont gw-login-out"></i><span><@spring.message "login.loginOut"/></span></a>
            </div>
        </div>
        <div class="search_box">
            <div class="search-box fl-r pos-r clearfix" style="padding-right:2rem">
                <div class="search-input-box pos-r" >
                    <div class="search-group clearfix">
                        <button type="button" class="select pos-r"><em id="searchType" tar="openSearchStaff"><@spring.message "commontheader.quickSearch.staff"/></em>
                            <i class="gwfont gw-shang"></i>
                        </button>
                        <div class="input-box pos-r">
                            <input type="text" placeholder="<@spring.message "commontheader.quickSearch.pla.staff"/>" id="searchInput"/>
                            <!-- <i class="clear gwfont gw-close"></i> -->
                        </div>
                        <button type="button" class="search" id="searchButton"><i class="gwfont gw-search"></i></button>
                    </div>
                    <ul>
                        <li class="sel-item selected" tar="openSearchStaff" pla="<@spring.message "commontheader.quickSearch.pla.staff"/>"><@spring.message "commontheader.quickSearch.staff"/></li>
                        <li class="sel-item" tar="openSearchEntry" pla="<@spring.message "commontheader.quickSearch.pla.entry"/>"><@spring.message "commontheader.quickSearch.entry"/></li>
                        <#--<li class="sel-item" tar="openMaterial" pla="<@spring.message "commontheader.quickSearch.pla.material"/>"><@spring.message "commontheader.quickSearch.material"/></li>-->
                        <li class="sel-item" tar="openDocument" pla="<@spring.message "commontheader.quickSearch.pla.document"/>"><@spring.message "commontheader.quickSearch.document"/></li>
                    </ul>
                </div>
                <button type="button" class="search-icons search_close">
                    <i class="gwfont gw-search"></i>
                    <i class="close gwfont gw-close"></i>
                </button>
            </div>
        </div>

    </div>
</div>
<style>

    .header .nav ul{
        padding-left: 0.7rem;
    }
    .round{
        width: 10px;
        height:10px;
        border-radius: 50%;
        background: red !important;
        position: absolute;
        top:11px;
        left: 35px;
        z-index: 10;
    }
    .round-der{
        position: relative;
    }
    /*.width-limit{*/
        /*width: 80% !important;*/
    /*}*/

    /*.search_box{*/
    /*    width: 500px;*/
    /*    position: absolute;*/
    /*    right: 30%;*/
    /*}*/
    /*.search-box{*/
    /*    width: 100%;*/
    /*}*/
    .header .search-box.show .search-input-box,.header .search-box .search-group{
        width: 520px !important;
    }
    #searchInput{
        width: 370px;
    }
    /*.clearfix{*/
    /*    padding-left: 0.5rem !important;*/
    /*}*/
    /*.search_close{*/
    /*    right: -40px !important;*/
    /*}*/
    .search_close{
        right: 0 !important;
    }
</style>
<script>
    $(function() {
        var language = getCookie('language');

        // 根据选择语言不同切换语言选择框的默认选项
        if ("en_US" == language) {
            document.getElementById("system").setAttribute("class","lang-r");
            var ul = document.getElementById("lang-ul")
            ul.style.width = "181px";
        }
        setInterval(function(){
            //window.location.reload();
            checkContextUser();
        }, 240000);
        if(window.sessionStorage.getItem("homeUrl")!=""){
            $("#homeUrl").attr("href",window.sessionStorage.getItem("homeUrl"));
            if(window.sessionStorage.getItem("homeUrl")=="/FDSpace/goHome?flag=home"){
                if(getCookie("language")=="en_US"){
                    $("#homeUrl").find("span").text("group ")
                }else{
                    $("#homeUrl").find("span").text("集团")
                }
            }else
            {
                if(getCookie("language")=="en_US"){
                    $("#homeUrl").find("span").text("Wind Power ")
                }else{
                    $("#homeUrl").find("span").text("风电")
                }

            }
        }

        //查询未读消息,并做标识
         findMessageTotal();
        // 导航状态
        var activeNav;
        activeNav = window.location.pathname;
        $("#nav-lis a").each(function(idx, elm) {
            if($(elm).attr("href") == activeNav) {
                $(elm).closest("li").addClass("active");
            }else{
                $(elm).closest("li").removeClass("active");
            }
        })
        if(activeNav == "/edit") {
            $("#nav-lis a[href='/apps']").closest("li").addClass("active");
        }else if(activeNav == "/") {
            $("#nav-lis a[href='/home']").closest("li").addClass("active");
        }
        /*
        if(sessionStorage.activeNav) {
            //activeNav = sessionStorage.activeNav;
            $("#nav-lis a").each(function(idx, elm) {
                if($(elm).attr("href") == activeNav) {
                    $(elm).addClass("active");
                }else{
                    $(elm).removeClass("active");
                }
            })
        }else{
            $("#nav-lis a").eq(0).addClass("active");
        }
        $("#nav-lis a").on("click", function() {
            sessionStorage.activeNav = $(this).attr("href");
        }) */
        //获取用户信息
        $.get("/user_rule?" + new Date().getTime(), function(userAndmenu) {
            var user = userAndmenu["user"];
            var male = user["male"];
            $("#userId").text(user.userId);
            $("#user_id").text(user.userName);
            if(userAndmenu.identity =='admin'){
                $("#identity").show();
            }
            male == "男" ? $("#user_avatar").attr("src", "/images/male.png") : $("#user_avatar").attr("src", "/images/female.png");
            if(user.avatar != null){
                $("#user_avatar").attr("src",user.avatar);
            }
        })
        // about search
        $(".search-box .search-icons").on("click", function(){
            var $node = $(this).parents(".search-box");
            $node.toggleClass("show");
            if($node.hasClass("show")) {
                /* $("body").append('<div class="shade"></div>'); //添加遮罩层 */
                $(".header .nav").hide();
                setTimeout('$(".search-input-box").css("overflow", "inherit")', 300);
                $(".search-box .search-input-box .input-box input").focus();
            }else{
                /* $("body .shade").remove(); //移除遮罩层 */
                $(".search-input-box").css("overflow", "hidden");
                setTimeout('$(".header .nav").show()', 300);
            }

        })
        $(".search-box .search-input-box .select").on("click", function(event){
            $(this).toggleClass("drop");
            if($(this).hasClass("drop")){
                $(this).closest(".search-group").siblings("ul").slideDown("fast");
            }else{
                $(this).closest(".search-group").siblings("ul").slideUp("fast");
            }
            window.event?window.event.cancelBubble=true:event.stopPropagation();
        })
        $(".search-box .search-input-box ul").on("click", ".sel-item", function(){
            $(this).addClass("selected").siblings().removeClass("selected").parents("ul").slideUp("fast").siblings(".search-group .select").removeClass("drop");
            var pla = $(this).attr("pla");
            var tar = $(this).attr("tar")
            $(".search-box .search-input-box .select em").text($(this).text()).attr("tar", tar);
            $(".search-box .search-input-box .input-box input").attr("placeholder", pla);
        })
        /* $(".search-box .search-input-box .input-box .clear").on("click", function(){
            $(this).siblings("input").val("").focus();
        }) */
        var remote = new RemoteService();
        $("#searchButton").on("click", function(){
            var tar = $("#searchType").attr("tar");
            var searchValue = $("#searchInput").val();
            if("openDocument" == tar){
                window.location.href="http://g-sp-app/jituan/ss/Pages/results.aspx?k="+searchValue;
            } else {
        // 	window.location.href="/cyclopedia/"+tar+"?searchValue="+searchValue;
            var   myurl = window.location.href;
            if(myurl!= null && (myurl.indexOf("cyclopedia/openSearchStaff") == -1)
                    && (myurl.indexOf("cyclopedia/openSearchEntry") == -1)
                    && (myurl.indexOf("cyclopedia/openMaterial") == -1)){
                window.open("/cyclopedia/" + tar + "?searchValue=" + encodeURI(searchValue), "_blank");
            }else{
                window.location.href= "/cyclopedia/" + tar + "?searchValue=" + encodeURI(searchValue);
              }
            }
        });

        // 添加回车事件
        $("#searchInput").keydown(function (e) {
            if (e.keyCode == 13) {
                var searchType = $("#searchType").text();
                var searchValue = $("#searchInput").val();
                var param = searchValue.replace(/(^\s*)|(\s*$)/g, '');//去除空格
                if (param == '' || param == undefined || param == null){
                    alert("检索项为空");
                }else{
                    $("#searchButton").trigger("click");
                }
            }
        });

        function goHome(){
            sessionStorage.activeNav = "/home";
        }
        $(document).on("click", function(){
            if($(".search-box .search-input-box .select").hasClass("drop")){
                $(".search-box .search-input-box .select").trigger("click");
            }
            if($(".lang").hasClass("active")) {
                $(".lang").removeClass("active").find("ul").hide();
            }
        })

        //通讯录模块
        $("#addressbook").on("click",function () {
            $.ajax({
                type : "get",
                url : "/oaInterface/toAddressbook",
                async : false,
                success : function(result){
                    //window.open(result.url);
                    $('body').append($('<a href="'+result.url+'" target="_blank" id="openWin"></a>'))
                    document.getElementById("openWin").click();//点击事件
                    $('#openWin').remove();
                }
            });
        });
        //消息列表
        $("#message-btn").on("click",function () {
            window.location.href = "/portal/mobile/message/toMessagePage"
        });
        //个人信息
        $("#user_info").on("click",function () {
            //window.open("/cyclopedia/toUserInfo" , "_blank");
            window.location.href = "/cyclopedia/user"
        });
        // 设置
        $("#system-set").on("click", function(event) {
            $(this).siblings("ul").toggle().closest(".lang").toggleClass("active");
            $("#lang-ul").hide();
            window.event?window.event.cancelBubble=true:event.stopPropagation();
        })
        //专栏讨论
        $("#special").on("click",function (event) {
            $(this).children("ul").toggle().closest("#special").toggleClass("active");
            //$("#lang-ul").hide();
            window.event?window.event.cancelBubble=true:event.stopPropagation();
        })
        //点击指定位置之外事件
        $("body").click(function(e){
            if(!$(e.target).closest("#special").length){
                $("#special").children("ul").css("display","none");
                $("#special").removeClass("active");
            }
        });
        //修改密码
        $("#password-btn").on("click", function() {
            var lau = getCookie('language');
            var cn = "en_US" === lau ? "en" : "cn";
            var userId = $("#userId").text();
            //window.open("http://cauth.goldwind.com.cn/un/password/directReset/" + cn + "/" +userId,'_blank');
            window.location.href = "http://cauth.goldwind.com.cn/un/password/directReset/" + cn + "/" +userId,'_blank';
        })
        // 语言切换
        $("#lang-btn").on("click", function(event) {
            $(this).siblings("ul").toggle().closest(".lang").toggleClass("active");
            window.event?window.event.cancelBubble=true:event.stopPropagation();
        })
        $("#lang-ul li").on("click", function() {
            var lang = $(this).attr("value");
            //$("#lang-btn").text(lang);
            if(lang == "CN") {
                window.location.href = "/home?lang=zh_CN";
            }else if(lang == "EN") {
                window.location.href = "/home?lang=en_US";
            }
        })

    })
    //跳转集团首页
    function openJump(ob) {
        if($(ob).attr("href")=="/FDSpace/goHome?flag=home"){
           window.sessionStorage.setItem("homeUrl","/FDSpace/goHome?flag=fj_home")
        }else
        {
            window.sessionStorage.setItem("homeUrl","/FDSpace/goHome?flag=home")
        }
    }
    function getCookie(name) {
        var strcookie = document.cookie;// 获取cookie字符串
        var arrcookie = strcookie.split(";");// 分割
        // 遍历匹配
        for (var i = 0; i < arrcookie.length; i++) {
            var arr = arrcookie[i].split("=");
            if (arr[0].trim() == name) {
                return arr[1];
            }
        }
        return "";
    }

    function checkContextUser(){
        //获取Session
        $.ajax({
            type : "get",
            url : "/user_rule",
            async : false,
            cache:false,
            success : function(result){
                var user = result["user"];
                if(user==null){
                    var langbtn=$("#lang-btn").html();
                    if ("EN" == langbtn) {
                        layer.confirm("You have not operated for a long time and your account has expired. Please log in again.", {
                            btn: ["OK",] //按钮
                        }, function(){
                            window.location.href ="/loginOut";
                            layer.closeAll('dialog');
                        });
                        //layer.alert("You have not operated for a long time and your account has expired. Please log in again.");
                    }else{
//                        layer.alert("您长时间未操作，账号已过期，请重新登录");
                        layer.confirm("您长时间未操作，账号已过期，请重新登录.", {
                            btn: ["OK",] //按钮
                        }, function(){
                            window.location.href ="/loginOut";
                            layer.closeAll('dialog');
                        });
                    }

                }
            },
            error:function(){
                var langbtn=$("#lang-btn").html();
                if ("EN" == langbtn) {
                    layer.confirm("Failure to connect to server.Please login again", {
                        btn: ["OK",] //按钮
                    }, function(){
                       // window.location.href ="http://eis.goldwind.com.cn";
                        window.location.href ="/loginOut";
                        layer.closeAll('dialog');
                    });
                    //layer.alert("You have not operated for a long time and your account has expired. Please log in again.");
                }else{
//                        layer.alert("您长时间未操作，账号已过期，请重新登录");
                    layer.confirm("与服务器连接失败.请重新登录", {
                        btn: ["OK",] //按钮
                    }, function(){
                        //window.location.href ="http://eis.goldwind.com.cn";
                        window.location.href ="/loginOut";
                        layer.closeAll('dialog');
                    });
                }
            }
        });

    }
    function findMessageTotal() {
        $.ajax({
            type : "POST",
            url : "/portal/mobile/message/getUnreadMessageCount",
            async : true,
            success : function(result){
                //var flag = result.count;
                if(result > 0){
                    $("#message_div").attr("class","round")
                }
            }
        });
    }
    function openManage() {
        window.open("/ssopcts/EIS_ADMIN");
    }
</script>