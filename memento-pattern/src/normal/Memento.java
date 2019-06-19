package normal;

/**
 * @author xiaosen
 * @date 2019/6/19 16:25
 * @description
 */
public class Memento {
    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
