/**
 * Dt_sfs_bill_acc_docIt_row.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.personnel.ercp.pi.wbs.OP_si_sfs_bill_acc_doc;

public class Dt_sfs_bill_acc_docIt_row  implements java.io.Serializable {
    /* sfs系统单据号 */
    private String docno;

    /* 是否清账行 */
    private String clear_line;

    /* 借方/贷方标识 */
    private String shkzg;

    /* 总账科目 */
    private String hkont;

    /* 成本中心 */
    private String kostl;

    /* 利润中心 */
    private String prctr;

    /* 对方利润中心 */
    private String zzdy5;

    /* 订单号 */
    private String aufnr;

    /* 客户编号 */
    private String kunnr;

    /* 供应商帐号 */
    private String lifnr;

    /* 凭证货币金额 */
    private String wrbtr;

    /* 基准日期 */
    private String zfbdt;

    /* 分配编号 */
    private String zuonr;

    /* 行文本 */
    private String sgtxt;

    /* 工作分解结构元素 (wbs 元素) */
    private String posid;

    /* 付款原因代码 */
    private String rstgr;

    /* 票据号 */
    private String wlzbp;

    /* check number */
    private String boeno;

    /* 银行代码 */
    private String bank;

    /* 银行帐户号码 */
    private String accou;

    /* 事务类型 */
    private String bewar;

    /* 行备用字段1 */
    private String reserve_f1;

    /* 行备用字段2 */
    private String reserve_f2;

    /* 行备用字段3 */
    private String reserve_f3;

    /* 行备用字段4 */
    private String reserve_f4;

    /* 行备用字段5 */
    private String reserve_f5;

    public Dt_sfs_bill_acc_docIt_row() {
    }

    public Dt_sfs_bill_acc_docIt_row(
           String docno,
           String clear_line,
           String shkzg,
           String hkont,
           String kostl,
           String prctr,
           String zzdy5,
           String aufnr,
           String kunnr,
           String lifnr,
           String wrbtr,
           String zfbdt,
           String zuonr,
           String sgtxt,
           String posid,
           String rstgr,
           String wlzbp,
           String boeno,
           String bank,
           String accou,
           String bewar,
           String reserve_f1,
           String reserve_f2,
           String reserve_f3,
           String reserve_f4,
           String reserve_f5) {
           this.docno = docno;
           this.clear_line = clear_line;
           this.shkzg = shkzg;
           this.hkont = hkont;
           this.kostl = kostl;
           this.prctr = prctr;
           this.zzdy5 = zzdy5;
           this.aufnr = aufnr;
           this.kunnr = kunnr;
           this.lifnr = lifnr;
           this.wrbtr = wrbtr;
           this.zfbdt = zfbdt;
           this.zuonr = zuonr;
           this.sgtxt = sgtxt;
           this.posid = posid;
           this.rstgr = rstgr;
           this.wlzbp = wlzbp;
           this.boeno = boeno;
           this.bank = bank;
           this.accou = accou;
           this.bewar = bewar;
           this.reserve_f1 = reserve_f1;
           this.reserve_f2 = reserve_f2;
           this.reserve_f3 = reserve_f3;
           this.reserve_f4 = reserve_f4;
           this.reserve_f5 = reserve_f5;
    }


    /**
     * Gets the docno value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return docno   * sfs系统单据号
     */
    public String getDocno() {
        return docno;
    }


    /**
     * Sets the docno value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param docno   * sfs系统单据号
     */
    public void setDocno(String docno) {
        this.docno = docno;
    }


    /**
     * Gets the clear_line value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return clear_line   * 是否清账行
     */
    public String getClear_line() {
        return clear_line;
    }


    /**
     * Sets the clear_line value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param clear_line   * 是否清账行
     */
    public void setClear_line(String clear_line) {
        this.clear_line = clear_line;
    }


    /**
     * Gets the shkzg value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return shkzg   * 借方/贷方标识
     */
    public String getShkzg() {
        return shkzg;
    }


    /**
     * Sets the shkzg value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param shkzg   * 借方/贷方标识
     */
    public void setShkzg(String shkzg) {
        this.shkzg = shkzg;
    }


    /**
     * Gets the hkont value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return hkont   * 总账科目
     */
    public String getHkont() {
        return hkont;
    }


    /**
     * Sets the hkont value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param hkont   * 总账科目
     */
    public void setHkont(String hkont) {
        this.hkont = hkont;
    }


    /**
     * Gets the kostl value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return kostl   * 成本中心
     */
    public String getKostl() {
        return kostl;
    }


    /**
     * Sets the kostl value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param kostl   * 成本中心
     */
    public void setKostl(String kostl) {
        this.kostl = kostl;
    }


    /**
     * Gets the prctr value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return prctr   * 利润中心
     */
    public String getPrctr() {
        return prctr;
    }


    /**
     * Sets the prctr value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param prctr   * 利润中心
     */
    public void setPrctr(String prctr) {
        this.prctr = prctr;
    }


    /**
     * Gets the zzdy5 value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return zzdy5   * 对方利润中心
     */
    public String getZzdy5() {
        return zzdy5;
    }


    /**
     * Sets the zzdy5 value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param zzdy5   * 对方利润中心
     */
    public void setZzdy5(String zzdy5) {
        this.zzdy5 = zzdy5;
    }


    /**
     * Gets the aufnr value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return aufnr   * 订单号
     */
    public String getAufnr() {
        return aufnr;
    }


    /**
     * Sets the aufnr value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param aufnr   * 订单号
     */
    public void setAufnr(String aufnr) {
        this.aufnr = aufnr;
    }


    /**
     * Gets the kunnr value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return kunnr   * 客户编号
     */
    public String getKunnr() {
        return kunnr;
    }


    /**
     * Sets the kunnr value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param kunnr   * 客户编号
     */
    public void setKunnr(String kunnr) {
        this.kunnr = kunnr;
    }


    /**
     * Gets the lifnr value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return lifnr   * 供应商帐号
     */
    public String getLifnr() {
        return lifnr;
    }


    /**
     * Sets the lifnr value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param lifnr   * 供应商帐号
     */
    public void setLifnr(String lifnr) {
        this.lifnr = lifnr;
    }


    /**
     * Gets the wrbtr value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return wrbtr   * 凭证货币金额
     */
    public String getWrbtr() {
        return wrbtr;
    }


    /**
     * Sets the wrbtr value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param wrbtr   * 凭证货币金额
     */
    public void setWrbtr(String wrbtr) {
        this.wrbtr = wrbtr;
    }


    /**
     * Gets the zfbdt value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return zfbdt   * 基准日期
     */
    public String getZfbdt() {
        return zfbdt;
    }


    /**
     * Sets the zfbdt value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param zfbdt   * 基准日期
     */
    public void setZfbdt(String zfbdt) {
        this.zfbdt = zfbdt;
    }


    /**
     * Gets the zuonr value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return zuonr   * 分配编号
     */
    public String getZuonr() {
        return zuonr;
    }


    /**
     * Sets the zuonr value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param zuonr   * 分配编号
     */
    public void setZuonr(String zuonr) {
        this.zuonr = zuonr;
    }


    /**
     * Gets the sgtxt value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return sgtxt   * 行文本
     */
    public String getSgtxt() {
        return sgtxt;
    }


    /**
     * Sets the sgtxt value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param sgtxt   * 行文本
     */
    public void setSgtxt(String sgtxt) {
        this.sgtxt = sgtxt;
    }


    /**
     * Gets the posid value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return posid   * 工作分解结构元素 (wbs 元素)
     */
    public String getPosid() {
        return posid;
    }


    /**
     * Sets the posid value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param posid   * 工作分解结构元素 (wbs 元素)
     */
    public void setPosid(String posid) {
        this.posid = posid;
    }


    /**
     * Gets the rstgr value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return rstgr   * 付款原因代码
     */
    public String getRstgr() {
        return rstgr;
    }


    /**
     * Sets the rstgr value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param rstgr   * 付款原因代码
     */
    public void setRstgr(String rstgr) {
        this.rstgr = rstgr;
    }


    /**
     * Gets the wlzbp value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return wlzbp   * 票据号
     */
    public String getWlzbp() {
        return wlzbp;
    }


    /**
     * Sets the wlzbp value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param wlzbp   * 票据号
     */
    public void setWlzbp(String wlzbp) {
        this.wlzbp = wlzbp;
    }


    /**
     * Gets the boeno value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return boeno   * check number
     */
    public String getBoeno() {
        return boeno;
    }


    /**
     * Sets the boeno value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param boeno   * check number
     */
    public void setBoeno(String boeno) {
        this.boeno = boeno;
    }


    /**
     * Gets the bank value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return bank   * 银行代码
     */
    public String getBank() {
        return bank;
    }


    /**
     * Sets the bank value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param bank   * 银行代码
     */
    public void setBank(String bank) {
        this.bank = bank;
    }


    /**
     * Gets the accou value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return accou   * 银行帐户号码
     */
    public String getAccou() {
        return accou;
    }


    /**
     * Sets the accou value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param accou   * 银行帐户号码
     */
    public void setAccou(String accou) {
        this.accou = accou;
    }


    /**
     * Gets the bewar value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return bewar   * 事务类型
     */
    public String getBewar() {
        return bewar;
    }


    /**
     * Sets the bewar value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param bewar   * 事务类型
     */
    public void setBewar(String bewar) {
        this.bewar = bewar;
    }


    /**
     * Gets the reserve_f1 value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return reserve_f1   * 行备用字段1
     */
    public String getReserve_f1() {
        return reserve_f1;
    }


    /**
     * Sets the reserve_f1 value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param reserve_f1   * 行备用字段1
     */
    public void setReserve_f1(String reserve_f1) {
        this.reserve_f1 = reserve_f1;
    }


    /**
     * Gets the reserve_f2 value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return reserve_f2   * 行备用字段2
     */
    public String getReserve_f2() {
        return reserve_f2;
    }


    /**
     * Sets the reserve_f2 value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param reserve_f2   * 行备用字段2
     */
    public void setReserve_f2(String reserve_f2) {
        this.reserve_f2 = reserve_f2;
    }


    /**
     * Gets the reserve_f3 value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return reserve_f3   * 行备用字段3
     */
    public String getReserve_f3() {
        return reserve_f3;
    }


    /**
     * Sets the reserve_f3 value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param reserve_f3   * 行备用字段3
     */
    public void setReserve_f3(String reserve_f3) {
        this.reserve_f3 = reserve_f3;
    }


    /**
     * Gets the reserve_f4 value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return reserve_f4   * 行备用字段4
     */
    public String getReserve_f4() {
        return reserve_f4;
    }


    /**
     * Sets the reserve_f4 value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param reserve_f4   * 行备用字段4
     */
    public void setReserve_f4(String reserve_f4) {
        this.reserve_f4 = reserve_f4;
    }


    /**
     * Gets the reserve_f5 value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @return reserve_f5   * 行备用字段5
     */
    public String getReserve_f5() {
        return reserve_f5;
    }


    /**
     * Sets the reserve_f5 value for this Dt_sfs_bill_acc_docIt_row.
     * 
     * @param reserve_f5   * 行备用字段5
     */
    public void setReserve_f5(String reserve_f5) {
        this.reserve_f5 = reserve_f5;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Dt_sfs_bill_acc_docIt_row)) return false;
        Dt_sfs_bill_acc_docIt_row other = (Dt_sfs_bill_acc_docIt_row) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docno==null && other.getDocno()==null) || 
             (this.docno!=null &&
              this.docno.equals(other.getDocno()))) &&
            ((this.clear_line==null && other.getClear_line()==null) || 
             (this.clear_line!=null &&
              this.clear_line.equals(other.getClear_line()))) &&
            ((this.shkzg==null && other.getShkzg()==null) || 
             (this.shkzg!=null &&
              this.shkzg.equals(other.getShkzg()))) &&
            ((this.hkont==null && other.getHkont()==null) || 
             (this.hkont!=null &&
              this.hkont.equals(other.getHkont()))) &&
            ((this.kostl==null && other.getKostl()==null) || 
             (this.kostl!=null &&
              this.kostl.equals(other.getKostl()))) &&
            ((this.prctr==null && other.getPrctr()==null) || 
             (this.prctr!=null &&
              this.prctr.equals(other.getPrctr()))) &&
            ((this.zzdy5==null && other.getZzdy5()==null) || 
             (this.zzdy5!=null &&
              this.zzdy5.equals(other.getZzdy5()))) &&
            ((this.aufnr==null && other.getAufnr()==null) || 
             (this.aufnr!=null &&
              this.aufnr.equals(other.getAufnr()))) &&
            ((this.kunnr==null && other.getKunnr()==null) || 
             (this.kunnr!=null &&
              this.kunnr.equals(other.getKunnr()))) &&
            ((this.lifnr==null && other.getLifnr()==null) || 
             (this.lifnr!=null &&
              this.lifnr.equals(other.getLifnr()))) &&
            ((this.wrbtr==null && other.getWrbtr()==null) || 
             (this.wrbtr!=null &&
              this.wrbtr.equals(other.getWrbtr()))) &&
            ((this.zfbdt==null && other.getZfbdt()==null) || 
             (this.zfbdt!=null &&
              this.zfbdt.equals(other.getZfbdt()))) &&
            ((this.zuonr==null && other.getZuonr()==null) || 
             (this.zuonr!=null &&
              this.zuonr.equals(other.getZuonr()))) &&
            ((this.sgtxt==null && other.getSgtxt()==null) || 
             (this.sgtxt!=null &&
              this.sgtxt.equals(other.getSgtxt()))) &&
            ((this.posid==null && other.getPosid()==null) || 
             (this.posid!=null &&
              this.posid.equals(other.getPosid()))) &&
            ((this.rstgr==null && other.getRstgr()==null) || 
             (this.rstgr!=null &&
              this.rstgr.equals(other.getRstgr()))) &&
            ((this.wlzbp==null && other.getWlzbp()==null) || 
             (this.wlzbp!=null &&
              this.wlzbp.equals(other.getWlzbp()))) &&
            ((this.boeno==null && other.getBoeno()==null) || 
             (this.boeno!=null &&
              this.boeno.equals(other.getBoeno()))) &&
            ((this.bank==null && other.getBank()==null) || 
             (this.bank!=null &&
              this.bank.equals(other.getBank()))) &&
            ((this.accou==null && other.getAccou()==null) || 
             (this.accou!=null &&
              this.accou.equals(other.getAccou()))) &&
            ((this.bewar==null && other.getBewar()==null) || 
             (this.bewar!=null &&
              this.bewar.equals(other.getBewar()))) &&
            ((this.reserve_f1==null && other.getReserve_f1()==null) || 
             (this.reserve_f1!=null &&
              this.reserve_f1.equals(other.getReserve_f1()))) &&
            ((this.reserve_f2==null && other.getReserve_f2()==null) || 
             (this.reserve_f2!=null &&
              this.reserve_f2.equals(other.getReserve_f2()))) &&
            ((this.reserve_f3==null && other.getReserve_f3()==null) || 
             (this.reserve_f3!=null &&
              this.reserve_f3.equals(other.getReserve_f3()))) &&
            ((this.reserve_f4==null && other.getReserve_f4()==null) || 
             (this.reserve_f4!=null &&
              this.reserve_f4.equals(other.getReserve_f4()))) &&
            ((this.reserve_f5==null && other.getReserve_f5()==null) || 
             (this.reserve_f5!=null &&
              this.reserve_f5.equals(other.getReserve_f5())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDocno() != null) {
            _hashCode += getDocno().hashCode();
        }
        if (getClear_line() != null) {
            _hashCode += getClear_line().hashCode();
        }
        if (getShkzg() != null) {
            _hashCode += getShkzg().hashCode();
        }
        if (getHkont() != null) {
            _hashCode += getHkont().hashCode();
        }
        if (getKostl() != null) {
            _hashCode += getKostl().hashCode();
        }
        if (getPrctr() != null) {
            _hashCode += getPrctr().hashCode();
        }
        if (getZzdy5() != null) {
            _hashCode += getZzdy5().hashCode();
        }
        if (getAufnr() != null) {
            _hashCode += getAufnr().hashCode();
        }
        if (getKunnr() != null) {
            _hashCode += getKunnr().hashCode();
        }
        if (getLifnr() != null) {
            _hashCode += getLifnr().hashCode();
        }
        if (getWrbtr() != null) {
            _hashCode += getWrbtr().hashCode();
        }
        if (getZfbdt() != null) {
            _hashCode += getZfbdt().hashCode();
        }
        if (getZuonr() != null) {
            _hashCode += getZuonr().hashCode();
        }
        if (getSgtxt() != null) {
            _hashCode += getSgtxt().hashCode();
        }
        if (getPosid() != null) {
            _hashCode += getPosid().hashCode();
        }
        if (getRstgr() != null) {
            _hashCode += getRstgr().hashCode();
        }
        if (getWlzbp() != null) {
            _hashCode += getWlzbp().hashCode();
        }
        if (getBoeno() != null) {
            _hashCode += getBoeno().hashCode();
        }
        if (getBank() != null) {
            _hashCode += getBank().hashCode();
        }
        if (getAccou() != null) {
            _hashCode += getAccou().hashCode();
        }
        if (getBewar() != null) {
            _hashCode += getBewar().hashCode();
        }
        if (getReserve_f1() != null) {
            _hashCode += getReserve_f1().hashCode();
        }
        if (getReserve_f2() != null) {
            _hashCode += getReserve_f2().hashCode();
        }
        if (getReserve_f3() != null) {
            _hashCode += getReserve_f3().hashCode();
        }
        if (getReserve_f4() != null) {
            _hashCode += getReserve_f4().hashCode();
        }
        if (getReserve_f5() != null) {
            _hashCode += getReserve_f5().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dt_sfs_bill_acc_docIt_row.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:goldwind.com:i_sfs:sfs_bill_acc_doc", ">dt_sfs_bill_acc_doc>it_row"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clear_line");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clear_line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shkzg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shkzg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hkont");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hkont"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kostl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kostl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prctr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prctr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zzdy5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zzdy5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aufnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aufnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kunnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kunnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wrbtr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wrbtr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zfbdt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zfbdt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuonr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zuonr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sgtxt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sgtxt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rstgr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rstgr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wlzbp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wlzbp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boeno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boeno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bank");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accou");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accou"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bewar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bewar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserve_f1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reserve_f1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserve_f2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reserve_f2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserve_f3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reserve_f3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserve_f4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reserve_f4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserve_f5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reserve_f5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
