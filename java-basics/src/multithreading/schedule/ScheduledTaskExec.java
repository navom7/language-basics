package multithreading.schedule;

import java.util.concurrent.*;

public class ScheduledTaskExec {
    public static void main(String[] args) {
        ScheduledExecutorService poolExecutor = Executors.newScheduledThreadPool(5);

        poolExecutor.schedule(() -> {
            System.out.println("Printing scheduled after 5 sec");
        }, 5, TimeUnit.SECONDS);



//        this will keep on running so we will have to explicitly stop it
        Future<?> futureObj = poolExecutor.scheduleAtFixedRate(() -> {
            System.out.println("first delay is 4 sec and after that every 2 sec:");
            //If this task takes longer than period, then next task will start immediately after this repeatation ends
        }, 4, 2, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000);
            futureObj.cancel(true);
        } catch (Exception e) {

        }





//        this will keep on running so we will have to explicitly stop it
        futureObj = poolExecutor.scheduleWithFixedDelay(() -> {
            System.out.println("first delay is 4 sec and after that every 2 sec:");
            //If this task takes longer than period, then next task will start after the given deal after this repeatation ends
        }, 4, 2, TimeUnit.SECONDS);

//        try {
//            Thread.sleep(10000);
//            futureObj.cancel(true);
//        } catch (Exception e) {
//
//        }
    }
}
