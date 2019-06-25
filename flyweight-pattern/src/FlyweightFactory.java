import java.util.HashMap;

/**
 * @author xiaosen
 * @date 2019/6/25 18:47
 * @description
 */
public class FlyweightFactory {

    private HashMap<String, Flyweight> flyweights=new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key){
        Flyweight flyweight=flyweights.get(key);
        if(flyweight!=null) {
            System.out.println("具体享元"+key+"已经存在，被成功获取！");
        }else{
            flyweight=new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
