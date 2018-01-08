package com.wn.unit.ten.six.one;

/**
 * Created by nengwei on 17/11/5.
 */
public class Implementation2 implements Service {

    @Override
    public void method1() {
        System.out.println("Implementation2.method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2.method2");
    }

    public static ServiceFactory serviceFactory =
            new ServiceFactory() {
                @Override
                public Service getService() {

                    return new Implementation2();
                }
            };
}
