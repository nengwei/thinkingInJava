package com.wn.module.factory.simple;

/**
 * Created by nengwei on 17/6/11.
 */
public class Factory {

    public BMW createBMW(int type){
        switch (type){
            case 320 :
                return  new BMW320();
            case 523 :
                return new BMW523();
            default:
                break;
        }
        return null;
    }
}
