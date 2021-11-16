package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseContractType;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.List;

public class FssBaseContractTypeVO extends FssBaseContractType {
    private List<String> ids;

    /**
     * 合同类型编码
     */
    @Excel(name = "合同类型编码")
    private String code;

    /**
     * 合同类型名称
     */
    @Excel(name = "合同类型名称")
    private String name;

    /**
     * 所属分类
     */
    @Excel(name = "所属分类")
    private String beyond;

    /**
     * 状态
     */
    @Excel(name = "状态")
    private String state;

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBeyond() {
        return beyond;
    }

    @Override
    public void setBeyond(String beyond) {
        this.beyond = beyond;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }
}
