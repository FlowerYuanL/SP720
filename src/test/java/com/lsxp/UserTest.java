package com.lsxp;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testUser(){

        //获取Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从Spring容器中获取对象
        User user = (User)context.getBean("User");
        //通过构造方法注入依赖
        System.out.println("user = " + user);
    }

}