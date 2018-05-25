package com.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class MyBatisSqlSessionFactory {
    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        try {
//            Reader reader = Resources.getResourceAsReader("myatis/mybatis-config.xml");
            InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }  // static

    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}
