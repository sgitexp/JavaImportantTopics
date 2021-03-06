package threads.ch5.synch.locks.without.demo;

/**
 * Created by chattops on 8/19/2016.
 */
public class SimpleThreadWithoutLocks implements Runnable {

    private static int count1 = 0;
    private static int count2 = 0;

    public static synchronized void add() {
        count1++;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized void compute() {
        for (int i = 0; i < 1000; i++) {
            add();
            addAgain();
        }
    }

    public static void addAgain() {
        count2++;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int getCount1() {
        return count1;
    }

    public static int getCount2() {
        return count2;
    }

    @Override
    public void run() {
        compute();
    }
}
