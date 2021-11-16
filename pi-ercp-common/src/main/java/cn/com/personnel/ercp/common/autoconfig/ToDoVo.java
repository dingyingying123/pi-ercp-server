package cn.com.personnel.ercp.common.autoconfig;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * 流程代办转对象
 */
public class ToDoVo {
    /**
     *成功标识
     */
    private String type;
    /**
     * 信息
     */
    private String message;
    /**
     *内容
     */
    private List<ToDoDetial> content;

    /**
     * 数据条数
     */
    private Integer count;

    /**
     *内容
     */
    private List<ToDoDetial> data;

    public class  ToDoDetial{
        private String workItemID;
        private String workItemName;
        private String processInstID;
        private String processInstName;
        private String createTime;
        private String processDefID;
        private String processDefName;
        private String actionURL;
        private String activityInstID;
        private String activityInstName;
        private String activityDefID;
        private String creator;
        private String creatorName;
        private String bizState;
        private String app;
        private String CurrentState;
        private String todoPeopleId;
        private String todoPeopleName;
        private List<Toduitems> toduitems;
        /**
        * 业务主键
        */
        private String primaryKey;

        private String frevId;

        /**
         * 待办信息
         */
        public class Toduitems{
            private String workItemID;
            private String workItemName;
            private String activityDefID;
            private String activityInstID;
            private String todoPeopleId;
            private String todoPeopleName;

            public String getWorkItemID() {
                return workItemID;
            }

            public void setWorkItemID(String workItemID) {
                this.workItemID = workItemID;
            }

            public String getWorkItemName() {
                return workItemName;
            }

            public void setWorkItemName(String workItemName) {
                this.workItemName = workItemName;
            }

            public String getActivityDefID() {
                return activityDefID;
            }

            public void setActivityDefID(String activityDefID) {
                this.activityDefID = activityDefID;
            }

            public String getActivityInstID() {
                return activityInstID;
            }

            public void setActivityInstID(String activityInstID) {
                this.activityInstID = activityInstID;
            }

            public String getTodoPeopleId() {
                return todoPeopleId;
            }

            public void setTodoPeopleId(String todoPeopleId) {
                this.todoPeopleId = todoPeopleId;
            }

            public String getTodoPeopleName() {
                return todoPeopleName;
            }

            public void setTodoPeopleName(String todoPeopleName) {
                this.todoPeopleName = todoPeopleName;
            }

            @Override
            public String toString() {
                return "Toduitems{" +
                        "workItemID='" + workItemID + '\'' +
                        ", workItemName='" + workItemName + '\'' +
                        ", activityDefID='" + activityDefID + '\'' +
                        ", activityInstID='" + activityInstID + '\'' +
                        ", todoPeopleId='" + todoPeopleId + '\'' +
                        ", todoPeopleName='" + todoPeopleName + '\'' +
                        '}';
            }
        }

        public ToDoDetial(){}

        public String getWorkItemID() {
            return workItemID;
        }

        public void setWorkItemID(String workItemID) {
            this.workItemID = workItemID;
        }

        public String getWorkItemName() {
            return workItemName;
        }

        public void setWorkItemName(String workItemName) {
            this.workItemName = workItemName;
        }

        public String getProcessInstID() {
            return processInstID;
        }

        public void setProcessInstID(String processInstID) {
            this.processInstID = processInstID;
        }

        public String getProcessInstName() {
            return processInstName;
        }

