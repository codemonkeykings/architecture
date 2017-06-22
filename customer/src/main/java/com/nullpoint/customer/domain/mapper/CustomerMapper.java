package com.nullpoint.customer.domain.mapper;

import com.nullpoint.customer.domain.bean.Customer;
import com.nullpoint.customer.vo.CustomerCN;
import com.nullpoint.plugin.mybatis.BaseMapper;
import org.springframework.stereotype.Repository;


/**
 * 客户实体Mapper接口.
 *
 * @author ZhangGe
 * @version v1.0
 * @create 2017年06月18日 11:59
 */
@Repository
public interface CustomerMapper extends BaseMapper<Customer, CustomerCN> {

}
