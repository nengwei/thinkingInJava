package com.wn.reflect;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 获取某个类的全部方法
 * Created by nengwei on 17/6/18.
 */
public class TestReflect6 implements Serializable {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.wn.reflect.User");
        Method methods[] = clazz.getMethods();
        for (int i = 0; i < methods.length; i++) {
            Class<?> returnType = methods[i].getReturnType();//获取方法返回值
            Class<?> para[] = methods[i].getParameterTypes();//获取方法里的参数
            int temp = methods[i].getModifiers();
            System.out.println(Modifier.toString(temp) + "");
            System.out.println(returnType.getName() + "");
            System.out.println(methods[i].getName() + "");
            for (int j = 0; j < para.length; j++) {
                System.out.println(para[j].getName() + "" + "arg" + j);
                if (j < para.length - 1) {
                    System.out.println(",");
                }
            }
            Class<?> exce[] = methods[i].getExceptionTypes();
            if (exce.length > 0) {
                System.out.println(") throws");
                for (int j = 0; j < exce.length; j++) {
                    System.out.println(exce[j].getName() + "");
                    if (j < exce.length - 1) {
                        System.out.println(",");
                    }
                }
            } else {
                System.out.println(")");
            }
            System.out.println();
        }
    }
}
