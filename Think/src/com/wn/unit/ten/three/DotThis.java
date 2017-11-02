package com.wn.unit.ten.three;

/**
 * Created by nengwei on 17/10/29.
 * 对外部类对象的引用，可以使用外部类的名字后面紧跟圆点和this
 */
public class DotThis {

    void f() {
        System.out.println("DoThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
