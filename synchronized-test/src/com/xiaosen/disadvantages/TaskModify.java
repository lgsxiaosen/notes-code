package com.xiaosen.disadvantages;

/**
 * @author xiaosen
 * @date 2019/3/6 21:21
 * @description
 */
public class TaskModify {

    private String getData1;

    private String getData2;

    public void longTimeTask(){
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            String data1 = "长时间处理任务后从远程返回的值1 threadName=" + Thread.currentThread().getName();
            String data2 = "长时间处理任务后从远程返回的值2 threadName=" + Thread.currentThread().getName();
            synchronized (this){
                getData1 = data1;
                getData2 = data2;
            }
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
