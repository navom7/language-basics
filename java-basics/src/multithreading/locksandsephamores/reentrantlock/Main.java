package multithreading.locksandsephamores.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        SharedResource resource1 = new SharedResource(lock);
        SharedResource resource2 = new SharedResource(lock);

        Thread t1 = new Thread(() -> {
            resource1.produce();
        });
        Thread t2 = new Thread(() -> {
            resource2.produce();
        });

        t1.start();
        t2.start();
    }
}
