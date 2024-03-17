package classes.singleton;

/*
synchronized block
Problem: call will be always synchronized hence slow because of lock and unlock and only
one thread will be allowed to to go inside

 */

public class CSynchronizationBlock {
    private static CSynchronizationBlock INSTANCE;

    private CSynchronizationBlock() {

    }

    synchronized public static CSynchronizationBlock getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new CSynchronizationBlock();
        }
        return INSTANCE;
    }
}
