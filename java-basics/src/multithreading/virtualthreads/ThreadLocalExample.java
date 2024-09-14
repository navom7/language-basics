package multithreading.virtualthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
//        threadLocal.set(Thread.currentThread().getName());

//        Thread t1 = new Thread(() -> {
//            threadLocal.set(Thread.currentThread().getName());
//            System.out.println(threadLocal.get());
//        });
//
//        t1.start();
//
//        System.out.println(threadLocal.get());


        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.submit(() -> {
           threadLocal.set(Thread.currentThread().getName());

           //need to clean the thread local variable in that thread execution itself otherwise that
            //thread local variable will be available in other task exection also
           threadLocal.remove();

        });

        for (int i = 0; i < 15; i++) {
            executorService.submit(() -> {
                System.out.println(threadLocal.get());
            });

        }



    }
}
