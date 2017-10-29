package com.wn.reflect;

import java.io.Serializable;

/**
 * 获取一个对象的父类与实现的接口
 * Created by nengwei on 17/6/18.
 */
public class TestReflect3 implements Serializable {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.wn.reflect.User");
        //取得父类
        Class<?> parentClass = clazz.getSuperclass();
        System.out.println("clazz的父类为：" + parentClass.getName());
        //clazz的父类为：java.lang.Object
        //获取所有的接口
        Class<?> intes[] = clazz.getInterfaces();
        System.out.println("clazz实现的接口有：");
        for (int i = 0; i < intes.length; i++) {
            System.out.println((i + 1) + ":" + intes[i].getName());
        }
    }

}
