package com.lsxp.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserAccountServiceTest {

    @Test
    public void login() {
        String testAccount = "123";
        String testPassword = "456";
        ApplicationContext apc = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserAccountService userAccountService = (UserAccountService) apc.getBean("userAccountService");
        Boolean loginResult = userAccountService.login(testAccount, testPassword);
        System.out.println("Login result: " + loginResult);
    }
}