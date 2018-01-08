package com.wn.unit.ten.six;

/**
 * Created by nengwei on 17/11/2.
 * <p>
 * 基类需要一个有参数的构造器
 */
public class Parcel8 {

    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }

}
