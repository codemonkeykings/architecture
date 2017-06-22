package com.nullpoint.archite.service;

import com.nullpoint.plugin.mybatis.BaseMapper;
import com.nullpoint.plugin.mybatis.page.Page;

import java.util.List;

/**
 * 基础Service实现.
 *
 * @author ZhangGe
 * @version v1.0
 * @create 2017年06月18日 23:48
 */
public class BaseService<E, Q> implements IBaseService<E, Q> {

    private BaseMapper<E, Q> mapper;

    public List<E> fetchAll() {
        return mapper.findAll();
    }

    public E fetchById(Long id) {
        return mapper.findById(id);
    }

    public List<E> fetchByCodition(Q condition) {
        return mapper.findByCodition(condition);
    }

    public Page<E> fetchByPage(Page<E> page, Q condition) {
        List<E> result = mapper.findByPage(page, condition);
        page.setResult(result);
        return page;
    }

    public void setMapper(BaseMapper mapper) {
        this.mapper = mapper;
    }

}
