package cn.com.personnel.ercp.pi.persistence.entity.reportwork;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fss_report_work_salary")
public class FssReportWorkSalary {
    /**
     * 薪资表主键
     */
    @Id
    @Column(name = "salary_id")
    @GeneratedValue(generator = "JDBC")
    private String salaryId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 薪资月
     */
    @Column(name = "salary_month")
    private String salaryMonth;

    /**
     * 入职时间
     */
    @Column(name = "hire_date")
    private String hireDate;

    /**
     * 部门
     */
    private String department;

    /**
     * 业务单元
     */
    private String busi;

    /**
     * 月度标准工资
     */
    private String salary;

    /**
     * 岗位工资标准
     */
    @Column(name = "position_salary")
    private String positionSalary;

    /**
     * 绩效工资标准
     */
    @Column(name = "performance_salary")
    private String performanceSalary;

    /**
     * 住房津贴标准
     */
    @Column(name = "housing_subsidy")
    private String housingSubsidy;

    /**
     * 通讯津贴
     */
    @Column(name = "communication_subsidy")
    private String communicationSubsidy;

    /**
     * 交通津贴
     */
    @Column(name = "travel_allowance")
    private String travelAllowance;

    /**
     * 午餐津贴
     */
    @Column(name = "lunch_allowance")
    private String lunchAllowance;

    /**
     * 职务津贴
     */
    @Column(name = "job_subsidy")
    private String jobSubsidy;

    /**
     * 其他津贴
     */
    @Column(name = "other_allowances")
    private String otherAllowances;

    /**
     * 高温津贴
     */
    @Column(name = "high_temp_subsidy")
    private String highTempSubsidy;

    /**
     * 月度奖金
     */
    @Column(name = "monthly_bonus")
    private String monthlyBonus;

    /**
     * 质量文化奖金
     */
    @Column(name = "quality_culture_bonus")
    private String qualityCultureBonus;

    /**
     * 季度奖金
     */
    @Column(name = "quarterly_bonus")
    private String quarterlyBonus;

    /**
     * 其他福利补贴
     */
    @Column(name = "other_welfare")
    private String otherWelfare;

    /**
     * 税前补发
     */
    @Column(name = "retroactive_pre_tax_payment")
    private String retroactivePreTaxPayment;

    /**
     * 税后补发
     */
    @Column(name = "after_tax_adjustment")
    private String afterTaxAdjustment;

    /**
     * 离职补偿金
     */
    @Column(name = "termination_remuneration")
    private String terminationRemuneration;

    /**
     * 竞业限制补偿金
     */
    @Column(name = "non_competition_remuneration")
    private String nonCompetitionRemuneration;

    /**
     * 兼职安全员津贴
     */
    @Column(name = "part_time_safety_personnel_allowance")
    private String partTimeSafetyPersonnelAllowance;

    /**
     * 坚守津贴
     */
    @Column(name = "mandatory_on_duty_allowance")
    private String mandatoryOnDutyAllowance;

    /**
     * 兼岗津贴
     */
    @Column(name = "part_time_allowance")
    private String partTimeAllowance;

    /**
     * 入厂津贴
     */
    @Column(name = "on_site_allowance")
    private String onSiteAllowance;

    /**
     * 通讯费补贴(额外支付)
     */
    @Column(name = "communication_allowance_extra_payment")
    private String communicationAllowanceExtraPayment;

    /**
     * 交通费补贴(额外支付)
     */
    @Column(name = "travel_allowance_extra_payment")
    private String travelAllowanceExtraPayment;

    /**
     * 项目经理津贴
     */
    @Column(name = "project_manager_allowance")
    private String projectManagerAllowance;

    /**
     * 质量工资
     */
    @Column(name = "quality_salary")
    private String qualitySalary;

    /**
     * 技术创新类
     */
    @Column(name = "technological_innovation")
    private String technologicalInnovation;

    /**
     * 管理标准化类
     */
    @Column(name = "management_standardization")
    private String managementStandardization;

    /**
     * 质量类
     */
    @Column(name = "quality_category")
    private String qualityCategory;

    /**
     * 创新管理专项
     */
    @Column(name = "innovation_management")
    private String innovationManagement;

    /**
     * 转型专项
     */
    @Column(name = "transformation_specific")
    private String transformationSpecific;

    /**
     * 风火同价项目
     */
    @Column(name = "wind_thermal_on_par")
    private String windThermalOnPar;

    /**
     * 质量管理专项
     */
    @Column(name = "quality_management")
    private String qualityManagement;

    /**
     * 工资补差
     */
    @Column(name = "salary_gap_remuneration")
    private String salaryGapRemuneration;

    /**
     * 加班费补发
     */
    @Column(name = "retroactive_ot_payment")
    private String retroactiveOtPayment;

    /**
     * 离职未休假期补发
     */
    @Column(name = "termination_leave_balance_remuneration")
    private String terminationLeaveBalanceRemuneration;

    /**
     * 讲师费
     */
    @Column(name = "lecturer_fee")
    private String lecturerFee;

    /**
     * 评优奖励发放
     */
    @Column(name = "excellence_award_incentive")
    private String excellenceAwardIncentive;

    /**
     * 培训费用合并计税
     */
    @Column(name = "taxable_training_fee")
    private String taxableTrainingFee;

    /**
     * 公司福利合并计税
     */
    @Column(name = "taxable_company_benefit")
    private String taxableCompanyBenefit;

    /**
     * 安全奖励
     */
    @Column(name = "safety_bonus")
    private String safetyBonus;

    /**
     * 安全月奖励
     */
    @Column(name = "safety_month_bonus")
    private String safetyMonthBonus;

    /**
     * 质量奖金
     */
    @Column(name = "quality_bonus")
    private String qualityBonus;

    /**
     * 季度之星奖励
     */
    @Column(name = "quarterly_star_bonus")
    private String quarterlyStarBonus;

    /**
     * 体系管理奖励
     */
    @Column(name = "system_management_bonus")
    private String systemManagementBonus;

    /**
     * 特种设备技能奖励
     */
    @Column(name = "special_equipment_skills_bonus")
    private String specialEquipmentSkillsBonus;

    /**
     * TPM活动奖励
     */
    @Column(name = "tpm_activity_bonus")
    private String tpmActivityBonus;

    /**
     * 内部精益奖励
     */
    @Column(name = "internal_lean_bonus")
    private String internalLeanBonus;

    /**
     * 预验收交接激励
     */
    @Column(name = "pre_acceptance_handover_bonus")
    private String preAcceptanceHandoverBonus;

    /**
     * 最终交接激励
     */
    @Column(name = "final_handover_bonus")
    private String finalHandoverBonus;

    /**
     * 备件降耗激励
     */
    @Column(name = "spare_parts_consumption_reduction_bonus")
    private String sparePartsConsumptionReductionBonus;

    /**
     * 发电量担保激励
     */
    @Column(name = "energy_generation_guarantee_bonus")
    private String energyGenerationGuaranteeBonus;

    /**
     * 台车激励
     */
    @Column(name = "trolley_bonus")
    private String trolleyBonus;

    /**
     * 优秀服务项目标杆奖励
     */
    @Column(name = "outstanding_service_project_benchmark_bonus")
    private String outstandingServiceProjectBenchmarkBonus;

    /**
     * 销售提成
     */
    @Column(name = "sales_commission")
    private String salesCommission;

    /**
     * QC活动奖励
     */
    @Column(name = "qc_activity_bonus")
    private String qcActivityBonus;

    /**
     * DNV安全管理标准手
     */
    @Column(name = "dnv_safety_management_standard_manual_bonus")
    private String dnvSafetyManagementStandardManualBonus;

    /**
     * 销售激励奖金-第一笔
     */
    @Column(name = "sales_incentive_bonus_first_batch_new_orders_bonus")
    private String salesIncentiveBonusFirstBatchNewOrdersBonus;

    /**
     * 销售激励奖金-第二笔
     */
    @Column(name = "sales_incentive_bonus_second_batch_new_orders_bonus")
    private String salesIncentiveBonusSecondBatchNewOrdersBonus;

    /**
     * 销售激励奖金-利润奖
     */
    @Column(name = "sales_incentive_bonus_profit_bonus")
    private String salesIncentiveBonusProfitBonus;

    /**
     * 即时激励
     */
    @Column(name = "spot_incentive")
    private String spotIncentive;

    /**
     * 工会会费
     */
    @Column(name = "labor_union_dues")
    private String laborUnionDues;

    /**
     * 税后补扣
     */
    @Column(name = "after_tax_deduction")
    private String afterTaxDeduction;

    /**
     * 水电费
     */
    @Column(name = "hydro_and_electricity_fees")
    private String hydroAndElectricityFees;

    /**
     * 房租
     */
    @Column(name = "housing_rent")
    private String housingRent;

    /**
     * 班车
     */
    @Column(name = "shuttle_bus")
    private String shuttleBus;

    /**
     * 罚款(税后)
     */
    @Column(name = "penalty_after_tax")
    private String penaltyAfterTax;

    /**
     * 罚款(税前)
     */
    @Column(name = "penalty_before_tax")
    private String penaltyBeforeTax;

    /**
     * 税前补扣
     */
    @Column(name = "pre_tax_deductions_pay_adjustment")
    private String preTaxDeductionsPayAdjustment;

    /**
     * 平日加班费
     */
    @Column(name = "weekday_ot_payment")
    private String weekdayOtPayment;

