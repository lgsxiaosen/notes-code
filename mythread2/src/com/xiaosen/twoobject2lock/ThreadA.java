package com.xiaosen.twoobject2lock;

/**
 * @author xiaosen
 * @date 2019/2/28 7:39
 * @description
 */
public class ThreadA extends Thread {

    private HasSelfPrivateNum hasSelfPrivateNum;

    public ThreadA(String name, HasSelfPrivateNum hasSelfPrivateNum){
        super();
        this.hasSelfPrivateNum = hasSelfPrivateNum;
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.add(this.getName());
    }
}
