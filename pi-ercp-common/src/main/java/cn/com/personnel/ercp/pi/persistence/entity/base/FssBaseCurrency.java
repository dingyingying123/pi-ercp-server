package cn.com.personnel.ercp.pi.persistence.entity.base;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_base_currency")
public class FssBaseCurrency {
    @Id
    @GeneratedValue(generator = "JDBC")
    private String id;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 说明
     */
    private String description;

    /**
     * 符号expendaccuracy
     */
    private String symbol;

    /**
     * 精确度
     */
    private Short accuracy;

    /**
     * 扩展精确度
     */
    private Short expendaccuracy;

    /**
     * 生效日期
     */
    private Date effectivedate;

    /**
     * 失效日期
     */
    private Date expirationdate;

    /**
     * 状态
     */
    private String state;

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
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取编码
     *
     * @return code - 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编码
     *
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取说明
     *
     * @return description - 说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置说明
     *
     * @param description 说明
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取符号
     *
     * @return symbol - 符号
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * 设置符号
     *
     * @param symbol 符号
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * 获取精确度
     *
     * @return accuracy - 精确度
     */
    public Short getAccuracy() {
        return accuracy;
    }

    /**
     * 设置精确度
     *
     * @param accuracy 精确度
     */
    public void setAccuracy(Short accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * 获取扩展精确度
     *
     * @return expendAccuracy - 扩展精确度
     */
    public Short getExpendaccuracy() {
        return expendaccuracy;
    }

    /**
     * 设置扩展精确度
     *
     * @param expendaccuracy 扩展精确度
     */
    public void setExpendaccuracy(Short expendaccuracy) {
        this.expendaccuracy = expendaccuracy;
    }

    /**
     * 获取生效日期
     *
     * @return effectiveDate - 生效日期
     */
    public Date getEffectivedate() {
        return effectivedate;
    }

    /**
     * 设置生效日期
     *
     * @param effectivedate 生效日期
     */
    public void setEffectivedate(Date effectivedate) {
        this.effectivedate = effectivedate;
    }

    /**
     * 获取失效日期
     *
     * @return expirationDate - 失效日期
     */
    public Date getExpirationdate() {
        return expirationdate;
    }

    /**
     * 设置失效日期
     *
     * @param expirationdate 失效日期
     */
    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(String state) {
        this.state = state;
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