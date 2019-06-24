package alternately;

/**
 * @author xiaosen
 * @date 2019/6/24 8:45
 * @description
 */
public class Mian {

    public static void main(String[] args){
        ConditionService service = new ConditionService();
        new Thread(() -> {
            for (int i=0; i<100; i++){
                service.set();
            }
        }).start();
        new Thread(() -> {
            for (int i=0; i<100; i++){
                service.get();
            }
        }).start();

    }
}
