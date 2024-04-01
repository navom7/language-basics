package multithreading.monitorlock;

public class MonitorLockExample {
    public synchronized void task1() {
        try{
            System.out.println("inside task1");
            Thread.sleep(10000);
            System.out.println("task 1 completed successfully");
        } catch (Exception ex) {

        }
    }

    public void task2() {
        System.out.println("task 2 before synchronization");
        synchronized (this) {
            System.out.println("task 2 after synchronization");
        }
    }

    public void task3() {
        System.out.println("task 3");
    }
}
