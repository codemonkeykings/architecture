package com.nullpoint.customer;/*
 * com.nullpoint.customer.SpringTxTestCase.java
 * Copyright: Copyright Tsingsoft (c) 2014
 * 北京清软创新科技股份有限公司
 */

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @TransactionConfiguration(transactionManager="transactionManager",defaultRollback=true) .
 * 
 * <pre>
 * transactionManager的默认取值是"transactionManager"，
 * defaultRollback的默认取值是true，当然，你也可以改成false。
 * true表示测试不会对数据库造成污染,false的话当然就会改动到数据库中了。
 * 在方法名上添加@Rollback(false)表示这个测试用例不需要回滚。
 * </pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/applicationContext.xml"})
public class SpringTxTestCase {
    /** 子类继承日志实例，无需手动添加日志代码. */
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
}
