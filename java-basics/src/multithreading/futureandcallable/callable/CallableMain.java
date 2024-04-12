package multithreading.futureandcallable.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableMain {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        Future<List<Integer>> value =  executor.submit(() -> {
            List<Integer> output = new ArrayList<>();
            output.add(300);
            return output;
        });

        Runtime.getRuntime().availableProcessors();

        try {
            List<Integer> output = value.get();
            System.out.println(output.get(0));
        } catch (Exception e) {

        }
    }
}
