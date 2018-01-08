package com.wn.unit.ten.five;

import com.wn.unit.ten.four.Destination;

/**
 * Created by nengwei on 17/11/1.
 *
 * 局部內部類
 */
public class Parcel5 {

    public Destination destination(String s){
        class PDestination implements Destination{
            private String label;

            private PDestination(String whereTo){
                label = whereTo;
            }

            public String readLabel(){
                return label;
            }

        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("shanghai");
    }

}
