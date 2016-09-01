package threads.ch2.demo5;

/**
 * Created by sukanta on 8/13/16.
 */
public class SimpleThread extends Thread {

    private static volatile int count = 0;

    public synchronized static void increment() {
        count++;
    }

    public static void printCount() {
        System.out.println("Count is now " + count);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            increment();
        }
    }
}
