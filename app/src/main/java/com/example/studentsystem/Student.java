package com.example.studentsystem;

import org.litepal.crud.DataSupport;

/**
 * Created by 木头人 on 2018/3/18.
 */

public class Student extends DataSupport{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private int id;

    private long number;//学号

    private String name;//姓名

    private String  sex;//性别
}
