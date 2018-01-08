package com.wn.unit.ten.eight;

/**
 * Created by nengwei on 17/11/6.
 *
 * callee2中的increment与Incrementable接口中的increment方法完全不相干，所以该类不能实现Incrementable接口来覆盖。
 * 只能使用内部类
 */
public class Callee2 extends  MyIncrement {

    private int i = 0;

    public void increment(){
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Closure implements Incrementable{
        public void increment(){
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference(){
        return new Closure();
    }

}
