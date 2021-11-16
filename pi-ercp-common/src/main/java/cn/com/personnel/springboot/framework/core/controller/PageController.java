package cn.com.personnel.springboot.framework.core.controller;

import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;
import cn.com.personnel.springboot.framework.datatables.DataTableQueryParameter;
import cn.com.personnel.springboot.framework.datatables.ServerSideRequest;

/**
 * @author lfjin
 *
 */
public class PageController extends WebController {
    public final static String PARAM_PAGE_NUMBER_KEY = "pageNumber";
    public final static String PARAM_PAGE_SIZE_KEY   = "pageSize";

    /**
     * 初始化分页信息-DataTable
     *
     * @return
     */
    public DataTableQueryParameter buildDataTablePagenation() {
        DataTableQueryParameter queryParameter = ServerSideRequest.instance(request).getQueryParameter();
        return queryParameter;
    }

    /**
     * 初始化分页信息
     *
     * @return
     */
    public PagenationQueryParameter buildPagenation() {
        int page = 1; // 页号
        int pageSize = -1; // 每页数据条数
        if (request.getParameter(PARAM_PAGE_NUMBER_KEY) != null) {
            try {
                page = Integer.parseInt(request.getParameter(PARAM_PAGE_NUMBER_KEY));
            } catch (Exception e) {
            }
        }
        if (request.getParameter(PARAM_PAGE_SIZE_KEY) != null) {
            try {
                pageSize = Integer.parseInt(request.getParameter(PARAM_PAGE_SIZE_KEY));
            } catch (Exception e) {
            }
        }
        PagenationQueryParameter queryParameter = null;
        if(pageSize>0) {
            queryParameter = new PagenationQueryParameter(page, pageSize);
        }

        return queryParameter;
    }

}