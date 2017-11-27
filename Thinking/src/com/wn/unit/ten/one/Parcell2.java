package com.wn.unit.ten.one;

/**
 * 外部类的方法返回一个指向内部类的引用
 * Created by nengwei on 17/6/11.
 */
public class Parcell2 {

    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcell2 parcell2 = new Parcell2();
        parcell2.ship("BeiJing");

        Parcell2 q = new Parcell2();
        //从外部类的非静态方法之外的任意位置创建某个内部类对象，必须具体指明这个对象的类型
        Parcell2.Contents c = q.contents();
        Parcell2.Destination d = q.to("ShangHai");
    }
}