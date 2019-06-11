/**
 * @author xiaosen
 * @date 2019/6/11 17:20
 * @description
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("目标角色实现类的方法");
    }
}
