package multithreading.locksandsephamores.condition;

public class Main {
    public static void main(String[] args) {
        SharedResourceCondition con = new SharedResourceCondition();
        Thread t1 = new Thread(() -> {
            for(int i = 0;  i < 3; i++) {
                con.consume();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0;  i < 3; i++) {
                con.produce();
            }
        });
        t1.start();
        t2.start();
    }
}
