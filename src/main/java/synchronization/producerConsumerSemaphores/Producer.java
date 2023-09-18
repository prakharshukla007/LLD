package synchronization.producerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Store store;
    private int producerNumber;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Producer(Store store, int producerNumber, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerNumber = producerNumber;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    private void produceItem() {
//        while(!(store.getItems().size() < 5)) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
        try {
            producerSemaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        store.addItem();
        consumerSemaphore.release();
    }

    @Override
    public void run() {
        while (true) {
            produceItem();
        }
    }
}
