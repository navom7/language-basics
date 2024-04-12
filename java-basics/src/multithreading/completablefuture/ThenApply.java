package multithreading.completablefuture;

import java.util.concurrent.*;

public class ThenApply {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1,
                    TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy());

            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
                return "task completed";
            //then we can use thenApplyAsync to make sure it uses different thread
            }, poolExecutor).thenApply((String str) -> {
                return str + " Coding";
            });

            System.out.println(asyncTask1.get());

        } catch (Exception e) {

        }
    }
}
