package cn.com.personnel.ercp.pi.persistence.entity.receivable;

/**
 * TODO
 * 银行部终止确认表
 * @author DongAiHua
 * @Date 2020/8/17 14:27
 */
public class FssBankHeadWithoutEntity {
    private String headId;
    private Integer withOut;
    private String createrId;
    private String createrName;

    public String getHeadId() {
        return headId;
    }

    public void setHeadId(String headId) {
        this.headId = headId;
    }

    public Integer getWithOut() {
        return withOut;
    }

    public void setWithOut(Integer withOut) {
        this.withOut = withOut;
    }

    public String getCreaterId() {
        return createrId;
    }

    public void setCreaterId(String createrId) {
        this.createrId = createrId;
    }

    public String getCreaterName() {
        return createrName;
    }

    public void setCreaterName(String createrName) {
        this.createrName = createrName;
    }
}
