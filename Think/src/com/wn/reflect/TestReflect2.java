package com.wn.reflect;

/**
 * 三种实例化对象的方式
 * Created by nengwei on 17/6/18.
 */
public class TestReflect2 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        //一般采用这种方式
        class1 = Class.forName("com.wn.reflect.User");
        class2 = new User(1).getClass();
        class3 = User.class;
        System.out.println("类名称" + class1.getName());
        System.out.println("类名称" + class2.getName());
        System.out.println("类名称" + class3.getName());

    }

}