    /**
     * 周末加班费
     */
    @Column(name = "weekend_ot_payment")
    private String weekendOtPayment;

    /**
     * 计件工资
     */
    @Column(name = "unit_based_salary")
    private String unitBasedSalary;

    /**
     * 节假日加班费
     */
    @Column(name = "holiday_ot_payment")
    private String holidayOtPayment;

    /**
     * 未休年假补偿
     */
    @Column(name = "annual_leave_subsidy")
    private String annualLeaveSubsidy;

    /**
     * 事假扣款
     */
    @Column(name = "personal_leave_deduction")
    private String personalLeaveDeduction;

    /**
     * 病假扣款
     */
    @Column(name = "sick_leave_deduction")
    private String sickLeaveDeduction;

    /**
     * 医疗期工资
     */
    @Column(name = "medical_leave_salary")
    private String medicalLeaveSalary;

    /**
     * 医疗期扣款
     */
    @Column(name = "medical_leave_deduction")
    private String medicalLeaveDeduction;

    /**
     * 停工期工资
     */
    @Column(name = "downtime_salary")
    private String downtimeSalary;

    /**
     * 产假扣款
     */
    @Column(name = "maternity_leave_deduction")
    private String maternityLeaveDeduction;

    /**
     * 流产假扣款
     */
    @Column(name = "abortion_leave_deduction")
    private String abortionLeaveDeduction;

    /**
     * 迟到/早退扣款
     */
    @Column(name = "late_early_leave_deduction")
    private String lateEarlyLeaveDeduction;

    /**
     * 旷工扣款
     */
    @Column(name = "absentee_deduction")
    private String absenteeDeduction;

    /**
     * 不足工作天数扣款
     */
    @Column(name = "under_time_deduction")
    private String underTimeDeduction;

    /**
     * 漏刷罚款
     */
    @Column(name = "miss_clocked_penalty")
    private String missClockedPenalty;

    /**
     * 养老保险补扣(个人)
     */
    @Column(name = "retroactive_pension")
    private String retroactivePension;

    /**
     * 养老保险补扣(单位)
     */
    @Column(name = "retroactive_pensioner")
    private String retroactivePensioner;

    /**
     * 医疗保险补扣(个人)
     */
    @Column(name = "retroactive_medical_care")
    private String retroactiveMedicalCare;

    /**
     * 大额医疗补扣(个人)
     */
    @Column(name = "retroactive_serious_illness")
    private String retroactiveSeriousIllness;

    /**
     * 医疗保险补扣(单位)
     */
    @Column(name = "retroactive_medicaler")
    private String retroactiveMedicaler;

    /**
     * 大额医疗补扣(单位)
     */
    @Column(name = "retroactive_serious_illnesser")
    private String retroactiveSeriousIllnesser;

    /**
     * 失业保险补扣(个人)
     */
    @Column(name = "retroactive_unemployment")
    private String retroactiveUnemployment;

    /**
     * 失业保险补扣(单位)
     */
    @Column(name = "retroactive_unemploymenter")
    private String retroactiveUnemploymenter;

    /**
     * 工伤保险补扣(单位)
     */
    @Column(name = "retroactive_on_job_injuryer")
    private String retroactiveOnJobInjuryer;

    /**
     * 生育保险补扣(单位)
     */
    @Column(name = "retroactive_maternityer")
    private String retroactiveMaternityer;

    /**
     * 住房公积金补扣(个人
     */
    @Column(name = "retroactive_housing_fund")
    private String retroactiveHousingFund;

    /**
     * 住房公积金补扣(单位
     */
    @Column(name = "housing_fund_er")
    private String housingFundEr;

    /**
     * 大额医疗(个人)
     */
    @Column(name = "serious_illness")
    private String seriousIllness;

    /**
     * 大额医疗(单位)
     */
    @Column(name = "serious_illnesser")
    private String seriousIllnesser;

    /**
     * 补充医疗(个人)
     */
    @Column(name = "medical_supplement")
    private String medicalSupplement;

    /**
     * 补充医疗(单位)
     */
    @Column(name = "medical_supplementer")
    private String medicalSupplementer;

    /**
     * 康宁(个人)
     */
    @Column(name = "corning_insurance")
    private String corningInsurance;

    /**
     * 康宁(单位)
     */
    @Column(name = "corning_insuranceer")
    private String corningInsuranceer;

    /**
     * 意外伤害险(个人)
     */
    @Column(name = "accident_insurance")
    private String accidentInsurance;

    /**
     * 意外伤害险(单位)
     */
    @Column(name = "accident_insurance_er")
    private String accidentInsuranceEr;

    /**
     * 月绩效考核系数
     */
    @Column(name = "performance_index")
    private String performanceIndex;

    /**
     * 单位承担社会保险合计
     */
    @Column(name = "total_si_er")
    private String totalSiEr;

    /**
     * 养老保险个人缴费
     */
    private String pension;

    /**
     * 养老保险单位缴费
     */
    private String pensioner;

    /**
     * 失业保险个人缴费
     */
    @Column(name = "unemployment_insurance")
    private String unemploymentInsurance;

    /**
     * 失业保险单位缴费
     */
    private String unemploymenter;

    /**
     * 医疗保险个人缴费
     */
    @Column(name = "medical_care_insurance")
    private String medicalCareInsurance;

    /**
     * 医疗保险单位缴费
     */
    @Column(name = "medical_care_er")
    private String medicalCareEr;

    /**
     * 工伤保险单位缴费
     */
    @Column(name = "on_job_injury_er")
    private String onJobInjuryEr;

    /**
     * 生育保险单位缴费
     */
    private String maternityer;

    /**
     * 住房公积金个人缴费
     */
    @Column(name = "housing_fund")
    private String housingFund;

    /**
     * 住房公积金单位缴费
     */
    @Column(name = "housing_funder")
    private String housingFunder;

    /**
     * 应税工资
     */
    @Column(name = "taxable_income")
    private String taxableIncome;

    /**
     * 离职补偿金税
     */
    @Column(name = "termination_remuneration_tax")
    private String terminationRemunerationTax;

    /**
     * 服务费(公司)
     */
    @Column(name = "service_fee")
    private String serviceFee;

    /**
     * 税前支付
     */
    @Column(name = "pre_tax_payment")
    private String preTaxPayment;

    /**
     * 税后扣款
     */
    @Column(name = "deduction_after_tax")
    private String deductionAfterTax;

    /**
     * 实得绩效工资
     */
    @Column(name = "actual_performance_pay")
    private String actualPerformancePay;

    /**
     * 应发合计
     */
    @Column(name = "pre_tax_income")
    private String preTaxIncome;

    /**
     * 个人所得税
     */
    @Column(name = "income_tax")
    private String incomeTax;

    /**
     * 实发工资
     */
    @Column(name = "net_income")
    private String netIncome;

    /**
     * 序号
     */
    private String sequence;

    /**
     * 合并计税
     */
    @Column(name = "merger_tax")
    private String mergerTax;

    /**
     * 社保支付
     */
    @Column(name = "social_insurance")
    private String socialInsurance;

    /**
     * 国籍
     */
    private String nationality;

    /**
     * 业务单元名称
     */
    @Column(name = "busi_text")
    private String busiText;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新人
     */
    private String updator;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 工会经费公司缴费
     */
    @Column(name = "labor_union_fund_company_payment")
    private String laborUnionFundCompanyPayment;

    /**
     * 教育金
     */
    @Column(name = "education_fund")
    private String educationFund;

    /**
     * 获取薪资表主键
     *
     * @return salary_id - 薪资表主键
     */
    public String getSalaryId() {
        return salaryId;
    }

