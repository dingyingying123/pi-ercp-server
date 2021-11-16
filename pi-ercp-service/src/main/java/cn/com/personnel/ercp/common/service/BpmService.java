/**
 * Copyright 2019 Goldwind Science & Technology. All rights reserved. GOLDWIND
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.common.autoconfig.ProcessOption;
import cn.com.personnel.ercp.common.autoconfig.ToDoVo;
import cn.com.personnel.ercp.common.constants.CommonConstants;
import cn.com.personnel.ercp.common.enums.FssProcessEnum;
import cn.com.personnel.ercp.common.kit.CommonConfig;
import cn.com.personnel.ercp.common.module.WorkFlow;
import cn.com.personnel.ercp.common.persistence.entity.ReturnEntity;
import cn.com.personnel.ercp.framework.exception.BusinessException;
import cn.com.personnel.ercp.pi.persistence.entity.credit.guarantee.FssGuaranteeResponsibleChange;
import cn.com.personnel.ercp.pi.persistence.entity.credit.letterofCredit.FssLetterOfCreditMange;
import cn.com.personnel.ercp.pi.persistence.entity.credit.letterofCredit.FssLetterofCreditInfo;
import cn.com.personnel.ercp.pi.persistence.entity.process.FssProcessReturnValue;
import cn.com.personnel.ercp.pi.persistence.mapper.process.FssProcessReturnValueMapper;
import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.service.BaseService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author 33925
 */
@Component
public class BpmService extends BaseService implements IBpmService {

    @Autowired
    private CommonConfig commonConfig;
    @Autowired
    private FssProcessReturnValueMapper fssProcessReturnValueMapper;

    /**
     * 获取工作项并拼接路由
     *
     * @param secUser
     * @param workFlow
     * @return
     */
    @Override
    public ReturnEntity queryWorkItemTask(SecUser secUser, WorkFlow workFlow) {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        try {

            ToDoVo toDoVo = queryWorkItem(secUser, workFlow);
            getTaskUrl(returnEntity, toDoVo, "todo");
            return returnEntity;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
            throw new BusinessException("获取待办失败！");
        }
    }

    @Override
    public ToDoVo queryWorkItem(SecUser secUser, WorkFlow workFlow) {
        Map<String, Object> resultMap = new HashMap<>();
        try {
            JSONObject input = new JSONObject();
            input.put("code", secUser.getUserId());
            input.put("name", secUser.getUserName());
            input.put("system", commonConfig.getAppCode());
            input.put("processInstID", workFlow.getProcessInstID());
            logger.info("====获取待办工作项入参====" + input.toString());
            String result = HttpClient.sendPostDataByJson(commonConfig.getBPSURL() + commonConfig.getQueryWorkItem(), input.toString(), "UTF-8");
            logger.info("====获取待办工作项结果====" + result);
            return JSON.parseObject(result, ToDoVo.class);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
            throw new BusinessException("获取待办失败！");
        }
    }

    @Override
    public ReturnEntity queryApproval(String id) {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        //获取当前业务数据得流程信息
        try {
            FssProcessReturnValue fssProcessReturnValue = fssProcessReturnValueMapper.selectProcessByPrimaryKey(id);
            returnEntity = queryTaskUrl(fssProcessReturnValue.getProcessInstId());
        } catch (Exception e) {
            throw new BusinessException("无法获取当前业务数据得流程信息");
        }
        return returnEntity;
    }

    @Override
    public ReturnEntity queryApprovalByInstId(String instId) {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        //获取当前业务数据得流程信息
        try {
            FssProcessReturnValue fssProcessReturnValue = fssProcessReturnValueMapper.selectByInstID(instId);
            returnEntity = queryTaskUrl(fssProcessReturnValue.getProcessInstId());
        } catch (Exception e) {
            throw new BusinessException("无法获取当前业务数据得流程信息");
        }
        return returnEntity;
    }

