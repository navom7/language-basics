package multithreading;

public class Main {
    public static void main(String[] args) {
        //Using Runnable
        System.out.println("code started in thread: " + Thread.currentThread().getName());
        MultithreadingRunnable runnableObject = new MultithreadingRunnable();
        Thread newThread = new Thread(runnableObject);
        newThread.start();
        System.out.println("Finish of main method int thread: " + Thread.currentThread().getName());


        //Using extends Thread directly
        System.out.println("start of thread start in thread: " + Thread.currentThread().getName());
        MultithreadingThread thread = new MultithreadingThread();
        thread.start();
        System.out.println("End of thread start in thread: " + Thread.currentThread().getName());

    }
}
