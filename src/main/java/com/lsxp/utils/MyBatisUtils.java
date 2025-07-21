package com.lsxp.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisUtils {

    private static SqlSessionFactory sqlSessionFactory;
    static{
        Reader rd = null;
        try {
            rd = Resources.getResourceAsReader("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(rd);
    }
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}
