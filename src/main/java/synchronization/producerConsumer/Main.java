package synchronization.producerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();

        Store store = new Store(5);

        for(int i=0; i<3; i++) {
            Producer producer = new Producer(store, i+1);
            es.execute(producer);
        }

        for(int i=0; i<100; i++) {
            Consumer consumer = new Consumer(store, i+1);
            es.execute(consumer);
        }
    }
}
