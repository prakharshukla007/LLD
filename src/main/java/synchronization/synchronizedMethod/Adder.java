package synchronization.synchronizedMethod;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value value;

    public Adder(Value value) {
        this.value = value;
    }

    @Override
    public Void call() {
        for (int i = 1; i <= 10000; i++) {
            System.out.println("Requesting lock for adding " + i);
            value.incrementBy(i);
            System.out.println("Added " + i);
        }
        return null;
    }
}
