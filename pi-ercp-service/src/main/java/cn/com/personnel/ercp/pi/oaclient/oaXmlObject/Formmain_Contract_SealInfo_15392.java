package cn.com.personnel.ercp.pi.oaclient.oaXmlObject;

public class Formmain_Contract_SealInfo_15392 {

    private String sealType; //印章类型
    private String sealName;  //印章名称
//    private String sealUser; //用印人
    private String systemSource;//系统来源
    private String isElectronicSignature; //是否电子签

    public String getSealType() {
        return sealType;
    }

    public void setSealType(String sealType) {
        this.sealType = sealType;
    }

    public String getSealName() {
        return sealName;
    }

    public void setSealName(String sealName) {
        this.sealName = sealName;
    }

//    public String getSealUser() {
//        return sealUser;
//    }
//
//    public void setSealUser(String sealUser) {
//        this.sealUser = sealUser;
//    }

    public String getSystemSource() {
        return systemSource;
    }

    public void setSystemSource(String systemSource) {
        this.systemSource = systemSource;
    }

    public String getIsElectronicSignature() {
        return isElectronicSignature;
    }

    public void setIsElectronicSignature(String isElectronicSignature) {
        this.isElectronicSignature = isElectronicSignature;
    }

}