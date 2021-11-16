package cn.com.personnel.ercp.pi.persistence.entity.sap;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "fclm_bam_amd")
public class FclmBamAmd {
    @Id
    @Column(name = "acc_id")
    @GeneratedValue(generator = "JDBC")
    private String accId;

    @Id
    private String mandt;

    @Id
    private String revision;

    private String banks;

    private String bankl;

    @Column(name = "acc_num")
    private String accNum;

    @Column(name = "acc_type_id")
    private String accTypeId;

    @Column(name = "valid_from")
    private String validFrom;

    @Column(name = "valid_to")
    private String validTo;

    private String iban;

    private String status;

    @Column(name = "cash_pool")
    private String cashPool;

    @Column(name = "cash_pool_id")
    private String cashPoolId;

    private String bukrs;

    private String prctr;

    private String gsber;

    private String segment;

    private String beneficial;

    @Column(name = "bank_contact")
    private String bankContact;

    @Column(name = "rel_manager")
    private String relManager;

    @Column(name = "company_contact")
    private String companyContact;

    @Column(name = "account_supervisor")
    private String accountSupervisor;

    private String edbsum;

    private String idbsum;

    @Column(name = "bs_upload_time")
    private String bsUploadTime;

    @Column(name = "created_at")
    private Long createdAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "opened_at")
    private Long openedAt;

    @Column(name = "opened_by")
    private String openedBy;

    @Column(name = "changed_at")
    private Long changedAt;

    @Column(name = "changed_by")
    private String changedBy;

    @Column(name = "reviewed_at")
    private Long reviewedAt;

    @Column(name = "reviewed_by")
    private String reviewedBy;

    @Column(name = "closed_at")
    private Long closedAt;

    @Column(name = "closed_by")
    private String closedBy;

    @Column(name = "deleted_flag")
    private String deletedFlag;

    @Column(name = "importing_channel")
    private String importingChannel;

    @Column(name = "cutoff_time_d")
    private String cutoffTimeD;

    @Column(name = "cutoff_time_c")
    private String cutoffTimeC;

    @Column(name = "planned_closing_date")
    private String plannedClosingDate;

    @Column(name = "upload_bs_flag")
    private String uploadBsFlag;

    @Column(name = "created_at_dat")
    private String createdAtDat;

    @Column(name = "created_at_tim")
    private String createdAtTim;

    @Column(name = "opened_at_dat")
    private String openedAtDat;

    @Column(name = "opened_at_tim")
    private String openedAtTim;

    @Column(name = "changed_at_dat")
    private String changedAtDat;

    @Column(name = "changed_at_tim")
    private String changedAtTim;

    @Column(name = "closed_at_dat")
    private String closedAtDat;

    @Column(name = "closed_at_tim")
    private String closedAtTim;

    @Column(name = "control_key")
    private String controlKey;

    @Column(name = "iban_valid_from")
    private String ibanValidFrom;

    private String objnr;

    private String vgtyp;

    @Column(name = "procstat_act")
    private String procstatAct;

    @Column(name = "balstat_act")
    private String balstatAct;

    @Column(name = "serstat_act")
    private String serstatAct;

    @Column(name = "reconstat_act")
    private String reconstatAct;

    @Column(name = "exp_number")
    private String expNumber;

    @Column(name = "exp_rhyth")
    private String expRhyth;

    private String calendar;

    @Column(name = "sort_idx")
    private String sortIdx;

    @Column(name = "amt_diff")
    private BigDecimal amtDiff;

    @Column(name = "dummy_fclm_bam_amd_incl_eew_ps")
    private String dummyFclmBamAmdInclEewPs;

    /**
     * @return acc_id
     */
    public String getAccId() {
        return accId;
    }

    /**
     * @param accId
     */
    public void setAccId(String accId) {
        this.accId = accId;
    }

    /**
     * @return mandt
     */
    public String getMandt() {
        return mandt;
    }

    /**
     * @param mandt
     */
    public void setMandt(String mandt) {
        this.mandt = mandt;
    }

    /**
     * @return revision
     */
    public String getRevision() {
        return revision;
    }

    /**
     * @param revision
     */
    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * @return banks
     */
    public String getBanks() {
        return banks;
    }

    /**
     * @param banks
     */
    public void setBanks(String banks) {
        this.banks = banks;
    }

    /**
     * @return bankl
     */
    public String getBankl() {
        return bankl;
    }

    /**
     * @param bankl
     */
    public void setBankl(String bankl) {
        this.bankl = bankl;
    }

    /**
     * @return acc_num
     */
    public String getAccNum() {
        return accNum;
    }

    /**
     * @param accNum
     */
    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    /**
     * @return acc_type_id
     */
    public String getAccTypeId() {
        return accTypeId;
    }

    /**
     * @param accTypeId
     */
    public void setAccTypeId(String accTypeId) {
        this.accTypeId = accTypeId;
    }

    /**
     * @return valid_from
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * @param validFrom
     */
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * @return valid_to
     */
    public String getValidTo() {
        return validTo;
    }

    /**
     * @param validTo
     */
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    /**
     * @return iban
     */
    public String getIban() {
        return iban;
    }

    /**
     * @param iban
     */
    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return cash_pool
     */
    public String getCashPool() {
        return cashPool;
    }

    /**
     * @param cashPool
     */
    public void setCashPool(String cashPool) {
        this.cashPool = cashPool;
    }

    /**
     * @return cash_pool_id
     */
    public String getCashPoolId() {
        return cashPoolId;
    }

    /**
     * @param cashPoolId
     */
    public void setCashPoolId(String cashPoolId) {
        this.cashPoolId = cashPoolId;
    }

    /**
     * @return bukrs
     */
    public String getBukrs() {
        return bukrs;
    }

    /**
     * @param bukrs
     */
    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }

    /**
     * @return prctr
     */
    public String getPrctr() {
        return prctr;
    }

    /**
     * @param prctr
     */
    public void setPrctr(String prctr) {
        this.prctr = prctr;
    }

    /**
     * @return gsber
     */
    public String getGsber() {
        return gsber;
    }

    /**
     * @param gsber
     */
    public void setGsber(String gsber) {
        this.gsber = gsber;
    }

    /**
     * @return segment
     */
    public String getSegment() {
        return segment;
    }

    /**
     * @param segment
     */
    public void setSegment(String segment) {
        this.segment = segment;
    }

    /**
     * @return beneficial
     */
    public String getBeneficial() {
        return beneficial;
    }

    /**
     * @param beneficial
     */
    public void setBeneficial(String beneficial) {
        this.beneficial = beneficial;
    }

    /**
     * @return bank_contact
     */
    public String getBankContact() {
        return bankContact;
    }

    /**
     * @param bankContact
     */
    public void setBankContact(String bankContact) {
        this.bankContact = bankContact;
    }

    /**
     * @return rel_manager
     */
    public String getRelManager() {
        return relManager;
    }

    /**
     * @param relManager
     */
    public void setRelManager(String relManager) {
        this.relManager = relManager;
    }

    /**
     * @return company_contact
     */
    public String getCompanyContact() {
        return companyContact;
    }

    /**
     * @param companyContact
     */
    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact;
    }

    /**
     * @return account_supervisor
     */
    public String getAccountSupervisor() {
        return accountSupervisor;
    }

    /**
     * @param accountSupervisor
     */
    public void setAccountSupervisor(String accountSupervisor) {
        this.accountSupervisor = accountSupervisor;
    }

    /**
     * @return edbsum
     */
    public String getEdbsum() {
        return edbsum;
    }

    /**
     * @param edbsum
     */
    public void setEdbsum(String edbsum) {
        this.edbsum = edbsum;
    }

    /**
     * @return idbsum
     */
    public String getIdbsum() {
        return idbsum;
    }

    /**
     * @param idbsum
     */
    public void setIdbsum(String idbsum) {
        this.idbsum = idbsum;
    }

    /**
     * @return bs_upload_time
     */
    public String getBsUploadTime() {
        return bsUploadTime;
    }

    /**
     * @param bsUploadTime
     */
    public void setBsUploadTime(String bsUploadTime) {
        this.bsUploadTime = bsUploadTime;
    }

    /**
     * @return created_at
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return created_by
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return opened_at
     */
    public Long getOpenedAt() {
        return openedAt;
    }

    /**
     * @param openedAt
     */
    public void setOpenedAt(Long openedAt) {
        this.openedAt = openedAt;
    }

    /**
     * @return opened_by
     */
    public String getOpenedBy() {
        return openedBy;
    }

    /**
     * @param openedBy
     */
    public void setOpenedBy(String openedBy) {
        this.openedBy = openedBy;
    }

    /**
     * @return changed_at
     */
    public Long getChangedAt() {
        return changedAt;
    }

    /**
     * @param changedAt
     */
    public void setChangedAt(Long changedAt) {
        this.changedAt = changedAt;
    }

    /**
     * @return changed_by
     */
    public String getChangedBy() {
        return changedBy;
    }

    /**
     * @param changedBy
     */
    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    /**
     * @return reviewed_at
     */
    public Long getReviewedAt() {
        return reviewedAt;
    }

    /**
     * @param reviewedAt
     */
    public void setReviewedAt(Long reviewedAt) {
        this.reviewedAt = reviewedAt;
    }

    /**
     * @return reviewed_by
     */
    public String getReviewedBy() {
        return reviewedBy;
    }

    /**
     * @param reviewedBy
     */
    public void setReviewedBy(String reviewedBy) {
        this.reviewedBy = reviewedBy;
    }

    /**
     * @return closed_at
     */
    public Long getClosedAt() {
        return closedAt;
    }

    /**
     * @param closedAt
     */
    public void setClosedAt(Long closedAt) {
        this.closedAt = closedAt;
    }

    /**
     * @return closed_by
     */
    public String getClosedBy() {
        return closedBy;
    }

    /**
     * @param closedBy
     */
    public void setClosedBy(String closedBy) {
        this.closedBy = closedBy;
    }

    /**
     * @return deleted_flag
     */
    public String getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * @param deletedFlag
     */
    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    /**
     * @return importing_channel
     */
    public String getImportingChannel() {
        return importingChannel;
    }

    /**
     * @param importingChannel
     */
    public void setImportingChannel(String importingChannel) {
        this.importingChannel = importingChannel;
    }

    /**
     * @return cutoff_time_d
     */
    public String getCutoffTimeD() {
        return cutoffTimeD;
    }

    /**
     * @param cutoffTimeD
     */
    public void setCutoffTimeD(String cutoffTimeD) {
        this.cutoffTimeD = cutoffTimeD;
    }

    /**
     * @return cutoff_time_c
     */
    public String getCutoffTimeC() {
        return cutoffTimeC;
    }

    /**
     * @param cutoffTimeC
     */
    public void setCutoffTimeC(String cutoffTimeC) {
        this.cutoffTimeC = cutoffTimeC;
    }

    /**
     * @return planned_closing_date
     */
    public String getPlannedClosingDate() {
        return plannedClosingDate;
    }

    /**
     * @param plannedClosingDate
     */
    public void setPlannedClosingDate(String plannedClosingDate) {
        this.plannedClosingDate = plannedClosingDate;
    }

    /**
     * @return upload_bs_flag
     */
    public String getUploadBsFlag() {
        return uploadBsFlag;
    }

    /**
     * @param uploadBsFlag
     */
    public void setUploadBsFlag(String uploadBsFlag) {
        this.uploadBsFlag = uploadBsFlag;
    }

    /**
     * @return created_at_dat
     */
    public String getCreatedAtDat() {
        return createdAtDat;
    }

    /**
     * @param createdAtDat
     */
    public void setCreatedAtDat(String createdAtDat) {
        this.createdAtDat = createdAtDat;
    }

    /**
     * @return created_at_tim
     */
    public String getCreatedAtTim() {
        return createdAtTim;
    }

    /**
     * @param createdAtTim
     */
    public void setCreatedAtTim(String createdAtTim) {
        this.createdAtTim = createdAtTim;
    }

    /**
     * @return opened_at_dat
     */
    public String getOpenedAtDat() {
        return openedAtDat;
    }

    /**
     * @param openedAtDat
     */
    public void setOpenedAtDat(String openedAtDat) {
        this.openedAtDat = openedAtDat;
    }

    /**
     * @return opened_at_tim
     */
    public String getOpenedAtTim() {
        return openedAtTim;
    }

    /**
     * @param openedAtTim
     */
    public void setOpenedAtTim(String openedAtTim) {
        this.openedAtTim = openedAtTim;
    }

    /**
     * @return changed_at_dat
     */
    public String getChangedAtDat() {
        return changedAtDat;
    }

    /**
     * @param changedAtDat
     */
    public void setChangedAtDat(String changedAtDat) {
        this.changedAtDat = changedAtDat;
    }

    /**
     * @return changed_at_tim
     */
    public String getChangedAtTim() {
        return changedAtTim;
    }

    /**
     * @param changedAtTim
     */
    public void setChangedAtTim(String changedAtTim) {
        this.changedAtTim = changedAtTim;
    }

    /**
     * @return closed_at_dat
     */
    public String getClosedAtDat() {
        return closedAtDat;
    }

    /**
     * @param closedAtDat
     */
    public void setClosedAtDat(String closedAtDat) {
        this.closedAtDat = closedAtDat;
    }

    /**
     * @return closed_at_tim
     */
    public String getClosedAtTim() {
        return closedAtTim;
    }

    /**
     * @param closedAtTim
     */
    public void setClosedAtTim(String closedAtTim) {
        this.closedAtTim = closedAtTim;
    }

    /**
     * @return control_key
     */
    public String getControlKey() {
        return controlKey;
    }

    /**
     * @param controlKey
     */
    public void setControlKey(String controlKey) {
        this.controlKey = controlKey;
    }

    /**
     * @return iban_valid_from
     */
    public String getIbanValidFrom() {
        return ibanValidFrom;
    }

    /**
     * @param ibanValidFrom
     */
    public void setIbanValidFrom(String ibanValidFrom) {
        this.ibanValidFrom = ibanValidFrom;
    }

    /**
     * @return objnr
     */
    public String getObjnr() {
        return objnr;
    }

    /**
     * @param objnr
     */
    public void setObjnr(String objnr) {
        this.objnr = objnr;
    }

    /**
     * @return vgtyp
     */
    public String getVgtyp() {
        return vgtyp;
    }

    /**
     * @param vgtyp
     */
    public void setVgtyp(String vgtyp) {
        this.vgtyp = vgtyp;
    }

    /**
     * @return procstat_act
     */
    public String getProcstatAct() {
        return procstatAct;
    }

    /**
     * @param procstatAct
     */
    public void setProcstatAct(String procstatAct) {
        this.procstatAct = procstatAct;
    }

    /**
     * @return balstat_act
     */
    public String getBalstatAct() {
        return balstatAct;
    }

    /**
     * @param balstatAct
     */
    public void setBalstatAct(String balstatAct) {
        this.balstatAct = balstatAct;
    }

    /**
     * @return serstat_act
     */
    public String getSerstatAct() {
        return serstatAct;
    }

    /**
     * @param serstatAct
     */
    public void setSerstatAct(String serstatAct) {
        this.serstatAct = serstatAct;
    }

    /**
     * @return reconstat_act
     */
    public String getReconstatAct() {
        return reconstatAct;
    }

    /**
     * @param reconstatAct
     */
    public void setReconstatAct(String reconstatAct) {
        this.reconstatAct = reconstatAct;
    }

    /**
     * @return exp_number
     */
    public String getExpNumber() {
        return expNumber;
    }

    /**
     * @param expNumber
     */
    public void setExpNumber(String expNumber) {
        this.expNumber = expNumber;
    }

    /**
     * @return exp_rhyth
     */
    public String getExpRhyth() {
        return expRhyth;
    }

    /**
     * @param expRhyth
     */
    public void setExpRhyth(String expRhyth) {
        this.expRhyth = expRhyth;
    }

    /**
     * @return calendar
     */
    public String getCalendar() {
        return calendar;
    }

    /**
     * @param calendar
     */
    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }

    /**
     * @return sort_idx
     */
    public String getSortIdx() {
        return sortIdx;
    }

    /**
     * @param sortIdx
     */
    public void setSortIdx(String sortIdx) {
        this.sortIdx = sortIdx;
    }

    /**
     * @return amt_diff
     */
    public BigDecimal getAmtDiff() {
        return amtDiff;
    }

    /**
     * @param amtDiff
     */
    public void setAmtDiff(BigDecimal amtDiff) {
        this.amtDiff = amtDiff;
    }

    /**
     * @return dummy_fclm_bam_amd_incl_eew_ps
     */
    public String getDummyFclmBamAmdInclEewPs() {
        return dummyFclmBamAmdInclEewPs;
    }

    /**
     * @param dummyFclmBamAmdInclEewPs
     */
    public void setDummyFclmBamAmdInclEewPs(String dummyFclmBamAmdInclEewPs) {
        this.dummyFclmBamAmdInclEewPs = dummyFclmBamAmdInclEewPs;
    }
}