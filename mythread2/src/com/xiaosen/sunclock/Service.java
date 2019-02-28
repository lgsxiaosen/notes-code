package com.xiaosen.sunclock;

/**
 * @author xiaosen
 * @date 2019/2/28 8:22
 * @description
 */
public class Service {
    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }

    synchronized public void service2(){
        System.out.println("service2");
        service3();
    }

    synchronized public void service3(){
        System.out.println("service3");

    }
}
