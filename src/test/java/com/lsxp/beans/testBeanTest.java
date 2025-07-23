package com.lsxp.beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class testBeanTest {

    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        testBean bean = (testBean) ac.getBean("testBean");
        System.out.println(bean);
    }
}