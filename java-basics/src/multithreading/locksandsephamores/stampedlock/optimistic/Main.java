package multithreading.locksandsephamores.stampedlock.optimistic;

import multithreading.locksandsephamores.stampedlock.optimistic.SharedResourceStamped;

public class Main {
    public static void main(String[] args) {
        SharedResourceStamped sr = new SharedResourceStamped();
        Thread t1 = new Thread(() -> {
            sr.produce();
        });
        Thread t3 = new Thread(() -> {
            sr.consume();
        });
        t1.start();
//        t3.start();
    }
}
