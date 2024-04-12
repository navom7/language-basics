package multithreading.schedule;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledTaskExec {
    public static void main(String[] args) {
        ScheduledExecutorService poolExecutor = Executors.newScheduledThreadPool(5);

        poolExecutor.schedule(() -> {
            System.out.println("Printing scheduled after 5 sec");
        }, 5, TimeUnit.SECONDS);



        poolExecutor.scheduleAtFixedRate(() -> {
            System.out.println("first delay is 4 sec and after that every 2 sec:");
        }, 4, 2, TimeUnit.SECONDS);
    }
}