    /**
     * 拼接流程路径
     *
     * @param returnEntity
     * @param toDoVo
     * @param type
     */
    public void getTaskUrl(ReturnEntity returnEntity, ToDoVo toDoVo, String type) {
        //待办路由 type=todo  已办路由 type=done     已发路由=sent  归档路由=archive
        logger.info("类型type:" + type);
        if (toDoVo == null) return;
        ;
        List<ToDoVo.ToDoDetial> content = toDoVo.getContent() != null ? toDoVo.getContent() : toDoVo.getData();
        List<ToDoVo.ToDoDetial> contentNew = new ArrayList<>();
        if (content != null && content.size() > 0) {
            for (ToDoVo.ToDoDetial doDetial : content) {
                logger.info("=============待办返回数据：doDetial" + doDetial);
                ///rd?path=/runQuality/runStatus/a/b&key=650d86cc9d41455ebfddd5a003339b6c&layout=false
                FssProcessReturnValue fssProcessReturnValue = fssProcessReturnValueMapper.selectTodoProcess(doDetial);
                StringBuilder url = new StringBuilder("/rd?path=");
                if (fssProcessReturnValue != null) {
                    doDetial.setPrimaryKey(fssProcessReturnValue.getPrimaryKeyId());
                    doDetial.setFrevId(fssProcessReturnValue.getFrevId());
                    if (FssProcessEnum.Bond_Issue_Apply.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //债券发行申请
                        // url =new StringBuilder(doDetial.getActionURL());
                        url.append(FssProcessEnum.Bond_Issue_Apply.getUrl());
                        url.append("&key=628af45b551e40d08f0109e0d6d15302");
                        url.append("&fbiaId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Department_Personnel_Hours.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //每月人员工时导入
                        // url =new StringBuilder(doDetial.getActionURL());
                        url.append(FssProcessEnum.Department_Personnel_Hours.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&dmId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Xd_Guarantee_Manage_Notice.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //保函管理
                        // url =new StringBuilder(doDetial.getActionURL());
                        url.append(FssProcessEnum.Sfs_Xd_Guarantee_Manage_Notice.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&sId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Xd_Factoring_Apply.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //保理申请
                        // url =new StringBuilder(doDetial.getActionURL());
                        url.append(FssProcessEnum.Sfs_Xd_Factoring_Apply.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&faId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Xd_Factoring_Withdraw_Apply.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //保理提款申请
                        // url =new StringBuilder(doDetial.getActionURL());
                        url.append(FssProcessEnum.Sfs_Xd_Factoring_Withdraw_Apply.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&fwaId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Xd_Bank_Credit_Apply.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //银行授信申请
                        // url =new StringBuilder(doDetial.getActionURL());
                        url.append(FssProcessEnum.Sfs_Xd_Bank_Credit_Apply.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&bcId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Xd_Bank_Credit_Change.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //银行授信变更
                        // url =new StringBuilder(doDetial.getActionURL());
                        url.append(FssProcessEnum.Sfs_Xd_Bank_Credit_Change.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&fbccId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Maintenance_Not_Revoked_Reason.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //维护未撤销
                        url.append(FssProcessEnum.Maintenance_Not_Revoked_Reason.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&sId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Guarantee_Info.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //保函申请
                        url.append(FssProcessEnum.Sfs_Guarantee_Info.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&guaranteeId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Guarantee_Info_change.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //保函新增变更申请
                        url.append(FssProcessEnum.Sfs_Guarantee_Info_change.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&guaranteeId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);

                    } else if (FssProcessEnum.Sfs_Inner_Loan_Contract.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //借款申请
                        url.append(FssProcessEnum.Sfs_Inner_Loan_Contract.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&innerId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Sign_Loan_Contract.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //借款申请
                        url.append(FssProcessEnum.Sfs_Sign_Loan_Contract.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&loanId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Sign_Loan_Change_Apply.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //借款变更申请
                        url.append(FssProcessEnum.Sfs_Sign_Loan_Change_Apply.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&manageId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Loan_Withdraw_Apply.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //提款申请
                        url.append(FssProcessEnum.Sfs_Loan_Withdraw_Apply.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&drawApplyId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Xd_Internal_Transfer_Order.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //内部调拨单
                        url.append(FssProcessEnum.Sfs_Xd_Internal_Transfer_Order.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&drawApplyId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Xd_Bill_Cancel_Internal_Order.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //取消内部调拨单
                        url.append(FssProcessEnum.Sfs_Xd_Bill_Cancel_Internal_Order.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&drawApplyId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Xd_Pay_Internal_Transfer_Order.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //应收票据的内部调拨单  这个地方生成数据库的路由
                        url.append(FssProcessEnum.Sfs_Xd_Pay_Internal_Transfer_Order.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&drawApplyId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Xd_Discount_Receivable.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //应收票据的贴现  这个地方生成数据库的路由
                        url.append(FssProcessEnum.Sfs_Xd_Discount_Receivable.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&drawApplyId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Loan_Prepayment_Apply.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //提前还款申请
                        url.append(FssProcessEnum.Sfs_Loan_Prepayment_Apply.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&repaymentApplyId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_inner_Loan_Prepayment.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //提前还款申请
                        url.append(FssProcessEnum.Sfs_inner_Loan_Prepayment.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&repaymentApplyId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Bill_Receivable_Expire_Reminder.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //应收票据到期提醒
                        url.append(FssProcessEnum.Sfs_Bill_Receivable_Expire_Reminder.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&repaymentApplyId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Credit_Pay_Expire_Reminder.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        // 信用证付款到期提醒
                        url.append(FssProcessEnum.Credit_Pay_Expire_Reminder.getUrl());
                        url.append("&key=628af45b551e40d08f0109e0d6d15302");
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Bill_Expire_Reminder.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        // 应付票据到期提醒
                        url.append(FssProcessEnum.Bill_Expire_Reminder.getUrl());
                        url.append("&key=628af45b551e40d08f0109e0d6d15302");
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Loan_Repayment_Reminder.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //应收票据到期提醒
                        url.append(FssProcessEnum.Loan_Repayment_Reminder.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Bond_Expire_Reminder.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //债券到期提醒
                        url.append(FssProcessEnum.Bond_Expire_Reminder.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Guarantee_Expire_Reminder.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //保函到期提醒
                        url.append(FssProcessEnum.Guarantee_Expire_Reminder.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Inner_Loan_Pay_Interest_Reminder.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //内部借款付息提醒
                        url.append(FssProcessEnum.Inner_Loan_Pay_Interest_Reminder.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Inner_Loan_Repayment_Reminder.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //内部借款还款提醒
                        url.append(FssProcessEnum.Inner_Loan_Repayment_Reminder.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Loan_Pay_Interest_Reminder.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //外部借款还款提醒
                        url.append(FssProcessEnum.Loan_Pay_Interest_Reminder.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_Accounting_notice.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //分录知会
                        url.append(FssProcessEnum.Sfs_Accounting_notice.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&repaymentApplyId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else if (FssProcessEnum.Sfs_bill_yincheng.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //应付银承
                        url.append(FssProcessEnum.Sfs_bill_yincheng.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&accepId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    }else if (FssProcessEnum.Sfs_Inner_Prepayment_Apply.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //内部还款申请
                        url.append(FssProcessEnum.Sfs_Inner_Prepayment_Apply.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&repaymentApplyId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    }else if (FssProcessEnum.Sfs_Financial_Bill_Apply.getProcessDefID().equals(doDetial.getProcessDefName())) {
                        //内部还款申请
                        url.append(FssProcessEnum.Sfs_Financial_Bill_Apply.getUrl());
                        url.append("&key=07aedb49e88548c49222d72892fea680");
                        url.append("&finaId=" + fssProcessReturnValue.getPrimaryKeyId());
                        setProcessUrl(type, doDetial, fssProcessReturnValue, url);
                        doDetial.setActionURL(url.toString());
                        contentNew.add(doDetial);
                        logger.info("=========返回数据" + doDetial);
                    } else {
                        //保存流程信息
                    }
                } else {
                    doDetial.setActionURL(url.toString());
                    contentNew.add(doDetial);
                    logger.info("=========返回数据" + doDetial);
                }
            }
            toDoVo.setContent(contentNew);
            returnEntity.setData(new PageInfo<>(contentNew));
        }
    }


    private void setProcessUrl(String type, ToDoVo.ToDoDetial doDetial, FssProcessReturnValue fssProcessReturnValue, StringBuilder url) {
        url.append("&layout=false");
        url.append("&type=" + (type == null ? "" : type));
        url.append("&frevId=" + (fssProcessReturnValue.getFrevId() == null ? "" : fssProcessReturnValue.getFrevId()));
        url.append("&activityDefID=" + (doDetial.getActivityDefID() == null ? "" : doDetial.getActivityDefID()));
        url.append("&processInstID=" + (doDetial.getProcessInstID() == null ? "" : doDetial.getProcessInstID()));
        url.append("&activityInstID=" + (doDetial.getActivityInstID() == null ? "" : doDetial.getActivityInstID()));
        url.append("&workItemID=" + (doDetial.getWorkItemID() == null ? "" : doDetial.getWorkItemID()));
//        url.append("&workItemName=" + (doDetial.getWorkItemName() == null ? "" : doDetial.getWorkItemName()));
//        url.append("&processInstName=" + (doDetial.getProcessInstName() == null ? "" : doDetial.getProcessInstName()));
//        try {
//            url.append("&workItemName=" + (doDetial.getWorkItemName() == null ? "" : URLEncoder.encode(doDetial.getWorkItemName(), "utf-8")));
//            url.append("&processInstName=" + (doDetial.getProcessInstName() == null ? "" : URLEncoder.encode(doDetial.getProcessInstName(), "utf-8")));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        url.append("&processDefName=" + doDetial.getProcessDefName());
    }

    @Override
    public String getTaskRoute(ReturnEntity returnEntity, ToDoVo toDoVo, String type) {
        getTaskUrl(returnEntity, toDoVo, type);
        if (toDoVo.getContent().size() > 0) {
            return toDoVo.getContent().get(0).getActionURL();
        } else {
            return "";
        }
    }

    /**
     * 获取流程actionUrl
     *
     * @return
     */
    @Override
    public ReturnEntity queryTaskUrl(String processInstID) {
        WorkFlow workFlow = new WorkFlow();
        workFlow.setProcessInstID(processInstID);
        ReturnEntity returnEntity = queryProcessesTask(workFlow);
        String actionUrl = "";
        if (returnEntity != null && returnEntity.getData() != null) {
            PageInfo pageInfo = (PageInfo) returnEntity.getData();
            if (pageInfo != null && pageInfo.getList() != null && pageInfo.getList().size() > 0) {
                ToDoVo.ToDoDetial doDetial = (ToDoVo.ToDoDetial) pageInfo.getList().get(0);
                actionUrl = doDetial.getActionURL();
            }
        }
        return ReturnEntity.ok(actionUrl);
    }


    @Override
    public ReturnEntity queryProcessesTask(WorkFlow workFlow) {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        try {
            ToDoVo toDoVo = queryProcesses(workFlow.getProcessInstID());
            getTaskUrl(returnEntity, toDoVo, "archive");
            return returnEntity;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
            throw new BusinessException("获取待办失败！");
        }
    }

    @Override
    public ToDoVo queryProcesses(String processInstID) {
        try {
            JSONObject input = new JSONObject();
            input.put("system", commonConfig.getAppCode());
            input.put("processInstID", processInstID);

            input.put("page", 1);
            input.put("pagenum", 10);
            logger.info("====获取流程入参====" + input.toString());
            String result = HttpClient.sendPostDataByJson(commonConfig.getBPSURL() + commonConfig.getQueryProcesses(), input.toString(), "UTF-8");
            logger.info("====获取流程结果====" + result);
            return JSON.parseObject(result, ToDoVo.class);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
            throw new BusinessException("获取流程失败！");
        }
    }


    @Override
    public List<ProcessOption> queryApprovalAndWorkItemName(String processInstID) {
        try {
            JSONObject parm = new JSONObject();
            parm.put("code", "36515");
            parm.put("name", "聂帅");
            parm.put("processInstID", processInstID);
            logger.info("====查询流程带工作项名称的审批意见入参====" + parm.toString());
            logger.info("====查询流程带工作项名称的审批意见入参URL====" + commonConfig.getBPSURL() + commonConfig.getQueryApprovalAndWorkItemName());
            String result = HttpClient.sendPostDataByJson(commonConfig.getBPSURL() + commonConfig.getQueryApprovalAndWorkItemName(), parm.toString(), "UTF-8");
            logger.info("====查询流程带工作项名称的审批意见结果====" + result);
            JSONObject json = JSON.parseObject(result);
            if (null != json) {
                return JSONObject.parseArray(json.get("content").toString(), ProcessOption.class);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return Collections.emptyList();
    }


    /**
     * 添加用户
     *
     * @param secUser
     */
    @Override
    public void addUser(SecUser secUser) {
        JSONObject object = new JSONObject();
        try {
            JSONObject input = new JSONObject();
            input.put("pernr", secUser.getUserId());
            input.put("ename", secUser.getUserName());
            input.put("zhrCell", "12345678");
            input.put("zhrPersg", "");
            input.put("orgeh", "10058055");
            input.put("zhrEmail", "nieshuai@goldwind.com.cn");
            input.put("zhrStatus", "3");
            input.put("gesc", "1");
            input.put("flag", "1");
            String url = commonConfig.getBPSURL() + commonConfig.getAddUser();
            logger.info("====添加用户入参====" + input.toString());
            logger.info("====添加用户url====" + url);
            String result = HttpClient.sendPostDataByJson(url, input.toString(), "UTF-8");
            logger.info("====添加用户结果====" + result);
            object.put("result", result);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
            throw new BusinessException("获取页面失败！");
        }
    }

    @Override
    public ReturnEntity queryExpiredUndoTask(SecUser secUser, PagenationQueryParameter buildPagenation) {
        ReturnEntity returnEntity = new ReturnEntity(CommonConstants.SUCCESS_CODE, CommonConstants.SUCCESS_MESSAGE, null);
        try {
            Integer page = 1;
            Integer pagenum = 100;
            if (buildPagenation != null) {
                page = buildPagenation.getOffset();
                pagenum = buildPagenation.getLimit();
            }
            ToDoVo toDoVo = undoTask(secUser, page + "", pagenum + "", null);
            getTaskUrl(returnEntity, toDoVo, "todo");
            return returnEntity;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
            throw new BusinessException("获取待办失败！");
        }
    }


    /**
     * 获取待办
     * keyword 是搜流程名字，  creator 是搜发起人工号，工号是精确搜索
     * "begtime":"2020-08-07"   endtime   是流程发起时间的 范围
     * creatorName 字段 创建人名字 模糊搜索
     * workflowTemplete 多个用“，”隔开
     *
     * @param user
     * @param page
     * @param pagenum
     * @return
     */
    public ToDoVo undoTask(SecUser user, String page, String pagenum, Map<String, String> param) {
        //获取待办接口
        Map<String, Object> resultMap = new HashMap<>();
        try {
            JSONObject input = new JSONObject();
            input.put("code", user.getUserId());
            input.put("name", user.getUserName());
            input.put("system", commonConfig.getAppCode());
            input.put("page", page);
            input.put("pagenum", pagenum);
            if (param != null) {
                //根据模板 流程定义名称 查询代办，多个流程定义名用逗号分隔
                if (!StringUtils.isEmpty(param.get("workflowTemplete"))) {
                    input.put("workflowTemplete", param.get("workflowTemplete"));
                }
                //根据关键字模糊查询
                if (!StringUtils.isEmpty(param.get("keyword"))) {
                    input.put("keyword", param.get("keyword"));
                }
            }
            logger.info("====获取待办入参====" + input.toString());
            String result = HttpClient.sendPostDataByJson(commonConfig.getBPSURL() + commonConfig.getUndoTaskURL(), input.toString(), "UTF-8");
            logger.info("====获取待办结果====" + result);
            return JSON.parseObject(result, ToDoVo.class);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
            throw new BusinessException("获取待办失败！");
        }
    }


}
