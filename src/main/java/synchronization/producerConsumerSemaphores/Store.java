package synchronization.producerConsumerSemaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private Queue<Object> items = new ConcurrentLinkedQueue<>();
    private int maxItemsCount;

    public Queue<Object> getItems() {
        return items;
    }

    public Store(int maxItemsCount) {
        this.maxItemsCount = maxItemsCount;
    }

    public void addItem() {
        items.add(new Object());
        System.out.println("Item added, size is: " + items.size());
    }

    public void removeItem() {
        items.remove(items.remove());
        System.out.println("Item removed, size is: " + items.size());
    }

    public void setItemsCount(int itemsCount) throws Exception {
        itemsCount = items.size();
        System.out.println(itemsCount);
        if(itemsCount > maxItemsCount) {
            throw new Exception("Items count gone crazy " + itemsCount);
        }
    }
}
