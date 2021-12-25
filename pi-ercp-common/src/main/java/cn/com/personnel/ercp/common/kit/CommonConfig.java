package cn.com.personnel.ercp.common.kit;

import cn.com.personnel.ercp.framework.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 配置文件
 */
@Component
public class CommonConfig {
    @Autowired
    private Environment env;

    public String getSapMandt() {
        return env.getProperty("sap.mandt");
    }

    public String getAppCode() {
        return env.getProperty("app.app_code");
    }

    /* =========EIS配置 开始============== */
    public String getEisPassword() {
        return env.getProperty("eis.password");
    }
    public String getTokenCode() {
        return env.getProperty("eis.tokenCode");
    }
    /* =========EIS配置 开始============== */

    /* =========CA配置 开始============== */
    public String getAddress() {
        return env.getProperty("open.url");
    }

    public String getUserName() {
        return env.getProperty("open.userName");
    }

    public String getPassword() {
        return env.getProperty("open.password");
    }
    /* =========CA配置 结束============== */

    /* =========BPS配置 开始============== */
    public String getBPSURL() {
        return env.getProperty("BPS.serverUrl");
    }
    public String getSystem() {
        return env.getProperty("BPS.app.system");
    }
    public String getStartGWTaskURL() {
        return env.getProperty("BPS.app.startGWTaskURL");
    }
    public String getExcuteGWTaskURL() {
        return env.getProperty("BPS.app.excuteGWTaskURL");
    }
    public String getUndoTaskURL() {
        return env.getProperty("BPS.app.undoTaskURL");
    }
    public String getQueryWorkItem() {
        return env.getProperty("BPS.app.queryWorkItem");
    }
    public String getQueryProcesses() {
        return env.getProperty("BPS.app.queryProcesses");
    }
    public String getQueryProYb() {
        return env.getProperty("BPS.app.queryProYb");
    }
    public String getAddUser() {
        return env.getProperty("BPS.app.addUser");
    }
    public String getTerminateTask() {
        return env.getProperty("BPS.app.terminateTask");
    }
    public String getGraphicURL() {
        return env.getProperty("BPS.app.getGraphicURL");
    }
    public String getBackActity() {
        return env.getProperty("BPS.app.BackActity");
    }
    public String getQueryApproval() {
        return env.getProperty("BPS.app.queryApproval");
    }
    public String getAssignAfter(){
        return env.getProperty("BPS.app.AssignAfter");
    }
    public String getInstPro() {
        return env.getProperty("BPS.app.instPro");
    }
    public String getQueryProStep() {
        return env.getProperty("BPS.app.queryProStep");
    }
    public String getDelegateItem() {
        return env.getProperty("BPS.app.delegateItem");
    }
    public String getBackActs() {
        return env.getProperty("BPS.app.getBackActs");
    }
    public String getPressTask() {
        return env.getProperty("BPS.app.pressTask");
    }
    public String getQuerySentFlow() {
        return env.getProperty("BPS.app.querySentFlow");
    }
    public String getOnestepBackActity() {
        return env.getProperty("BPS.app.OnestepBackActity");
    }
    public String getAppointNextActivities() {
        return env.getProperty("BPS.app.appointNextActivities");
    }
    public String getInstProDetail() {
        return env.getProperty("BPS.app.getInstProDetail");
    }
    public String getWithdrawProcess() {
        return env.getProperty("BPS.app.withdrawProcess");
    }
    public String getWithdrawProcessWithoutExecute() {
        return env.getProperty("BPS.app.withdrawProcessWithoutExecute");
    }
    public String getRenameProInst() {
        return env.getProperty("BPS.app.renameProInst");
    }
    public String getQueryApprovalAndWorkItemName() {
        return env.getProperty("BPS.app.queryApprovalAndWorkItemName");
    }
    public String getReladata(){
        return env.getProperty("BPS.app.reladata");
    }
    /* =========BPS配置 结束============== */

    /*===========SAP开始==============*/
    public String getDenEndPointAddress(String url) {
        String serverUrl = env.getProperty("den.serverUrl");
        URL urls;
        try {
            // 正式环境401改为800
            if("prd".equals(env.getProperty("spring.profiles.active"))){
                url = (url == null?null:url.replace("300","800"));
            }
            urls = new URL(url = (url == null?null:url.replace("300","800")));
        } catch (MalformedURLException e) {
            throw new BusinessException(e);
        }
        return serverUrl + urls.getFile();
    }
    public String getDenUserName(){
        return env.getProperty("den.username");
    }

    public String getDenPassword(){
        return env.getProperty("den.password");
    }
    /*===========SAP结束==============*/

    /**
     * 获取oa token认证地址
     * @return
     */
    public String getAuthUrl(){
        return env.getProperty("oa.serverUrl")+"/seeyon/rest/token";
    }

    /**
     * 获取付款实例号地址
     * @return
     */
    public String getInstanceDataUrl(){
        return env.getProperty("oa.serverUrl")+"/seeyon/rest/get/allformdataresource";
    }
    public String getRequestHostProperty(){
        return env.getProperty("oa.serverUrl").replace("http:\\\\","");
    }

    public String getOaUserName(){
        return  env.getProperty("oa.userName");
    }

    public String getOaPassword(){
        return  env.getProperty("oa.password");
    }

    public String getEndPointAddress(){
        return env.getProperty("oa.serverUrl")+"/seeyon/services/BPMService.BPMServiceHttpSoap12Endpoint/";
    }

    /**
     * 上传文件
     * @return
     */
    public String getUploadServiceUrl(){
        return env.getProperty("oa.uploadFileServerUrl");
    }

    /**
     * 获取模板审批意见列表
     * @return
     */
    public String getTemplateApprovalUrl(){
        return env.getProperty("oa.serverUrl")+"/seeyon/rest/affair/allContent";
    }
    /**
     * 获取实例号
     * @return
     */
    public String getInstanceUrl(){
        return env.getProperty("oa.serverUrl")+"/seeyon/rest/affair/data";
    }


    public String getAffairIdUrl(){
        return env.getProperty("oa.serverUrl")+"/seeyon/rest/affair";
    }

    public String getUploadSignedUrl(){
        return env.getProperty("oa.serverUrl")+"/seeyon/rest/formfile/sendfile";
    }

    public String getReturnUrl(){
        return env.getProperty("oa.serverUrl")+"/seeyon/login/portalsso";
    }

    /*===========token开始==============*/
    public String getDeviceCode(){
        return env.getProperty("token.deviceCode");
    }

    /*===========SAP结束==============*/
}
