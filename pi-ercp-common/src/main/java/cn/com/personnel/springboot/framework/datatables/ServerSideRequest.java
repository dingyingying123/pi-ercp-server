package cn.com.personnel.springboot.framework.datatables;

import cn.com.personnel.springboot.framework.kit.StrKit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lfjin
 *
 */
public class ServerSideRequest implements Serializable {
    private static final long  serialVersionUID             = 3054912713211154614L;

    public static final String COLUMNS_DATA_PATTERN         = "columns[{0}][data]";
    public static final String COLUMNS_NAME_PATTERN         = "columns[{0}][name]";
    public static final String COLUMNS_SEARCHABLE_PATTERN   = "columns[{0}][searchable]";
    public static final String COLUMNS_ORDERABLE_PATTERN    = "columns[{0}][orderable]";
    public static final String COLUMNS_SEARCH_VALUE_PATTERN = "columns[{0}][search][value]";
    public static final String COLUMNS_SEARCH_REGEX_PATTERN = "columns[{0}][search][regex]";

    public static final String ORDER_COLUMN_PATTERN         = "order[{0}][column]";
    public static final String ORDER_DIR_PATTERN            = "order[{0}][dir]";

    public static final String PARAM_NAME_DRAW              = "draw";
    public static final String PARAM_NAME_START             = "start";
    public static final String PARAM_NAME_LENGTH            = "length";
    public static final String PARAM_NAME_SEARCHVALUE       = "search[value]";
    public static final String PARAM_NAME_SEARCHREGEX       = "search[regex]";

    public static ServerSideRequest instance(HttpServletRequest request) {
        ServerSideRequest me = new ServerSideRequest();

        String drawString = request.getParameter(PARAM_NAME_DRAW);
        if (StrKit.notBlank(drawString)) {
            me.draw = Integer.parseInt(drawString);
        }
        String startString = request.getParameter(PARAM_NAME_START);
        if (StrKit.notBlank(startString)) {
            me.start = Integer.parseInt(startString);
        }
        String lengthString = request.getParameter(PARAM_NAME_LENGTH);
        if (StrKit.notBlank(lengthString)) {
            me.length = Integer.parseInt(lengthString);
        }
        String searchValueString = request.getParameter(PARAM_NAME_SEARCHVALUE);
        String searchRegexString = request.getParameter(PARAM_NAME_SEARCHREGEX);
        me.searchRegex = Boolean.parseBoolean(searchRegexString);

        me.parseColumns(request);
        me.parseOrder(request);

        if (StrKit.notBlank(searchValueString)) {
            me.searchValue = searchValueString;
            for (Column col : me.columns) {
                if (StrKit.notBlank(col.getData(), col.getName())) {
                    me.columnsSearchValues.putIfAbsent(col.getName() == null ? col.getData() : col.getName(),
                            searchValueString);
                }
            }
        }

        return me;
    }

    protected final Logger      logger              = LoggerFactory.getLogger(this.getClass());

    private int                 draw;                                                          // draw

    private int                 start;                                                         // start
    private int                 length;                                                        // length
    private String              searchValue;                                                   // search[value]
    private boolean             searchRegex;                                                   // search[regex]
    private Map<String, String> columnsSearchValues = new HashMap<String, String>();
    private List<Column>        columns             = new ArrayList<Column>();
    private List<String>        orders              = new ArrayList<String>();

    /**
     * @return the columns
     */
    public List<Column> getColumns() {
        return columns;
    }

    /**
     * @return the columnsSearchValues
     */
    public Map<String, String> getColumnsSearchValues() {
        return columnsSearchValues;
    }

    /**
     * @return the draw
     */
    public int getDraw() {
        return draw;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @return the order
     */
    public List<String> getOrders() {
        return orders;
    }

    public DataTableQueryParameter getQueryParameter() {
        DataTableQueryParameter query = new DataTableQueryParameter(draw, start, length);

        query.getParams().putAll(columnsSearchValues);
        query.setSortColumns(StrKit.join(orders, ","));

        return query;
    }

    /**
     * @return the searchValue
     */
    public String getSearchValue() {
        return searchValue;
    }

    /**
     * @return the start
     */
    public int getStart() {
        return start;
    }

    /**
     * @return the searchRegex
     */
    public boolean isSearchRegex() {
        return searchRegex;
    }

    protected ServerSideRequest parseColumns(HttpServletRequest request) {

        Map parameterMap = request.getParameterMap();
        int i = 0;
        while (true) {
            String colDate = MessageFormat.format(COLUMNS_DATA_PATTERN, i);
            String colName = MessageFormat.format(COLUMNS_NAME_PATTERN, i);
            String colSearchable = MessageFormat.format(COLUMNS_SEARCHABLE_PATTERN, i);
            String colOrderable = MessageFormat.format(COLUMNS_ORDERABLE_PATTERN, i);

            String colSearchValue = MessageFormat.format(COLUMNS_SEARCH_VALUE_PATTERN, i);
            // String colOrderable =
            // MessageFormat.format(COLUMNS_SEARCH_REGEX_PATTERN, i);
            if (!parameterMap.containsKey(colDate)) {
                break;
            }

            Column col = new Column();
            col.setIndex(i);
            col.setData(request.getParameter(colDate));
            col.setName(request.getParameter(colName));
            col.setOrderable(Boolean.parseBoolean(request.getParameter(colOrderable)));
            col.setSearchable(Boolean.parseBoolean(request.getParameter(colSearchable)));

            columns.add(col);

            String searchValue = request.getParameter(colSearchValue);
            if (StrKit.notBlank(searchValue)) {
                if (StrKit.notBlank(colDate, colName)) {
                    columnsSearchValues.put(colName == null ? colDate : colName, searchValue);
                } else {
                    logger.warn("This a column search value {0} but not specific with column[{1}][name] or column[{2}][date]",
                            searchValue, i, i);
                }
            }

            i++;
        }

        return this;
    }

    protected ServerSideRequest parseOrder(HttpServletRequest request) {

        Map parameterMap = request.getParameterMap();
        int i = 0;
        while (true) {
            String orderColumn = MessageFormat.format(ORDER_COLUMN_PATTERN, i);
            String orderDir = MessageFormat.format(ORDER_DIR_PATTERN, i);

            if (!parameterMap.containsKey(orderColumn)) {
                break;
            }

            String order = request.getParameter(orderColumn);
            if (StrKit.notBlank(order)) {
                int orderIndex = Integer.parseInt(order);
                if (orderIndex < columns.size()) {
                    Column col = columns.get(orderIndex);
                    if (StrKit.notBlank(col.getData(), col.getName())) {
                        String dir = request.getParameter(orderDir);
                        if (StrKit.isBlank(dir)) {
                            dir = "asc";
                        }

                        orders.add((col.getName() == null ? col.getData() : col.getName()) + " " + dir);
                    } else {
                        logger.warn("This a column order order[{0}][column]={1} but not specific with column[{2}][name] or column[{3}][date]",
                                searchValue, order, i, i);
                    }
                }
            }

            i++;
        }

        return this;
    }
}

