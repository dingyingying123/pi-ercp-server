package cn.com.personnel.ercp.pi.persistence.entity.credit.bond;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_bond_guarantee")
public class FssBondGuarantee {
    /**
     * 担保信息ID
     */
    @Id
    @Column(name = "guarantee_id")
    @GeneratedValue(generator = "JDBC")
    private String guaranteeId;

    /**
     * 债券ID
     */
    @Column(name = "bond_id")
    private String bondId;

    /**
     * 担保类型ID
     */
    @Column(name = "guarantee_type_id")
    private String guaranteeTypeId;

    /**
     * 担保类型编码
     */
    @Column(name = "guarantee_type_code")
    private String guaranteeTypeCode;

    /**
     * 担保类型
     */
    @Column(name = "guarantee_type_name")
    private String guaranteeTypeName;

    /**
     * 担保信息主键，抵押表主键或质押表主键
     */
    @Column(name = "info_id")
    private String infoId;

    /**
     * 担保信息编码，抵押表编码或质押表编码
     */
    @Column(name = "guarantee_info_id")
    private String guaranteeInfoId;

    /**
     * 担保信息，抵押表名称或质押表名称
     */
    @Column(name = "guarantee_info_name")
    private String guaranteeInfoName;

    /**
     * 项目id
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 所有权人编码
     */
    @Column(name = "collateral_category_id")
    private String collateralCategoryId;

    /**
     * 所有权人
     */
    @Column(name = "ownership_people")
    private String ownershipPeople;

    /**
     * 备注
     */
    private String description;

    /**
     * 预留
     */
    private String reserve;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    private String updater;

    /**
     * 获取担保信息ID
     *
     * @return guarantee_id - 担保信息ID
     */
    public String getGuaranteeId() {
        return guaranteeId;
    }

    /**
     * 设置担保信息ID
     *
     * @param guaranteeId 担保信息ID
     */
    public void setGuaranteeId(String guaranteeId) {
        this.guaranteeId = guaranteeId;
    }

    /**
     * 获取债券ID
     *
     * @return bond_id - 债券ID
     */
    public String getBondId() {
        return bondId;
    }

    /**
     * 设置债券ID
     *
     * @param bondId 债券ID
     */
    public void setBondId(String bondId) {
        this.bondId = bondId;
    }

    /**
     * 获取担保类型ID
     *
     * @return guarantee_type_id - 担保类型ID
     */
    public String getGuaranteeTypeId() {
        return guaranteeTypeId;
    }

    /**
     * 设置担保类型ID
     *
     * @param guaranteeTypeId 担保类型ID
     */
    public void setGuaranteeTypeId(String guaranteeTypeId) {
        this.guaranteeTypeId = guaranteeTypeId;
    }

    /**
     * 获取担保类型编码
     *
     * @return guarantee_type_code - 担保类型编码
     */
    public String getGuaranteeTypeCode() {
        return guaranteeTypeCode;
    }

    /**
     * 设置担保类型编码
     *
     * @param guaranteeTypeCode 担保类型编码
     */
    public void setGuaranteeTypeCode(String guaranteeTypeCode) {
        this.guaranteeTypeCode = guaranteeTypeCode;
    }

    /**
     * 获取担保类型
     *
     * @return guarantee_type_name - 担保类型
     */
    public String getGuaranteeTypeName() {
        return guaranteeTypeName;
    }

    /**
     * 设置担保类型
     *
     * @param guaranteeTypeName 担保类型
     */
    public void setGuaranteeTypeName(String guaranteeTypeName) {
        this.guaranteeTypeName = guaranteeTypeName;
    }

    /**
     * 获取担保信息主键，抵押表主键或质押表主键
     *
     * @return info_id - 担保信息主键，抵押表主键或质押表主键
     */
    public String getInfoId() {
        return infoId;
    }

    /**
     * 设置担保信息主键，抵押表主键或质押表主键
     *
     * @param infoId 担保信息主键，抵押表主键或质押表主键
     */
    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    /**
     * 获取担保信息编码，抵押表编码或质押表编码
     *
     * @return guarantee_info_id - 担保信息编码，抵押表编码或质押表编码
     */
    public String getGuaranteeInfoId() {
        return guaranteeInfoId;
    }

    /**
     * 设置担保信息编码，抵押表编码或质押表编码
     *
     * @param guaranteeInfoId 担保信息编码，抵押表编码或质押表编码
     */
    public void setGuaranteeInfoId(String guaranteeInfoId) {
        this.guaranteeInfoId = guaranteeInfoId;
    }

    /**
     * 获取担保信息，抵押表名称或质押表名称
     *
     * @return guarantee_info_name - 担保信息，抵押表名称或质押表名称
     */
    public String getGuaranteeInfoName() {
        return guaranteeInfoName;
    }

    /**
     * 设置担保信息，抵押表名称或质押表名称
     *
     * @param guaranteeInfoName 担保信息，抵押表名称或质押表名称
     */
    public void setGuaranteeInfoName(String guaranteeInfoName) {
        this.guaranteeInfoName = guaranteeInfoName;
    }

    /**
     * 获取项目id
     *
     * @return project_id - 项目id
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目id
     *
     * @param projectId 项目id
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取项目名称
     *
     * @return project_name - 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置项目名称
     *
     * @param projectName 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取所有权人编码
     *
     * @return collateral_category_id - 所有权人编码
     */
    public String getCollateralCategoryId() {
        return collateralCategoryId;
    }

    /**
     * 设置所有权人编码
     *
     * @param collateralCategoryId 所有权人编码
     */
    public void setCollateralCategoryId(String collateralCategoryId) {
        this.collateralCategoryId = collateralCategoryId;
    }

    /**
     * 获取所有权人
     *
     * @return ownership_people - 所有权人
     */
    public String getOwnershipPeople() {
        return ownershipPeople;
    }

    /**
     * 设置所有权人
     *
     * @param ownershipPeople 所有权人
     */
    public void setOwnershipPeople(String ownershipPeople) {
        this.ownershipPeople = ownershipPeople;
    }

    /**
     * 获取备注
     *
     * @return description - 备注
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置备注
     *
     * @param description 备注
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取预留
     *
     * @return reserve - 预留
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * 设置预留
     *
     * @param reserve 预留
     */
    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取更新人
     *
     * @return updater - 更新人
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 设置更新人
     *
     * @param updater 更新人
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }
}