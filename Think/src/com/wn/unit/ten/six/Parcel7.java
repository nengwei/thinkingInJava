package com.wn.unit.ten.six;

import com.wn.unit.ten.four.Contents;
//匿名内部类
//将返回值的生成与表示这个返回值的类的定义结合在一起。
public class Parcel7 {

    public Contents contents() {
        return new Contents() {//创建一个继承自Contents的匿名内部类的对象。

            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
        System.out.println("args = [" + c.value() + "]");
    }

}
