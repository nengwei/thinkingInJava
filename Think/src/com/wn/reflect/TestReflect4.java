package com.wn.reflect;

import java.lang.reflect.Constructor;

/**
 * 通过反射机制实例化一个对象
 * Created by nengwei on 17/6/18.
 */
public class TestReflect4 {
    //通过对象获得完整的包名和类名
    public static void main(String[] args) throws Exception {
        Class<?> class1 = Class.forName("com.wn.reflect.User");
        //第一种方法，实例化默认构造方法，调用set赋值
        User user = null;
        user = (User) class1.newInstance();
        user.setId(1);
        user.setName("weineng");
        user.setGender("femail");
        System.out.println("------->" + user.getId() + " -- " + user.getName() + " -- " + user.getGender());

        //第二种方法  获得全部的构造函数 使用构造函数赋值
        Constructor<?> cons[] = class1.getConstructors();
        //查看每个构造函数需要的参数
        for (int i = 0; i < cons.length; i++) {
            //获得构造函数的所有参数
            Class<?> clazzs[] = cons[i].getParameterTypes();
            System.out.print("cons[" + i + "](");
            for (int j = 0; j < clazzs.length; j++) {
                if (j == clazzs.length - 1) {
                    System.out.print(clazzs[j].getName());
                } else {
                    System.out.print(clazzs[j].getName() + ",");
                }
            }
            System.out.println(")");
        }

        //根据构造函数初始化对象
        user = (User) cons[1].newInstance(12);
        System.out.println(user.getId());
        user = (User) cons[2].newInstance(14, "weineng");
        System.out.println(user.getId() + " --" + user.getName());
    }
}
