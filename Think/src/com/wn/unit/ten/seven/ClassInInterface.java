package com.wn.unit.ten.seven;

/**
 * Created by nengwei on 17/11/5.
 *
 * 嵌套类可以作为接口的一部分、
 * 接口中的任何类都自动的是public和static的。
 * 可以在内部类中实现外围接口
 *
 */
public interface ClassInInterface {

    void howdy();

    class Test implements ClassInInterface{
        @Override
        public void howdy() {
            System.out.println("howdy");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }

}
