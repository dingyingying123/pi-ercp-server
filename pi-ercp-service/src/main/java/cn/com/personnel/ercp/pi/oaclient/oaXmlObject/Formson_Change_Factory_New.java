package cn.com.personnel.ercp.pi.oaclient.oaXmlObject;

public class Formson_Change_Factory_New {


    private String newFactoryCountry_code;      // 新工厂国家代码
    private String newCity_code;        //新城市代码
    private String newFactoryAddress;     //地址信息合并
    private String newTimeStamp; //新工厂时间戳

    public String getNewTimeStamp() {
        return newTimeStamp;
    }

    public void setNewTimeStamp(String newTimeStamp) {
        this.newTimeStamp = newTimeStamp;
    }

    public String getNewCity_code() {
        return newCity_code;
    }

    public void setNewCity_code(String newCity_code) {
        this.newCity_code = newCity_code;
    }

    public String getNewFactoryCountry_code() {
        return newFactoryCountry_code;
    }

    public void setNewFactoryCountry_code(String newFactoryCountry_code) {
        this.newFactoryCountry_code = newFactoryCountry_code;
    }

    public String getNewFactoryAddress() {
        return newFactoryAddress;
    }

    public void setNewFactoryAddress(String newFactoryAddress) {
        this.newFactoryAddress = newFactoryAddress;
    }
}
