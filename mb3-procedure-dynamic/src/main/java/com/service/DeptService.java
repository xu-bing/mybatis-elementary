package com.service;

import com.entity.Dept;
import com.mapper.DeptMapper;
import com.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

public class DeptService {
    public void createDept(){
        SqlSession session = MyBatisSqlSessionFactory.getSession();


        DeptMapper deptMapper = session.getMapper(DeptMapper.class);

        Dept dept = new Dept();
        dept.setDname("acc");
        dept.setLoc("shanghai");

        deptMapper.createDept(dept);

        session.commit();

        session.close();
    }


    public static void main(String[] args) {
        DeptService d = new DeptService();
        d.createDept();
    }
}
