package cn.com.personnel.ercp.pi.persistence.entity.bankCredit;

import javax.persistence.Column;
import java.math.BigDecimal;

public class FssBankCreditChangeLineDetailsVO extends FssBankCreditChangeLineDetails {

    /**
     * 占用额度
     */
    @Column(name = "occupy_quota")
    private BigDecimal occupyQuota;

    /**
     * 折合人命币金额-占用额度
     */
    @Column(name = "convert_occupy_quota")
    private BigDecimal convertOccupyQuota;

    /**
     * 使用额度
     */
    @Column(name = "use_quota")
    private BigDecimal useQuota;

    /**
     * 折合人民币金额-使用额度
     */
    @Column(name = "convert_use_quota")
    private BigDecimal convertUseQuota;

    /**
     * 剩余额度
     */
    @Column(name = "remaining_amount")
    private BigDecimal remainingAmount;

    /**
     * 折合人命币额度-剩余额度
     */
    @Column(name = "convert_remaining_amount")
    private BigDecimal convertRemainingAmount;

    /**
     * 并表占用额度
     */
    @Column(name = "consolidated_occupancy_quota")
    private BigDecimal consolidatedOccupancyQuota;

    /**
     * 折合人民币金额-并表占用额度
     */
    @Column(name = "convert_consolidated_occupancy_quota")
    private BigDecimal convertConsolidatedOccupancyQuota;

    /**
     * 非并表占用额度
     */
    @Column(name = "no_consolidated_occupancy_quota")
    private BigDecimal noConsolidatedOccupancyQuota;

    /**
     * 折合人民币金额-非并表占用额度
     */
    @Column(name = "no_convert_consolidated_occupancy_quota")
    private BigDecimal noConvertConsolidatedOccupancyQuota;

    /**
     * 并表使用额度
     */
    @Column(name = "consolidated_use_quota")
    private BigDecimal consolidatedUseQuota;

    /**
     * 折合人民币金额-并表使用额度
     */
    @Column(name = "convert_consolidated_use_quota")
    private BigDecimal convertConsolidatedUseQuota;

    /**
     * 非并表使用额度
     */
    @Column(name = "no_consolidated_use_quota")
    private BigDecimal noConsolidatedUseQuota;

    /**
     * 折合人民币金额-非并表使用额度
     */
    @Column(name = "no_convert_consolidated_use_quota")
    private BigDecimal noConvertConsolidatedUseQuota;

    public BigDecimal getOccupyQuota() {
        return occupyQuota;
    }

    public void setOccupyQuota(BigDecimal occupyQuota) {
        this.occupyQuota = occupyQuota;
    }

    public BigDecimal getConvertOccupyQuota() {
        return convertOccupyQuota;
    }

    public void setConvertOccupyQuota(BigDecimal convertOccupyQuota) {
        this.convertOccupyQuota = convertOccupyQuota;
    }

    public BigDecimal getUseQuota() {
        return useQuota;
    }

    public void setUseQuota(BigDecimal useQuota) {
        this.useQuota = useQuota;
    }

    public BigDecimal getConvertUseQuota() {
        return convertUseQuota;
    }

    public void setConvertUseQuota(BigDecimal convertUseQuota) {
        this.convertUseQuota = convertUseQuota;
    }

    public BigDecimal getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(BigDecimal remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public BigDecimal getConvertRemainingAmount() {
        return convertRemainingAmount;
    }

    public void setConvertRemainingAmount(BigDecimal convertRemainingAmount) {
        this.convertRemainingAmount = convertRemainingAmount;
    }

    public BigDecimal getConsolidatedOccupancyQuota() {
        return consolidatedOccupancyQuota;
    }

    public void setConsolidatedOccupancyQuota(BigDecimal consolidatedOccupancyQuota) {
        this.consolidatedOccupancyQuota = consolidatedOccupancyQuota;
    }

    public BigDecimal getConvertConsolidatedOccupancyQuota() {
        return convertConsolidatedOccupancyQuota;
    }

    public void setConvertConsolidatedOccupancyQuota(BigDecimal convertConsolidatedOccupancyQuota) {
        this.convertConsolidatedOccupancyQuota = convertConsolidatedOccupancyQuota;
    }

    public BigDecimal getNoConsolidatedOccupancyQuota() {
        return noConsolidatedOccupancyQuota;
    }

    public void setNoConsolidatedOccupancyQuota(BigDecimal noConsolidatedOccupancyQuota) {
        this.noConsolidatedOccupancyQuota = noConsolidatedOccupancyQuota;
    }

    public BigDecimal getNoConvertConsolidatedOccupancyQuota() {
        return noConvertConsolidatedOccupancyQuota;
    }

    public void setNoConvertConsolidatedOccupancyQuota(BigDecimal noConvertConsolidatedOccupancyQuota) {
        this.noConvertConsolidatedOccupancyQuota = noConvertConsolidatedOccupancyQuota;
    }

    public BigDecimal getConsolidatedUseQuota() {
        return consolidatedUseQuota;
    }

    public void setConsolidatedUseQuota(BigDecimal consolidatedUseQuota) {
        this.consolidatedUseQuota = consolidatedUseQuota;
    }

    public BigDecimal getConvertConsolidatedUseQuota() {
        return convertConsolidatedUseQuota;
    }

    public void setConvertConsolidatedUseQuota(BigDecimal convertConsolidatedUseQuota) {
        this.convertConsolidatedUseQuota = convertConsolidatedUseQuota;
    }

    public BigDecimal getNoConsolidatedUseQuota() {
        return noConsolidatedUseQuota;
    }

    public void setNoConsolidatedUseQuota(BigDecimal noConsolidatedUseQuota) {
        this.noConsolidatedUseQuota = noConsolidatedUseQuota;
    }

    public BigDecimal getNoConvertConsolidatedUseQuota() {
        return noConvertConsolidatedUseQuota;
    }

    public void setNoConvertConsolidatedUseQuota(BigDecimal noConvertConsolidatedUseQuota) {
        this.noConvertConsolidatedUseQuota = noConvertConsolidatedUseQuota;
    }
}
