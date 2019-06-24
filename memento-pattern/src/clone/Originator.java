package clone;

/**
 * @author xiaosen
 * @date 2019/6/19 16:44
 * @description
 */
public class Originator implements Cloneable{
    private String state = "";
    private Originator backup;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void restoreMemento(){
        this.setState(this.backup.getState());
    }

    public void createMemento(){
        this.backup = this.clone();
    }

    @Override
    protected Originator clone() {
        try {
            return (Originator)super.clone();
        }catch (CloneNotSupportedException e){
            e.fillInStackTrace();
            return null;
        }
    }
}
