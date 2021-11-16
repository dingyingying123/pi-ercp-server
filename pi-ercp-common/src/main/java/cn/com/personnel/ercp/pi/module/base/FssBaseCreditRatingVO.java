package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseCreditRating;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.List;

public class FssBaseCreditRatingVO extends FssBaseCreditRating {
    private List<String> ids;

    /**
     * 公司名称
     */
    @Excel(name = "公司名称")
    private String organName;

    /**
     * 评级类型
     */
    @Excel(name = "评级类型")
    private String ratingType;

    /**
     * 总行名称
     */
    @Excel(name = "评级机构")
    private String headName;

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public String getOrganName() {
        return organName;
    }

    @Override
    public void setOrganName(String organName) {
        this.organName = organName;
    }

    @Override
    public String getRatingType() {
        return ratingType;
    }

    @Override
    public void setRatingType(String ratingType) {
        this.ratingType = ratingType;
    }

    @Override
    public String getHeadName() {
        return headName;
    }

    @Override
    public void setHeadName(String headName) {
        this.headName = headName;
    }
}
