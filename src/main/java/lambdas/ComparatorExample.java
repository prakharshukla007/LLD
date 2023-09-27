package lambdas;

import java.util.Comparator;

public class ComparatorExample {

    public static void main(String[] args) {
        Comparator<String> comparator = (s1, s2) -> s1.length() - s2.length();

        System.out.println(comparator.compare("test", "tesfgflj"));
    }

}
