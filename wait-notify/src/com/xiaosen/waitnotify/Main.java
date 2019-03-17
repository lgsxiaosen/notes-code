package com.xiaosen.waitnotify;

/**
 * @author xiaosen
 * @date 2019/3/17 16:48
 * @description
 */
public class Main {

    public static void main(String[] args){
        try {
            Object lock = new Object();
            MyWait myWait = new MyWait(lock);
            new Thread(() -> myWait.waitTest()).start();
            Thread.sleep(3000);
            MyNotify myNotify = new MyNotify(lock);
            new Thread(() -> myNotify.notifyTest()).start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
