package cn.com.personnel.ercp.common.util;


import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * 预提与付息周期
 */
public class NewCycleCalculationUtils {

    //付息时间计算
    /**
     *  业务日期： 取付息日+付息间隔计算出来的日期
     *  入账日期：首次付息日为入账日期，
     *  开始日期：第一笔付息的开始日期是第一笔提款日期，以后每笔付息的开始日期都是付息日。付息第一笔开始时间为第一笔提款日期，付息最后一笔的截至日取合同的结束日期。若还款界面的利息结清方式选择的有利随本清，则付息日会增加一个按还款日期计算的付息日，计算利息从开始日期到还款日期开始计算，只还款关联的借据计算付息。
     *  结束日期：下一笔付息日的前一天，最后1笔付息日的结束日期是合同结束日期
     *  计算规则：
     *      每次点击计算的时候，入账状态是已经入账的和来源是手工的，无论提款和还款等各界面的信息怎么变化，付息的金额都不再做变化。只针对未入账和来源是自动的付息做重新计算与变化
     */
    /**
     * 付息抬头界面字段
     * 付息整体计算的日期范围逻辑：付息第一笔开始计算的日期为第一笔提款日期，付息最后一笔的截止日取借款合同的结束日期。业务日期取付息日+付息间隔计算出来的日期。若还款界面的利息结清方式选择的有利随本清，则付息日会增加一个按还款日期计算的付息日，计算利息从开始日期到还款日期开始计算，只还款关联的借据计算付息。
     * 每次点击计算的时候，入账状态是已经入账的和来源是手工的，无论提款和还款等各界面的信息怎么变化，付息的金额都不再做变化。只针对未入账和来源是自动的付息做重新计算与变化。
     *
     * 付息整体计算的日期范围逻辑
     *  付息第一笔开始的日期为第一笔提款日期，付息最后一笔的截至日取接口合同结束日期
     */

    /**
     * 付息时间计算规则
     */
    public static List<Model> payInterest(Date firstPayInterestDate,Date drawDate,Date contractEndDate){
        /**
         * 业务时间 == 付息时间
         * 付息界面四个日期之间的关系
         *  业务日期 == 入账日期
         *  开始时间 == 上一个业务时间
         *  结束时间 == 当前业务时间-1
         */

        // 计算付息时间
        Date payInterestDate = firstPayInterestDate;
        //获取业务时间
        //第一次付息计算 开始时间等于第一次提款时间，结束时间等于下一次付息日的前一天，业务日期与入账日期等于首次付息日期
        List list = new ArrayList();
        
        while (DateUtils.compareDate(payInterestDate,contractEndDate)){
            Date temp = payInterestDate;

            if (DateUtils.dateFormat(payInterestDate).equals(DateUtils.dateFormat(firstPayInterestDate))){
                Model model = new Model();
                model.setBusinessDate(firstPayInterestDate);
                model.setCreditDate(firstPayInterestDate);
                model.setStartDate(drawDate);
                model.setEndDate(DateUtils.getYesterdayDate(payInterestDate));
                model.setFirst(true);
                list.add(model);
            }else {
               Model model = new Model();
                model.setBusinessDate(payInterestDate);
                model.setCreditDate(payInterestDate);
                model.setStartDate(DateUtils.getQuarterDate(payInterestDate,-1));
                model.setEndDate(DateUtils.getYesterdayDate(payInterestDate));
                model.setFirst(false);
                list.add(model);
            }
            payInterestDate = DateUtils.getQuarterDate(payInterestDate,1);
            if (DateUtils.compareDate(contractEndDate,payInterestDate)){
               Model model = new Model();
                model.setBusinessDate(contractEndDate);
                model.setCreditDate(contractEndDate);
                model.setStartDate(temp);
                model.setEndDate(DateUtils.getYesterdayDate(contractEndDate));
                model.setFirst(false);
                list.add(model);
            }

        }
        list.subList(0,list.size()-1);
        list.forEach(it->{
            System.out.println(JSON.toJSONString(it));
        });
        return list;
        // 计算下一个付息日时间时候发现超过合同结束时间时候 业务日期、入账日期等于合同结束时间 开始时间等于上次付息日，结束时间日等于合同结束前一天
    }

