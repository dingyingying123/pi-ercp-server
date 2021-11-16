
/**
 * DocumentException.java
 *
 * This file was auto-generated from WSDL by the Apache Axis2 version: 1.4.1
 * Built on : Aug 13, 2008 (05:03:35 LKT)
 */

package cn.com.personnel.ercp.pi.oaclient.oaWbs;

public class DocumentException extends java.lang.Exception {

    private BPMServiceStub.DocumentExceptionE faultMessage;

    public DocumentException() {
        super("DocumentException");
    }

    public DocumentException(java.lang.String s) {
        super(s);
    }

    public DocumentException(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public void setFaultMessage(BPMServiceStub.DocumentExceptionE msg) {
        faultMessage = msg;
    }

    public BPMServiceStub.DocumentExceptionE getFaultMessage() {
        return faultMessage;
    }
}
