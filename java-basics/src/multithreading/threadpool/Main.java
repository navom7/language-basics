package multithreading.threadpool;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4,
                10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
                new CustomThreadFactory(),
                new CustomRejectHandler()
                );

        executor.allowCoreThreadTimeOut(true); //to make sure that keepAliveTIme passed is being used to delete and thread if not used after 10 mins



        for (int i = 0; i < 7; i++) {
            executor.submit(() -> {
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                }
                System.out.println("Task processed by: " + Thread.currentThread().getName());
            });
        }
    }


}
class CustomThreadFactory implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(Thread.NORM_PRIORITY);
        t.setDaemon(false);
        return t;
    }
}

class CustomRejectHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task rejected: " + r.toString() + " " + executor.toString());
    }
}
