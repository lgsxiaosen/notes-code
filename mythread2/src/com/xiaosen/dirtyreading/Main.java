package com.xiaosen.dirtyreading;

/**
 * @author xiaosen
 * @date 2019/2/28 8:05
 * @description
 */
public class Main {

    public static void main(String[] args) throws Exception{
        DirtyReadTest dirtyReadTest = new DirtyReadTest();
        ThreadTest threadTest = new ThreadTest(dirtyReadTest);
        threadTest.start();
        Thread.sleep(200);
        dirtyReadTest.getValue();
    }


}
