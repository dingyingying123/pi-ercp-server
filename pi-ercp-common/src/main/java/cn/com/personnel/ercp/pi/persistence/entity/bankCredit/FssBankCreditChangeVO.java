package cn.com.personnel.ercp.pi.persistence.entity.bankCredit;

import java.util.List;

public class FssBankCreditChangeVO {

    private FssBankCreditChange fssBankCreditChange;

    private List<FssBankCreditChange> listFssBankCreditChange;

    private FssBankCreditChangeLineDetails fssBankCreditChangeLineDetails;

    private List<FssBankCreditChangeLineDetails> listFssBankCreditChangeLineDetails;

    private Integer whetherToSubmit;

    public FssBankCreditChange getFssBankCreditChange() {
        return fssBankCreditChange;
    }

    public void setFssBankCreditChange(FssBankCreditChange fssBankCreditChange) {
        this.fssBankCreditChange = fssBankCreditChange;
    }

    public List<FssBankCreditChange> getListFssBankCreditChange() {
        return listFssBankCreditChange;
    }

    public void setListFssBankCreditChange(List<FssBankCreditChange> listFssBankCreditChange) {
        this.listFssBankCreditChange = listFssBankCreditChange;
    }

    public FssBankCreditChangeLineDetails getFssBankCreditChangeLineDetails() {
        return fssBankCreditChangeLineDetails;
    }

    public void setFssBankCreditChangeLineDetails(FssBankCreditChangeLineDetails fssBankCreditChangeLineDetails) {
        this.fssBankCreditChangeLineDetails = fssBankCreditChangeLineDetails;
    }

    public List<FssBankCreditChangeLineDetails> getListFssBankCreditChangeLineDetails() {
        return listFssBankCreditChangeLineDetails;
    }

    public void setListFssBankCreditChangeLineDetails(List<FssBankCreditChangeLineDetails> listFssBankCreditChangeLineDetails) {
        this.listFssBankCreditChangeLineDetails = listFssBankCreditChangeLineDetails;
    }

    public Integer getWhetherToSubmit() {
        return whetherToSubmit;
    }

    public void setWhetherToSubmit(Integer whetherToSubmit) {
        this.whetherToSubmit = whetherToSubmit;
    }
}
