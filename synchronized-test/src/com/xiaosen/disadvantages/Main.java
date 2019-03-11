package com.xiaosen.disadvantages;

/**
 * @author xiaosen
 * @date 2019/3/6 21:08
 * @description
 */
public class Main {
    public static void main(String[] args){
        TaskModify task = new TaskModify();
        MyThread myThread = new MyThread(task, "A");
        MyThread myThread1 = new MyThread(task, "B");
        myThread.start();
        myThread1.start();
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long beginTime = Utils.begainTime1;
        if (Utils.begainTime2<Utils.begainTime1){
            beginTime = Utils.begainTime2;
        }
        long endTime = Utils.endTime1;
        if (Utils.endTime2>Utils.endTime1){
            endTime = Utils.endTime2;
        }
        System.out.println("耗时：" + (endTime-beginTime)/1000 + "s");


    }


}
