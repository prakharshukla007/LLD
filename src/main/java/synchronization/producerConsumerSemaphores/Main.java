package synchronization.producerConsumerSemaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        int maxSlotsInStore = 5;
        Store store = new Store(maxSlotsInStore);

        Semaphore prodSemaphore = new Semaphore(maxSlotsInStore);
        Semaphore consSemaphore = new Semaphore(0);

        for(int i=1; i<=10; i++) {
            Producer producer = new Producer(store, i, prodSemaphore, consSemaphore);
            es.execute(producer);
        }

        for(int i=1; i<=20; i++) {
            Consumer consumer = new Consumer(store, i, consSemaphore, consSemaphore);
            es.execute(consumer);
        }
    }
}
