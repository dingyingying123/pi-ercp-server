/**
 * Dt_sfs_bill_acc_docIt_header.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.personnel.ercp.pi.wbs.OP_si_sfs_bill_acc_doc;

public class Dt_sfs_bill_acc_docIt_header  implements java.io.Serializable {
    /* sfs系统单据号 */
    private String docno;

    /* 凭证中的过帐日期 */
    private String budat;

    /* 凭证中的凭证日期 */
    private String bldat;

    /* 公司代码 */
    private String bukrs;

    /* 凭证类型 */
    private String blart;

    /* 会计期间 */
    private String monat;

    /* 用户名 */
    private String usnam;

    /* 参考凭证编号 */
    private String xblnr;

    /* 凭证抬头文本 */
    private String bktxt;

    /* 货币码 */
    private String waers;

    /* 是否清账凭证 */
    private String clearing_doc;

    /* 头备用字段1 */
    private String reserve_f1;

    /* 头备用字段2 */
    private String reserve_f2;

    /* 头备用字段3 */
    private String reserve_f3;

    /* 头备用字段4 */
    private String reserve_f4;

    /* 头备用字段5 */
    private String reserve_f5;

    public Dt_sfs_bill_acc_docIt_header() {
    }

    public Dt_sfs_bill_acc_docIt_header(
           String docno,
           String budat,
           String bldat,
           String bukrs,
           String blart,
           String monat,
           String usnam,
           String xblnr,
           String bktxt,
           String waers,
           String clearing_doc,
           String reserve_f1,
           String reserve_f2,
           String reserve_f3,
           String reserve_f4,
           String reserve_f5) {
           this.docno = docno;
           this.budat = budat;
           this.bldat = bldat;
           this.bukrs = bukrs;
           this.blart = blart;
           this.monat = monat;
           this.usnam = usnam;
           this.xblnr = xblnr;
           this.bktxt = bktxt;
           this.waers = waers;
           this.clearing_doc = clearing_doc;
           this.reserve_f1 = reserve_f1;
           this.reserve_f2 = reserve_f2;
           this.reserve_f3 = reserve_f3;
           this.reserve_f4 = reserve_f4;
           this.reserve_f5 = reserve_f5;
    }


    /**
     * Gets the docno value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return docno   * sfs系统单据号
     */
    public String getDocno() {
        return docno;
    }


    /**
     * Sets the docno value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param docno   * sfs系统单据号
     */
    public void setDocno(String docno) {
        this.docno = docno;
    }


    /**
     * Gets the budat value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return budat   * 凭证中的过帐日期
     */
    public String getBudat() {
        return budat;
    }


    /**
     * Sets the budat value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param budat   * 凭证中的过帐日期
     */
    public void setBudat(String budat) {
        this.budat = budat;
    }


    /**
     * Gets the bldat value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return bldat   * 凭证中的凭证日期
     */
    public String getBldat() {
        return bldat;
    }


    /**
     * Sets the bldat value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param bldat   * 凭证中的凭证日期
     */
    public void setBldat(String bldat) {
        this.bldat = bldat;
    }


    /**
     * Gets the bukrs value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return bukrs   * 公司代码
     */
    public String getBukrs() {
        return bukrs;
    }


    /**
     * Sets the bukrs value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param bukrs   * 公司代码
     */
    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }


    /**
     * Gets the blart value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return blart   * 凭证类型
     */
    public String getBlart() {
        return blart;
    }


    /**
     * Sets the blart value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param blart   * 凭证类型
     */
    public void setBlart(String blart) {
        this.blart = blart;
    }


    /**
     * Gets the monat value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return monat   * 会计期间
     */
    public String getMonat() {
        return monat;
    }


    /**
     * Sets the monat value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param monat   * 会计期间
     */
    public void setMonat(String monat) {
        this.monat = monat;
    }


    /**
     * Gets the usnam value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return usnam   * 用户名
     */
    public String getUsnam() {
        return usnam;
    }


    /**
     * Sets the usnam value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param usnam   * 用户名
     */
    public void setUsnam(String usnam) {
        this.usnam = usnam;
    }


    /**
     * Gets the xblnr value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return xblnr   * 参考凭证编号
     */
    public String getXblnr() {
        return xblnr;
    }


    /**
     * Sets the xblnr value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param xblnr   * 参考凭证编号
     */
    public void setXblnr(String xblnr) {
        this.xblnr = xblnr;
    }


    /**
     * Gets the bktxt value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return bktxt   * 凭证抬头文本
     */
    public String getBktxt() {
        return bktxt;
    }


    /**
     * Sets the bktxt value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param bktxt   * 凭证抬头文本
     */
    public void setBktxt(String bktxt) {
        this.bktxt = bktxt;
    }


    /**
     * Gets the waers value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return waers   * 货币码
     */
    public String getWaers() {
        return waers;
    }


    /**
     * Sets the waers value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param waers   * 货币码
     */
    public void setWaers(String waers) {
        this.waers = waers;
    }


    /**
     * Gets the clearing_doc value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return clearing_doc   * 是否清账凭证
     */
    public String getClearing_doc() {
        return clearing_doc;
    }


    /**
     * Sets the clearing_doc value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param clearing_doc   * 是否清账凭证
     */
    public void setClearing_doc(String clearing_doc) {
        this.clearing_doc = clearing_doc;
    }


    /**
     * Gets the reserve_f1 value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return reserve_f1   * 头备用字段1
     */
    public String getReserve_f1() {
        return reserve_f1;
    }


    /**
     * Sets the reserve_f1 value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param reserve_f1   * 头备用字段1
     */
    public void setReserve_f1(String reserve_f1) {
        this.reserve_f1 = reserve_f1;
    }


    /**
     * Gets the reserve_f2 value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return reserve_f2   * 头备用字段2
     */
    public String getReserve_f2() {
        return reserve_f2;
    }


    /**
     * Sets the reserve_f2 value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param reserve_f2   * 头备用字段2
     */
    public void setReserve_f2(String reserve_f2) {
        this.reserve_f2 = reserve_f2;
    }


    /**
     * Gets the reserve_f3 value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return reserve_f3   * 头备用字段3
     */
    public String getReserve_f3() {
        return reserve_f3;
    }


    /**
     * Sets the reserve_f3 value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param reserve_f3   * 头备用字段3
     */
    public void setReserve_f3(String reserve_f3) {
        this.reserve_f3 = reserve_f3;
    }


    /**
     * Gets the reserve_f4 value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return reserve_f4   * 头备用字段4
     */
    public String getReserve_f4() {
        return reserve_f4;
    }


    /**
     * Sets the reserve_f4 value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param reserve_f4   * 头备用字段4
     */
    public void setReserve_f4(String reserve_f4) {
        this.reserve_f4 = reserve_f4;
    }


    /**
     * Gets the reserve_f5 value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @return reserve_f5   * 头备用字段5
     */
    public String getReserve_f5() {
        return reserve_f5;
    }


    /**
     * Sets the reserve_f5 value for this Dt_sfs_bill_acc_docIt_header.
     * 
     * @param reserve_f5   * 头备用字段5
     */
    public void setReserve_f5(String reserve_f5) {
        this.reserve_f5 = reserve_f5;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Dt_sfs_bill_acc_docIt_header)) return false;
        Dt_sfs_bill_acc_docIt_header other = (Dt_sfs_bill_acc_docIt_header) obj;
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
            ((this.budat==null && other.getBudat()==null) || 
             (this.budat!=null &&
              this.budat.equals(other.getBudat()))) &&
            ((this.bldat==null && other.getBldat()==null) || 
             (this.bldat!=null &&
              this.bldat.equals(other.getBldat()))) &&
            ((this.bukrs==null && other.getBukrs()==null) || 
             (this.bukrs!=null &&
              this.bukrs.equals(other.getBukrs()))) &&
            ((this.blart==null && other.getBlart()==null) || 
             (this.blart!=null &&
              this.blart.equals(other.getBlart()))) &&
            ((this.monat==null && other.getMonat()==null) || 
             (this.monat!=null &&
              this.monat.equals(other.getMonat()))) &&
            ((this.usnam==null && other.getUsnam()==null) || 
             (this.usnam!=null &&
              this.usnam.equals(other.getUsnam()))) &&
            ((this.xblnr==null && other.getXblnr()==null) || 
             (this.xblnr!=null &&
              this.xblnr.equals(other.getXblnr()))) &&
            ((this.bktxt==null && other.getBktxt()==null) || 
             (this.bktxt!=null &&
              this.bktxt.equals(other.getBktxt()))) &&
            ((this.waers==null && other.getWaers()==null) || 
             (this.waers!=null &&
              this.waers.equals(other.getWaers()))) &&
            ((this.clearing_doc==null && other.getClearing_doc()==null) || 
             (this.clearing_doc!=null &&
              this.clearing_doc.equals(other.getClearing_doc()))) &&
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
        if (getBudat() != null) {
            _hashCode += getBudat().hashCode();
        }
        if (getBldat() != null) {
            _hashCode += getBldat().hashCode();
        }
        if (getBukrs() != null) {
            _hashCode += getBukrs().hashCode();
        }
        if (getBlart() != null) {
            _hashCode += getBlart().hashCode();
        }
        if (getMonat() != null) {
            _hashCode += getMonat().hashCode();
        }
        if (getUsnam() != null) {
            _hashCode += getUsnam().hashCode();
        }
        if (getXblnr() != null) {
            _hashCode += getXblnr().hashCode();
        }
        if (getBktxt() != null) {
            _hashCode += getBktxt().hashCode();
        }
        if (getWaers() != null) {
            _hashCode += getWaers().hashCode();
        }
        if (getClearing_doc() != null) {
            _hashCode += getClearing_doc().hashCode();
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
        new org.apache.axis.description.TypeDesc(Dt_sfs_bill_acc_docIt_header.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:goldwind.com:i_sfs:sfs_bill_acc_doc", ">dt_sfs_bill_acc_doc>it_header"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "budat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bldat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bldat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bukrs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bukrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usnam");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usnam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xblnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xblnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bktxt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bktxt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearing_doc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clearing_doc"));
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
