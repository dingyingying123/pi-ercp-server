package cn.com.personnel.ercp.pi.persistence.entity.sap;

import javax.persistence.*;

public class Cskt {
    @Id
    private String datbi;

    @Id
    @GeneratedValue(generator = "JDBC")
    private String kokrs;

    @Id
    private String kostl;

    @Id
    private String mandt;

    @Id
    private String spras;

    private String ktext;

    private String ltext;

    private String mctxt;

    /**
     * @return datbi
     */
    public String getDatbi() {
        return datbi;
    }

    /**
     * @param datbi
     */
    public void setDatbi(String datbi) {
        this.datbi = datbi;
    }

    /**
     * @return kokrs
     */
    public String getKokrs() {
        return kokrs;
    }

    /**
     * @param kokrs
     */
    public void setKokrs(String kokrs) {
        this.kokrs = kokrs;
    }

    /**
     * @return kostl
     */
    public String getKostl() {
        return kostl;
    }

    /**
     * @param kostl
     */
    public void setKostl(String kostl) {
        this.kostl = kostl;
    }

    /**
     * @return mandt
     */
    public String getMandt() {
        return mandt;
    }

    /**
     * @param mandt
     */
    public void setMandt(String mandt) {
        this.mandt = mandt;
    }

    /**
     * @return spras
     */
    public String getSpras() {
        return spras;
    }

    /**
     * @param spras
     */
    public void setSpras(String spras) {
        this.spras = spras;
    }

    /**
     * @return ktext
     */
    public String getKtext() {
        return ktext;
    }

    /**
     * @param ktext
     */
    public void setKtext(String ktext) {
        this.ktext = ktext;
    }

    /**
     * @return ltext
     */
    public String getLtext() {
        return ltext;
    }

    /**
     * @param ltext
     */
    public void setLtext(String ltext) {
        this.ltext = ltext;
    }

    /**
     * @return mctxt
     */
    public String getMctxt() {
        return mctxt;
    }

    /**
     * @param mctxt
     */
    public void setMctxt(String mctxt) {
        this.mctxt = mctxt;
    }
}