package multithreading.locksandsephamores.stampedlock.optimistic;

import java.util.concurrent.locks.StampedLock;

public class SharedResourceStamped {
    int a = 20;
    StampedLock lock = new StampedLock();
    public void produce() {
        long stamp = lock.tryOptimisticRead();
        try{

            System.out.println("Write Lock acquired by: " + Thread.currentThread().getName());
            a = 23;
            Thread.sleep(5000);
            if(lock.validate(stamp)) {
                System.out.println("updated successfully");
            } else {
                System.out.println("rollback of work");
                a = 20;
            }
        } catch (Exception e) {

        }
    }

    public void consume() {
        long stamp = lock.writeLock();
        try{
            System.out.println("Read Lock acquired by: " + Thread.currentThread().getName());
            int b = a;
        } catch (Exception e) {

        } finally {
            lock.unlockWrite(stamp);
            System.out.println("Read Lock acquired by: " + Thread.currentThread().getName());
        }

    }
}
