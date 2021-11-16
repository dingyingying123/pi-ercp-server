package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import java.math.BigDecimal;
import java.util.Date;

/**
 * TODO
 * 银行数据数据实体
 * @author DongAiHua
 * @Date 2020/8/4 19:42
 */
public class FssBillReceBankMoudelEntity {
    private String rbmId; //主建
    private String rbmCompanyName;//公司名称
    private Date dealDate;//交易日期
    private String rbmNumber;//票据编号
    private BigDecimal incomeMoney;//收入金额
    private BigDecimal giveMoney;//付出金额
    private String traderName;//交易对手名称
    private Date rbmCDate;//出票日期
    private Date stopDate;//到期日
    private Date creatorDate; //创建日期
    private String checkState;//核对状态

    public Date getCreatorDate() {
        return creatorDate;
    }

    public void setCreatorDate(Date creatorDate) {
        this.creatorDate = creatorDate;
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState;
    }

    public String getRbmId() {
        return rbmId;
    }

    public void setRbmId(String rbmId) {
        this.rbmId = rbmId;
    }

    public String getRbmCompanyName() {
        return rbmCompanyName;
    }

    public void setRbmCompanyName(String rbmCompanyName) {
        this.rbmCompanyName = rbmCompanyName;
    }

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public String getRbmNumber() {
        return rbmNumber;
    }

    public void setRbmNumber(String rbmNumber) {
        this.rbmNumber = rbmNumber;
    }

    public BigDecimal getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(BigDecimal incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    public BigDecimal getGiveMoney() {
        return giveMoney;
    }

    public void setGiveMoney(BigDecimal giveMoney) {
        this.giveMoney = giveMoney;
    }

    public String getTraderName() {
        return traderName;
    }

    public void setTraderName(String traderName) {
        this.traderName = traderName;
    }

    public Date getRbmCDate() {
        return rbmCDate;
    }

    public void setRbmCDate(Date rbmCDate) {
        this.rbmCDate = rbmCDate;
    }

    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }
}
