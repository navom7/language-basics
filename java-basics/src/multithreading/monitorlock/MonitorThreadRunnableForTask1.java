package multithreading.monitorlock;

public class MonitorThreadRunnableForTask1 implements Runnable{

    MonitorLockExample monitorLockExample;

    public MonitorThreadRunnableForTask1(MonitorLockExample monitorLockExample) {
        this.monitorLockExample = monitorLockExample;
    }

    @Override
    public void run() {
        monitorLockExample.task1();
    }
}
