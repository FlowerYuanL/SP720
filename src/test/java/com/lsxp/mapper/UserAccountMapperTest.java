package com.lsxp.mapper;

import com.lsxp.pojo.UserAccount;
import com.lsxp.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserAccountMapperTest {

    UserAccountMapper userAccountMapper;
    SqlSession session;
    @Before
    public void setUp() throws Exception {
        session = MyBatisUtils.getSession();
        userAccountMapper = session.getMapper(UserAccountMapper.class);
    }

    @After
    public void tearDown() throws Exception {
        session.close();
    }

    @Test
    public void findPasswordByAccount() {
        String account = "1234";
        String password = userAccountMapper.findPasswordByAccount(account);
        System.out.println("password = "+password);
    }

    @Test
    public void addNewUser() {
        List<UserAccount> userAccounts=new ArrayList<>();
        UserAccount userAccount = new UserAccount();
        userAccount.setAccount("1234");
        userAccount.setPassword("4568");
        UserAccount userAccount1 = new UserAccount();
        userAccount1.setAccount("4567");
        userAccount1.setPassword("6789");
        userAccounts.add(userAccount);
        userAccounts.add(userAccount1);
        userAccountMapper.addNewUser(userAccounts);
        session.commit();
    }
}