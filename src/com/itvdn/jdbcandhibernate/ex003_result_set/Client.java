package com.itvdn.jdbcandhibernate.ex003_result_set;


public class Client {

    private int id;
    private int age;
    private String name;
    private String phone;

    public Client(int id, int age, String name, String phone) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

}
