/**
 * @author xiaosen
 * @date 2019/6/21 18:29
 * @description
 */
public interface Visitor {
    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);
}
