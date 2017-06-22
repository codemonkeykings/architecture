package com.nullpoint.plugin.mybatis;

import com.nullpoint.plugin.mybatis.page.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 基础Mapper接口.
 *
 * @author ZhangGe
 * @version v1.0
 * @create 2017年06月18日 23:27
 */
public interface BaseMapper<E, Q> {

    /**
     * 通过ID查询记录.
     *
     * @param id  主键ID
     * @return  单条记录
     */
    E findById(Long id);

    /**
     * 查询表中所有记录.
     *
     * @return  所有记录集合
     */
    List<E> findAll();

    /**
     * 根据codition条件查询记录.
     *
     * @param condition  查询条件
     * @return  符合条件的记录集合
     */
    List<E> findByCodition(Q condition);

    /**
     * 根据条件查询并分页.
     *
     * @param page
     * @param condition
     * @return
     */
    List<E> findByPage(@Param("page") Page<E> page, @Param("cd") Q condition);

    /**
     * 保存一条记录.
     *
     * @param entity  记录实体
     */
    void save(E entity);

    /**
     * 根据ID删除一条记录.
     *
     * @param id  主键ID
     */
    void delete(Long id);

    /**
     * 根据条件删除记录.
     *
     * @param codition  删除条件
     */
    void deleteByCodition(Q codition);

    /**
     * 根据主键ID更新一条记录.
     *
     * @param id  主键ID
     * @param codition  更新信息
     */
    void update(@Param("id") Long id, @Param("cd") Q codition);

}
