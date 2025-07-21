package com.lsxp.mapper;

import com.lsxp.pojo.UserAccount;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserAccountMapper {

    @Select("select password from user_account where account = #{account}")
    public String findPasswordByAccount(String account);

    public void addNewUser(List<UserAccount> userAccounts);
}
