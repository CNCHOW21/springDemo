package com.lz.anno;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private String sex;
    private String address;
    private String home;

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
}
