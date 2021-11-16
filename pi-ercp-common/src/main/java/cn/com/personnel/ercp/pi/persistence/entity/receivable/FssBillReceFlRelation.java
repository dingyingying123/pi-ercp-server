package cn.com.personnel.ercp.pi.persistence.entity.receivable;

/**
 * TODO
 * 关系表实体
 * @author DongAiHua
 * @Date 2020/9/29 9:43
 */
public class FssBillReceFlRelation {
    private String relId;
    private String receId;
    private String receNumber;
    private String entryNumber;
    private String organId;
    private String type;
    private String docId;

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(String entryNumber) {
        this.entryNumber = entryNumber;
    }

    public String getOrganId() {
        return organId;
    }

    public void setOrganId(String organId) {
        this.organId = organId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRelId() {
        return relId;
    }

    public void setRelId(String relId) {
        this.relId = relId;
    }

    public String getReceId() {
        return receId;
    }

    public void setReceId(String receId) {
        this.receId = receId;
    }

    public String getReceNumber() {
        return receNumber;
    }

    public void setReceNumber(String receNumber) {
        this.receNumber = receNumber;
    }
}
