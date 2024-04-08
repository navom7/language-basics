package multithreading.lockfreeconcurren.atomicinteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntShareResource {
    AtomicInteger counter = new AtomicInteger(0);

    //This uses compare and swap (cas) operations
    public void increment() {
        counter.incrementAndGet();
    }

    public int get() {
        return counter.get();
    }
}
