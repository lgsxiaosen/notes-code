package clone;

/**
 * @author xiaosen
 * @date 2019/6/19 16:48
 * @description
 */
public class Client {

    public static void main(String[] args){
        Originator originator = new Originator();
        originator.setState("初始状态");
        System.out.println(originator.getState());
        originator.createMemento();
        originator.setState("修改状态");
        System.out.println(originator.getState());
        originator.restoreMemento();
        System.out.println(originator.getState());
    }
}
