package lambdas.customInterface;

import java.util.function.BiFunction;

public class Client {

    public static void main(String[] args) {
        MathOperation adder = (a, b) -> a + b;
        System.out.println(adder.operate(10, 20));

        MathOperation adder2 = Integer::sum;
        System.out.println(adder2.operate(10, 20));

        MathOperation subtractor = (a, b) -> a - b;

        System.out.println(doOperation(1, 2, adder));

        BiFunction<Integer, Integer, Integer> adder3 = (a, b) -> a + b;
        System.out.println(doOperation(1, 2, adder3));

        System.out.println(doOperation(1, 2, (BiFunction<Integer, Integer, Integer>) (integer1, integer2) -> integer1 + integer2));
    }

    public static int doOperation(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }

    public static int doOperation(int a, int b, BiFunction<Integer, Integer, Integer> function) {
        return function.apply(a, b);
    }

}

