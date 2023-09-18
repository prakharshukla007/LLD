package synchronization.synchronizationKeyword;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value value;
    public Subtractor(Value value) {
        this.value = value;
    }
    @Override
    public Void call() throws Exception {
        for(int i=1; i<=100; i++) {
            System.out.println("Requesting lock for subtracting " + i);
            synchronized (value) {
                value.value -= i;
                System.out.println("Subtracted " + i);
            }
        }
        return null;
    }
}
