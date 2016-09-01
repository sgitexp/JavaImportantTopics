package threads.ch5.synch.locks.with.demo;

/**
 * Created by chattops on 8/19/2016.
 */
public class SimpleThreadWithLocks implements Runnable {

    private static int count1 = 0;
    private static int count2 = 0;
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void add() {
        synchronized (lock1) {
            count1++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void addAgain() {
        synchronized (lock2) {
            count2++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void compute() {
        for (int i = 0; i < 1000; i++) {
            add();
            addAgain();
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
