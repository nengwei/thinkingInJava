package com.wn.unit.five.seven.one;

/**
 * Created by nengwei on 17/10/2.
 * 其它类的构造器会在本类构造器前调用
 */
public class House {

    Window w1 = new Window(1);

    House() {
        System.out.println("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);
}
