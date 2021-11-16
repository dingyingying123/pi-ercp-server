package cn.com.personnel.ercp.pi.module;

import cn.com.personnel.ercp.common.autoconfig.MultiTitle;
import org.jeecgframework.poi.excel.entity.ImportParams;

import java.util.List;

public class ImportParamsVO extends ImportParams {
    private Boolean isLandscape; //是否是横向数据

    private  Integer titleNum; //横向表头的数量

    private Boolean isExecuteData; //是否导入列表

    private List<List<MultiTitle>> multiTitleList; //横向合并的数据

    private Boolean referFirst;  //合并参照第一行

    private Integer startTitle;  //特殊表头开始位置

    public Boolean getIsLandscape() {
        return isLandscape;
    }

    public void setIsLandscape(Boolean isLandscape) {
        this.isLandscape = isLandscape;
    }

    public Integer getTitleNum() {
        return titleNum;
    }

    public void setTitleNum(Integer titleNum) {
        this.titleNum = titleNum;
    }

    public Boolean getIsExecuteData() {
        return isExecuteData;
    }

    public void setIsExecuteData(Boolean isExecuteData) {
        this.isExecuteData = isExecuteData;
    }

    public List<List<MultiTitle>> getMultiTitleList() {
        return multiTitleList;
    }

    public void setMultiTitleList(List<List<MultiTitle>> multiTitleList) {
        this.multiTitleList = multiTitleList;
    }

    public Boolean getReferFirst() {
        return referFirst;
    }

    public void setReferFirst(Boolean referFirst) {
        this.referFirst = referFirst;
    }

    public Integer getStartTitle() {
        return startTitle;
    }

    public void setStartTitle(Integer startTitle) {
        this.startTitle = startTitle;
    }
}
