package cn.com.personnel.ercp.pi.persistence.entity.reportwork;

public class FssReportProjectVO extends FssReportWorkTaxProjectProportion {
    private String projectStartTime;
    private String projectEndTime;
    private String monthLastDay;
    public String getProjectStartTime() {
        return projectStartTime;
    }

    public void setProjectStartTime(String projectStartTime) {
        this.projectStartTime = projectStartTime;
    }

    public String getProjectEndTime() {
        return projectEndTime;
    }

    public void setProjectEndTime(String projectEndTime) {
        this.projectEndTime = projectEndTime;
    }

    public String getMonthLastDay() {
        return monthLastDay;
    }

    public void setMonthLastDay(String monthLastDay) {
        this.monthLastDay = monthLastDay;
    }
}
