package com.nullpoint.customer.domain.mapper;

import com.nullpoint.customer.SpringTxTestCase;
import com.nullpoint.customer.domain.bean.Customer;
import com.nullpoint.customer.vo.CustomerCN;
import com.nullpoint.plugin.mybatis.page.Page;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * 一句话功能简述.
 * <pre>
 * 功能详细描述
 * </pre>
 *
 * @author ZhangGe
 * @version v1.0
 * @create 2017年06月18日 14:33
 */

public class CustomerMapperTest extends SpringTxTestCase {

    @Autowired
    private CustomerMapper mapper;

    @Test
    public void testFindAll() {
        Customer entity = new Customer();
        entity.setIdentify("zhanggeoo7");
        entity.setPassword("123456");
        entity.setShowName("nullpoint");
        entity.setRealName("张葛");
        entity.setRegisterTime(new Date());
        //mapper.save(entity);
        List<Customer> list = mapper.findAll();
        System.out.println(list);

        List<Customer> list1 = mapper.findAll();
        System.out.println(list1);
    }

    @Test
    public void testFindAllPage() {
        Page<Customer> page = new Page<Customer>();
        page.setPageIndex(1);
        page.setPageSize(2);
        CustomerCN condition = new CustomerCN();
        condition.setShowName("zhanggeoo7");
        List<Customer> list = mapper.findByPage(page, condition);
        System.out.println(list);
    }
}
