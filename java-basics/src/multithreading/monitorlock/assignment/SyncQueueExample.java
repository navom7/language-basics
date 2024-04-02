package multithreading.monitorlock.assignment;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SyncQueueExample {
    private Queue<Integer> q = new LinkedList<>();
    private Integer size = 3;

    synchronized void addData(int data) {
        System.out.println("inside add data with data: " + data);

        while(q.size() == size) {
            System.out.println("Queue is full waiting for data to be removed!");
            try{
                wait();
            } catch (Exception e) {
                //handle exception
            }
        }
        try{
            Thread.sleep(1000);
        } catch (Exception ex) {

        }
        System.out.println("adding data to queue: " + data);
        q.add(data);
        System.out.println("data added, notifying all");
        notify();
    }

    synchronized void removeData() {
        System.out.println("inside remove data");

        while(q.isEmpty()) {
            System.out.println("queue is empty, waiting for data to be added");
            try {
                wait();
            } catch (Exception e) {

            }
        }
        Integer value = q.remove();
        notify();
        System.out.println("Removed value: " + value);
        System.out.println("notifying all");
    }
    public int getSize() {
        return q.size();
    }
}
