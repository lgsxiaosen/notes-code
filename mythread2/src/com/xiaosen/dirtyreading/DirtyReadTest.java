package com.xiaosen.dirtyreading;

/**
 * @author xiaosen
 * @date 2019/2/28 7:59
 * @description
 */
public class DirtyReadTest {
    public String username = "A";
    public String password = "AA";
    synchronized public void setValue(String username, String password){
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method: username = " + username + " password = " + password);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void getValue(){
        System.out.println("getValue method: username = " + username + " password = " + password);
    }

}
