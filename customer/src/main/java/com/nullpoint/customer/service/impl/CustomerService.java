package com.nullpoint.customer.service.impl;

import com.nullpoint.archite.service.BaseService;
import com.nullpoint.customer.domain.bean.Customer;
import com.nullpoint.customer.service.ICustomerService;
import com.nullpoint.customer.vo.CustomerCN;
import org.springframework.stereotype.Service;

/**
 * 客户管理Service接口实现.
 *
 * @author ZhangGe
 * @version v1.0
 * @create 2017年06月17日 14:14
 */
@Service
public class CustomerService extends BaseService<Customer, CustomerCN>
        implements ICustomerService {

}
