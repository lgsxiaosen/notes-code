package normal;

/**
 * @author xiaosen
 * @date 2019/6/19 16:23
 * @description
 */
public class Originator {
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void restoreMenmento(Memento memento){
        this.setState(memento.getState());
    }
}
