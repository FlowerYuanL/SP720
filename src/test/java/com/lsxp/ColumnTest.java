package com.lsxp;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class ColumnTest {

    @Test
    public void testToString() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Column c = (Column)ac.getBean("Column");
        System.out.println(c.toString());
    }
}