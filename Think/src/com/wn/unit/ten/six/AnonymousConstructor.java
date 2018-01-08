package com.wn.unit.ten.six;

/**
 * Created by nengwei on 17/11/2.
 * 通过实例初始化，就能够达到为匿名内部类创建一个构造器的效果
 */
public class AnonymousConstructor {

    public static Base getBase(int i) {
        return new Base(i) {

            {
                System.out.println("inside instance initializer");
            }

            @Override
            public void f() {
                System.out.println("AnonymousConstructor.f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }

}
