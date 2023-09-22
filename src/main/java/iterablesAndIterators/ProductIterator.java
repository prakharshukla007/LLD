package iterablesAndIterators;

import java.util.Iterator;
import java.util.List;

public class ProductIterator implements Iterator<Product> {

    private final List<Product> productList;

    private int cursor;

    public ProductIterator(List<Product> productList) {
        this.productList = productList;
        cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor < productList.size();
    }

    @Override
    public Product next() {
        return productList.get(cursor++);
    }
}
