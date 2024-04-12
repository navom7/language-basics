package multithreading.completablefuture;

import java.util.concurrent.*;

public class ThenCompose {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1,
                    TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy());

            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
                return "task completed";
                //then we can use thenApplyAsync to make sure it uses different thread
            }, poolExecutor);

            CompletableFuture<String> asyncTask2 = asyncTask1.thenComposeAsync((String str) -> {
                return CompletableFuture.supplyAsync(() -> str + " world");
            }, poolExecutor);

            System.out.println(asyncTask1.get());
            System.out.println(asyncTask2.get());

        } catch (Exception e) {

        }
    }
}
