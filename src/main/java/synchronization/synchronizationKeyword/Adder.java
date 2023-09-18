package synchronization.synchronizationKeyword;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value value;
    public Adder(Value value) {
        this.value = value;
    }
    @Override
    public Void call() throws Exception {
        for(int i=1; i<=100; i++) {
            System.out.println("Requesting lock for adding " + i);
            synchronized (value) {
                this.value.value += i;
                System.out.println("Added " + i);
            }
        }
        return null;
    }
}
