package multithreading.monitorlock.sharedresource;

public class SharedResource {
    private boolean isItemAvailable = false;

    synchronized public void consumeTask() {
        System.out.println("Consuming task");
        if(isItemAvailable == false) {
            try{
                System.out.println("Consumer Thread is waiting");
                wait();
            } catch (Exception ex) {

            }
        }
        isItemAvailable = false;
        System.out.println("Task Consumed!");
    }

    synchronized public void produceTask() {
        System.out.println("Producing task:");
        try {
            Thread.sleep(15000);
        } catch (Exception ex) {

        }
        isItemAvailable = true;
        System.out.println("Producer thread calling the notifyall");
        notifyAll();
        System.out.println("Task Produced");
    }
}
