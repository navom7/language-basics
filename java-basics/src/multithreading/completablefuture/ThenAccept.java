package multithreading.completablefuture;

import java.util.concurrent.*;

public class ThenAccept {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1,
                    TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy());

            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
                return "task completed";
                //then we can use thenApplyAsync to make sure it uses different thread
            }, poolExecutor);

            asyncTask1.thenAccept((String str) -> {
                System.out.println("hello " + str);
            });

            System.out.println(asyncTask1.get());

        } catch (Exception e) {

        }
    }
}
