package cn.com.personnel.ercp.pi.wbs.module.baseData;

import java.io.Serializable;
import java.util.List;

/**
 * TODO
 * 查询参数
 * @author DongAiHua
 * @Date 2021/1/13 14:41
 */
public class BIllReceSelPar implements Serializable {
    private static final long serialVersionUID = 5695532782670828888L;

    private String companyIds;
    private String customerNames;
    private String collectDate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCompanyIds() {
        return companyIds;
    }

    public void setCompanyIds(String companyIds) {
        this.companyIds = companyIds;
    }

    public String getCustomerNames() {
        return customerNames;
    }

    public void setCustomerNames(String customerNames) {
        this.customerNames = customerNames;
    }

    public String getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(String collectDate) {
        this.collectDate = collectDate;
    }
}
