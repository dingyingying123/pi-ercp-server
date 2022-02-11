<!-- footer -->
<div class="footer pos-r">
<#--    <a href="javascript:;" class="feedback"><i class="gwfont gw-feedback"></i></a>-->
    <div  class="supervisionBox">
        <div class="BoxImgBox1"></div>
        <p class="BoxImgBox2Text">
            <@spring.message "commontfooter.reporting"/>
        </p>
    </div>
    <div  class="feedbackBox">
        <div class="BoxImgBox2"></div>
        <p class="BoxImgBox2Text">
            <@spring.message "commontfooter.feedback"/>
        </p>

    </div>
    <p class="copyright">
        © Copyright 2019 goldwind.com.cn All Right Reserved.
    </p>
</div>
<div id="supervision-Box" style="display: none">
    <div class="supervisionHeght">
        <div class="supervisionHeghtTitle en_CH_box">
            金风科技反舞弊举报须知
        </div>
        <div class="supervisionHeghtTitle en_US_box" style="font-size: 18px;">
            Goldwind Anti-fraud Management System
        </div>
    </div>
    <div class="supervisionBody">
        <div class="supervisionBodyMin en_CH_box">
            <p class="supervisionBodyMinp">金风科技一直秉承廉洁、勤勉、健康的企业文化，旗帜鲜明的反对各类舞弊行为。<b>如果您有任何关于金风员工可能涉嫌舞弊的信息或线索，可随时向集团审计监察部反映。</b>集团审计监察部作为反舞弊工作常设部门，受公司董事会审计委员会领导，独立于业务部门开展审计工作；我们会谨慎处理所有的咨询、投诉和举报，并在法律法规许可范围内竭尽全力确保举报人的信息不被泄漏，保证调查工作的客观与公正。</p>
            <p class="supervisionBodyMinp">我们建议任何人在提交投诉举报时，留下联系方式、问题事件的细节、调查线索等信息，以便我们及时与您反馈调查进展，提高调查的效率。</p>
            <p class="supervisionBodyMinli supervisionBodyMinp supervisionBodyMinli1">根据《金风科技反舞弊管理制度》，公司反舞弊投诉举报渠道为：</p>
            <p class="supervisionBodyMinli supervisionBodyMinp"><b>举报电话：</b>010-67511888-1127</p>
            <p class="supervisionBodyMinli supervisionBodyMinp"><b>举报邮箱：</b>audit@goldwind.com.cn</p>
            <p class="supervisionBodyMinli supervisionBodyMinp"><b>通信地址：</b>北京市经济技术开发区，博兴一路8号，金风科技集团审计监察部（邮政编码：100176）</p>
        </div>
        <div class="supervisionBodyMin en_US_box">
            <p class="supervisionBodyMinp">For a long time, Goldwind has been promoting a clean, diligent, and healthy corporate culture, and has firmly cracked down on fraudulent behaviors. If you have any information or clues that Goldwind employees may be involved in fraud, you can contact the Group Audit and Supervision Department at any time. As a department in charge of anti-fraud work, the Group's Audit and Supervision Department is led by the Audit Committee of the Company's Board of Directors and conducts audit/supervision work independently. We will handle all inquiries and reports carefully, and make every effort to protect private information of the reporter in accordance with laws and regulations, and ensure the objectivity and fairness of the investigation work on the basis of compliance and legality.</b></p>
            <p class="supervisionBodyMinp">
                We suggest that anyone should leave detailed information including name, contact information, details of suspicious behaviors, etc., while submitting a complaint or question. So that we can directly contact him/her when necessary for further information. </p>
            <p class="supervisionBodyMinli supervisionBodyMinp supervisionBodyMinli1">According to the " Goldwind Anti-fraud Management System”, Goldwind has established a telephone number and e-mail address as channels for reporting problems:</p>

            <p class="supervisionBodyMinli"><b>Reporting phone:</b>010-67511888-1127</p>
            <p class="supervisionBodyMinli"><b>Reporting email: </b>audit@goldwind.com.cn</p>
            <p class="supervisionBodyMinli">Mailing address: No. 8 Boxing 1st Road, Economic & Technological Development Zone, Beijing (Second Phase), Goldwind Group Audit and Supervision Department </p>
            <p class="supervisionBodyMinli">Postal Code: 100176</p>
        </div>
        <button type="button" id="clone" ><@spring.message "common.closeButton"/></button>
        <div style="height: 10px"></div>
    </div>
