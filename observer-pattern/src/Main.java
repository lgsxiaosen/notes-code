public class Main {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.doSomething();
        System.out.println("----------------");
        SubjectApi subjectApi = new SubjectApi();
        ObserverApi observerApi = new ObserverApi();
        subjectApi.addObserver(observerApi);
        subjectApi.doSomething();

    }
}
