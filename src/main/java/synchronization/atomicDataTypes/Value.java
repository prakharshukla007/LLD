package synchronization.atomicDataTypes;

import java.util.concurrent.atomic.AtomicInteger;

// thread safe
public class Value {
    AtomicInteger value = new AtomicInteger(0);
}
