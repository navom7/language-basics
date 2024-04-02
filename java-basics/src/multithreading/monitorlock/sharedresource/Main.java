package multithreading.monitorlock.sharedresource;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread consumerThread = new Thread(() -> {
            sharedResource.consumeTask();
        });

        Thread producerThread = new Thread(() -> {
            sharedResource.produceTask();
        });

        consumerThread.start();
        producerThread.start();
    }

}
