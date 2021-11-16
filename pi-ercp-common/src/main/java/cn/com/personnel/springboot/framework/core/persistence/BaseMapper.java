package cn.com.personnel.springboot.framework.core.persistence;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.rowbounds.SelectByConditionRowBoundsMapper;

/**
 * @author lfjin
 * @param <T>
 *
 */
public interface BaseMapper<T> extends Mapper<T>, SelectByConditionRowBoundsMapper<T> {

}