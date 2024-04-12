package multithreading.futureandcallable.future;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        Future<?> futureObj = executor.submit(() -> {
           try{
               Thread.sleep(7000);
               System.out.println("This is the task, which thread will execute");
           } catch (Exception e) {

           }
        });

        System.out.println("isDone: " + futureObj.isDone());

        try{
            futureObj.get(2, TimeUnit.SECONDS);
        }catch (TimeoutException e) {
            System.out.println("Timeout exception: " + e.getMessage());
        } catch (Exception e) {

        }

        try{
            futureObj.get();
        } catch (Exception e) {

        }

        System.out.println("isDone: " + futureObj.isDone());
        System.out.println("is cancelled: " + futureObj.isCancelled());


    }
}
