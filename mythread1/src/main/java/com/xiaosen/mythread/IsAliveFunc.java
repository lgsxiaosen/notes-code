package main.java.com.xiaosen.mythread;

/**
 * @author xiaosen
 * @date 2019/2/26 7:34
 * @description
 */
public class IsAliveFunc extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("run is alive = " + this.isAlive());
    }


    public static void main(String[] args){
        IsAliveFunc isAliveFunc = new IsAliveFunc();
        System.out.println("begin start " + isAliveFunc.isAlive());
        isAliveFunc.start();
        System.out.println("after start " + isAliveFunc.isAlive());
    }

}