    /**
     * 预提
     * @return
     */
    public static List<Model> preDraw(Date firstPayInterestDate,Date drawDate,Date contractEndDate){
        Date originalDate = drawDate;
        /**
         * 业务日期 等于月末日期或者付息的前一天
         * 入账日期 等于月末日期或者付息的前一天
         * 开始日期 等于月初或者付息日
         * 结束日期 月末或者付息日前一天
         */
        List<String> listPayInterestList = getListPayInterestList(firstPayInterestDate, contractEndDate);

        LinkedHashMap<String,String> mapDate = new LinkedHashMap<>();
        listPayInterestList.forEach(it->{
            mapDate.put(it.substring(0,7),it);
        });
        System.out.println("开始计算付息日");
        listPayInterestList.forEach(it->{
            System.out.println("付息日:"+JSON.toJSONString(it));
        });
        System.out.println("结束计算付息日");
        List list = new ArrayList();

        while (DateUtils.compareDate(drawDate,contractEndDate)){

            String strDate = DateUtils.dateFormat(drawDate).substring(0,7);//yyyy-MM
            String s = mapDate.get(strDate);
            //判断当前月是否有付息日
            if (StringUtils.isNotBlank(s)){
                //首次付息日与首次提款日在同一个月
                if (drawDate.equals(originalDate)){
                    Date date = DateUtils.StrToDate(s);
                    Model first = new Model();
                    first.setBusinessDate(DateUtils.getYesterdayDate(date));
                    first.setCreditDate(DateUtils.getYesterdayDate(date));
                    first.setStartDate(drawDate);
                    first.setEndDate(DateUtils.getYesterdayDate(date));
                    first.setFirst(true);
                    list.add(first);
                    Model second = new Model();
                    second.setStartDate(date);
                    second.setBusinessDate(DateUtils.getMonthLastDay(drawDate));
                    second.setCreditDate(DateUtils.getMonthLastDay(drawDate));
                    second.setEndDate(DateUtils.getMonthLastDay(drawDate));
                    second.setFirst(false);
                    list.add(second);
                }else {
                    Model stage = new Model();
                    Date payInterestDate = DateUtils.StrToDate(s);
                    stage.setBusinessDate(DateUtils.getYesterdayDate(payInterestDate));
                    stage.setCreditDate(DateUtils.getYesterdayDate(payInterestDate));
                    stage.setStartDate(DateUtils.getMonthFistDay(payInterestDate));
                    stage.setEndDate(DateUtils.getYesterdayDate(payInterestDate));
                    stage.setFirst(false);
                    list.add(stage);

                    Model stage2 = new Model();
                    stage2.setBusinessDate(DateUtils.getMonthLastDay(payInterestDate));
                    stage2.setCreditDate(DateUtils.getMonthLastDay(payInterestDate));
                    stage2.setStartDate(payInterestDate);
                    stage2.setEndDate(DateUtils.getMonthLastDay(payInterestDate));
                    stage2.setFirst(false);
                    list.add(stage2);
                }

            }else {
                //首次付息日与首次提款日不在同一个月
                if (drawDate.equals(originalDate)){
                    Model first = new Model();
                    first.setBusinessDate(DateUtils.getMonthLastDay(drawDate));
                    first.setCreditDate(DateUtils.getMonthLastDay(drawDate));
                    first.setStartDate(drawDate);
                    first.setEndDate(DateUtils.getMonthLastDay(drawDate));
                    first.setFirst(true);
                    list.add(first);
                }else {
                    Model normalStage = new Model();
                    normalStage.setBusinessDate(DateUtils.getMonthLastDay(drawDate));
                    normalStage.setCreditDate(DateUtils.getMonthLastDay(drawDate));
                    normalStage.setStartDate(DateUtils.getMonthFistDay(drawDate));
                    normalStage.setEndDate(DateUtils.getMonthLastDay(drawDate));
                    normalStage.setFirst(false);
                    list.add(normalStage);
                }

            }
            drawDate = DateUtils.nextMonth(drawDate);
        }

        list.forEach(it->{
            System.out.println(JSON.toJSONString(it));
        });
        System.out.println("返回业务时间段");
        return list;
    }


    /**
     * 计算付息年月
     * @param firstPayInterestDate 首次付息日
     * @param contractEndDate 合同结束时间
     * @return
     */
    public static List<String> getListPayInterestList(Date firstPayInterestDate,Date contractEndDate){
        List<String> list = new ArrayList<>();
        while (DateUtils.compareDate(firstPayInterestDate,contractEndDate)){
            list.add(DateUtils.dateFormat(firstPayInterestDate));
            firstPayInterestDate =  DateUtils.getQuarterDate(firstPayInterestDate,1);
        }
        list.add(DateUtils.dateFormat(DateUtils.getYesterdayDate(contractEndDate)));
        return list;
    }


}