        public void setProcessInstName(String processInstName) {
            this.processInstName = processInstName;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getProcessDefID() {
            return processDefID;
        }

        public void setProcessDefID(String processDefID) {
            this.processDefID = processDefID;
        }

        public String getProcessDefName() {
            return processDefName;
        }

        public void setProcessDefName(String processDefName) {
            this.processDefName = processDefName;
        }

        public String getActionURL() {
            return actionURL;
        }

        public void setActionURL(String actionURL) {
            this.actionURL = actionURL;
        }

        public String getActivityInstID() {
            return activityInstID;
        }

        public void setActivityInstID(String activityInstID) {
            this.activityInstID = activityInstID;
        }

        public String getActivityInstName() {
            return activityInstName;
        }

        public void setActivityInstName(String activityInstName) {
            this.activityInstName = activityInstName;
        }

        public String getActivityDefID() {
            return activityDefID;
        }

        public void setActivityDefID(String activityDefID) {
            this.activityDefID = activityDefID;
        }

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public String getCreatorName() {
            return creatorName;
        }

        public void setCreatorName(String creatorName) {
            this.creatorName = creatorName;
        }

        public String getBizState() {
            return bizState;
        }

        public void setBizState(String bizState) {
            this.bizState = bizState;
        }

        public String getApp() {
            return app;
        }

        public void setApp(String app) {
            this.app = app;
        }

        public String getPrimaryKey() {
            return primaryKey;
        }

        public void setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
        }

        public String getFrevId() {
            return frevId;
        }

        public void setFrevId(String frevId) {
            this.frevId = frevId;
        }

        public String getCurrentState() {
            return CurrentState;
        }

        public void setCurrentState(String currentState) {
            CurrentState = currentState;
        }

        public String getTodoPeopleId() {
            return todoPeopleId;
        }

        public void setTodoPeopleId(String todoPeopleId) {
            this.todoPeopleId = todoPeopleId;
        }

        public String getTodoPeopleName() {
            return todoPeopleName;
        }

        public void setTodoPeopleName(String todoPeopleName) {
            this.todoPeopleName = todoPeopleName;
        }

        public List<Toduitems> getToduitems() {
            return toduitems;
        }

        public void setToduitems(List<Toduitems> toduitems) {
            this.toduitems = toduitems;
            if(toduitems != null && toduitems.size() > 0){
                Toduitems todu = toduitems.get(0);
                if(StringUtils.isNotEmpty(todu.getActivityDefID())){
                    this.activityDefID = todu.getActivityDefID();
                }
                if(StringUtils.isNotEmpty(todu.getActivityInstID())){
                    this.activityInstID = todu.getActivityInstID();
                }
                if(StringUtils.isNotEmpty(todu.getTodoPeopleId())){
                    this.todoPeopleId = todu.getTodoPeopleId();
                }
                if(StringUtils.isNotEmpty(todu.getTodoPeopleName())){
                    this.todoPeopleName = todu.getTodoPeopleName();
                }
            }
        }

        @Override
        public String toString() {
            return "ToDoDetial{" +
                    "workItemID='" + workItemID + '\'' +
                    ", workItemName='" + workItemName + '\'' +
                    ", processInstID='" + processInstID + '\'' +
                    ", processInstName='" + processInstName + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", processDefID='" + processDefID + '\'' +
                    ", processDefName='" + processDefName + '\'' +
                    ", actionURL='" + actionURL + '\'' +
                    ", activityInstID='" + activityInstID + '\'' +
                    ", activityInstName='" + activityInstName + '\'' +
                    ", activityDefID='" + activityDefID + '\'' +
                    ", creator='" + creator + '\'' +
                    ", creatorName='" + creatorName + '\'' +
                    ", bizState='" + bizState + '\'' +
                    ", app='" + app + '\'' +
                    ", CurrentState='" + CurrentState + '\'' +
                    ", todoPeopleId='" + todoPeopleId + '\'' +
                    ", todoPeopleName='" + todoPeopleName + '\'' +
                    ", toduitems=" + toduitems +
                    ", primaryKey='" + primaryKey + '\'' +
                    ", frevId='" + frevId + '\'' +
                    '}';
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ToDoDetial> getContent() {
        return content;
    }

    public void setContent(List<ToDoDetial> content) {
        this.content = content;
    }

    public List<ToDoDetial> getData() {
        return data;
    }

    public void setData(List<ToDoDetial> data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
