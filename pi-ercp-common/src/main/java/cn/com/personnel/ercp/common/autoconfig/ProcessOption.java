/**
 * @description: 流程审批意见接口
 * @author: tuojiajia
 * @create: 2020-05-15 10:16
 **/
package cn.com.personnel.ercp.common.autoconfig;

import java.util.Date;

public class ProcessOption {
    /**
    * 审批意见
    */
    private String content;
    /** 
    * 审批时间 
    */
    private Date createTime;
    /** 
    * 意见类型
    */
    private String operationtype;
    /** 
    * 审批人id
    */
    private String producer;
    /**
    * 审批人
    */
    private String producerName;
    /**
    * 工作项ID
    */
    private String workItemID;
    /**
    * 工作项名称
    */
    private String workitemname;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getOperationtype() {
        return operationtype;
    }

    public void setOperationtype(String operationtype) {
        this.operationtype = operationtype;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getWorkItemID() {
        return workItemID;
    }

    public void setWorkItemID(String workItemID) {
        this.workItemID = workItemID;
    }

    public String getWorkitemname() {
        return workitemname;
    }

    public void setWorkitemname(String workitemname) {
        this.workitemname = workitemname;
    }
}