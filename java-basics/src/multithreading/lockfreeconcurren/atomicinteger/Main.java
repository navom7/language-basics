package multithreading.lockfreeconcurren.atomicinteger;

public class Main {
    public static void main(String[] args) {
        AtomicIntShareResource sr = new AtomicIntShareResource();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 200000000; i++) {
                sr.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 200000000; i++) {
                sr.increment();
            }
        });

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (Exception e) {}

        System.out.println("Value: " + sr.get());
    }
}
