package multithreading.locksandsephamores.stampedlock.readwrite;


public class Main {
    public static void main(String[] args) {
        SharedResourceStamped sr = new SharedResourceStamped();
        Thread t1 = new Thread(() -> {
            sr.produce();
        });
        Thread t2 = new Thread(() -> {
            sr.produce();
        });
        Thread t3 = new Thread(() -> {
            sr.consume();
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
