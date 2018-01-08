package com.wn.unit.twoone;

/**
 * Created by nengwei on 17/6/10.
 */
public class ThreadTest implements Runnable {

    @Override
    public void run() {
        try {
            while(true){
                System.out.println(12);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        Thread t = new Thread(new ThreadTest());
        t.start();
    }
}
