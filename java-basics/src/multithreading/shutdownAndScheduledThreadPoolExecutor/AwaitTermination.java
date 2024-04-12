package multithreading.shutdownAndScheduledThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTermination {
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

        try {

            boolean isTerminated = poolExecutor.awaitTermination(2, TimeUnit.SECONDS);
            System.out.println("terminated after 2 second: " + isTerminated);

            isTerminated = poolExecutor.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("Terminated after 5 seconds: " + isTerminated);

        } catch (Exception e) {

        }

    }
}
