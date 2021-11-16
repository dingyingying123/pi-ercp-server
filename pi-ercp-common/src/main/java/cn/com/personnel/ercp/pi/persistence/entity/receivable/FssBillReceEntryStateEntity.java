package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * TODO
 * 不终止，折现过帐状态关联表
 * @author DongAiHua
 * @Date 2020/10/10 11:11
 */
@Table(name = "fss_bill_rece_entry_state")
public class FssBillReceEntryStateEntity {
    @Id
    @Column(name = "ens_id")
    private String ensId;
    @Column(name = "type")
    private String type;
    @Column(name = "post_date")
    private Date postDate;
    @Column(name = "rece_id")
    private String receId;
    @Column(name = "group_no")
    private String groupNo;
    @Column(name = "entry_number")
    private String entryNumber;
    @Column(name = "document_no")
    private String documentNo;
    @Column(name = "entry_status")
    private String entryStatus;
    @Column(name = "updater")
    private String updater;
    @Column(name = "update_time")
    private Date updateTime;
    @Column(name = "error_message")
    private String errorMessage;
    @Column(name = "reversal_status")
    private String reversalStatus;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getReversalStatus() {
        return reversalStatus;
    }

    public void setReversalStatus(String reversalStatus) {
        this.reversalStatus = reversalStatus;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getEnsId() {
        return ensId;
    }

    public void setEnsId(String ensId) {
        this.ensId = ensId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getReceId() {
        return receId;
    }

    public void setReceId(String receId) {
        this.receId = receId;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(String entryNumber) {
        this.entryNumber = entryNumber;
    }

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    public String getEntryStatus() {
        return entryStatus;
    }

    public void setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus;
    }
}
