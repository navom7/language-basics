package multithreading.locksandsephamores.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceCondition {
    boolean b = false;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void produce() {
        try {
            lock.lock();
            System.out.println("Produce Lock aquired by: " + Thread.currentThread().getName());
            if (b) {
                System.out.println("Produce thread waiting: " + Thread.currentThread().getName());
                condition.await();
            }
            b = true;
            condition.signal();
        } catch (Exception e) {

        } finally {
            lock.unlock();
            System.out.println("Producer Lock released: " + Thread.currentThread().getName());
        }
    }

    public void consume() {
        try{
            Thread.sleep(5000);
            lock.lock();
            System.out.println("Consume Lock acquired " + Thread.currentThread().getName());
            if(!b) {
                condition.await();
                System.out.println("Consumer thread waiting: " + Thread.currentThread().getName());
            }
            b = false;
            condition.signal();
        } catch (Exception e){

        } finally {
            lock.unlock();
            System.out.println("Consumer thread lock released: " + Thread.currentThread().getName() + "\n");
        }
    }
}
