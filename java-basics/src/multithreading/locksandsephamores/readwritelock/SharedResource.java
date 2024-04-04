package multithreading.locksandsephamores.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {
    boolean isAvailable = false;

    ReadWriteLock lock;
    SharedResource(ReadWriteLock lock) {
        this.lock = lock;
    }

    public void consume() {
        try{
            lock.readLock().lock();
            System.out.println("Read Lock acquired by thread: " + Thread.currentThread().getName());
            System.out.println("isavailable: " + isAvailable);
            Thread.sleep(5000);
        } catch (Exception e){

        }
        finally {
            lock.readLock().unlock();
            System.out.println("Read Lock released by thread: " + Thread.currentThread().getName());
        }
    }

    public void produce() {
        try{
            lock.writeLock().lock();
            System.out.println("Write Lock acquired by thread: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(5000);
        } catch (Exception e){

        }
        finally {
            lock.writeLock().unlock();
            System.out.println("Write Lock released by thread: " + Thread.currentThread().getName());
        }
    }
}
