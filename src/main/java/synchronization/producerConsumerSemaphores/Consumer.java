package synchronization.producerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Store store;
    private int consumerNumber;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Consumer(Store store, int consumerNumber, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.consumerNumber = consumerNumber;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    private void consumeItem() {
//        while(!(store.getItems().size() > 0)) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
        try {
            consumerSemaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        store.removeItem();
        producerSemaphore.release();
    }

    @Override
    public void run() {
        while(true) {
            consumeItem();
        }
    }
}
