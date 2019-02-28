package com.xiaosen.twoobject2lock;

/**
 * @author xiaosen
 * @date 2019/2/28 7:30
 * @description
 */
public class HasSelfPrivateNum {
    private int num = 0;
    synchronized public void add(String name){

        try {
            if ("a".equals(name)){
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(name + " num = " + num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }




}
