/**
 * @author xiaosen
 * @date 2019/6/10 17:59
 * @description
 */
public class ConcreteHandler1 extends Handler{
    @Override
    public void handlerMessage(int request) {
        if (request==1){
            System.out.println("处理者1负责处理请求");
        }else {
            if (this.getNexthandler()!=null){
                this.getNexthandler().handlerMessage(request);
            }else {
                System.out.println("没有处理该请求");
            }
        }
    }
}
