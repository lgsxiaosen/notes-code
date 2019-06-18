/**
 * @author xiaosen
 * @date 2019/6/18 17:28
 * @description
 */
public class Facade {
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();

    public void doMethodA(){
        classA.doMethodA();
    }
    public void doMethodB(){
        classB.doMethodB();
    }
    public void doMethodC(){
        classC.doMethodC();
    }
}
