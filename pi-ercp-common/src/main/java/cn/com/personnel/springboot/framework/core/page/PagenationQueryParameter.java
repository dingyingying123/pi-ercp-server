package cn.com.personnel.springboot.framework.core.page;

import cn.com.personnel.springboot.framework.core.model.QueryParameter;

/**
 * @author lfjin
 *
 */
public class PagenationQueryParameter extends QueryParameter {
    public final static int DEFAULT_PAGE_SIZE = 10;

    private int             offset;
    private int             limit;

    public PagenationQueryParameter(int offset) {
        this(offset, DEFAULT_PAGE_SIZE);
    }

    public PagenationQueryParameter(int offset, int limit) {
        super();
        this.offset = offset;
        this.limit = limit;
    }

    /**
     * @return the limit
     */
    public int getLimit() {
        return limit;
    }

    /**
     * @return the offset
     */
    public int getOffset() {
        return offset;
    }

    /**
     * @param limit
     *            the limit to set
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * @param offset
     *            the offset to set
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }
}

