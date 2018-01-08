package com.wn.unit.ten.one;

/**
 * 外部类中定义内部类
 * Created by nengwei on 17/6/11.
 */
public class Parcell {

    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            this.label = whereTo;
        }

        String readLabel() {
            return label;
        }

    }

    public void ship(String dest) {
        Contents contents = new Contents();
        Destination destination = new Destination(dest);
        System.out.println(destination.readLabel());
    }

    public static void main(String[] main) {
        Parcell p = new Parcell();
        p.ship(">>>>>BeiJing<<<<<<");
    }


}
