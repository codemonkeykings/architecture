package com.nullpoint.archite.service;

import com.nullpoint.plugin.mybatis.BaseMapper;
import com.nullpoint.plugin.mybatis.page.Page;

import java.util.List;

/**
 * 一句话功能简述.
 * <pre>
 * 功能详细描述
 * </pre>
 *
 * @author ZhangGe
 * @version v1.0
 * @create 2017年06月19日 0:22
 */
public interface IBaseService<E, Q> {

    List<E> fetchAll();

    E fetchById(Long id);

    List<E> fetchByCodition(Q condition);

    Page<E> fetchByPage(Page<E> page, Q condition);

    void setMapper(BaseMapper<E, Q> mapper);
}
