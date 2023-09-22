package iterablesAndIterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        for(int val : list) System.out.print(val + " ");

        System.out.println();
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("iPhone"));
        productList.add(new Product("Samsung Monitor"));
        productList.add(new Product("Apple pencil"));
        ShoppingCart shoppingCart = new ShoppingCart(productList);

        for(Product product : shoppingCart) {
            System.out.print(product.getName() + ", ");
        }

        System.out.println();
        Iterator<Product> iterator2 = shoppingCart.iterator();
        while(iterator2.hasNext()) {
            System.out.print(iterator2.next().getName() + ", ");
        }
    }

}
