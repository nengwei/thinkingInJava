package com.wn.unit.ten.eight;

/**
 * Created by nengwei on 17/11/6.
 */
public class Callee1 implements Incrementable{

    private int i = 0 ;

    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}
