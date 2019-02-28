package com.xiaosen.sunclock;

/**
 * @author xiaosen
 * @date 2019/2/28 8:24
 * @description
 */
public class ThreadTest extends Thread {
    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.service1();
    }
}
