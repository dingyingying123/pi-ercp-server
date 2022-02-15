package cn.com.personnel.ercp.pi.persistence.mapper.child;

import cn.com.personnel.ercp.pi.persistence.entity.child.PiAddress;
import cn.com.personnel.springboot.framework.core.persistence.BaseMapper;

import java.util.List;

public interface PiAddressMapper extends BaseMapper<PiAddress> {
    List<PiAddress> queryAddressList(PiAddress piAddress);
}