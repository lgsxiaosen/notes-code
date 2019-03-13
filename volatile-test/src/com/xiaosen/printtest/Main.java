package com.xiaosen.printtest;

/**
 * @author xiaosen
 * @date 2019/3/13 21:04
 * @description
 */
public class Main {

    public static void main(String[] args){

        PringStringThread pringStringThread = new PringStringThread();
        new Thread(() -> pringStringThread.printStringFunc()).start();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        pringStringThread.setContinue(false);

    }

}
