package com.wn.unit.ten.four;

/**
 * Created by nengwei on 17/11/1.
 */
public class TestPacel {

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();

        Destination d = p.destination("shanghai");

    }

}
