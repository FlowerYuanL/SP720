package com.lsxp;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringTest {

    @Test
    public void testSpring() {

        /*1.获取Spring容器*/
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /*2.从Spring容器获取对象*/
        HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");

        /*3.调用对象的方法*/
        helloSpring.show();
    }
}