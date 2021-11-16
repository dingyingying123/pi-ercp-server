package cn.com.personnel.springboot.framework.core.controller;

import cn.com.personnel.springboot.framework.core.service.IService;
import cn.com.personnel.springboot.framework.kit.Reflect;
import cn.com.personnel.springboot.framework.kit.ReflectException;

/**
 * @author lfjin
 *
 */
public abstract class BusinessController extends BaseController {

    public <T> T excute(IService service, String methode, Object... params) {
        try {
            Reflect serviceRef = Reflect.on(service);
            Reflect ret = serviceRef.call(methode, params);
            return ret.get();
        } catch (ReflectException e) {
            onException(e);
        }

        return null;
    }

    abstract public Object onException(Exception e);
}