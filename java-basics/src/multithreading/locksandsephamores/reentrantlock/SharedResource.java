package multithreading.locksandsephamores.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;

    ReentrantLock lock;
    SharedResource(ReentrantLock lock) {
        this.lock = lock;
    }

    public void produce() {
        try{
            lock.lock();
            System.out.println("Lock acquired by thread: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(5000);
        } catch (Exception e){

        }
        finally {
            lock.unlock();
            System.out.println("Lock released by thread: " + Thread.currentThread().getName());
        }
    }
}
