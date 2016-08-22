package threads.ch5.synch.locks.with.demo;

/**
 * Created by chattops on 8/19/2016.
 */
public class SimpleThreadWithLocks implements Runnable {

    private static int count1 = 0;
    private static int count2 = 0;

    @Override
    public void run() {
        compute();
    }

    public static synchronized void add() {
        count1++;
    }

    public static synchronized void compute() {
        for (int i = 0; i < 10000; i++) {
            add();
            addAgain();
        }
    }

    public static void addAgain() {
        count2++;
    }

    public static int getCount1() {
        return count1;
    }

    public static int getCount2() {
        return count2;
    }
}
