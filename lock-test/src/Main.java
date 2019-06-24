public class Main {

    public static void main(String[] args) {
        LockTest lockTest = new LockTest();

        for (int i=0; i<5; i++){
            new Thread(lockTest::test, "Thread-"+i).start();
        }
    }
}
