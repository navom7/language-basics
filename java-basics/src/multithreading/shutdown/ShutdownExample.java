package multithreading.shutdown;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownExample {
    public static void main(String[] vargs) {
        ExecutorService poolExecutor = Executors.newFixedThreadPool(5);

        poolExecutor.submit(() -> {
            System.out.println("Thread going to start its work");
            try{
                Thread.sleep(5000);
            } catch (Exception e) {

            }
            System.out.println("Thread completed its work");
        });

        poolExecutor.shutdown();

        System.out.println("already submitted task Thread will execute event after shutdown");
        poolExecutor.submit(() -> {
            System.out.println("executor caled after shutdown");
        });


    }
}
