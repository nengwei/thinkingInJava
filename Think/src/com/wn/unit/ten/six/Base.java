package com.wn.unit.ten.six;

/**
 * Created by nengwei on 17/11/2.
 * <p>
 * 内部类中不可能有命名构造器，但通过实例初始化，就能够达到为匿名内部类创建一个构造器的效果。
 */
abstract class Base {

    public Base(int i) {
        System.out.println("Base = [" + i + "]");
    }

    public abstract void f();
}
