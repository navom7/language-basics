package multithreading.locksandsephamores.stampedlock.readwrite;

import java.util.concurrent.locks.StampedLock;

public class SharedResourceStamped {
    boolean isAvailable = false;
    StampedLock lock = new StampedLock();

    public void produce() {
        long stamp = lock.writeLock();
        try{
            System.out.println("Write Lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(5000);
        } catch (Exception e) {

        } finally {
            lock.unlockWrite(stamp);
            System.out.println("Write lock released by: " + Thread.currentThread().getName());
        }
    }

    public void consume() {
        long stamp = lock.readLock();
        try{
            System.out.println("Read Lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
        } catch (Exception e) {

        } finally {
            lock.unlockRead(stamp);
            System.out.println("Read Lock acquired by: " + Thread.currentThread().getName());
        }

    }
}
