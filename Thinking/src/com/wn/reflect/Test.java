package com.wn.reflect;

import java.lang.reflect.Constructor;

/**
 * Created by nengwei on 17/6/18.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.wn.reflect.User");
        Constructor<?> cons[] = clazz.getConstructors();
        for (int i = 0; i < cons.length; i++) {
            System.out.println(cons[i]);
        }
        User user = null;
        user = (User) cons[1].newInstance(14);
        System.out.println(user.getId());
    }

}
