package com.wn.reflect;

import java.lang.reflect.Method;

/**
 * 通过反射机制调用某个类的方法
 * Created by nengwei on 17/6/18.
 */
public class TestReflect7 {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.wn.reflect.TestReflect7");
        //调用TestReflect类中的reflect方法
        Method method = clazz.getMethod("test");
        method.invoke(clazz.newInstance());
        Method method1 = clazz.getMethod("test2", int.class, String.class);
        method1.invoke(clazz.newInstance(), 20, "weineng");
    }

    public void test() {
        System.out.println("Java 反射机制 － 调用某个类的方法");
    }

    public void test2(int age, String name) {
        System.out.println("Java反射机制 － 调用某个类的方法1");
        System.out.println("age--->" + age + "||||||name---->" + name);
    }


}
