package multithreading.futureandcallable.callable;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());


        Future<?> futureObj = executor.submit(() -> {
            System.out.println("Task1 with Runnable");
        });


        try{
            Object obj = futureObj.get();
            System.out.println(obj == null);
        } catch (Exception e) {

        }





    }
}
