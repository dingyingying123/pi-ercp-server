package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.pi.persistence.entity.sap.T001;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.List;

public class OrganizationVO extends T001 {
    private String userId;
    //是否加 数据值为无 的数据
    private Boolean isNull;
    /**
     * 公司编码
     */
    @Excel(name = "公司编码")
    private String bukrs;
    /**
     * 公司名称
     */
    @Excel(name = "公司名称")
    private String name;
    /**
     * 公司名称
     */
    private String butxt;

    /**
     * 公司完整名称
     */
    @Excel(name = "完整公司名称")
    private String fullName;

    private String fullNameWhole;

    public String getFullNameWhole() {
        return fullNameWhole;
    }

    public void setFullNameWhole(String fullNameWhole) {
        this.fullNameWhole = fullNameWhole;
    }

    /**

     * SAP本位币
     */
    @Excel(name = "SAP本位币")
    private String waers;
    /**
     * 业务单元
     */
    @Excel(name = "业务单元编码")
    private String busi;
    /**
     * 业务单元名称
     */
    @Excel(name = "业务单元名称")
    private String busiText;
    /**
     * 区域
     */
    @Excel(name = "区域编码")
    private String comDomainTr;
    /**
     * 区域名称
     */
    @Excel(name = "区域名称")
    private String domainText;
    /**
     * 是否注销
     */
    @Excel(name = "是否注销")
    private String zzInvalid;
    /**
     * 是否纳入合并
     */
    @Excel(name = "是否纳入合并")
    private String zzInclusion;
    //公司编码 保函排除用
    private String companyNo;
    /**
     * 导出选中数据
     */
    private List<String> ids;

    public String getBukrs() {
        return bukrs;
    }

    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getButxt() {
        return butxt;
    }

    public void setButxt(String butxt) {
        this.butxt = butxt;
    }

    public String getWaers() {
        return waers;
    }

    public void setWaers(String waers) {
        this.waers = waers;
    }

    public String getBusi() {
        return busi;
    }

    public void setBusi(String busi) {
        this.busi = busi;
    }

    public String getBusiText() {
        return busiText;
    }

    public void setBusiText(String busiText) {
        this.busiText = busiText;
    }

    public String getComDomainTr() {
        return comDomainTr;
    }

    public void setComDomainTr(String comDomainTr) {
        this.comDomainTr = comDomainTr;
    }

    public String getDomainText() {
        return domainText;
    }

    public void setDomainText(String domainText) {
        this.domainText = domainText;
    }

    public String getZzInvalid() {
        return zzInvalid;
    }

    public void setZzInvalid(String zzInvalid) {
        this.zzInvalid = zzInvalid;
    }

    public String getZzInclusion() {
        return zzInclusion;
    }

    public void setZzInclusion(String zzInclusion) {
        this.zzInclusion = zzInclusion;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }

    public Boolean getIsNull() {
        return isNull;
    }

    public void setIsNull(Boolean aNull) {
        isNull = aNull;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
