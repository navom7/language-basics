package multithreading.monitorlock.deprecated;

public class SampleResource {
    synchronized void produce() {
        System.out.println("Lock acquired");
        try{
            Thread.sleep(8000);
        } catch (Exception e){

        }
        System.out.println("Lock Release");
    }
}
