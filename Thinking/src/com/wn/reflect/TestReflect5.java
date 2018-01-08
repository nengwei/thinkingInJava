package com.wn.reflect;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 获得某个类的全部属性
 * Created by nengwei on 17/6/18.
 */
public class TestReflect5 implements Serializable {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.wn.reflect.User");
        System.out.println(">>>>>>>>>>>>>>>>>>本类属性");
        //获得类的全部属性
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            //权限修饰符
            int mo = fields[i].getModifiers();
            //获取修饰符
            String priv = Modifier.toString(mo);
            //属性类型
            Class<?> type = fields[i].getType();
            System.out.println(priv + " " + type.getName() + " " + fields[i].getName() + ";");
        }

        System.out.println(">>>>>>>>>>>>>>>>实现的接口或者父类的属性");
        //取得实现的接口或者父类的属性
        Field[] fields1 = clazz.getFields();
        for (int j = 0; j < fields1.length; j++) {
            //权限修饰符
            int mo = fields[j].getModifiers();
            String priv = Modifier.toString(mo);
            //属性类型
            Class<?> type = fields[j].getType();
            System.out.println(priv + " " + type.getName() + " " + fields[j].getName() + ";");
        }
    }
}
