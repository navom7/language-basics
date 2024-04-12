package multithreading.forkjoin;

import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class WorkStealingPool {
    public static void main(String[] args) {
        ComputeSumTask task = new ComputeSumTask(1,5);
        System.out.println(task.compute());


        //thread count == number of processors
        Executors.newWorkStealingPool();

        //When we submit() it goes to submission queue
        //when fork() it goes to work stealing queue


        ForkJoinPool pool = ForkJoinPool.commonPool();
        Future<Integer> futureObj = pool.submit(new ComputeSumTask(0,100));
        try{
            System.out.println(futureObj.get());
        } catch(Exception e){

        }
    }
}
