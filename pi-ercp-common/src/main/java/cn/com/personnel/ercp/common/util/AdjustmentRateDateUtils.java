package cn.com.personnel.ercp.common.util;

import cn.com.personnel.ercp.pi.persistence.entity.innerLoan.FssInnerLoanContractIou;
import cn.com.personnel.ercp.pi.persistence.entity.innerLoan.FssInnerLoanContractManage;
import cn.com.personnel.ercp.pi.persistence.entity.loan.FssLoanContractIou;
import cn.com.personnel.ercp.pi.persistence.entity.loan.FssLoanContractManage;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 计算调息日期
 */
public class AdjustmentRateDateUtils {
    /**
     * 计算调息日
     *
     * @param firstInterestPaymentDate
     * @param interestPaymentInterval
     * @param contractEndDate
     * @return
     */
    public static Map<String, Date> calculate(Date firstInterestPaymentDate, Integer interestPaymentInterval, Date contractEndDate) {
        Map<String, Date> map = new HashMap<>();
        while (DateUtils.compareDate(firstInterestPaymentDate, contractEndDate)) {
            String toMonth = DateUtils.dateFormatToMonth(firstInterestPaymentDate);
            map.put(toMonth, firstInterestPaymentDate);
            firstInterestPaymentDate = DateUtils.getDate(firstInterestPaymentDate, interestPaymentInterval);
        }
        return map;
    }

    public static Map<String, Date> calculate(FssLoanContractIou iou, FssLoanContractManage manage) {
        String adjustInterestDate = iou.getAdjustInterestDate();
        //调整日期
        Date adjustDate = null;
        if (adjustInterestDate.equals("其他")) {
            adjustDate = iou.getAdjustInterestSpecificTime();
            String toMonth = DateUtils.dateFormatToMonth(adjustDate);
            Map<String,Date> map = new HashMap<>();
            map.put(toMonth,adjustDate);
            return map;
        }
        //每次提款日和首次提款日计算逻辑相同
        adjustDate = iou.getWithdrawDate();
        String interestPaymentInterval = iou.getInterestPaymentInterval();
        String contractEndDate = manage.getContractEndDate();
        return calculate(adjustDate, Integer.parseInt(interestPaymentInterval), DateConvert.stringToDate(contractEndDate));
    }

    public static Map<String, Date> innerCalculate(FssInnerLoanContractIou iou, FssInnerLoanContractManage manage) {
        //TODO 首次提款日与每次提款日
        Date firstInterestPaymentDate = null;
        if (iou.getAdjustInterestDate().equals("其他")) {
            firstInterestPaymentDate = iou.getAdjustInterestSpecificTime();
        }
        firstInterestPaymentDate = iou.getFirstInterestPaymentDate();
        String interestPaymentInterval = iou.getInterestPaymentInterval();
        String contractEndDate = manage.getLoanEndDate();
        return calculate(firstInterestPaymentDate, Integer.parseInt(interestPaymentInterval), DateConvert.stringToDate(contractEndDate));
    }
}
