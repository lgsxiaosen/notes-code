package com.xiaosen.printtest;

/**
 * @author xiaosen
 * @date 2019/3/13 20:55
 * @description
 */
public class PrintString {
    private boolean isContinue = true;

    public boolean isContinue() {
        return isContinue;
    }

    public void setContinue(boolean aContinue) {
        this.isContinue = aContinue;
    }

    public void printStringFunc(){
        try {
            while (isContinue){
                System.out.println("run printStringFunc threadName=" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        PrintString printString = new PrintString();
        printString.printStringFunc();
        System.out.println("stop printStringFunc stopThread=" + Thread.currentThread().getName());
        printString.setContinue(false);
    }
}
