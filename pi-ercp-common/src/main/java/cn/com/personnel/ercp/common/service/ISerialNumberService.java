/**
 * Copyright 2017 Goldwind Science & Technology.
 * All rights reserved. GOLDWIND PROPRIETARY/CONFIDENTIAL. 
 * Use is subject to license terms.
 */
package cn.com.personnel.ercp.common.service;

/**
 * @author 33925
 *
 */
public interface ISerialNumberService {
    
    public String getDateSerialNum(int len, String type, int step);

    public String getDateSerialNum(int len, String type, Integer the_year, int step);

    public String getDateSerialNum(int len, String type, Integer the_year, Integer the_month, int step) ;

    /**
     * 获取年月日序列号
     * 
     * @param len
     *            序列号的长度
     * @param type
     *            类型， 一般使用表名
     * @param the_year
     * @param the_month
     * @param the_day
     * @param step
     * @return
     */
    public String getDateSerialNum(int len, String type, Integer the_year, Integer the_month, Integer the_day, int step) ;
    
    
    public String getItemStrNo(int lenth, int itemNum) ;
}
