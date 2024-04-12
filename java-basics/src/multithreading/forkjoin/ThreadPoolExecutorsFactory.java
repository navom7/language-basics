package multithreading.forkjoin;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExecutorsFactory {
    public static void main(String[] args) {
        try{
            ExecutorService poolExec1 = Executors.newFixedThreadPool(5);
            Future<String> res = poolExec1.submit(() -> "this is the asynchronous task");
            System.out.println(res.get());





            poolExec1 = Executors.newCachedThreadPool();
            res = poolExec1.submit(() -> "this is the cached task");
            System.out.println(res.get());



            poolExec1 = Executors.newSingleThreadExecutor();
            res = poolExec1.submit(() -> "this is the single thread task");
            System.out.println(res.get());

        } catch (Exception e) {

        }
    }
}
