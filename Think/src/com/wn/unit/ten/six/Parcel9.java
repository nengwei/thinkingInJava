package com.wn.unit.ten.six;

import com.wn.unit.ten.four.Destination;

/**
 * Created by nengwei on 17/11/2.
 */
public class Parcel9 {

    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;

            public String readLabel() {
                return label;
            }
        };
    }
}
