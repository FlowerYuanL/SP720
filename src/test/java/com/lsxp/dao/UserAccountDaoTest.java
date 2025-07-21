package com.lsxp.dao;

import com.lsxp.dao.impl.UserAccountDaoImpl;
import com.lsxp.service.UserAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserAccountDaoTest {

    @Test
    public void getPassword() {
        ApplicationContext apc = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserAccountDao service = (UserAccountDao) apc.getBean("UserAccountDao");
        String testAccount = "123";
        String testPassword = service.getPassword(testAccount);
        System.out.println("testAccount: " + testAccount+", testPassword: " + testPassword);
    }
}