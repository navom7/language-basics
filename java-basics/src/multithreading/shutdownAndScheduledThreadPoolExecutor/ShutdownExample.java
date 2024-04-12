package multithreading.shutdownAndScheduledThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownExample {
    public static void main(String[] vargs) {
        ExecutorService poolExecutor = Executors.newFixedThreadPool(5);

        poolExecutor.submit(() -> {
            System.out.println("Thread going to start its work");
        });

        poolExecutor.shutdown();

        poolExecutor.submit(() -> {
            System.out.println("executor caled after shutdown");
        });


    }
}
