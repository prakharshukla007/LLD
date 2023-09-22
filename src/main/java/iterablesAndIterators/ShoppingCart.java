package iterablesAndIterators;

import java.util.Iterator;
import java.util.List;

public class ShoppingCart implements Iterable<Product> {

    private final List<Product> productList;

    public ShoppingCart(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Iterator<Product> iterator() {
        return new ProductIterator(productList);
    }
}
