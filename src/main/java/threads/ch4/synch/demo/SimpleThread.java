package threads.ch4.synch.demo;

/**
 * Created by chattops on 8/19/2016.
 */
public class SimpleThread implements Runnable {

    private static int count = 0;

    //Uncomment line 17 and comment line 18 to see the difference
    //private static synchronized void increment() {
    private static synchronized void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            increment();
        }
    }

}
