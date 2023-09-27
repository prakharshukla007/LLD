package lambdas;

import java.util.concurrent.Callable;

public class CallableExample {

    public static void main(String[] args) throws Exception {
//        Callable<String> callable = () -> {
//            return returnStatus();
//        };
        Callable<String> callable = CallableExample::returnStatus;
        System.out.println(callable.call());
    }

    public static String returnStatus() {
        System.out.println("Calling from callable");
        return "done";
    }

}
