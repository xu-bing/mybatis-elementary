package com.dao;

import com.entity.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class EmpDao {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }    // static

    public void  queryAllEmps(){
        SqlSession session = sqlSessionFactory.openSession();

        List<Emp> empList = session.selectList("queryAllEmps");

        for (Emp emp :
                empList) {
            System.out.println(emp.getEmpno() + "::" + emp.getEname());
        }

        session.close();
    }

    public static void main(String[] args) {
        EmpDao empDao = new EmpDao();
        empDao.queryAllEmps();
    }
}

