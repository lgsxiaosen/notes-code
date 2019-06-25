/**
 * @author xiaosen
 * @date 2019/6/21 18:40
 * @description
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB(){
        return "具体元素B的操作。";
    }
}
