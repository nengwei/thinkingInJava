package com.wn.unit.ten.three;

/**
 * Created by nengwei on 17/11/1.
 * 创建某个内部类的对象。需要用new表达式提供对其它外部类对象的引用
 *
 * 要想直接创建内部类对象，必须使用外部类的对象来创建该内部类对象
 *
 * 在拥有外部类对象之前是不可能创建内部类对象的。这是因为内部类对象会暗暗的连接到创建他的外部类对象上。
 *
 * 如果创建的是嵌套类，那么就不会对外部类对象的引用
 */
public class DotNew {

    public class Inner{}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
