/**
 * Dt_sfs_bill_acc_doc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.personnel.ercp.pi.wbs.OP_si_sfs_bill_acc_doc;


/**
 * SFS票据凭证
 */
public class Dt_sfs_bill_acc_doc  implements java.io.Serializable {
    /* 集成消息标记 */
    private String iv_msg_flag;

    /* 集成消息抬头信息 */
    private MessageHead is_msg_head;

    /* 表头信息 */
    private Dt_sfs_bill_acc_docIt_header[] it_header;

    /* 行项信息 */
    private Dt_sfs_bill_acc_docIt_row[] it_row;

    public Dt_sfs_bill_acc_doc() {
    }

    public Dt_sfs_bill_acc_doc(
           String iv_msg_flag,
           MessageHead is_msg_head,
           Dt_sfs_bill_acc_docIt_header[] it_header,
           Dt_sfs_bill_acc_docIt_row[] it_row) {
           this.iv_msg_flag = iv_msg_flag;
           this.is_msg_head = is_msg_head;
           this.it_header = it_header;
           this.it_row = it_row;
    }


    /**
     * Gets the iv_msg_flag value for this Dt_sfs_bill_acc_doc.
     * 
     * @return iv_msg_flag   * 集成消息标记
     */
    public String getIv_msg_flag() {
        return iv_msg_flag;
    }


    /**
     * Sets the iv_msg_flag value for this Dt_sfs_bill_acc_doc.
     * 
     * @param iv_msg_flag   * 集成消息标记
     */
    public void setIv_msg_flag(String iv_msg_flag) {
        this.iv_msg_flag = iv_msg_flag;
    }


    /**
     * Gets the is_msg_head value for this Dt_sfs_bill_acc_doc.
     * 
     * @return is_msg_head   * 集成消息抬头信息
     */
    public MessageHead getIs_msg_head() {
        return is_msg_head;
    }


    /**
     * Sets the is_msg_head value for this Dt_sfs_bill_acc_doc.
     * 
     * @param is_msg_head   * 集成消息抬头信息
     */
    public void setIs_msg_head(MessageHead is_msg_head) {
        this.is_msg_head = is_msg_head;
    }


    /**
     * Gets the it_header value for this Dt_sfs_bill_acc_doc.
     * 
     * @return it_header   * 表头信息
     */
    public Dt_sfs_bill_acc_docIt_header[] getIt_header() {
        return it_header;
    }


    /**
     * Sets the it_header value for this Dt_sfs_bill_acc_doc.
     * 
     * @param it_header   * 表头信息
     */
    public void setIt_header(Dt_sfs_bill_acc_docIt_header[] it_header) {
        this.it_header = it_header;
    }

    public Dt_sfs_bill_acc_docIt_header getIt_header(int i) {
        return this.it_header[i];
    }

    public void setIt_header(int i, Dt_sfs_bill_acc_docIt_header _value) {
        this.it_header[i] = _value;
    }


    /**
     * Gets the it_row value for this Dt_sfs_bill_acc_doc.
     * 
     * @return it_row   * 行项信息
     */
    public Dt_sfs_bill_acc_docIt_row[] getIt_row() {
        return it_row;
    }


    /**
     * Sets the it_row value for this Dt_sfs_bill_acc_doc.
     * 
     * @param it_row   * 行项信息
     */
    public void setIt_row(Dt_sfs_bill_acc_docIt_row[] it_row) {
        this.it_row = it_row;
    }

    public Dt_sfs_bill_acc_docIt_row getIt_row(int i) {
        return this.it_row[i];
    }

    public void setIt_row(int i, Dt_sfs_bill_acc_docIt_row _value) {
        this.it_row[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Dt_sfs_bill_acc_doc)) return false;
        Dt_sfs_bill_acc_doc other = (Dt_sfs_bill_acc_doc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.iv_msg_flag==null && other.getIv_msg_flag()==null) || 
             (this.iv_msg_flag!=null &&
              this.iv_msg_flag.equals(other.getIv_msg_flag()))) &&
            ((this.is_msg_head==null && other.getIs_msg_head()==null) || 
             (this.is_msg_head!=null &&
              this.is_msg_head.equals(other.getIs_msg_head()))) &&
            ((this.it_header==null && other.getIt_header()==null) || 
             (this.it_header!=null &&
              java.util.Arrays.equals(this.it_header, other.getIt_header()))) &&
            ((this.it_row==null && other.getIt_row()==null) || 
             (this.it_row!=null &&
              java.util.Arrays.equals(this.it_row, other.getIt_row())));
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
        if (getIv_msg_flag() != null) {
            _hashCode += getIv_msg_flag().hashCode();
        }
        if (getIs_msg_head() != null) {
            _hashCode += getIs_msg_head().hashCode();
        }
        if (getIt_header() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIt_header());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getIt_header(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIt_row() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIt_row());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getIt_row(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dt_sfs_bill_acc_doc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:goldwind.com:i_sfs:sfs_bill_acc_doc", "dt_sfs_bill_acc_doc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iv_msg_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iv_msg_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_msg_head");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_msg_head"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:goldwind.com:i_sfs:com_basis_global", "MessageHead"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("it_header");
        elemField.setXmlName(new javax.xml.namespace.QName("", "it_header"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:goldwind.com:i_sfs:sfs_bill_acc_doc", ">dt_sfs_bill_acc_doc>it_header"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("it_row");
        elemField.setXmlName(new javax.xml.namespace.QName("", "it_row"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:goldwind.com:i_sfs:sfs_bill_acc_doc", ">dt_sfs_bill_acc_doc>it_row"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
