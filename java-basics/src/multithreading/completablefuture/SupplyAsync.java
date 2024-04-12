package multithreading.completablefuture;

import java.util.concurrent.*;

public class SupplyAsync {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1,
                    TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy());

            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
                return "task completed";
            }, poolExecutor);

            System.out.println(asyncTask1.get());

        } catch (Exception e) {

        }
    }
}
