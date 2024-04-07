package multithreading.locksandsephamores.semaphores;

public class Main {
    public static void main(String[] args) {
        ShareResourceSemaphore sr = new ShareResourceSemaphore();
        Thread t1 = new Thread(() -> {
            sr.producer();
        });
        Thread t2 = new Thread(() -> {
            sr.producer();
        });
        Thread t3 = new Thread(() -> {
            sr.producer();
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
