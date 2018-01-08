package com.wn.unit.seven.three;

/**
 * Created by nengwei on 17/10/18.
 * <p>
 * 代理
 */
public class SpaceShipDelegation {

    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    //Delegated methods
    public void up(int velocity) {
        controls.up(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation pro = new SpaceShipDelegation("NES");
        pro.up(11);
    }

}
