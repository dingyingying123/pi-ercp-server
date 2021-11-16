package cn.com.personnel.ercp.pi.module.base;


import cn.com.personnel.ercp.pi.persistence.entity.credit.guarantee.FssGuaranteeServiceCharge;

import java.util.ArrayList;
import java.util.List;

public class ServiceChargeVO {
    /**
     * 保函编号
     */
    private String guaranteeNum;
    /**
     * 手续费列表
     */
    private List<FssGuaranteeServiceCharge> list = new ArrayList<>();

    public String getGuaranteeNum() {
        return guaranteeNum;
    }

    public void setGuaranteeNum(String guaranteeNum) {
        this.guaranteeNum = guaranteeNum;
    }

    public List<FssGuaranteeServiceCharge> getList() {
        return list;
    }

    public void setList(List<FssGuaranteeServiceCharge> list) {
        this.list = list;
    }
}
