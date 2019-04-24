/**
 * @author liuguisen
 * @date 2019/4/24 17:31
 * @description
 */
public class ColleagureA extends Colleagure {

    public ColleagureA(Mediator mediator){
        super(mediator);
    }

    public void doSelfthing(String message){
        System.out.println("ColleagureA receive message = " + message);
    }

    public void doMediaThing(){
        mediator.doSomething(this,"do ColleagureA mediator thing !");
    }



}
