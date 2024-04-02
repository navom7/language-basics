package multithreading.daemon.thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method started");
        SampleResource sr = new SampleResource();
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 calling produce method");
            sr.produce();
        });

        t1.start();
//        try{
//            t1.join();
//        } catch (Exception e) {
//
//        }

        t1.setDaemon(true);

        System.out.println("End of main");

    }
}
