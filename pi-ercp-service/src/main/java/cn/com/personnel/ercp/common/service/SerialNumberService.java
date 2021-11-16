/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.service;

import cn.com.personnel.ercp.common.persistence.entity.SerialNumberDate;
import cn.com.personnel.ercp.common.persistence.mapper.SerialNumberDateMapper;
import cn.com.personnel.ercp.framework.config.ApplicationConfig;
import cn.com.personnel.ercp.framework.kit.UUIDKit;
import cn.com.personnel.springboot.framework.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 33925
 *
 */
@Component
public class SerialNumberService  extends BaseService implements ISerialNumberService {

    @Autowired
    private SerialNumberDateMapper serialNumberDateMapper;
    
    /* (non-Javadoc)
     * @see cn.com.personnel.ercp.common.service.ISerialNumberService#getDateSerialNum(int, java.lang.String, int)
     */
    @Override
    public String getDateSerialNum(int len, String type, int step) {
        return getDateSerialNum(len, type, null, null, null, step);
    }

    /* (non-Javadoc)
     * @see cn.com.personnel.ercp.common.service.ISerialNumberService#getDateSerialNum(int, java.lang.String, java.lang.Integer, int)
     */
    @Override
    public String getDateSerialNum(int len, String type, Integer the_year, int step) {
        return getDateSerialNum(len, type, the_year, null, null, step);
    }

    /* (non-Javadoc)
     * @see cn.com.personnel.ercp.common.service.ISerialNumberService#getDateSerialNum(int, java.lang.String, java.lang.Integer, java.lang.Integer, int)
     */
    @Override
    public String getDateSerialNum(int len, String type, Integer the_year, Integer the_month, int step) {
        return getDateSerialNum(len, type, the_year, the_month, null, step);
    }

    /* (non-Javadoc)
     * @see cn.com.personnel.ercp.common.service.ISerialNumberService#getDateSerialNum(int, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, int)
     */
    @Override
    public String getDateSerialNum(int len, String type, Integer the_year, Integer the_month, Integer the_day,
            int step) {
        
        SerialNumberDate serialNumberDate = new SerialNumberDate();
        serialNumberDate.setAppcode(ApplicationConfig.APP_CODE);
        serialNumberDate.setSerialtype(type);
        serialNumberDate.setTheYear(the_year);
        if(the_month!=null) {
            serialNumberDate.setTheMonth(the_month.shortValue());
        }
        
        if(the_day!=null) {
            serialNumberDate.setTheDay(the_day.shortValue());
        }
        
        SerialNumberDate result  = serialNumberDateMapper.selectOne(serialNumberDate);
        int serialNum =1;
        if(result==null) {
            serialNumberDate.setId(UUIDKit.getUUID());
            serialNumberDate.setSerialNum(serialNum);
            //添加第一条数据
            serialNumberDateMapper.insert(serialNumberDate);
        }else {
            serialNum = result.getSerialNum() +1;
            result.setSerialNum(serialNum);
            serialNumberDateMapper.updateByPrimaryKeySelective(result);
        }

        //日期格式yyMMdd
        String datastr = "";
        if (the_day != null) {
            if (the_day >= 10) {
                datastr = datastr + the_day;
            } else {
                datastr = datastr + "0" + the_day;
            }
        }

        if (the_month != null) {
            if (the_month >= 10) {
                datastr = the_month + datastr;
            } else {
                datastr = "0" + the_month + datastr;
            }
        }

        if (the_year != null) {
            datastr = the_year + datastr;
            datastr = datastr.substring(2, datastr.length());
        }

        int zlen = len - datastr.length();
        String snoStr = getItemStrNo(zlen, serialNum);
        return datastr+snoStr;
    }

    
    public String getItemStrNo(int lenth,int itemNum) {
        String priex = "000000";
        int itemNoLen = (itemNum+"").length();
        String result = "XJ" + priex.substring(0, lenth-itemNoLen) + itemNum;
        return result;
    }
    
}
