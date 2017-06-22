package com.nullpoint.plugin.mybatis.page;

import java.util.Collections;
import java.util.List;

/**
 * 分页信息.
 *
 * @author ZhangGe
 * @version v1.0
 * @create 2017年06月18日 17:16
 */
public class Page<E> {

    /**
     * 当前页码，从1开始.
     */
    private int pageIndex;

    /**
     * 每页显示多少行.
     */
    private int pageSize = 10;

    /**
     * 总共多少条记录.
     */
    private int totalCount;

    /**
     * 总共多少页.
     */
    private int totalPage;

    /**
     * 分业后的数据集合.
     */
    List<E> result = Collections.emptyList();

    /**
     * 开始记录索引，从0开始.
     */
    private int start;

    public int getPageIndex() {
        if (pageIndex <= 0) {
            pageIndex = 1;
        }
        int totalPage = getTotalPage();
        if (pageIndex > totalPage) {
            pageIndex = totalPage;
        }
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return (int)Math.ceil(totalCount * 1.0 / pageSize);
    }

    public int getStart() {
        start = (getPageIndex() - 1) * pageSize;
        if (start < 0) {
            start = 0;
        }
        int totalCount = getTotalCount();
        if (start > totalCount) {
            start = totalCount;
        }
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public List<E> getResult() {
        return result;
    }

    public void setResult(List<E> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", start=" + start +
                '}';
    }
}
