/**
 * @author xiaosen
 * @date 2019/6/10 18:01
 * @description
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handlerMessage(int request) {
        if (request==2){
            System.out.println("处理者2负责处理请求");
        }else {
            if (this.getNexthandler()!=null){
                this.getNexthandler().handlerMessage(request);
            }else {
                System.out.println("没有处理该请求");
            }
        }
    }
}
