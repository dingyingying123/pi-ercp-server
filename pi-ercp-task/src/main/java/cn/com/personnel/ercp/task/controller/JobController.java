package cn.com.personnel.ercp.task.controller;

import cn.com.personnel.ercp.task.module.QuartzEntity;
import cn.com.personnel.ercp.task.persistence.entiy.QrtzExecuteLog;
import cn.com.personnel.ercp.task.service.IJobDetailService;
import cn.com.personnel.springboot.framework.core.controller.PageController;
import com.github.pagehelper.PageInfo;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("job/jobManager")
public class JobController extends PageController{
	 @Autowired
	 private Scheduler scheduler;

	 @Autowired
	 private IJobDetailService jobDetailService;
	 
	 /**
     * 初始化方法
     */
    @RequestMapping("/init")
    public String init(HttpServletRequest request) {
    	return "/job/job_config";
    }
    
	 /**
     * 日志初始化方法
     */
    @RequestMapping("/initLog")
    public String initLog(HttpServletRequest request) {
    	return "/job/job_log";
    }
    
    
    /**
     * 获取日志
     * 
     * @return
     */
    @RequestMapping(value = "/getJobLog", method = RequestMethod.POST)
    @ResponseBody
    public PageInfo<QrtzExecuteLog> getJobLog(Model model, @RequestBody QrtzExecuteLog logParam) {
         return new PageInfo<QrtzExecuteLog>( jobDetailService.getQrtzLog(logParam, buildPagenation()));
    }

    /**
     * 获取列表
     * 
     * @return
     */
    @RequestMapping(value = "/getJobTask", method = RequestMethod.POST)
    @ResponseBody
    public PageInfo<QuartzEntity> getProduct() {
        try {
            return new PageInfo<QuartzEntity>( jobDetailService.listQuartzEntity("", buildPagenation()));
        } catch (Exception ex) {
        	 return null;
        }
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> save(@RequestBody QuartzEntity quartz) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            // 如果是修改 展示旧的 任务
            if (quartz.getOldJobGroup() != null) {
                JobKey key = new JobKey(quartz.getOldJobName(), quartz.getOldJobGroup());
                scheduler.deleteJob(key);
            }
            Class cls = Class.forName(quartz.getJobClassName());
            cls.newInstance();
            // 构建job信息

            JobDetail job = JobBuilder.newJob(cls).withIdentity(quartz.getJobName(), quartz.getJobGroup())
                    .usingJobData("data", quartz.getJobJsonData()).withDescription(quartz.getDescription()).build();
            // 触发时间点
            CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(quartz.getCronExpression());
            cronScheduleBuilder.withMisfireHandlingInstructionDoNothing();//设置misfire策略
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("trigger" + quartz.getJobName(), quartz.getJobGroup()).startNow()
                    .withSchedule(cronScheduleBuilder).build();
            // 交由Scheduler安排触发
            scheduler.scheduleJob(job, trigger);
            map.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
        }
        return map;
    }

    @PostMapping("/trigger")
    @ResponseBody
    public Map<String, Object> trigger(@RequestBody QuartzEntity quartz) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            JobKey key = new JobKey(quartz.getJobName(), quartz.getJobGroup());
            scheduler.triggerJob(key);
            map.put("success", true);
        } catch (SchedulerException e) {
            e.printStackTrace();
            map.put("success", false);
        }
        return map;
    }

    @RequestMapping(value = "/pause", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> pause(@RequestBody QuartzEntity quartz) {
 
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            JobKey key = new JobKey(quartz.getJobName(), quartz.getJobGroup());
            scheduler.pauseJob(key);
            map.put("success", true);
        } catch (SchedulerException e) {
            e.printStackTrace();
            map.put("success", false);
        }
        return map;
    }

    @PostMapping("/resume")
    @ResponseBody
    public Map<String, Object> resume(@RequestBody QuartzEntity quartz) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            JobKey key = new JobKey(quartz.getJobName(), quartz.getJobGroup());
            scheduler.resumeJob(key);
            map.put("success", true);
        } catch (SchedulerException e) {
            e.printStackTrace();
            map.put("success", false);
        }
        return map;
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> remove(@RequestBody QuartzEntity quartz) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            TriggerKey triggerKey = TriggerKey.triggerKey(quartz.getJobName(), quartz.getJobGroup());
            // 停止触发器
            scheduler.pauseTrigger(triggerKey);
            // 移除触发器
            scheduler.unscheduleJob(triggerKey);
            // 删除任务
            scheduler.deleteJob(JobKey.jobKey(quartz.getJobName(), quartz.getJobGroup()));
            System.out.println("removeJob:" + JobKey.jobKey(quartz.getJobName()));
            map.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
        }
        return map;
    }
}
