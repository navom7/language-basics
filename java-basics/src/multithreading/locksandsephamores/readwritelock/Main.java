package multithreading.locksandsephamores.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        ReadWriteLock lock = new ReentrantReadWriteLock();
        SharedResource resource1 = new SharedResource(lock);
        SharedResource resource2 = new SharedResource(lock);
        SharedResource resource3 = new SharedResource(lock);

        Thread t1 = new Thread(() -> {
            resource1.consume();
        });
        Thread t2 = new Thread(() -> {
            resource2.consume();
        });
        Thread t3 = new Thread(() -> {
            resource2.produce();
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
