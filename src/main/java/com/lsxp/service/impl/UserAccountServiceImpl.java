package com.lsxp.service.impl;


import com.lsxp.mapper.UserAccountMapper;
import com.lsxp.service.UserAccountService;

import lombok.Setter;



public class UserAccountServiceImpl implements UserAccountService {

    /*setter注入*/
    @Setter
    private UserAccountMapper userAccountMapper;

    @Override
    public boolean login(String account, String password) {
        String realPassword = userAccountMapper.findPasswordByAccount(account);
        if (realPassword == null || realPassword.isEmpty()){
            System.out.println("Account does not exist");
            return false;
        } else if (realPassword.equals(password)) {
            System.out.println("Login successfully");
            return true;
        }else {
            System.out.println("Wrong password");
            return false;
        }
    }
}
