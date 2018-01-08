package com.wn.unit.ten.six.one;

/**
 * Created by nengwei on 17/11/5.
 */
public class Factories {

    public static void ServiceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        ServiceConsumer(Implementation1.factory);
        ServiceConsumer(Implementation2.serviceFactory);
    }


}
