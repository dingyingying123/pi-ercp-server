package cn.com.personnel.ercp.pi.persistence.entity.receivable;

/**
 * TODO
 *
 * @author DongAiHua
 * @Date 2020/9/15 19:29
 */
public class VorganInfo {
    private String mandt;
    private String bukrs;
    private String name;
    private String busi;
    private String busitext;

    public String getMandt() {
        return mandt;
    }

    public void setMandt(String mandt) {
        this.mandt = mandt;
    }

    public String getBukrs() {
        return bukrs;
    }

    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusi() {
        return busi;
    }

    public void setBusi(String busi) {
        this.busi = busi;
    }

    public String getBusitext() {
        return busitext;
    }

    public void setBusitext(String busitext) {
        this.busitext = busitext;
    }
}
