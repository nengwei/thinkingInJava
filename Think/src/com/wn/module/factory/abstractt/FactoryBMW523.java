package com.wn.module.factory.abstractt;

/**
 * Created by nengwei on 17/6/11.
 */
public class FactoryBMW523 implements FactoryBMW {
    @Override
    public BMW523 createBMW() {
        return new BMW523();
    }
}
