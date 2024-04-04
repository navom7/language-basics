package multithreading.locksandsephamores;

public class SharedResource {
    boolean isAvailable = false;
    synchronized void produce(){
        try{
            System.out.println("Lock acquired by thread: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception ex) {

        }
        System.out.println("Lock release by thread: " + Thread.currentThread().getName());
    }
}
