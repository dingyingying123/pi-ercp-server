package cn.com.personnel.springboot.framework.datatables;

import cn.com.personnel.springboot.framework.core.page.PagenationQueryParameter;

/**
 * @author lfjin
 *
 */
public class DataTableQueryParameter extends PagenationQueryParameter {

    private int draw;

    /**
     * @param offset
     */
    public DataTableQueryParameter(int draw, int offset) {
        super(offset);
    }

    /**
     * @param offset
     * @param limit
     */
    public DataTableQueryParameter(int draw, int offset, int limit) {
        super(offset, limit);
    }

    /**
     * @return the draw
     */
    public int getDraw() {
        return draw;
    }

    /**
     * @param draw
     *            the draw to set
     */
    public void setDraw(int draw) {
        this.draw = draw;
    }

}