</div>
<div id="feedback-box">
    <h1><@spring.message "commontfooter.feedback"/></h1>
    <div class="form-box">
        <form role="form">
            <div class="input-group">
                <div class="input-box">
                    <span class=""><@spring.message "commontfooter.feedback.name"/>:</span>
                    <input type="text" id="title" name="title" class="inputs" placeholder="<@spring.message "commontfooter.feedback.questionName"/>">
                </div>
            </div>
            <div class="input-group">
                <div class="input-box">
                    <span class=""><@spring.message "commontfooter.feedback.discription"/>:</span>
                    <textarea type="text" id="content" name="content" rows="5" class="inputs" placeholder="<@spring.message "commontfooter.feedback.questionDiscription"/>"></textarea>
                </div>
            </div>
            <div class="button-box">
                <button type="button" id="saveBtn" ><@spring.message "common.submitButton"/></button>
            </div>
        </form>
    </div>
</div>
<script type="text/javascript" language="javascript" src="/plugins/layer/2.4/layer.js"></script>
<script type="text/javascript" language="javascript" src="/plugins/jquery/jquery-3.1.1.min.js"></script>
<script type="text/javascript" language="javascript" src="/plugins/jquery/jquery.json.min.js"></script>
<script type="text/javascript" language="javascript" src="/js/utils.js?v=${.now?long}"></script>
<script type="text/javascript" language="javascript" src="/js/RemoteService.js?v=${.now?long}"></script>
<script>
$(function(){
    if(getCookie('language')=="zh_CN"){
        $(".en_US_box").remove();
    }else{
        $(".en_CH_box").remove();
    }
    var fIndex;
    $(".footer .feedbackBox").on("click", function(){
        //清空表单
        $('form')[0].reset();
        fIndex = layer.open({
            type: 1
            , title: '<@spring.message "commontfooter.feedback"/>'
            , area: ['500px']
            , content: $("#feedback-box")
        })
    })
    $(".footer .supervisionBox").on("click", function(){
        //清空表单
        $('form')[0].reset();
        fIndex = layer.open({
            type: 1,
            title: false, //不显示标题
            area: ['880px']
            , content: $("#supervision-Box")
        })
    })
    var param = new Object();
    $("#clone").on("click",function() {
        layer.close(fIndex);
    })
    $("#saveBtn").on("click",function() {
        var title = $("#title").val();// 名称
        var content = $("#content").val();// 描述
        if($.isEmptyStr(title)){
            layer.alert("问题名称不能为空或全部是空格！");
            return;
        }
        if($.isEmptyStr(content)){
            layer.alert("问题描述内容不能为空或全部是空格！");
            return;
        }
        param["title"] = title;
        param["content"] = content;
        remote.call("/cyclopedia/addProblemFeedback",param,function(result){
            if(result == 1){
                //隐藏层
                layer.alert("创建成功！", {icon:1,closeBtn: 0}, function(index){
                    layer.close(index);
                    layer.close(fIndex);
                });
            }else{
                layer.alert("创建失败！" ,{icon:1,closeBtn: 0},function(index){
                    layer.close(index);
                    layer.close(fIndex);
                });
            }
        });

        
        
        
    });
    function getCookie(name)
    {
        var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
        if(arr=document.cookie.match(reg))
            return unescape(arr[2]);
        else
            return null;
    }

});

</script>
