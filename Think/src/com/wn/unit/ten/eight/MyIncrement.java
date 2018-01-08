package com.wn.unit.ten.eight;

/**
 * Created by nengwei on 17/11/6.
 */
public class MyIncrement {

    public void increment() {
        System.out.println("Other operation");
    }

    static void f(MyIncrement mi){
            mi.increment();
    }
}
