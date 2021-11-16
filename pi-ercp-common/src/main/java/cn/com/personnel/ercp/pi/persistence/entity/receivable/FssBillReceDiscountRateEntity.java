package cn.com.personnel.ercp.pi.persistence.entity.receivable;

import java.util.Date;

/**
 * TODO
 * 折现率表实体
 * @author DongAiHua
 * @Date 2020/8/6 13:36
 */
public class FssBillReceDiscountRateEntity {
    private String disId; //主建
    private Date disDate; //日期
    private Double oneDisRate; //一类折现率
    private Double towDisRate; //二类折现率
    private Double threeDisRate; //三类折现率
    private Double fourDisRate;//四类折现率
    private Date creatorDate;//创建时间
    private Integer updState;//是否可修改 0 不 1可

    public Date getDisDate() {
        return disDate;
    }

    public void setDisDate(Date disDate) {
        this.disDate = disDate;
    }

    public Integer getUpdState() {
        return updState;
    }

    public void setUpdState(Integer updState) {
        this.updState = updState;
    }

    public String getDisId() {
        return disId;
    }

    public void setDisId(String disId) {
        this.disId = disId;
    }

    public Double getOneDisRate() {
        return oneDisRate;
    }

    public void setOneDisRate(Double oneDisRate) {
        this.oneDisRate = oneDisRate;
    }

    public Double getTowDisRate() {
        return towDisRate;
    }

    public void setTowDisRate(Double towDisRate) {
        this.towDisRate = towDisRate;
    }

    public Double getThreeDisRate() {
        return threeDisRate;
    }

    public void setThreeDisRate(Double threeDisRate) {
        this.threeDisRate = threeDisRate;
    }

    public Double getFourDisRate() {
        return fourDisRate;
    }

    public void setFourDisRate(Double fourDisRate) {
        this.fourDisRate = fourDisRate;
    }

    public Date getCreatorDate() {
        return creatorDate;
    }

    public void setCreatorDate(Date creatorDate) {
        this.creatorDate = creatorDate;
    }
}
