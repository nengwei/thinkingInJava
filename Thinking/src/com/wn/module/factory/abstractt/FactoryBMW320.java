package com.wn.module.factory.abstractt;

/**
 * Created by nengwei on 17/6/11.
 */
public class FactoryBMW320 implements FactoryBMW {


    @Override
    public BMW320 createBMW() {
        return new BMW320();
    }
}
