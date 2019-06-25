/**
 * @author xiaosen
 * @date 2019/6/21 18:39
 * @description
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA(){
        return "具体元素A的操作。";
    }
}
