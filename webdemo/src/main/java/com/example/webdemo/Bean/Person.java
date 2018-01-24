package com.example.webdemo.Bean;

/**
 * @Author :Luke
 * @Description:
 * @Date : Created in 11:05 2018/1/19
 * @Modified By:
 */
public class Person {

    private String name;
    private Integer age;

    public Person(){
        super();
    }
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
