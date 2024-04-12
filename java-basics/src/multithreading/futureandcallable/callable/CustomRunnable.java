package multithreading.futureandcallable.callable;

import java.util.List;

public class CustomRunnable implements Runnable {

    List<Integer> output;

    CustomRunnable(List<Integer> output) {
        this.output = output;
    }

    @Override
    public void run() {
        output.add(300);
        System.out.println("CustomRunnable method called");
    }
}
