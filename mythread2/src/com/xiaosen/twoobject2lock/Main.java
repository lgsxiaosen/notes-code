package com.xiaosen.twoobject2lock;

/**
 * @author xiaosen
 * @date 2019/2/28 7:41
 * @description
 */
public class Main {

    public static void main(String[] args){
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        HasSelfPrivateNum hasSelfPrivateNum1 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA("a", hasSelfPrivateNum);
        ThreadA threadA1 = new ThreadA("b", hasSelfPrivateNum);
        threadA.start();
        threadA1.start();
    }


}
