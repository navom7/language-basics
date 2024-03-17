package classes.singleton;


/*

core1 -> cache1
core2 -> cache2

suppose two threads come parallelly
core1 created connection object and stored in cache1, and cache sync up is not yet done
thread2 will use core2 in this case and will check in memory layer and will not find the object
hence this will also create one new object

hence we use VOLATILE keyword to make sure any read and write for that value happens directly
from memory layer

 */

public class DDoubleCheckLock {
    //volatile keyword make sure to read and write directly from memory layer
    private static volatile DDoubleCheckLock INSTANCE;

    private DDoubleCheckLock() {

    }

    synchronized public static DDoubleCheckLock getInstance() {
        if(INSTANCE == null) {
            synchronized (DDoubleCheckLock.class) {
                if(INSTANCE == null) {
                    INSTANCE = new DDoubleCheckLock();
                }
            }
        }
        return INSTANCE;
    }
}
