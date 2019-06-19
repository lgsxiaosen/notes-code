package normal;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("初始状态");
        System.out.println(originator.getState());
        Caretaker caretaker= new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("修改状态");
        System.out.println(originator.getState());
        originator.restoreMenmento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
