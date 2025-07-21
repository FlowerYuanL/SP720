package com.lsxp.dao.impl;

import com.lsxp.dao.UserAccountDao;
import com.lsxp.mapper.UserAccountMapper;
import com.lsxp.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

public class UserAccountDaoImpl implements UserAccountDao {

    @Override
    public String getPassword(String account) {
        System.out.println("account = " + account);
        SqlSession session = MyBatisUtils.getSession();
        UserAccountMapper userAccountMapper = session.getMapper(UserAccountMapper.class);
        String realPassword = userAccountMapper.findPasswordByAccount(account);
        System.out.println("realPassword = "+realPassword);
        return realPassword;
    }
}
