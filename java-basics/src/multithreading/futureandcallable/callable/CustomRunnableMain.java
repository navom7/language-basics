package multithreading.futureandcallable.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CustomRunnableMain {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        List<Integer> output = new ArrayList<>();
        Future<List<Integer>> object = executor.submit(new CustomRunnable(output), output);

        try {
            object.get();
            System.out.println(output.get(0));

            List<Integer> result = object.get();
            System.out.println(result.get(0));
        } catch (Exception e) {

        }



    }
}
