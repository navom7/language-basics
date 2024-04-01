package multithreading.monitorlock;

public class Main {
    public static void main(String[] args) {
        MonitorLockExample obj = new MonitorLockExample();

        MonitorThreadRunnableForTask1 runnableForTask1 = new MonitorThreadRunnableForTask1(obj);
        Thread t1 = new Thread(runnableForTask1);

        Thread t2 = new Thread(() -> obj.task2());
        Thread t3 = new Thread(() -> obj.task3());

        t1.start();
        t2.start();
        t3.start();


    }
}
