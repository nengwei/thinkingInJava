package com.wn.unit.ten.eight;

/**
 * Created by nengwei on 17/11/6.
 */
public class Caller {

    private Incrementable callbackReference;

    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }

    void go() {
        callbackReference.increment();
    }

}
