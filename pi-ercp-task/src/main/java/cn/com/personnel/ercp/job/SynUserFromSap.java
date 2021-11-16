package cn.com.personnel.ercp.job;

import cn.com.personnel.ercp.auth.persistence.entity.SecUser;
import cn.com.personnel.ercp.auth.service.ISecUserService;
import cn.com.personnel.ercp.ca.mydbpersistence.entity.ZVHrEmployee;
import cn.com.personnel.ercp.ca.mydbpersistence.mapper.VHrEmployeeMapper;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by 36515 on 2019/8/14.
 */
public class SynUserFromSap implements Job {

    @Autowired
    public VHrEmployeeMapper vHrEmployeeMapper;
    @Autowired
    public ISecUserService secUserService;

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("执行定时任务 定时更新SEC_USER信息");
        logger.info("=============执行定时任务 定时更新SEC_USER信息===============");
//        try {
//            InetAddress address = InetAddress.getLocalHost();
//            String ip = address.getHostAddress();
        // 只有一台服务器执行
//            if ("10.12.7.246".equals(ip)) {

        List<ZVHrEmployee> list = vHrEmployeeMapper.VHrEmployeeAll();

        String id = null;
        if(!CollectionUtils.isEmpty(list)) {
            for(ZVHrEmployee zVHrEmployee :list) {
                //获取id
                id =zVHrEmployee.getPernr();
                //去掉id*前面的0
                String pernr = id.replaceFirst("^0*", "");
                //list.add(zVHrEmployee);
                //pernr = id  去SecUcer筛选id相同的数据
                 SecUser secUser=secUserService.selectByUserId(pernr);
                if(secUser==null){
                    System.out.println("新增"+zVHrEmployee.getEname()+pernr);
                    secUser=new SecUser();
                    secUser.setUserId(pernr);
                    secUser.setUserName(zVHrEmployee.getEname());
                    secUser.setEmail(zVHrEmployee.getZhrEmail());
                    secUser.setTelNo(zVHrEmployee.getZhrCell());
                    secUser.setGovernor("否");
                    secUser.setStatus("有效");
                    secUserService.addUser(secUser);
                }else {
                    System.out.println("更新"+zVHrEmployee.getEname()+pernr);
                    secUser.setUserName(zVHrEmployee.getEname());
                    secUser.setEmail(zVHrEmployee.getZhrEmail());
                    secUser.setTelNo(zVHrEmployee.getZhrCell());
                    secUserService.updateUser(secUser);
                }
            }
        }
        logger.info("=======定时更新SEC_USER条数: "+list.size());
        logger.info("=============定时更新SEC_USER信息定时任务结束===============");
    }
}
