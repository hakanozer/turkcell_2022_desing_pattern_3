package _4_singleton;

public class DBSingle {

    private static DB instance = null;

    private static Object lock = new Object();

    public static DB singleton() {
        if ( instance == null ) {
            synchronized (lock) {
                instance = new DB();
            }
        }
        return instance;
    }

}
