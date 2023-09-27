package lambdas;

public class Client {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for(int i=1; i<=10; i++) System.out.print(i + " ");
        });
        t.start();
    }

}
