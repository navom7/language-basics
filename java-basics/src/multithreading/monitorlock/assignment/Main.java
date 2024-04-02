package multithreading.monitorlock.assignment;

public class Main {
    public static void main(String[] args) {
        SyncQueueExample sqe = new SyncQueueExample();
        Thread t1 = new Thread(() -> sqe.removeData());

        Thread t2 = new Thread(() -> sqe.removeData());

        Thread t3 = new Thread(() -> sqe.removeData());

        Thread t4 = new Thread(() -> sqe.removeData());

        Thread t5 = new Thread(() -> sqe.addData(8));

        Thread t6 = new Thread(() -> sqe.addData(9));

        Thread t7 = new Thread(() -> sqe.addData(10));

        Thread t8 = new Thread(() -> sqe.addData(11));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();

//        System.out.println("final size is: " + sqe.getSize());

    }
}
