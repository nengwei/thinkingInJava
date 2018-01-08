package com.wn.reflect;

import java.io.Serializable;

/**
 * 用户实体类
 * Created by nengwei on 17/6/18.
 */
public class User implements Serializable {

    private Integer id;
    private String name;
    private String gender;
    public String age;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public User() {
       super();
    }

    public User(Integer id) {
        super();
        this.id = id;
    }

    public User(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public User(Integer id, String name,String gender) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String returnName(){
        return "weineng";
    }

}
