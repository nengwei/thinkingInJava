package com.wn.reflect;

/**
 * 通过对象获得完整的包名和类名
 * Created by nengwei on 17/6/18.
 */
public class TestReflect {

    public static void main(String[] args) {
        User user = new User(1);
        System.out.println(user.getClass().getName());
    }

}
