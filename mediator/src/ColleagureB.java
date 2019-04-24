/**
 * @author xiaosen
 * @date 2019/4/24 17:36
 * @description
 */
public class ColleagureB extends Colleagure {

    public ColleagureB(Mediator mediator){
        super(mediator);
    }

    public void doSelfthing(String message){
        System.out.println("ColleagureB receive message = " + message);
    }

    public void doMediaThing(){
        mediator.doSomething(this,"do ColleagureB mediator thing !");
    }
}
