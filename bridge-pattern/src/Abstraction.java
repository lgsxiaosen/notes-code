/**
 * @author xiaosen
 * @date 2019/6/26 16:29
 * @description
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    abstract void operation();
}
