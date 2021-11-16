/**
 * Dt_sfs_reverse_acc_docIs_reverse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.personnel.ercp.pi.wbs.OP_si_sfs_reverse_acc_doc;

public class Dt_sfs_reverse_acc_docIs_reverse  implements java.io.Serializable {
    /* sfs系统单据号 */
    private String docnr;

    /* 财年 */
    private String gjahr;

    /* 公司代码 */
    private String bukrs;

    /* 会计凭证号码 */
    private String belnr;

    /* 凭证中的过帐日期 */
    private String budat;

    /* 冲销原因 */
    private String stgrd;

    /* 头备用字段1 */
    private String reserve_f1;

    /* 头备用字段2 */
    private String reserve_f2;

    /* 头备用字段3 */
    private String reserve_f3;

    public Dt_sfs_reverse_acc_docIs_reverse() {
    }

    public Dt_sfs_reverse_acc_docIs_reverse(
           String docnr,
           String gjahr,
           String bukrs,
           String belnr,
           String budat,
           String stgrd,
           String reserve_f1,
           String reserve_f2,
           String reserve_f3) {
           this.docnr = docnr;
           this.gjahr = gjahr;
           this.bukrs = bukrs;
           this.belnr = belnr;
           this.budat = budat;
           this.stgrd = stgrd;
           this.reserve_f1 = reserve_f1;
           this.reserve_f2 = reserve_f2;
           this.reserve_f3 = reserve_f3;
    }


    /**
     * Gets the docnr value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @return docnr   * sfs系统单据号
     */
    public String getDocnr() {
        return docnr;
    }


    /**
     * Sets the docnr value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @param docnr   * sfs系统单据号
     */
    public void setDocnr(String docnr) {
        this.docnr = docnr;
    }


    /**
     * Gets the gjahr value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @return gjahr   * 财年
     */
    public String getGjahr() {
        return gjahr;
    }


    /**
     * Sets the gjahr value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @param gjahr   * 财年
     */
    public void setGjahr(String gjahr) {
        this.gjahr = gjahr;
    }


    /**
     * Gets the bukrs value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @return bukrs   * 公司代码
     */
    public String getBukrs() {
        return bukrs;
    }


    /**
     * Sets the bukrs value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @param bukrs   * 公司代码
     */
    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }


    /**
     * Gets the belnr value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @return belnr   * 会计凭证号码
     */
    public String getBelnr() {
        return belnr;
    }


    /**
     * Sets the belnr value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @param belnr   * 会计凭证号码
     */
    public void setBelnr(String belnr) {
        this.belnr = belnr;
    }


    /**
     * Gets the budat value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @return budat   * 凭证中的过帐日期
     */
    public String getBudat() {
        return budat;
    }


    /**
     * Sets the budat value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @param budat   * 凭证中的过帐日期
     */
    public void setBudat(String budat) {
        this.budat = budat;
    }


    /**
     * Gets the stgrd value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @return stgrd   * 冲销原因
     */
    public String getStgrd() {
        return stgrd;
    }


    /**
     * Sets the stgrd value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @param stgrd   * 冲销原因
     */
    public void setStgrd(String stgrd) {
        this.stgrd = stgrd;
    }


    /**
     * Gets the reserve_f1 value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @return reserve_f1   * 头备用字段1
     */
    public String getReserve_f1() {
        return reserve_f1;
    }


    /**
     * Sets the reserve_f1 value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @param reserve_f1   * 头备用字段1
     */
    public void setReserve_f1(String reserve_f1) {
        this.reserve_f1 = reserve_f1;
    }


    /**
     * Gets the reserve_f2 value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @return reserve_f2   * 头备用字段2
     */
    public String getReserve_f2() {
        return reserve_f2;
    }


    /**
     * Sets the reserve_f2 value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @param reserve_f2   * 头备用字段2
     */
    public void setReserve_f2(String reserve_f2) {
        this.reserve_f2 = reserve_f2;
    }


    /**
     * Gets the reserve_f3 value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @return reserve_f3   * 头备用字段3
     */
    public String getReserve_f3() {
        return reserve_f3;
    }


    /**
     * Sets the reserve_f3 value for this Dt_sfs_reverse_acc_docIs_reverse.
     * 
     * @param reserve_f3   * 头备用字段3
     */
    public void setReserve_f3(String reserve_f3) {
        this.reserve_f3 = reserve_f3;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Dt_sfs_reverse_acc_docIs_reverse)) return false;
        Dt_sfs_reverse_acc_docIs_reverse other = (Dt_sfs_reverse_acc_docIs_reverse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docnr==null && other.getDocnr()==null) || 
             (this.docnr!=null &&
              this.docnr.equals(other.getDocnr()))) &&
            ((this.gjahr==null && other.getGjahr()==null) || 
             (this.gjahr!=null &&
              this.gjahr.equals(other.getGjahr()))) &&
            ((this.bukrs==null && other.getBukrs()==null) || 
             (this.bukrs!=null &&
              this.bukrs.equals(other.getBukrs()))) &&
            ((this.belnr==null && other.getBelnr()==null) || 
             (this.belnr!=null &&
              this.belnr.equals(other.getBelnr()))) &&
            ((this.budat==null && other.getBudat()==null) || 
             (this.budat!=null &&
              this.budat.equals(other.getBudat()))) &&
            ((this.stgrd==null && other.getStgrd()==null) || 
             (this.stgrd!=null &&
              this.stgrd.equals(other.getStgrd()))) &&
            ((this.reserve_f1==null && other.getReserve_f1()==null) || 
             (this.reserve_f1!=null &&
              this.reserve_f1.equals(other.getReserve_f1()))) &&
            ((this.reserve_f2==null && other.getReserve_f2()==null) || 
             (this.reserve_f2!=null &&
              this.reserve_f2.equals(other.getReserve_f2()))) &&
            ((this.reserve_f3==null && other.getReserve_f3()==null) || 
             (this.reserve_f3!=null &&
              this.reserve_f3.equals(other.getReserve_f3())));
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
        if (getDocnr() != null) {
            _hashCode += getDocnr().hashCode();
        }
        if (getGjahr() != null) {
            _hashCode += getGjahr().hashCode();
        }
        if (getBukrs() != null) {
            _hashCode += getBukrs().hashCode();
        }
        if (getBelnr() != null) {
            _hashCode += getBelnr().hashCode();
        }
        if (getBudat() != null) {
            _hashCode += getBudat().hashCode();
        }
        if (getStgrd() != null) {
            _hashCode += getStgrd().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dt_sfs_reverse_acc_docIs_reverse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:goldwind.com:i_sfs:sfs_reverse_acc_doc", ">dt_sfs_reverse_acc_doc>is_reverse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gjahr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gjahr"));
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
        elemField.setFieldName("belnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belnr"));
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
        elemField.setFieldName("stgrd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stgrd"));
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
