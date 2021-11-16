/**
 * MessageHead.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.personnel.ercp.pi.wbs.OP_si_sfs_bill_acc_doc;


/**
 * 集成消息抬头信息
 */
public class MessageHead  implements java.io.Serializable {
    /* 接受数据的ECC系统 */
    private String MANDT;

    /* 第三方发出消息为必输，外围系统生成GUID，关联反馈消息 */
    private String GUID;

    /* ERP发出消息为必输，ERP系统生成GUID，用于ERP关联消息和监控平台使用 */
    private String PROXY_ID;

    /* 调用服务的外围系统号，关联反馈消息 */
    private String SYSTEM_ID;

    /* 外部系统调用人 */
    private String OPERATOR;

    /* 语言编码 */
    private String SPRAS;

    /* 接口名称，可选，PI系统提供 */
    private String INTERFACE_ID;

    /* 发送方，可选，PI系统提供 */
    private String SENDER;

    /* 接收方，可选，PI系统提供 */
    private String RECIVER;

    /* 发送时间，可选，14位，格式：YYYYMMDDHHMMSS */
    private String SENDTIME;

    public MessageHead() {
    }

    public MessageHead(
           String MANDT,
           String GUID,
           String PROXY_ID,
           String SYSTEM_ID,
           String OPERATOR,
           String SPRAS,
           String INTERFACE_ID,
           String SENDER,
           String RECIVER,
           String SENDTIME) {
           this.MANDT = MANDT;
           this.GUID = GUID;
           this.PROXY_ID = PROXY_ID;
           this.SYSTEM_ID = SYSTEM_ID;
           this.OPERATOR = OPERATOR;
           this.SPRAS = SPRAS;
           this.INTERFACE_ID = INTERFACE_ID;
           this.SENDER = SENDER;
           this.RECIVER = RECIVER;
           this.SENDTIME = SENDTIME;
    }


    /**
     * Gets the MANDT value for this MessageHead.
     * 
     * @return MANDT   * 接受数据的ECC系统
     */
    public String getMANDT() {
        return MANDT;
    }


    /**
     * Sets the MANDT value for this MessageHead.
     * 
     * @param MANDT   * 接受数据的ECC系统
     */
    public void setMANDT(String MANDT) {
        this.MANDT = MANDT;
    }


    /**
     * Gets the GUID value for this MessageHead.
     * 
     * @return GUID   * 第三方发出消息为必输，外围系统生成GUID，关联反馈消息
     */
    public String getGUID() {
        return GUID;
    }


    /**
     * Sets the GUID value for this MessageHead.
     * 
     * @param GUID   * 第三方发出消息为必输，外围系统生成GUID，关联反馈消息
     */
    public void setGUID(String GUID) {
        this.GUID = GUID;
    }


    /**
     * Gets the PROXY_ID value for this MessageHead.
     * 
     * @return PROXY_ID   * ERP发出消息为必输，ERP系统生成GUID，用于ERP关联消息和监控平台使用
     */
    public String getPROXY_ID() {
        return PROXY_ID;
    }


    /**
     * Sets the PROXY_ID value for this MessageHead.
     * 
     * @param PROXY_ID   * ERP发出消息为必输，ERP系统生成GUID，用于ERP关联消息和监控平台使用
     */
    public void setPROXY_ID(String PROXY_ID) {
        this.PROXY_ID = PROXY_ID;
    }


    /**
     * Gets the SYSTEM_ID value for this MessageHead.
     * 
     * @return SYSTEM_ID   * 调用服务的外围系统号，关联反馈消息
     */
    public String getSYSTEM_ID() {
        return SYSTEM_ID;
    }


    /**
     * Sets the SYSTEM_ID value for this MessageHead.
     * 
     * @param SYSTEM_ID   * 调用服务的外围系统号，关联反馈消息
     */
    public void setSYSTEM_ID(String SYSTEM_ID) {
        this.SYSTEM_ID = SYSTEM_ID;
    }


    /**
     * Gets the OPERATOR value for this MessageHead.
     * 
     * @return OPERATOR   * 外部系统调用人
     */
    public String getOPERATOR() {
        return OPERATOR;
    }


    /**
     * Sets the OPERATOR value for this MessageHead.
     * 
     * @param OPERATOR   * 外部系统调用人
     */
    public void setOPERATOR(String OPERATOR) {
        this.OPERATOR = OPERATOR;
    }


    /**
     * Gets the SPRAS value for this MessageHead.
     * 
     * @return SPRAS   * 语言编码
     */
    public String getSPRAS() {
        return SPRAS;
    }


    /**
     * Sets the SPRAS value for this MessageHead.
     * 
     * @param SPRAS   * 语言编码
     */
    public void setSPRAS(String SPRAS) {
        this.SPRAS = SPRAS;
    }


    /**
     * Gets the INTERFACE_ID value for this MessageHead.
     * 
     * @return INTERFACE_ID   * 接口名称，可选，PI系统提供
     */
    public String getINTERFACE_ID() {
        return INTERFACE_ID;
    }


