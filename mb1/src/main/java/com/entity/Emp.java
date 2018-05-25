package com.entity;

import java.util.Date;

public class Emp {
    private Integer empno;
    private String ename;
    private String job;
    private  Double sal;
    private Date hiredate;

    public Emp() {
    }

    public Emp(Integer empno, String ename, String job, Double sal, Date hiredate) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.hiredate = hiredate;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
}
