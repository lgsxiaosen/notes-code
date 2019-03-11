package com.xiaosen.disadvantages;

/**
 * @author xiaosen
 * @date 2019/3/6 21:05
 * @description
 */
public class MyThread extends Thread{
    private TaskModify task;
    private String name;

    public MyThread(TaskModify task, String name){
        super();
        this.task=task;
        this.name=name;
        super.setName(name);
    }

    @Override
    public void run() {
        super.run();
        if ("A".equals(name)){
            Utils.begainTime1 = System.currentTimeMillis();
            task.longTimeTask();
            Utils.endTime1 = System.currentTimeMillis();
        }else {
            Utils.begainTime2 = System.currentTimeMillis();
            task.longTimeTask();
            Utils.endTime2 = System.currentTimeMillis();
        }
    }
}
