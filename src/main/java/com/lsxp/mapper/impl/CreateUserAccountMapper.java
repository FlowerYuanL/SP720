package com.lsxp.mapper.impl;

import com.lsxp.mapper.UserAccountMapper;
import com.lsxp.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.FactoryBean;

/*构建静态工厂*/
public class CreateUserAccountMapper {

    public static UserAccountMapper getMapper(){
        SqlSession session = MyBatisUtils.getSession();
        return session.getMapper(UserAccountMapper.class);
    }

    public UserAccountMapper createMapper(){

        SqlSession session = MyBatisUtils.getSession();
        return session.getMapper(UserAccountMapper.class);
    }
}
