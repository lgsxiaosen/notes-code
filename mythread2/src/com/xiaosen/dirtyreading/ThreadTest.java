package com.xiaosen.dirtyreading;

/**
 * @author xiaosen
 * @date 2019/2/28 8:03
 * @description
 */
public class ThreadTest extends Thread {
    private DirtyReadTest dirtyReadTest;
    public ThreadTest(DirtyReadTest dirtyReadTest){
        super();
        this.dirtyReadTest=dirtyReadTest;
    }

    @Override
    public void run() {
        super.run();
        dirtyReadTest.setValue("B", "BB");
    }
}
