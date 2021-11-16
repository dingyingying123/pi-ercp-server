package cn.com.personnel.ercp.pi.persistence.entity.bankCredit;

import java.util.List;

public class FssBankCreditInfosVO {
    private FssBankCreditInfo fssBankCreditInfo;

    private List<FssBankCreditInfo> listFssBankCreditInfo;

    private FssBankCreditLineDetails fssBankCreditLineDetails;

    private List<FssBankCreditLineDetails> listFssBankCreditLineDetails;

    private Integer whetherToSubmit;

    public FssBankCreditInfo getFssBankCreditInfo() {
        return fssBankCreditInfo;
    }

    public void setFssBankCreditInfo(FssBankCreditInfo fssBankCreditInfo) {
        this.fssBankCreditInfo = fssBankCreditInfo;
    }

    public List<FssBankCreditInfo> getListFssBankCreditInfo() {
        return listFssBankCreditInfo;
    }

    public void setListFssBankCreditInfo(List<FssBankCreditInfo> listFssBankCreditInfo) {
        this.listFssBankCreditInfo = listFssBankCreditInfo;
    }

    public FssBankCreditLineDetails getFssBankCreditLineDetails() {
        return fssBankCreditLineDetails;
    }

    public void setFssBankCreditLineDetails(FssBankCreditLineDetails fssBankCreditLineDetails) {
        this.fssBankCreditLineDetails = fssBankCreditLineDetails;
    }

    public List<FssBankCreditLineDetails> getListFssBankCreditLineDetails() {
        return listFssBankCreditLineDetails;
    }

    public void setListFssBankCreditLineDetails(List<FssBankCreditLineDetails> listFssBankCreditLineDetails) {
        this.listFssBankCreditLineDetails = listFssBankCreditLineDetails;
    }

    public Integer getWhetherToSubmit() {
        return whetherToSubmit;
    }

    public void setWhetherToSubmit(Integer whetherToSubmit) {
        this.whetherToSubmit = whetherToSubmit;
    }
}
