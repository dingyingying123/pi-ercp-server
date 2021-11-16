package cn.com.personnel.ercp.pi.module.base;

import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseGuaranteeReminder;
import cn.com.personnel.ercp.pi.persistence.entity.base.FssBaseGuaranteeReminderCondition;

import java.util.List;

public class FssBaseGuaranteeReminderVO extends FssBaseGuaranteeReminder {
    private List<FssBaseGuaranteeReminderCondition> guaranteeReminderConditionList;

    public List<FssBaseGuaranteeReminderCondition> getGuaranteeReminderConditionList() {
        return guaranteeReminderConditionList;
    }

    public void setGuaranteeReminderConditionList(List<FssBaseGuaranteeReminderCondition> guaranteeReminderConditionList) {
        this.guaranteeReminderConditionList = guaranteeReminderConditionList;
    }
}
