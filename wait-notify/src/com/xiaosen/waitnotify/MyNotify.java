package com.xiaosen.waitnotify;

/**
 * @author xiaosen
 * @date 2019/3/17 16:47
 * @description
 */
public class MyNotify {
    private final Object lock;

    MyNotify(Object lock){
        this.lock=lock;
    }

    public void notifyTest(){
        synchronized (lock){
            System.out.println("开始 notify time = " + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束 notify time = " + System.currentTimeMillis());
        }
    }

}
