package cn.com.personnel.ercp.pi.persistence.entity.bankCredit;

import java.util.List;

public class FssBankCreditManagementVO {

    private FssBankCreditManagement fssBankCreditManagement;

    private List<FssBankCreditManagement> listFssBankCreditManagement;

    private FssBankCreditLineDetailsManage fssBankCreditLineDetailsManage;

    private List<FssBankCreditLineDetailsManage> listFssBankCreditLineDetailsManage;

    public FssBankCreditManagement getFssBankCreditManagement() {
        return fssBankCreditManagement;
    }

    public void setFssBankCreditManagement(FssBankCreditManagement fssBankCreditManagement) {
        this.fssBankCreditManagement = fssBankCreditManagement;
    }

    public List<FssBankCreditManagement> getListFssBankCreditManagement() {
        return listFssBankCreditManagement;
    }

    public void setListFssBankCreditManagement(List<FssBankCreditManagement> listFssBankCreditManagement) {
        this.listFssBankCreditManagement = listFssBankCreditManagement;
    }

    public FssBankCreditLineDetailsManage getFssBankCreditLineDetailsManage() {
        return fssBankCreditLineDetailsManage;
    }

    public void setFssBankCreditLineDetailsManage(FssBankCreditLineDetailsManage fssBankCreditLineDetailsManage) {
        this.fssBankCreditLineDetailsManage = fssBankCreditLineDetailsManage;
    }

    public List<FssBankCreditLineDetailsManage> getListFssBankCreditLineDetailsManage() {
        return listFssBankCreditLineDetailsManage;
    }

    public void setListFssBankCreditLineDetailsManage(List<FssBankCreditLineDetailsManage> listFssBankCreditLineDetailsManage) {
        this.listFssBankCreditLineDetailsManage = listFssBankCreditLineDetailsManage;
    }
}
