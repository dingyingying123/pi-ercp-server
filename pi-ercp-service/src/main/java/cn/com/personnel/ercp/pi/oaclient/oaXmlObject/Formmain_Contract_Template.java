package cn.com.personnel.ercp.pi.oaclient.oaXmlObject;

public class Formmain_Contract_Template {
    private String templateNo;  //合同模板编号
    private String templateName; //合同模板名称
    private String category; //合同类别
    private String party; //我方合同地位
    private String templateDesc; //合同模板说明

    public String getTemplateNo() {
        return templateNo;
    }

    public void setTemplateNo(String templateNo) {
        this.templateNo = templateNo;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getTemplateDesc() {
        return templateDesc;
    }

    public void setTemplateDesc(String templateDesc) {
        this.templateDesc = templateDesc;
    }

}