    /**
     * Sets the INTERFACE_ID value for this MessageHead.
     * 
     * @param INTERFACE_ID   * 接口名称，可选，PI系统提供
     */
    public void setINTERFACE_ID(String INTERFACE_ID) {
        this.INTERFACE_ID = INTERFACE_ID;
    }


    /**
     * Gets the SENDER value for this MessageHead.
     * 
     * @return SENDER   * 发送方，可选，PI系统提供
     */
    public String getSENDER() {
        return SENDER;
    }


    /**
     * Sets the SENDER value for this MessageHead.
     * 
     * @param SENDER   * 发送方，可选，PI系统提供
     */
    public void setSENDER(String SENDER) {
        this.SENDER = SENDER;
    }


    /**
     * Gets the RECIVER value for this MessageHead.
     * 
     * @return RECIVER   * 接收方，可选，PI系统提供
     */
    public String getRECIVER() {
        return RECIVER;
    }


    /**
     * Sets the RECIVER value for this MessageHead.
     * 
     * @param RECIVER   * 接收方，可选，PI系统提供
     */
    public void setRECIVER(String RECIVER) {
        this.RECIVER = RECIVER;
    }


    /**
     * Gets the SENDTIME value for this MessageHead.
     * 
     * @return SENDTIME   * 发送时间，可选，14位，格式：YYYYMMDDHHMMSS
     */
    public String getSENDTIME() {
        return SENDTIME;
    }


    /**
     * Sets the SENDTIME value for this MessageHead.
     * 
     * @param SENDTIME   * 发送时间，可选，14位，格式：YYYYMMDDHHMMSS
     */
    public void setSENDTIME(String SENDTIME) {
        this.SENDTIME = SENDTIME;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MessageHead)) return false;
        MessageHead other = (MessageHead) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MANDT==null && other.getMANDT()==null) || 
             (this.MANDT!=null &&
              this.MANDT.equals(other.getMANDT()))) &&
            ((this.GUID==null && other.getGUID()==null) || 
             (this.GUID!=null &&
              this.GUID.equals(other.getGUID()))) &&
            ((this.PROXY_ID==null && other.getPROXY_ID()==null) || 
             (this.PROXY_ID!=null &&
              this.PROXY_ID.equals(other.getPROXY_ID()))) &&
            ((this.SYSTEM_ID==null && other.getSYSTEM_ID()==null) || 
             (this.SYSTEM_ID!=null &&
              this.SYSTEM_ID.equals(other.getSYSTEM_ID()))) &&
            ((this.OPERATOR==null && other.getOPERATOR()==null) || 
             (this.OPERATOR!=null &&
              this.OPERATOR.equals(other.getOPERATOR()))) &&
            ((this.SPRAS==null && other.getSPRAS()==null) || 
             (this.SPRAS!=null &&
              this.SPRAS.equals(other.getSPRAS()))) &&
            ((this.INTERFACE_ID==null && other.getINTERFACE_ID()==null) || 
             (this.INTERFACE_ID!=null &&
              this.INTERFACE_ID.equals(other.getINTERFACE_ID()))) &&
            ((this.SENDER==null && other.getSENDER()==null) || 
             (this.SENDER!=null &&
              this.SENDER.equals(other.getSENDER()))) &&
            ((this.RECIVER==null && other.getRECIVER()==null) || 
             (this.RECIVER!=null &&
              this.RECIVER.equals(other.getRECIVER()))) &&
            ((this.SENDTIME==null && other.getSENDTIME()==null) || 
             (this.SENDTIME!=null &&
              this.SENDTIME.equals(other.getSENDTIME())));
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
        if (getMANDT() != null) {
            _hashCode += getMANDT().hashCode();
        }
        if (getGUID() != null) {
            _hashCode += getGUID().hashCode();
        }
        if (getPROXY_ID() != null) {
            _hashCode += getPROXY_ID().hashCode();
        }
        if (getSYSTEM_ID() != null) {
            _hashCode += getSYSTEM_ID().hashCode();
        }
        if (getOPERATOR() != null) {
            _hashCode += getOPERATOR().hashCode();
        }
        if (getSPRAS() != null) {
            _hashCode += getSPRAS().hashCode();
        }
        if (getINTERFACE_ID() != null) {
            _hashCode += getINTERFACE_ID().hashCode();
        }
        if (getSENDER() != null) {
            _hashCode += getSENDER().hashCode();
        }
        if (getRECIVER() != null) {
            _hashCode += getRECIVER().hashCode();
        }
        if (getSENDTIME() != null) {
            _hashCode += getSENDTIME().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageHead.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:goldwind.com:i_sfs:com_basis_global", "MessageHead"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MANDT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MANDT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROXY_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PROXY_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYSTEM_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SYSTEM_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OPERATOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OPERATOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPRAS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SPRAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INTERFACE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INTERFACE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SENDER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SENDER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RECIVER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RECIVER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SENDTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SENDTIME"));
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
