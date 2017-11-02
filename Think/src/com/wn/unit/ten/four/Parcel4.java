package com.wn.unit.ten.four;

/**
 * Created by nengwei on 17/11/1.
 */
public class Parcel4 {

    private class PContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected class PDestinaton implements Destination {
        private String label;

        private PDestinaton(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestinaton(s);
    }

    public Contents contents(){
        return new PContents();
    }

}
