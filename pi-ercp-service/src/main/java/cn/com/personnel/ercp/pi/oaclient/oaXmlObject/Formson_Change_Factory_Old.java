package cn.com.personnel.ercp.pi.oaclient.oaXmlObject;

public class Formson_Change_Factory_Old {


    private String oldFactoryCountry_code;      // 旧工厂国家代码
    private String oldCity_code;       //旧城市代码
    private String oldFactoryAddress;     //地址信息合并
    private String oldTimeStamp; //旧工厂主键

    public String getOldTimeStamp() {
        return oldTimeStamp;
    }

    public void setOldTimeStamp(String oldTimeStamp) {
        this.oldTimeStamp = oldTimeStamp;
    }

    public String getOldCity_code() {
        return oldCity_code;
    }

    public void setOldCity_code(String oldCity_code) {
        this.oldCity_code = oldCity_code;
    }

    public String getOldFactoryCountry_code() {
        return oldFactoryCountry_code;
    }

    public void setOldFactoryCountry_code(String oldFactoryCountry_code) {
        this.oldFactoryCountry_code = oldFactoryCountry_code;
    }

    public String getOldFactoryAddress() {
        return oldFactoryAddress;
    }

    public void setOldFactoryAddress(String oldFactoryAddress) {
        this.oldFactoryAddress = oldFactoryAddress;
    }
}
