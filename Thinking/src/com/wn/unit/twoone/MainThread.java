package com.wn.unit.twoone;

/**
 * Created by nengwei on 17/8/10.
 */
public class MainThread {

    private static int i = 0;
    private static final int j = i++;

    public static void main(String[] args) {
//        Thread thread = new Thread(new LiftOff());
//        thread.start();
        for (int i = 0; i < 5; i++) {//输出说明不同任务的执行在线程被换进换出时混在了一起。这种交换是由线程调度器自动控制的。
            new Thread(new LiftOff()).start();
            System.out.println("Waiting for LiftOff");
        }
    }
}
