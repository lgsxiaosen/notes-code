/**
 * @author xiaosen
 * @date 2019/4/19 17:43
 * @description
 */
public class ConstructorTest implements Cloneable {
    public ConstructorTest() {
        System.out.println("构造器执行。。。");
    }

    @Override
    protected ConstructorTest clone() throws CloneNotSupportedException {
        return (ConstructorTest) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        ConstructorTest constructorTest = new ConstructorTest();
        ConstructorTest constructorTest1 = constructorTest.clone();
    }
}
