package multithreading.monitorlock.deprecated;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method started");
        SampleResource sr = new SampleResource();
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 calling produce method");
            sr.produce();
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 calling produce method");
            try{
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            sr.produce();
        });

        t1.start();
        t2.start();

        try{
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        System.out.println("Suspending thread 1");
        t1.suspend();


        try{
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        System.out.println("Resuming thread 1");
        t1.resume();


        System.out.println("End of main");

    }
}
