package multithreading;

public class MultithreadingThread extends Thread{
    @Override
    public void run() {
        System.out.println("Running in thread: " + Thread.currentThread().getName());
    }
}
