package com.yph.mapper;

import com.yph.HelloWorld;
import com.yph.service.InService;
import com.yph.service.impl.InServiceImpl;
import com.yph.utils.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;


public class InDaoTest extends BaseTest {

    private static final Logger logger = LoggerFactory.getLogger(InDaoTest.class);
    @Autowired
    InService inService;

    @Autowired
    HelloWorld helloWorld;

    @Test
    public void testGetBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Map<String, InService> bean = context.getBeansOfType(InService.class);
        InService bean2 = (InService) context.getBean("inService");
        logger.info(String.valueOf(bean2));
        System.out.println(bean.values().iterator().next());
        System.out.println(bean);
    }

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        InService bean = context.getBean(InServiceImpl.class);
        InService bean2 = (InService) context.getBean("inService");
        System.out.println(bean.insert());
        System.out.println(bean2.insert());

    }

    @Test
    public void test1() {
        String insert = inService.insert();
        logger.info(insert);
    }

    @Test
    public void test2() {
        final int count = 2;
        logger.info("Success");
    }

    @Test
    public void test3() {
        String message = helloWorld.getMessage();
        logger.info(message);
    }
}
