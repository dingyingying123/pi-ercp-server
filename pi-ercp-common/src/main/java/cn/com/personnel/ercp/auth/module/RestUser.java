package cn.com.personnel.ercp.auth.module;

public class RestUser {
    /**
     * 用户id
     */
	protected String pernr;

    /**
     * 姓名
     */
    private String ename;

    /**
     * 性别1：男  2：女
     */
    private String gesc;

    /**
     * 手机号
     */
    private String zhr_cell;

    /**
     * 邮箱
     */
    private String zhr_email;

    /**
     * 用户类型(A:职员、B:劳务派遣人员、C:聘用人员D:退休人员、E:不在岗人员、F:实习人员H:外包商、Z:离职人员)
     */
    private String zhr_persg;

    /**
     * 状态0:离职、1:不活动2:退休、3:激活

     */
    private String zhr_status;
    
    /**
     * 部门编码

     */
    private String orgeh;


    public RestUser() {
		super();
	}


	public String getPernr() {
		return pernr;
	}


	public void setPernr(String pernr) {
		this.pernr = pernr;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getGesc() {
		return gesc;
	}


	public void setGesc(String gesc) {
		this.gesc = gesc;
	}



	public String getZhr_cell() {
		return zhr_cell;
	}


	public void setZhr_cell(String zhr_cell) {
		this.zhr_cell = zhr_cell;
	}


	public String getZhr_email() {
		return zhr_email;
	}


	public void setZhr_email(String zhr_email) {
		this.zhr_email = zhr_email;
	}


	public String getZhr_persg() {
		return zhr_persg;
	}


	public void setZhr_persg(String zhr_persg) {
		this.zhr_persg = zhr_persg;
	}


	public String getZhr_status() {
		return zhr_status;
	}


	public void setZhr_status(String zhr_status) {
		this.zhr_status = zhr_status;
	}


	public String getOrgeh() {
		return orgeh;
	}


	public void setOrgeh(String orgeh) {
		this.orgeh = orgeh;
	}

	

    
}