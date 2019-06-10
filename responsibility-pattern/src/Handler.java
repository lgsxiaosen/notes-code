
/**
 * @author xiaosen
 * @date 2019/6/10 17:51
 * @description
 */
public abstract class Handler {
    private Handler nexthandler;

    public Handler getNexthandler() {
        return nexthandler;
    }

    public void setNexthandler(Handler nexthandler) {
        this.nexthandler = nexthandler;
    }
    /**
     * @author xiaosen
     * @description 处理请求的方法
     * @date 2019/6/10
     * @param
     * @return
     */
    public abstract void handlerMessage(int request);

}
