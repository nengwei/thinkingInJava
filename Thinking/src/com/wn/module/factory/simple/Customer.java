package com.wn.module.factory.simple;

/**
 * Created by nengwei on 17/6/11.
 */
public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }
}
