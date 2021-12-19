package cn.com.personnel.ercp.pi.persistence.entity.server;

import java.util.Date;
import javax.persistence.*;

@Table(name = "server_take_case_family_member")
public class ServerTakeCaseFamilyMember {
    @Id
    @Column(name = "mem_id")
    @GeneratedValue(generator = "JDBC")
    private String memId;

    @Column(name = "child_id")
    private String childId;

    @Column(name = "case_id")
    private String caseId;

    @Column(name = "case_no")
    private String caseNo;

    @Column(name = "child_name")
    private String childName;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "member_relation")
    private String memberRelation;

    @Column(name = "member_age")
    private String memberAge;

    @Column(name = "member_profession")
    private String memberProfession;

    @Column(name = "is_live_together")
    private String isLiveTogether;

    @Column(name = "member_tel")
    private String memberTel;

    private String isdelete;

    private String status;

    private String creator;

    @Column(name = "create_time")
    private Date createTime;

    private String updator;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return mem_id
     */
    public String getMemId() {
        return memId;
    }

    /**
     * @param memId
     */
    public void setMemId(String memId) {
        this.memId = memId;
    }

    /**
     * @return child_id
     */
    public String getChildId() {
        return childId;
    }

    /**
     * @param childId
     */
    public void setChildId(String childId) {
        this.childId = childId;
    }

    /**
     * @return case_id
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * @param caseId
     */
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * @return case_no
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * @param caseNo
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    /**
     * @return child_name
     */
    public String getChildName() {
        return childName;
    }

    /**
     * @param childName
     */
    public void setChildName(String childName) {
        this.childName = childName;
    }

    /**
     * @return member_name
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * @param memberName
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * @return member_relation
     */
    public String getMemberRelation() {
        return memberRelation;
    }

    /**
     * @param memberRelation
     */
    public void setMemberRelation(String memberRelation) {
        this.memberRelation = memberRelation;
    }

    /**
     * @return member_age
     */
    public String getMemberAge() {
        return memberAge;
    }

    /**
     * @param memberAge
     */
    public void setMemberAge(String memberAge) {
        this.memberAge = memberAge;
    }

    /**
     * @return member_profession
     */
    public String getMemberProfession() {
        return memberProfession;
    }

    /**
     * @param memberProfession
     */
    public void setMemberProfession(String memberProfession) {
        this.memberProfession = memberProfession;
    }

    /**
     * @return is_live_together
     */
    public String getIsLiveTogether() {
        return isLiveTogether;
    }

    /**
     * @param isLiveTogether
     */
    public void setIsLiveTogether(String isLiveTogether) {
        this.isLiveTogether = isLiveTogether;
    }

    /**
     * @return member_tel
     */
    public String getMemberTel() {
        return memberTel;
    }

    /**
     * @param memberTel
     */
    public void setMemberTel(String memberTel) {
        this.memberTel = memberTel;
    }

    /**
     * @return isdelete
     */
    public String getIsdelete() {
        return isdelete;
    }

    /**
     * @param isdelete
     */
    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return updator
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * @param updator
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}