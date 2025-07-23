package com.lsxp.mapper;

import com.lsxp.mapper.impl.CreateUserAccountMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class getMapperTest {

    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserAccountMapper userAccountMapper = (UserAccountMapper) ac.getBean("userAccountMapper");
        String password = userAccountMapper.findPasswordByAccount("123");
        System.out.println(password);
    }

    @Test
    public void test2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserAccountMapper userAccountMapper = (UserAccountMapper) ac.getBean("userAccountMapperQ");
        String password = userAccountMapper.findPasswordByAccount("123");
        System.out.println(password);
    }

    @Test
    public void test3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserAccountMapper userAccountMapper = (UserAccountMapper) ac.getBean("userAccountMapperQQ");
        String password = userAccountMapper.findPasswordByAccount("123");
        System.out.println(password);
    }
}