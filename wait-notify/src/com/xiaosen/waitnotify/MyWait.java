package com.xiaosen.waitnotify;

/**
 * @author xiaosen
 * @date 2019/3/17 16:43
 * @description
 */
public class MyWait {

    private final Object lock;

    MyWait(Object lock){
        this.lock=lock;
    }

    public void waitTest(){
        try {
            synchronized (lock){
                System.out.println("开始 wait time = " + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束 wait time = " + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
