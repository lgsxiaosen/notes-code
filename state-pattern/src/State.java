/**
 * @author xiaosen
 * @date 2019/6/24 18:45
 * @description
 */
public abstract class State {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    abstract void handle1();
    abstract void handle2();
}
