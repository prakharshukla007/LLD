package synchronization.synchronizationMCQ;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        A obj1 = new A(100);

        A obj2 = new A(100);

        obj1.toggleFunc = true;
        Thread thread1 = new Thread(obj1);
        thread1.start();

        Thread.sleep(10);

        obj1.toggleFunc = false;
        Thread thread2 = new Thread(obj1);
        thread2.start();
    }

}
