package com.wn.unit.seven.three;

/**
 * Created by nengwei on 17/10/18.
 */
public class SpaceShip extends  SpaceShipControls{

    private  String name;

    public SpaceShip(String name){
        this.name = name;
    }

    public String toDtring(){
        return name;
    }


    public static void main(String[] args) {
        SpaceShip protector  = new SpaceShip("NSEA");
        protector.down(10);//spaceShip包含spaceShipControls,与此同时，spaceshipControls的所有方法在spaceship中都暴露了出来
        //代理可以解决此问题
    }
}
