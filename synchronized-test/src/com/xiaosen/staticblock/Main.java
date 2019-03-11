package com.xiaosen.staticblock;

/**
 * @author xiaosen
 * @date 2019/3/11 7:50
 * @description
 */
public class Main {

    public static void main(String[] args){
        Service service = new Service();
        new Thread(Service::printA, "A").start();
        new Thread(Service::printB, "B").start();
        new Thread(() -> service.printC(), "C").start();


    }
}
