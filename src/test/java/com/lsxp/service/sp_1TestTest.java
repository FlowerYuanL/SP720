package com.lsxp.service;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import static org.junit.Assert.*;

public class sp_1TestTest {

    @Test
    public void test() {

        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("D:\\java_project\\SP720\\src\\main\\resources\\applicationContext.xml"));

        //方法一：
        //sp_1Test sp1Test = (sp_1Test) beanFactory.getBean("sp_1Test");

        //方法二：
        //sp_1Test sp1Test = beanFactory.getBean(sp_1Test.class);
        //System.out.println(sp1Test);

    }

    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

    }

}