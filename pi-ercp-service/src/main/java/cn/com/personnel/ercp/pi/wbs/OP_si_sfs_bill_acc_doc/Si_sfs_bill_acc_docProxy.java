package cn.com.personnel.ercp.pi.wbs.OP_si_sfs_bill_acc_doc;

public class Si_sfs_bill_acc_docProxy implements Si_sfs_bill_acc_doc {
  private String _endpoint = null;
  private Si_sfs_bill_acc_doc si_sfs_bill_acc_doc = null;
  
  public Si_sfs_bill_acc_docProxy() {
    _initSi_sfs_bill_acc_docProxy();
  }
  
  public Si_sfs_bill_acc_docProxy(String endpoint) {
    _endpoint = endpoint;
    _initSi_sfs_bill_acc_docProxy();
  }
  
  private void _initSi_sfs_bill_acc_docProxy() {
    try {
      si_sfs_bill_acc_doc = (new Si_sfs_bill_acc_docServiceLocator()).getHTTPS_Port();
      if (si_sfs_bill_acc_doc != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)si_sfs_bill_acc_doc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)si_sfs_bill_acc_doc)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (si_sfs_bill_acc_doc != null)
      ((javax.xml.rpc.Stub)si_sfs_bill_acc_doc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Si_sfs_bill_acc_doc getSi_sfs_bill_acc_doc() {
    if (si_sfs_bill_acc_doc == null)
      _initSi_sfs_bill_acc_docProxy();
    return si_sfs_bill_acc_doc;
  }
  
  public void si_sfs_bill_acc_doc(Dt_sfs_bill_acc_doc mt_sfs_bill_acc_doc) throws java.rmi.RemoteException{
    if (si_sfs_bill_acc_doc == null)
      _initSi_sfs_bill_acc_docProxy();
    si_sfs_bill_acc_doc.si_sfs_bill_acc_doc(mt_sfs_bill_acc_doc);
  }
  
  
}