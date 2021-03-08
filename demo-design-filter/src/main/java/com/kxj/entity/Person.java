package com.kxj.entity;

/**
 * @author xiangjin.kong
 * @date 2021/3/8 16:33
 */
public class Person {

    /**
     *
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String gender;


    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Person [name=" + name + ", gender=" + gender + "]";
    }


}
