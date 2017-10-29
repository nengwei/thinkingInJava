package com.wn.spring.lifeCycle;

/**
 * Created by nengwei on 17/6/17.
 */
public class Car {

    public Car() {
        System.out.println("Car's constructor.....");
    }

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void init() {
        System.out.println("init....");
    }

    public void destory() {
        System.out.println("destory....");
    }

    @Override
    public String toString() {
        return "Car [" + brand + "]";
    }
}