    /**
     * 设置薪资表主键
     *
     * @param salaryId 薪资表主键
     */
    public void setSalaryId(String salaryId) {
        this.salaryId = salaryId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取薪资月
     *
     * @return salary_month - 薪资月
     */
    public String getSalaryMonth() {
        return salaryMonth;
    }

    /**
     * 设置薪资月
     *
     * @param salaryMonth 薪资月
     */
    public void setSalaryMonth(String salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    /**
     * 获取入职时间
     *
     * @return hire_date - 入职时间
     */
    public String getHireDate() {
        return hireDate;
    }

    /**
     * 设置入职时间
     *
     * @param hireDate 入职时间
     */
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * 获取部门
     *
     * @return department - 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置部门
     *
     * @param department 部门
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取业务单元
     *
     * @return busi - 业务单元
     */
    public String getBusi() {
        return busi;
    }

    /**
     * 设置业务单元
     *
     * @param busi 业务单元
     */
    public void setBusi(String busi) {
        this.busi = busi;
    }

    /**
     * 获取月度标准工资
     *
     * @return salary - 月度标准工资
     */
    public String getSalary() {
        return salary;
    }

    /**
     * 设置月度标准工资
     *
     * @param salary 月度标准工资
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }

    /**
     * 获取岗位工资标准
     *
     * @return position_salary - 岗位工资标准
     */
    public String getPositionSalary() {
        return positionSalary;
    }

    /**
     * 设置岗位工资标准
     *
     * @param positionSalary 岗位工资标准
     */
    public void setPositionSalary(String positionSalary) {
        this.positionSalary = positionSalary;
    }

    /**
     * 获取绩效工资标准
     *
     * @return performance_salary - 绩效工资标准
     */
    public String getPerformanceSalary() {
        return performanceSalary;
    }

    /**
     * 设置绩效工资标准
     *
     * @param performanceSalary 绩效工资标准
     */
    public void setPerformanceSalary(String performanceSalary) {
        this.performanceSalary = performanceSalary;
    }

    /**
     * 获取住房津贴标准
     *
     * @return housing_subsidy - 住房津贴标准
     */
    public String getHousingSubsidy() {
        return housingSubsidy;
    }

    /**
     * 设置住房津贴标准
     *
     * @param housingSubsidy 住房津贴标准
     */
    public void setHousingSubsidy(String housingSubsidy) {
        this.housingSubsidy = housingSubsidy;
    }

    /**
     * 获取通讯津贴
     *
     * @return communication_subsidy - 通讯津贴
     */
    public String getCommunicationSubsidy() {
        return communicationSubsidy;
    }

    /**
     * 设置通讯津贴
     *
     * @param communicationSubsidy 通讯津贴
     */
    public void setCommunicationSubsidy(String communicationSubsidy) {
        this.communicationSubsidy = communicationSubsidy;
    }

    /**
     * 获取交通津贴
     *
     * @return travel_allowance - 交通津贴
     */
    public String getTravelAllowance() {
        return travelAllowance;
    }

    /**
     * 设置交通津贴
     *
     * @param travelAllowance 交通津贴
     */
    public void setTravelAllowance(String travelAllowance) {
        this.travelAllowance = travelAllowance;
    }

    /**
     * 获取午餐津贴
     *
     * @return lunch_allowance - 午餐津贴
     */
    public String getLunchAllowance() {
        return lunchAllowance;
    }

    /**
     * 设置午餐津贴
     *
     * @param lunchAllowance 午餐津贴
     */
    public void setLunchAllowance(String lunchAllowance) {
        this.lunchAllowance = lunchAllowance;
    }

    /**
     * 获取职务津贴
     *
     * @return job_subsidy - 职务津贴
     */
    public String getJobSubsidy() {
        return jobSubsidy;
    }

    /**
     * 设置职务津贴
     *
     * @param jobSubsidy 职务津贴
     */
    public void setJobSubsidy(String jobSubsidy) {
        this.jobSubsidy = jobSubsidy;
    }

    /**
     * 获取其他津贴
     *
     * @return other_allowances - 其他津贴
     */
    public String getOtherAllowances() {
        return otherAllowances;
    }

    /**
     * 设置其他津贴
     *
     * @param otherAllowances 其他津贴
     */
    public void setOtherAllowances(String otherAllowances) {
        this.otherAllowances = otherAllowances;
    }

    /**
     * 获取高温津贴
     *
     * @return high_temp_subsidy - 高温津贴
     */
    public String getHighTempSubsidy() {
        return highTempSubsidy;
    }

    /**
     * 设置高温津贴
     *
     * @param highTempSubsidy 高温津贴
     */
    public void setHighTempSubsidy(String highTempSubsidy) {
        this.highTempSubsidy = highTempSubsidy;
    }

    /**
     * 获取月度奖金
     *
     * @return monthly_bonus - 月度奖金
     */
    public String getMonthlyBonus() {
        return monthlyBonus;
    }

    /**
     * 设置月度奖金
     *
     * @param monthlyBonus 月度奖金
     */
    public void setMonthlyBonus(String monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    /**
     * 获取质量文化奖金
     *
     * @return quality_culture_bonus - 质量文化奖金
     */
    public String getQualityCultureBonus() {
        return qualityCultureBonus;
    }

    /**
     * 设置质量文化奖金
     *
     * @param qualityCultureBonus 质量文化奖金
     */
    public void setQualityCultureBonus(String qualityCultureBonus) {
        this.qualityCultureBonus = qualityCultureBonus;
    }

    /**
     * 获取季度奖金
     *
     * @return quarterly_bonus - 季度奖金
     */
    public String getQuarterlyBonus() {
        return quarterlyBonus;
    }

    /**
     * 设置季度奖金
     *
     * @param quarterlyBonus 季度奖金
     */
    public void setQuarterlyBonus(String quarterlyBonus) {
        this.quarterlyBonus = quarterlyBonus;
    }

    /**
     * 获取其他福利补贴
     *
     * @return other_welfare - 其他福利补贴
     */
    public String getOtherWelfare() {
        return otherWelfare;
    }

    /**
     * 设置其他福利补贴
     *
     * @param otherWelfare 其他福利补贴
     */
    public void setOtherWelfare(String otherWelfare) {
        this.otherWelfare = otherWelfare;
    }

    /**
     * 获取税前补发
     *
     * @return retroactive_pre_tax_payment - 税前补发
     */
    public String getRetroactivePreTaxPayment() {
        return retroactivePreTaxPayment;
    }

    /**
     * 设置税前补发
     *
     * @param retroactivePreTaxPayment 税前补发
     */
    public void setRetroactivePreTaxPayment(String retroactivePreTaxPayment) {
        this.retroactivePreTaxPayment = retroactivePreTaxPayment;
    }

    /**
     * 获取税后补发
     *
     * @return after_tax_adjustment - 税后补发
     */
    public String getAfterTaxAdjustment() {
        return afterTaxAdjustment;
    }

    /**
     * 设置税后补发
     *
     * @param afterTaxAdjustment 税后补发
     */
    public void setAfterTaxAdjustment(String afterTaxAdjustment) {
        this.afterTaxAdjustment = afterTaxAdjustment;
    }

    /**
     * 获取离职补偿金
     *
     * @return termination_remuneration - 离职补偿金
     */
    public String getTerminationRemuneration() {
        return terminationRemuneration;
    }

    /**
     * 设置离职补偿金
     *
     * @param terminationRemuneration 离职补偿金
     */
    public void setTerminationRemuneration(String terminationRemuneration) {
        this.terminationRemuneration = terminationRemuneration;
    }

    /**
     * 获取竞业限制补偿金
     *
     * @return non_competition_remuneration - 竞业限制补偿金
     */
    public String getNonCompetitionRemuneration() {
        return nonCompetitionRemuneration;
    }

    /**
     * 设置竞业限制补偿金
     *
     * @param nonCompetitionRemuneration 竞业限制补偿金
     */
    public void setNonCompetitionRemuneration(String nonCompetitionRemuneration) {
        this.nonCompetitionRemuneration = nonCompetitionRemuneration;
    }

    /**
     * 获取兼职安全员津贴
     *
     * @return part_time_safety_personnel_allowance - 兼职安全员津贴
     */
    public String getPartTimeSafetyPersonnelAllowance() {
        return partTimeSafetyPersonnelAllowance;
    }

    /**
     * 设置兼职安全员津贴
     *
     * @param partTimeSafetyPersonnelAllowance 兼职安全员津贴
     */
    public void setPartTimeSafetyPersonnelAllowance(String partTimeSafetyPersonnelAllowance) {
        this.partTimeSafetyPersonnelAllowance = partTimeSafetyPersonnelAllowance;
    }

    /**
     * 获取坚守津贴
     *
     * @return mandatory_on_duty_allowance - 坚守津贴
     */
    public String getMandatoryOnDutyAllowance() {
        return mandatoryOnDutyAllowance;
    }

    /**
     * 设置坚守津贴
     *
     * @param mandatoryOnDutyAllowance 坚守津贴
     */
    public void setMandatoryOnDutyAllowance(String mandatoryOnDutyAllowance) {
        this.mandatoryOnDutyAllowance = mandatoryOnDutyAllowance;
    }

    /**
     * 获取兼岗津贴
     *
     * @return part_time_allowance - 兼岗津贴
     */
    public String getPartTimeAllowance() {
        return partTimeAllowance;
    }

    /**
     * 设置兼岗津贴
     *
     * @param partTimeAllowance 兼岗津贴
     */
    public void setPartTimeAllowance(String partTimeAllowance) {
        this.partTimeAllowance = partTimeAllowance;
    }

    /**
     * 获取入厂津贴
     *
     * @return on_site_allowance - 入厂津贴
     */
    public String getOnSiteAllowance() {
        return onSiteAllowance;
    }

    /**
     * 设置入厂津贴
     *
     * @param onSiteAllowance 入厂津贴
     */
    public void setOnSiteAllowance(String onSiteAllowance) {
        this.onSiteAllowance = onSiteAllowance;
    }

    /**
     * 获取通讯费补贴(额外支付)
     *
     * @return communication_allowance_extra_payment - 通讯费补贴(额外支付)
     */
    public String getCommunicationAllowanceExtraPayment() {
        return communicationAllowanceExtraPayment;
    }

    /**
     * 设置通讯费补贴(额外支付)
     *
     * @param communicationAllowanceExtraPayment 通讯费补贴(额外支付)
     */
    public void setCommunicationAllowanceExtraPayment(String communicationAllowanceExtraPayment) {
        this.communicationAllowanceExtraPayment = communicationAllowanceExtraPayment;
    }

    /**
     * 获取交通费补贴(额外支付)
     *
     * @return travel_allowance_extra_payment - 交通费补贴(额外支付)
     */
    public String getTravelAllowanceExtraPayment() {
        return travelAllowanceExtraPayment;
    }

    /**
     * 设置交通费补贴(额外支付)
     *
     * @param travelAllowanceExtraPayment 交通费补贴(额外支付)
     */
    public void setTravelAllowanceExtraPayment(String travelAllowanceExtraPayment) {
        this.travelAllowanceExtraPayment = travelAllowanceExtraPayment;
    }

    /**
     * 获取项目经理津贴
     *
     * @return project_manager_allowance - 项目经理津贴
     */
    public String getProjectManagerAllowance() {
        return projectManagerAllowance;
    }

    /**
     * 设置项目经理津贴
     *
     * @param projectManagerAllowance 项目经理津贴
     */
    public void setProjectManagerAllowance(String projectManagerAllowance) {
        this.projectManagerAllowance = projectManagerAllowance;
    }

    /**
     * 获取质量工资
     *
     * @return quality_salary - 质量工资
     */
    public String getQualitySalary() {
        return qualitySalary;
    }

    /**
     * 设置质量工资
     *
     * @param qualitySalary 质量工资
     */
    public void setQualitySalary(String qualitySalary) {
        this.qualitySalary = qualitySalary;
    }

    /**
     * 获取技术创新类
     *
     * @return technological_innovation - 技术创新类
     */
    public String getTechnologicalInnovation() {
        return technologicalInnovation;
    }

    /**
     * 设置技术创新类
     *
     * @param technologicalInnovation 技术创新类
     */
    public void setTechnologicalInnovation(String technologicalInnovation) {
        this.technologicalInnovation = technologicalInnovation;
    }

    /**
     * 获取管理标准化类
     *
     * @return management_standardization - 管理标准化类
     */
    public String getManagementStandardization() {
        return managementStandardization;
    }

    /**
     * 设置管理标准化类
     *
     * @param managementStandardization 管理标准化类
     */
    public void setManagementStandardization(String managementStandardization) {
        this.managementStandardization = managementStandardization;
    }

    /**
     * 获取质量类
     *
     * @return quality_category - 质量类
     */
    public String getQualityCategory() {
        return qualityCategory;
    }

    /**
     * 设置质量类
     *
     * @param qualityCategory 质量类
     */
    public void setQualityCategory(String qualityCategory) {
        this.qualityCategory = qualityCategory;
    }

    /**
     * 获取创新管理专项
     *
     * @return innovation_management - 创新管理专项
     */
    public String getInnovationManagement() {
        return innovationManagement;
    }

    /**
     * 设置创新管理专项
     *
     * @param innovationManagement 创新管理专项
     */
    public void setInnovationManagement(String innovationManagement) {
        this.innovationManagement = innovationManagement;
    }

    /**
     * 获取转型专项
     *
     * @return transformation_specific - 转型专项
     */
    public String getTransformationSpecific() {
        return transformationSpecific;
    }

    /**
     * 设置转型专项
     *
     * @param transformationSpecific 转型专项
     */
    public void setTransformationSpecific(String transformationSpecific) {
        this.transformationSpecific = transformationSpecific;
    }

    /**
     * 获取风火同价项目
     *
     * @return wind_thermal_on_par - 风火同价项目
     */
    public String getWindThermalOnPar() {
        return windThermalOnPar;
    }

    /**
     * 设置风火同价项目
     *
     * @param windThermalOnPar 风火同价项目
     */
    public void setWindThermalOnPar(String windThermalOnPar) {
        this.windThermalOnPar = windThermalOnPar;
    }

    /**
     * 获取质量管理专项
     *
     * @return quality_management - 质量管理专项
     */
    public String getQualityManagement() {
        return qualityManagement;
    }

    /**
     * 设置质量管理专项
     *
     * @param qualityManagement 质量管理专项
     */
    public void setQualityManagement(String qualityManagement) {
        this.qualityManagement = qualityManagement;
    }

    /**
     * 获取工资补差
     *
     * @return salary_gap_remuneration - 工资补差
     */
    public String getSalaryGapRemuneration() {
        return salaryGapRemuneration;
    }

    /**
     * 设置工资补差
     *
     * @param salaryGapRemuneration 工资补差
     */
    public void setSalaryGapRemuneration(String salaryGapRemuneration) {
        this.salaryGapRemuneration = salaryGapRemuneration;
    }

    /**
     * 获取加班费补发
     *
     * @return retroactive_ot_payment - 加班费补发
     */
    public String getRetroactiveOtPayment() {
        return retroactiveOtPayment;
    }

    /**
     * 设置加班费补发
     *
     * @param retroactiveOtPayment 加班费补发
     */
    public void setRetroactiveOtPayment(String retroactiveOtPayment) {
        this.retroactiveOtPayment = retroactiveOtPayment;
    }

    /**
     * 获取离职未休假期补发
     *
     * @return termination_leave_balance_remuneration - 离职未休假期补发
     */
    public String getTerminationLeaveBalanceRemuneration() {
        return terminationLeaveBalanceRemuneration;
    }

    /**
     * 设置离职未休假期补发
     *
     * @param terminationLeaveBalanceRemuneration 离职未休假期补发
     */
    public void setTerminationLeaveBalanceRemuneration(String terminationLeaveBalanceRemuneration) {
        this.terminationLeaveBalanceRemuneration = terminationLeaveBalanceRemuneration;
    }

    /**
     * 获取讲师费
     *
     * @return lecturer_fee - 讲师费
     */
    public String getLecturerFee() {
        return lecturerFee;
    }

    /**
     * 设置讲师费
     *
     * @param lecturerFee 讲师费
     */
    public void setLecturerFee(String lecturerFee) {
        this.lecturerFee = lecturerFee;
    }

    /**
     * 获取评优奖励发放
     *
     * @return excellence_award_incentive - 评优奖励发放
     */
    public String getExcellenceAwardIncentive() {
        return excellenceAwardIncentive;
    }

    /**
     * 设置评优奖励发放
     *
     * @param excellenceAwardIncentive 评优奖励发放
     */
    public void setExcellenceAwardIncentive(String excellenceAwardIncentive) {
        this.excellenceAwardIncentive = excellenceAwardIncentive;
    }

    /**
     * 获取培训费用合并计税
     *
     * @return taxable_training_fee - 培训费用合并计税
     */
    public String getTaxableTrainingFee() {
        return taxableTrainingFee;
    }

    /**
     * 设置培训费用合并计税
     *
     * @param taxableTrainingFee 培训费用合并计税
     */
    public void setTaxableTrainingFee(String taxableTrainingFee) {
        this.taxableTrainingFee = taxableTrainingFee;
    }

    /**
     * 获取公司福利合并计税
     *
     * @return taxable_company_benefit - 公司福利合并计税
     */
    public String getTaxableCompanyBenefit() {
        return taxableCompanyBenefit;
    }

    /**
     * 设置公司福利合并计税
     *
     * @param taxableCompanyBenefit 公司福利合并计税
     */
    public void setTaxableCompanyBenefit(String taxableCompanyBenefit) {
        this.taxableCompanyBenefit = taxableCompanyBenefit;
    }

    /**
     * 获取安全奖励
     *
     * @return safety_bonus - 安全奖励
     */
    public String getSafetyBonus() {
        return safetyBonus;
    }

    /**
     * 设置安全奖励
     *
     * @param safetyBonus 安全奖励
     */
    public void setSafetyBonus(String safetyBonus) {
        this.safetyBonus = safetyBonus;
    }

    /**
     * 获取安全月奖励
     *
     * @return safety_month_bonus - 安全月奖励
     */
    public String getSafetyMonthBonus() {
        return safetyMonthBonus;
    }

    /**
     * 设置安全月奖励
     *
     * @param safetyMonthBonus 安全月奖励
     */
    public void setSafetyMonthBonus(String safetyMonthBonus) {
        this.safetyMonthBonus = safetyMonthBonus;
    }

    /**
     * 获取质量奖金
     *
     * @return quality_bonus - 质量奖金
     */
    public String getQualityBonus() {
        return qualityBonus;
    }

    /**
     * 设置质量奖金
     *
     * @param qualityBonus 质量奖金
     */
    public void setQualityBonus(String qualityBonus) {
        this.qualityBonus = qualityBonus;
    }

    /**
     * 获取季度之星奖励
     *
     * @return quarterly_star_bonus - 季度之星奖励
     */
    public String getQuarterlyStarBonus() {
        return quarterlyStarBonus;
    }

    /**
     * 设置季度之星奖励
     *
     * @param quarterlyStarBonus 季度之星奖励
     */
    public void setQuarterlyStarBonus(String quarterlyStarBonus) {
        this.quarterlyStarBonus = quarterlyStarBonus;
    }

    /**
     * 获取体系管理奖励
     *
     * @return system_management_bonus - 体系管理奖励
     */
    public String getSystemManagementBonus() {
        return systemManagementBonus;
    }

    /**
     * 设置体系管理奖励
     *
     * @param systemManagementBonus 体系管理奖励
     */
    public void setSystemManagementBonus(String systemManagementBonus) {
        this.systemManagementBonus = systemManagementBonus;
    }

    /**
     * 获取特种设备技能奖励
     *
     * @return special_equipment_skills_bonus - 特种设备技能奖励
     */
    public String getSpecialEquipmentSkillsBonus() {
        return specialEquipmentSkillsBonus;
    }

    /**
     * 设置特种设备技能奖励
     *
     * @param specialEquipmentSkillsBonus 特种设备技能奖励
     */
    public void setSpecialEquipmentSkillsBonus(String specialEquipmentSkillsBonus) {
        this.specialEquipmentSkillsBonus = specialEquipmentSkillsBonus;
    }

    /**
     * 获取TPM活动奖励
     *
     * @return tpm_activity_bonus - TPM活动奖励
     */
    public String getTpmActivityBonus() {
        return tpmActivityBonus;
    }

    /**
     * 设置TPM活动奖励
     *
     * @param tpmActivityBonus TPM活动奖励
     */
    public void setTpmActivityBonus(String tpmActivityBonus) {
        this.tpmActivityBonus = tpmActivityBonus;
    }

    /**
     * 获取内部精益奖励
     *
     * @return internal_lean_bonus - 内部精益奖励
     */
    public String getInternalLeanBonus() {
        return internalLeanBonus;
    }

    /**
     * 设置内部精益奖励
     *
     * @param internalLeanBonus 内部精益奖励
     */
    public void setInternalLeanBonus(String internalLeanBonus) {
        this.internalLeanBonus = internalLeanBonus;
    }

    /**
     * 获取预验收交接激励
     *
     * @return pre_acceptance_handover_bonus - 预验收交接激励
     */
    public String getPreAcceptanceHandoverBonus() {
        return preAcceptanceHandoverBonus;
    }

    /**
     * 设置预验收交接激励
     *
     * @param preAcceptanceHandoverBonus 预验收交接激励
     */
    public void setPreAcceptanceHandoverBonus(String preAcceptanceHandoverBonus) {
        this.preAcceptanceHandoverBonus = preAcceptanceHandoverBonus;
    }

    /**
     * 获取最终交接激励
     *
     * @return final_handover_bonus - 最终交接激励
     */
    public String getFinalHandoverBonus() {
        return finalHandoverBonus;
    }

    /**
     * 设置最终交接激励
     *
     * @param finalHandoverBonus 最终交接激励
     */
    public void setFinalHandoverBonus(String finalHandoverBonus) {
        this.finalHandoverBonus = finalHandoverBonus;
    }

    /**
     * 获取备件降耗激励
     *
     * @return spare_parts_consumption_reduction_bonus - 备件降耗激励
     */
    public String getSparePartsConsumptionReductionBonus() {
        return sparePartsConsumptionReductionBonus;
    }

    /**
     * 设置备件降耗激励
     *
     * @param sparePartsConsumptionReductionBonus 备件降耗激励
     */
    public void setSparePartsConsumptionReductionBonus(String sparePartsConsumptionReductionBonus) {
        this.sparePartsConsumptionReductionBonus = sparePartsConsumptionReductionBonus;
    }

    /**
     * 获取发电量担保激励
     *
     * @return energy_generation_guarantee_bonus - 发电量担保激励
     */
    public String getEnergyGenerationGuaranteeBonus() {
        return energyGenerationGuaranteeBonus;
    }

    /**
     * 设置发电量担保激励
     *
     * @param energyGenerationGuaranteeBonus 发电量担保激励
     */
    public void setEnergyGenerationGuaranteeBonus(String energyGenerationGuaranteeBonus) {
        this.energyGenerationGuaranteeBonus = energyGenerationGuaranteeBonus;
    }

    /**
     * 获取台车激励
     *
     * @return trolley_bonus - 台车激励
     */
    public String getTrolleyBonus() {
        return trolleyBonus;
    }

    /**
     * 设置台车激励
     *
     * @param trolleyBonus 台车激励
     */
    public void setTrolleyBonus(String trolleyBonus) {
        this.trolleyBonus = trolleyBonus;
    }

    /**
     * 获取优秀服务项目标杆奖励
     *
     * @return outstanding_service_project_benchmark_bonus - 优秀服务项目标杆奖励
     */
    public String getOutstandingServiceProjectBenchmarkBonus() {
        return outstandingServiceProjectBenchmarkBonus;
    }

    /**
     * 设置优秀服务项目标杆奖励
     *
     * @param outstandingServiceProjectBenchmarkBonus 优秀服务项目标杆奖励
     */
    public void setOutstandingServiceProjectBenchmarkBonus(String outstandingServiceProjectBenchmarkBonus) {
        this.outstandingServiceProjectBenchmarkBonus = outstandingServiceProjectBenchmarkBonus;
    }

    /**
     * 获取销售提成
     *
     * @return sales_commission - 销售提成
     */
    public String getSalesCommission() {
        return salesCommission;
    }

    /**
     * 设置销售提成
     *
     * @param salesCommission 销售提成
     */
    public void setSalesCommission(String salesCommission) {
        this.salesCommission = salesCommission;
    }

    /**
     * 获取QC活动奖励
     *
     * @return qc_activity_bonus - QC活动奖励
     */
    public String getQcActivityBonus() {
        return qcActivityBonus;
    }

    /**
     * 设置QC活动奖励
     *
     * @param qcActivityBonus QC活动奖励
     */
    public void setQcActivityBonus(String qcActivityBonus) {
        this.qcActivityBonus = qcActivityBonus;
    }

    /**
     * 获取DNV安全管理标准手
     *
     * @return dnv_safety_management_standard_manual_bonus - DNV安全管理标准手
     */
    public String getDnvSafetyManagementStandardManualBonus() {
        return dnvSafetyManagementStandardManualBonus;
    }

    /**
     * 设置DNV安全管理标准手
     *
     * @param dnvSafetyManagementStandardManualBonus DNV安全管理标准手
     */
    public void setDnvSafetyManagementStandardManualBonus(String dnvSafetyManagementStandardManualBonus) {
        this.dnvSafetyManagementStandardManualBonus = dnvSafetyManagementStandardManualBonus;
    }

    /**
     * 获取销售激励奖金-第一笔
     *
     * @return sales_incentive_bonus_first_batch_new_orders_bonus - 销售激励奖金-第一笔
     */
    public String getSalesIncentiveBonusFirstBatchNewOrdersBonus() {
        return salesIncentiveBonusFirstBatchNewOrdersBonus;
    }

    /**
     * 设置销售激励奖金-第一笔
     *
     * @param salesIncentiveBonusFirstBatchNewOrdersBonus 销售激励奖金-第一笔
     */
    public void setSalesIncentiveBonusFirstBatchNewOrdersBonus(String salesIncentiveBonusFirstBatchNewOrdersBonus) {
        this.salesIncentiveBonusFirstBatchNewOrdersBonus = salesIncentiveBonusFirstBatchNewOrdersBonus;
    }

    /**
     * 获取销售激励奖金-第二笔
     *
     * @return sales_incentive_bonus_second_batch_new_orders_bonus - 销售激励奖金-第二笔
     */
    public String getSalesIncentiveBonusSecondBatchNewOrdersBonus() {
        return salesIncentiveBonusSecondBatchNewOrdersBonus;
    }

    /**
     * 设置销售激励奖金-第二笔
     *
     * @param salesIncentiveBonusSecondBatchNewOrdersBonus 销售激励奖金-第二笔
     */
    public void setSalesIncentiveBonusSecondBatchNewOrdersBonus(String salesIncentiveBonusSecondBatchNewOrdersBonus) {
        this.salesIncentiveBonusSecondBatchNewOrdersBonus = salesIncentiveBonusSecondBatchNewOrdersBonus;
    }

    /**
     * 获取销售激励奖金-利润奖
     *
     * @return sales_incentive_bonus_profit_bonus - 销售激励奖金-利润奖
     */
    public String getSalesIncentiveBonusProfitBonus() {
        return salesIncentiveBonusProfitBonus;
    }

    /**
     * 设置销售激励奖金-利润奖
     *
     * @param salesIncentiveBonusProfitBonus 销售激励奖金-利润奖
     */
    public void setSalesIncentiveBonusProfitBonus(String salesIncentiveBonusProfitBonus) {
        this.salesIncentiveBonusProfitBonus = salesIncentiveBonusProfitBonus;
    }

    /**
     * 获取即时激励
     *
     * @return spot_incentive - 即时激励
     */
    public String getSpotIncentive() {
        return spotIncentive;
    }

    /**
     * 设置即时激励
     *
     * @param spotIncentive 即时激励
     */
    public void setSpotIncentive(String spotIncentive) {
        this.spotIncentive = spotIncentive;
    }

    /**
     * 获取工会会费
     *
     * @return labor_union_dues - 工会会费
     */
    public String getLaborUnionDues() {
        return laborUnionDues;
    }

    /**
     * 设置工会会费
     *
     * @param laborUnionDues 工会会费
     */
    public void setLaborUnionDues(String laborUnionDues) {
        this.laborUnionDues = laborUnionDues;
    }

    /**
     * 获取税后补扣
     *
     * @return after_tax_deduction - 税后补扣
     */
    public String getAfterTaxDeduction() {
        return afterTaxDeduction;
    }

    /**
     * 设置税后补扣
     *
     * @param afterTaxDeduction 税后补扣
     */
    public void setAfterTaxDeduction(String afterTaxDeduction) {
        this.afterTaxDeduction = afterTaxDeduction;
    }

    /**
     * 获取水电费
     *
     * @return hydro_and_electricity_fees - 水电费
     */
    public String getHydroAndElectricityFees() {
        return hydroAndElectricityFees;
    }

    /**
     * 设置水电费
     *
     * @param hydroAndElectricityFees 水电费
     */
    public void setHydroAndElectricityFees(String hydroAndElectricityFees) {
        this.hydroAndElectricityFees = hydroAndElectricityFees;
    }

    /**
     * 获取房租
     *
     * @return housing_rent - 房租
     */
    public String getHousingRent() {
        return housingRent;
    }

    /**
     * 设置房租
     *
     * @param housingRent 房租
     */
    public void setHousingRent(String housingRent) {
        this.housingRent = housingRent;
    }

    /**
     * 获取班车
     *
     * @return shuttle_bus - 班车
     */
    public String getShuttleBus() {
        return shuttleBus;
    }

    /**
     * 设置班车
     *
     * @param shuttleBus 班车
     */
    public void setShuttleBus(String shuttleBus) {
        this.shuttleBus = shuttleBus;
    }

    /**
     * 获取罚款(税后)
     *
     * @return penalty_after_tax - 罚款(税后)
     */
    public String getPenaltyAfterTax() {
        return penaltyAfterTax;
    }

    /**
     * 设置罚款(税后)
     *
     * @param penaltyAfterTax 罚款(税后)
     */
    public void setPenaltyAfterTax(String penaltyAfterTax) {
        this.penaltyAfterTax = penaltyAfterTax;
    }

    /**
     * 获取罚款(税前)
     *
     * @return penalty_before_tax - 罚款(税前)
     */
    public String getPenaltyBeforeTax() {
        return penaltyBeforeTax;
    }

    /**
     * 设置罚款(税前)
     *
     * @param penaltyBeforeTax 罚款(税前)
     */
    public void setPenaltyBeforeTax(String penaltyBeforeTax) {
        this.penaltyBeforeTax = penaltyBeforeTax;
    }

    /**
     * 获取税前补扣
     *
     * @return pre_tax_deductions_pay_adjustment - 税前补扣
     */
    public String getPreTaxDeductionsPayAdjustment() {
        return preTaxDeductionsPayAdjustment;
    }

    /**
     * 设置税前补扣
     *
     * @param preTaxDeductionsPayAdjustment 税前补扣
     */
    public void setPreTaxDeductionsPayAdjustment(String preTaxDeductionsPayAdjustment) {
        this.preTaxDeductionsPayAdjustment = preTaxDeductionsPayAdjustment;
    }

    /**
     * 获取平日加班费
     *
     * @return weekday_ot_payment - 平日加班费
     */
    public String getWeekdayOtPayment() {
        return weekdayOtPayment;
    }

    /**
     * 设置平日加班费
     *
     * @param weekdayOtPayment 平日加班费
     */
    public void setWeekdayOtPayment(String weekdayOtPayment) {
        this.weekdayOtPayment = weekdayOtPayment;
    }

    /**
     * 获取周末加班费
     *
     * @return weekend_ot_payment - 周末加班费
     */
    public String getWeekendOtPayment() {
        return weekendOtPayment;
    }

    /**
     * 设置周末加班费
     *
     * @param weekendOtPayment 周末加班费
     */
    public void setWeekendOtPayment(String weekendOtPayment) {
        this.weekendOtPayment = weekendOtPayment;
    }

    /**
     * 获取计件工资
     *
     * @return unit_based_salary - 计件工资
     */
    public String getUnitBasedSalary() {
        return unitBasedSalary;
    }

    /**
     * 设置计件工资
     *
     * @param unitBasedSalary 计件工资
     */
    public void setUnitBasedSalary(String unitBasedSalary) {
        this.unitBasedSalary = unitBasedSalary;
    }

    /**
     * 获取节假日加班费
     *
     * @return holiday_ot_payment - 节假日加班费
     */
    public String getHolidayOtPayment() {
        return holidayOtPayment;
    }

    /**
     * 设置节假日加班费
     *
     * @param holidayOtPayment 节假日加班费
     */
    public void setHolidayOtPayment(String holidayOtPayment) {
        this.holidayOtPayment = holidayOtPayment;
    }

    /**
     * 获取未休年假补偿
     *
     * @return annual_leave_subsidy - 未休年假补偿
     */
    public String getAnnualLeaveSubsidy() {
        return annualLeaveSubsidy;
    }

    /**
     * 设置未休年假补偿
     *
     * @param annualLeaveSubsidy 未休年假补偿
     */
    public void setAnnualLeaveSubsidy(String annualLeaveSubsidy) {
        this.annualLeaveSubsidy = annualLeaveSubsidy;
    }

    /**
     * 获取事假扣款
     *
     * @return personal_leave_deduction - 事假扣款
     */
    public String getPersonalLeaveDeduction() {
        return personalLeaveDeduction;
    }

    /**
     * 设置事假扣款
     *
     * @param personalLeaveDeduction 事假扣款
     */
    public void setPersonalLeaveDeduction(String personalLeaveDeduction) {
        this.personalLeaveDeduction = personalLeaveDeduction;
    }

    /**
     * 获取病假扣款
     *
     * @return sick_leave_deduction - 病假扣款
     */
    public String getSickLeaveDeduction() {
        return sickLeaveDeduction;
    }

    /**
     * 设置病假扣款
     *
     * @param sickLeaveDeduction 病假扣款
     */
    public void setSickLeaveDeduction(String sickLeaveDeduction) {
        this.sickLeaveDeduction = sickLeaveDeduction;
    }

    /**
     * 获取医疗期工资
     *
     * @return medical_leave_salary - 医疗期工资
     */
    public String getMedicalLeaveSalary() {
        return medicalLeaveSalary;
    }

    /**
     * 设置医疗期工资
     *
     * @param medicalLeaveSalary 医疗期工资
     */
    public void setMedicalLeaveSalary(String medicalLeaveSalary) {
        this.medicalLeaveSalary = medicalLeaveSalary;
    }

    /**
     * 获取医疗期扣款
     *
     * @return medical_leave_deduction - 医疗期扣款
     */
    public String getMedicalLeaveDeduction() {
        return medicalLeaveDeduction;
    }

    /**
     * 设置医疗期扣款
     *
     * @param medicalLeaveDeduction 医疗期扣款
     */
    public void setMedicalLeaveDeduction(String medicalLeaveDeduction) {
        this.medicalLeaveDeduction = medicalLeaveDeduction;
    }

    /**
     * 获取停工期工资
     *
     * @return downtime_salary - 停工期工资
     */
    public String getDowntimeSalary() {
        return downtimeSalary;
    }

    /**
     * 设置停工期工资
     *
     * @param downtimeSalary 停工期工资
     */
    public void setDowntimeSalary(String downtimeSalary) {
        this.downtimeSalary = downtimeSalary;
    }

    /**
     * 获取产假扣款
     *
     * @return maternity_leave_deduction - 产假扣款
     */
    public String getMaternityLeaveDeduction() {
        return maternityLeaveDeduction;
    }

    /**
     * 设置产假扣款
     *
     * @param maternityLeaveDeduction 产假扣款
     */
    public void setMaternityLeaveDeduction(String maternityLeaveDeduction) {
        this.maternityLeaveDeduction = maternityLeaveDeduction;
    }

    /**
     * 获取流产假扣款
     *
     * @return abortion_leave_deduction - 流产假扣款
     */
    public String getAbortionLeaveDeduction() {
        return abortionLeaveDeduction;
    }

    /**
     * 设置流产假扣款
     *
     * @param abortionLeaveDeduction 流产假扣款
     */
    public void setAbortionLeaveDeduction(String abortionLeaveDeduction) {
        this.abortionLeaveDeduction = abortionLeaveDeduction;
    }

    /**
     * 获取迟到/早退扣款
     *
     * @return late_early_leave_deduction - 迟到/早退扣款
     */
    public String getLateEarlyLeaveDeduction() {
        return lateEarlyLeaveDeduction;
    }

    /**
     * 设置迟到/早退扣款
     *
     * @param lateEarlyLeaveDeduction 迟到/早退扣款
     */
    public void setLateEarlyLeaveDeduction(String lateEarlyLeaveDeduction) {
        this.lateEarlyLeaveDeduction = lateEarlyLeaveDeduction;
    }

    /**
     * 获取旷工扣款
     *
     * @return absentee_deduction - 旷工扣款
     */
    public String getAbsenteeDeduction() {
        return absenteeDeduction;
    }

    /**
     * 设置旷工扣款
     *
     * @param absenteeDeduction 旷工扣款
     */
    public void setAbsenteeDeduction(String absenteeDeduction) {
        this.absenteeDeduction = absenteeDeduction;
    }

    /**
     * 获取不足工作天数扣款
     *
     * @return under_time_deduction - 不足工作天数扣款
     */
    public String getUnderTimeDeduction() {
        return underTimeDeduction;
    }

    /**
     * 设置不足工作天数扣款
     *
     * @param underTimeDeduction 不足工作天数扣款
     */
    public void setUnderTimeDeduction(String underTimeDeduction) {
        this.underTimeDeduction = underTimeDeduction;
    }

    /**
     * 获取漏刷罚款
     *
     * @return miss_clocked_penalty - 漏刷罚款
     */
    public String getMissClockedPenalty() {
        return missClockedPenalty;
    }

    /**
     * 设置漏刷罚款
     *
     * @param missClockedPenalty 漏刷罚款
     */
    public void setMissClockedPenalty(String missClockedPenalty) {
        this.missClockedPenalty = missClockedPenalty;
    }

    /**
     * 获取养老保险补扣(个人)
     *
     * @return retroactive_pension - 养老保险补扣(个人)
     */
    public String getRetroactivePension() {
        return retroactivePension;
    }

    /**
     * 设置养老保险补扣(个人)
     *
     * @param retroactivePension 养老保险补扣(个人)
     */
    public void setRetroactivePension(String retroactivePension) {
        this.retroactivePension = retroactivePension;
    }

    /**
     * 获取养老保险补扣(单位)
     *
     * @return retroactive_pensioner - 养老保险补扣(单位)
     */
    public String getRetroactivePensioner() {
        return retroactivePensioner;
    }

    /**
     * 设置养老保险补扣(单位)
     *
     * @param retroactivePensioner 养老保险补扣(单位)
     */
    public void setRetroactivePensioner(String retroactivePensioner) {
        this.retroactivePensioner = retroactivePensioner;
    }

    /**
     * 获取医疗保险补扣(个人)
     *
     * @return retroactive_medical_care - 医疗保险补扣(个人)
     */
    public String getRetroactiveMedicalCare() {
        return retroactiveMedicalCare;
    }

    /**
     * 设置医疗保险补扣(个人)
     *
     * @param retroactiveMedicalCare 医疗保险补扣(个人)
     */
    public void setRetroactiveMedicalCare(String retroactiveMedicalCare) {
        this.retroactiveMedicalCare = retroactiveMedicalCare;
    }

    /**
     * 获取大额医疗补扣(个人)
     *
     * @return retroactive_serious_illness - 大额医疗补扣(个人)
     */
    public String getRetroactiveSeriousIllness() {
        return retroactiveSeriousIllness;
    }

    /**
     * 设置大额医疗补扣(个人)
     *
     * @param retroactiveSeriousIllness 大额医疗补扣(个人)
     */
    public void setRetroactiveSeriousIllness(String retroactiveSeriousIllness) {
        this.retroactiveSeriousIllness = retroactiveSeriousIllness;
    }

    /**
     * 获取医疗保险补扣(单位)
     *
     * @return retroactive_medicaler - 医疗保险补扣(单位)
     */
    public String getRetroactiveMedicaler() {
        return retroactiveMedicaler;
    }

    /**
     * 设置医疗保险补扣(单位)
     *
     * @param retroactiveMedicaler 医疗保险补扣(单位)
     */
    public void setRetroactiveMedicaler(String retroactiveMedicaler) {
        this.retroactiveMedicaler = retroactiveMedicaler;
    }

    /**
     * 获取大额医疗补扣(单位)
     *
     * @return retroactive_serious_illnesser - 大额医疗补扣(单位)
     */
    public String getRetroactiveSeriousIllnesser() {
        return retroactiveSeriousIllnesser;
    }

    /**
     * 设置大额医疗补扣(单位)
     *
     * @param retroactiveSeriousIllnesser 大额医疗补扣(单位)
     */
    public void setRetroactiveSeriousIllnesser(String retroactiveSeriousIllnesser) {
        this.retroactiveSeriousIllnesser = retroactiveSeriousIllnesser;
    }

    /**
     * 获取失业保险补扣(个人)
     *
     * @return retroactive_unemployment - 失业保险补扣(个人)
     */
    public String getRetroactiveUnemployment() {
        return retroactiveUnemployment;
    }

    /**
     * 设置失业保险补扣(个人)
     *
     * @param retroactiveUnemployment 失业保险补扣(个人)
     */
    public void setRetroactiveUnemployment(String retroactiveUnemployment) {
        this.retroactiveUnemployment = retroactiveUnemployment;
    }

    /**
     * 获取失业保险补扣(单位)
     *
     * @return retroactive_unemploymenter - 失业保险补扣(单位)
     */
    public String getRetroactiveUnemploymenter() {
        return retroactiveUnemploymenter;
    }

    /**
     * 设置失业保险补扣(单位)
     *
     * @param retroactiveUnemploymenter 失业保险补扣(单位)
     */
    public void setRetroactiveUnemploymenter(String retroactiveUnemploymenter) {
        this.retroactiveUnemploymenter = retroactiveUnemploymenter;
    }

    /**
     * 获取工伤保险补扣(单位)
     *
     * @return retroactive_on_job_injuryer - 工伤保险补扣(单位)
     */
    public String getRetroactiveOnJobInjuryer() {
        return retroactiveOnJobInjuryer;
    }

    /**
     * 设置工伤保险补扣(单位)
     *
     * @param retroactiveOnJobInjuryer 工伤保险补扣(单位)
     */
    public void setRetroactiveOnJobInjuryer(String retroactiveOnJobInjuryer) {
        this.retroactiveOnJobInjuryer = retroactiveOnJobInjuryer;
    }

    /**
     * 获取生育保险补扣(单位)
     *
     * @return retroactive_maternityer - 生育保险补扣(单位)
     */
    public String getRetroactiveMaternityer() {
        return retroactiveMaternityer;
    }

    /**
     * 设置生育保险补扣(单位)
     *
     * @param retroactiveMaternityer 生育保险补扣(单位)
     */
    public void setRetroactiveMaternityer(String retroactiveMaternityer) {
        this.retroactiveMaternityer = retroactiveMaternityer;
    }

    /**
     * 获取住房公积金补扣(个人
     *
     * @return retroactive_housing_fund - 住房公积金补扣(个人
     */
    public String getRetroactiveHousingFund() {
        return retroactiveHousingFund;
    }

    /**
     * 设置住房公积金补扣(个人
     *
     * @param retroactiveHousingFund 住房公积金补扣(个人
     */
    public void setRetroactiveHousingFund(String retroactiveHousingFund) {
        this.retroactiveHousingFund = retroactiveHousingFund;
    }

    /**
     * 获取住房公积金补扣(单位
     *
     * @return housing_fund_er - 住房公积金补扣(单位
     */
    public String getHousingFundEr() {
        return housingFundEr;
    }

    /**
     * 设置住房公积金补扣(单位
     *
     * @param housingFundEr 住房公积金补扣(单位
     */
    public void setHousingFundEr(String housingFundEr) {
        this.housingFundEr = housingFundEr;
    }

    /**
     * 获取大额医疗(个人)
     *
     * @return serious_illness - 大额医疗(个人)
     */
    public String getSeriousIllness() {
        return seriousIllness;
    }

    /**
     * 设置大额医疗(个人)
     *
     * @param seriousIllness 大额医疗(个人)
     */
    public void setSeriousIllness(String seriousIllness) {
        this.seriousIllness = seriousIllness;
    }

    /**
     * 获取大额医疗(单位)
     *
     * @return serious_illnesser - 大额医疗(单位)
     */
    public String getSeriousIllnesser() {
        return seriousIllnesser;
    }

    /**
     * 设置大额医疗(单位)
     *
     * @param seriousIllnesser 大额医疗(单位)
     */
    public void setSeriousIllnesser(String seriousIllnesser) {
        this.seriousIllnesser = seriousIllnesser;
    }

    /**
     * 获取补充医疗(个人)
     *
     * @return medical_supplement - 补充医疗(个人)
     */
    public String getMedicalSupplement() {
        return medicalSupplement;
    }

    /**
     * 设置补充医疗(个人)
     *
     * @param medicalSupplement 补充医疗(个人)
     */
    public void setMedicalSupplement(String medicalSupplement) {
        this.medicalSupplement = medicalSupplement;
    }

    /**
     * 获取补充医疗(单位)
     *
     * @return medical_supplementer - 补充医疗(单位)
     */
    public String getMedicalSupplementer() {
        return medicalSupplementer;
    }

    /**
     * 设置补充医疗(单位)
     *
     * @param medicalSupplementer 补充医疗(单位)
     */
    public void setMedicalSupplementer(String medicalSupplementer) {
        this.medicalSupplementer = medicalSupplementer;
    }

    /**
     * 获取康宁(个人)
     *
     * @return corning_insurance - 康宁(个人)
     */
    public String getCorningInsurance() {
        return corningInsurance;
    }

    /**
     * 设置康宁(个人)
     *
     * @param corningInsurance 康宁(个人)
     */
    public void setCorningInsurance(String corningInsurance) {
        this.corningInsurance = corningInsurance;
    }

    /**
     * 获取康宁(单位)
     *
     * @return corning_insuranceer - 康宁(单位)
     */
    public String getCorningInsuranceer() {
        return corningInsuranceer;
    }

    /**
     * 设置康宁(单位)
     *
     * @param corningInsuranceer 康宁(单位)
     */
    public void setCorningInsuranceer(String corningInsuranceer) {
        this.corningInsuranceer = corningInsuranceer;
    }

    /**
     * 获取意外伤害险(个人)
     *
     * @return accident_insurance - 意外伤害险(个人)
     */
    public String getAccidentInsurance() {
        return accidentInsurance;
    }

    /**
     * 设置意外伤害险(个人)
     *
     * @param accidentInsurance 意外伤害险(个人)
     */
    public void setAccidentInsurance(String accidentInsurance) {
        this.accidentInsurance = accidentInsurance;
    }

    /**
     * 获取月绩效考核系数
     *
     * @return performance_index - 月绩效考核系数
     */
    public String getPerformanceIndex() {
        return performanceIndex;
    }

    /**
     * 设置月绩效考核系数
     *
     * @param performanceIndex 月绩效考核系数
     */
    public void setPerformanceIndex(String performanceIndex) {
        this.performanceIndex = performanceIndex;
    }

    /**
     * 获取单位承担社会保险合计
     *
     * @return total_si_er - 单位承担社会保险合计
     */
    public String getTotalSiEr() {
        return totalSiEr;
    }

    /**
     * 设置单位承担社会保险合计
     *
     * @param totalSiEr 单位承担社会保险合计
     */
    public void setTotalSiEr(String totalSiEr) {
        this.totalSiEr = totalSiEr;
    }

    /**
     * 获取养老保险个人缴费
     *
     * @return pension - 养老保险个人缴费
     */
    public String getPension() {
        return pension;
    }

    /**
     * 设置养老保险个人缴费
     *
     * @param pension 养老保险个人缴费
     */
    public void setPension(String pension) {
        this.pension = pension;
    }

    /**
     * 获取养老保险单位缴费
     *
     * @return pensioner - 养老保险单位缴费
     */
    public String getPensioner() {
        return pensioner;
    }

    /**
     * 设置养老保险单位缴费
     *
     * @param pensioner 养老保险单位缴费
     */
    public void setPensioner(String pensioner) {
        this.pensioner = pensioner;
    }

    /**
     * 获取失业保险个人缴费
     *
     * @return unemployment_insurance - 失业保险个人缴费
     */
    public String getUnemploymentInsurance() {
        return unemploymentInsurance;
    }

    /**
     * 设置失业保险个人缴费
     *
     * @param unemploymentInsurance 失业保险个人缴费
     */
    public void setUnemploymentInsurance(String unemploymentInsurance) {
        this.unemploymentInsurance = unemploymentInsurance;
    }

    /**
     * 获取失业保险单位缴费
     *
     * @return unemploymenter - 失业保险单位缴费
     */
    public String getUnemploymenter() {
        return unemploymenter;
    }

    /**
     * 设置失业保险单位缴费
     *
     * @param unemploymenter 失业保险单位缴费
     */
    public void setUnemploymenter(String unemploymenter) {
        this.unemploymenter = unemploymenter;
    }

    /**
     * 获取医疗保险个人缴费
     *
     * @return medical_care_insurance - 医疗保险个人缴费
     */
    public String getMedicalCareInsurance() {
        return medicalCareInsurance;
    }

    /**
     * 设置医疗保险个人缴费
     *
     * @param medicalCareInsurance 医疗保险个人缴费
     */
    public void setMedicalCareInsurance(String medicalCareInsurance) {
        this.medicalCareInsurance = medicalCareInsurance;
    }

    /**
     * 获取医疗保险单位缴费
     *
     * @return medical_care_er - 医疗保险单位缴费
     */
    public String getMedicalCareEr() {
        return medicalCareEr;
    }

    /**
     * 设置医疗保险单位缴费
     *
     * @param medicalCareEr 医疗保险单位缴费
     */
    public void setMedicalCareEr(String medicalCareEr) {
        this.medicalCareEr = medicalCareEr;
    }

    /**
     * 获取工伤保险单位缴费
     *
     * @return on_job_injury_er - 工伤保险单位缴费
     */
    public String getOnJobInjuryEr() {
        return onJobInjuryEr;
    }

    /**
     * 设置工伤保险单位缴费
     *
     * @param onJobInjuryEr 工伤保险单位缴费
     */
    public void setOnJobInjuryEr(String onJobInjuryEr) {
        this.onJobInjuryEr = onJobInjuryEr;
    }

    /**
     * 获取生育保险单位缴费
     *
     * @return maternityer - 生育保险单位缴费
     */
    public String getMaternityer() {
        return maternityer;
    }

    /**
     * 设置生育保险单位缴费
     *
     * @param maternityer 生育保险单位缴费
     */
    public void setMaternityer(String maternityer) {
        this.maternityer = maternityer;
    }

    /**
     * 获取住房公积金个人缴费
     *
     * @return housing_fund - 住房公积金个人缴费
     */
    public String getHousingFund() {
        return housingFund;
    }

    /**
     * 设置住房公积金个人缴费
     *
     * @param housingFund 住房公积金个人缴费
     */
    public void setHousingFund(String housingFund) {
        this.housingFund = housingFund;
    }

    /**
     * 获取住房公积金单位缴费
     *
     * @return housing_funder - 住房公积金单位缴费
     */
    public String getHousingFunder() {
        return housingFunder;
    }

    /**
     * 设置住房公积金单位缴费
     *
     * @param housingFunder 住房公积金单位缴费
     */
    public void setHousingFunder(String housingFunder) {
        this.housingFunder = housingFunder;
    }

    /**
     * 获取应税工资
     *
     * @return taxable_income - 应税工资
     */
    public String getTaxableIncome() {
        return taxableIncome;
    }

    /**
     * 设置应税工资
     *
     * @param taxableIncome 应税工资
     */
    public void setTaxableIncome(String taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    /**
     * 获取离职补偿金税
     *
     * @return termination_remuneration_tax - 离职补偿金税
     */
    public String getTerminationRemunerationTax() {
        return terminationRemunerationTax;
    }

    /**
     * 设置离职补偿金税
     *
     * @param terminationRemunerationTax 离职补偿金税
     */
    public void setTerminationRemunerationTax(String terminationRemunerationTax) {
        this.terminationRemunerationTax = terminationRemunerationTax;
    }

    /**
     * 获取服务费(公司)
     *
     * @return service_fee - 服务费(公司)
     */
    public String getServiceFee() {
        return serviceFee;
    }

    /**
     * 设置服务费(公司)
     *
     * @param serviceFee 服务费(公司)
     */
    public void setServiceFee(String serviceFee) {
        this.serviceFee = serviceFee;
    }

    /**
     * 获取税前支付
     *
     * @return pre_tax_payment - 税前支付
     */
    public String getPreTaxPayment() {
        return preTaxPayment;
    }

    /**
     * 设置税前支付
     *
     * @param preTaxPayment 税前支付
     */
    public void setPreTaxPayment(String preTaxPayment) {
        this.preTaxPayment = preTaxPayment;
    }

    /**
     * 获取税后扣款
     *
     * @return deduction_after_tax - 税后扣款
     */
    public String getDeductionAfterTax() {
        return deductionAfterTax;
    }

    /**
     * 设置税后扣款
     *
     * @param deductionAfterTax 税后扣款
     */
    public void setDeductionAfterTax(String deductionAfterTax) {
        this.deductionAfterTax = deductionAfterTax;
    }

    /**
     * 获取实得绩效工资
     *
     * @return actual_performance_pay - 实得绩效工资
     */
    public String getActualPerformancePay() {
        return actualPerformancePay;
    }

    /**
     * 设置实得绩效工资
     *
     * @param actualPerformancePay 实得绩效工资
     */
    public void setActualPerformancePay(String actualPerformancePay) {
        this.actualPerformancePay = actualPerformancePay;
    }

    /**
     * 获取应发合计
     *
     * @return pre_tax_income - 应发合计
     */
    public String getPreTaxIncome() {
        return preTaxIncome;
    }

    /**
     * 设置应发合计
     *
     * @param preTaxIncome 应发合计
     */
    public void setPreTaxIncome(String preTaxIncome) {
        this.preTaxIncome = preTaxIncome;
    }

    /**
     * 获取个人所得税
     *
     * @return income_tax - 个人所得税
     */
    public String getIncomeTax() {
        return incomeTax;
    }

    /**
     * 设置个人所得税
     *
     * @param incomeTax 个人所得税
     */
    public void setIncomeTax(String incomeTax) {
        this.incomeTax = incomeTax;
    }

    /**
     * 获取实发工资
     *
     * @return net_income - 实发工资
     */
    public String getNetIncome() {
        return netIncome;
    }

    /**
     * 设置实发工资
     *
     * @param netIncome 实发工资
     */
    public void setNetIncome(String netIncome) {
        this.netIncome = netIncome;
    }

    /**
     * 获取序号
     *
     * @return sequence - 序号
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * 设置序号
     *
     * @param sequence 序号
     */
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    /**
     * 获取合并计税
     *
     * @return merger_tax - 合并计税
     */
    public String getMergerTax() {
        return mergerTax;
    }

    /**
     * 设置合并计税
     *
     * @param mergerTax 合并计税
     */
    public void setMergerTax(String mergerTax) {
        this.mergerTax = mergerTax;
    }

    /**
     * 获取社保支付
     *
     * @return social_insurance - 社保支付
     */
    public String getSocialInsurance() {
        return socialInsurance;
    }

    /**
     * 设置社保支付
     *
     * @param socialInsurance 社保支付
     */
    public void setSocialInsurance(String socialInsurance) {
        this.socialInsurance = socialInsurance;
    }

    /**
     * 获取国籍
     *
     * @return nationality - 国籍
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 设置国籍
     *
     * @param nationality 国籍
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * 获取业务单元名称
     *
     * @return busi_text - 业务单元名称
     */
    public String getBusiText() {
        return busiText;
    }

    /**
     * 设置业务单元名称
     *
     * @param busiText 业务单元名称
     */
    public void setBusiText(String busiText) {
        this.busiText = busiText;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新人
     *
     * @return updator - 更新人
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 设置更新人
     *
     * @param updator 更新人
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取工会经费公司缴费
     *
     * @return labor_union_fund_company_payment - 工会经费公司缴费
     */
    public String getLaborUnionFundCompanyPayment() {
        return laborUnionFundCompanyPayment;
    }

    /**
     * 设置工会经费公司缴费
     *
     * @param laborUnionFundCompanyPayment 工会经费公司缴费
     */
    public void setLaborUnionFundCompanyPayment(String laborUnionFundCompanyPayment) {
        this.laborUnionFundCompanyPayment = laborUnionFundCompanyPayment;
    }

    /**
     * 获取教育金
     *
     * @return education_fund - 教育金
     */
    public String getEducationFund() {
        return educationFund;
    }

    /**
     * 设置教育金
     *
     * @param educationFund 教育金
     */
    public void setEducationFund(String educationFund) {
        this.educationFund = educationFund;
    }

    public String getAccidentInsuranceEr() {
        return accidentInsuranceEr;
    }

    public void setAccidentInsuranceEr(String accidentInsuranceEr) {
        this.accidentInsuranceEr = accidentInsuranceEr;
    }
}