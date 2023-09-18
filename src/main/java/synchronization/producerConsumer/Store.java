package synchronization.producerConsumer;

public class Store {
    private int itemsCount;
    private int maxItemsCount;

    public Store(int maxItemsCount) {
        this.maxItemsCount = maxItemsCount;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int itemsCount) throws Exception {
        this.itemsCount = itemsCount;
        System.out.println(itemsCount);
        if(itemsCount > maxItemsCount || itemsCount < 0) {
            throw new Exception("Items count gone crazy " + itemsCount);
        }
    }

    public int getMaxItemsCount() {
        return maxItemsCount;
    }

    public void setMaxItemsCount(int maxItemsCount) {
        this.maxItemsCount = maxItemsCount;
    }
}
