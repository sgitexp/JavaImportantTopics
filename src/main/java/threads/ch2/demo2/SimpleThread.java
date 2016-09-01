package threads.ch2.demo2;

/**
 * Created by sukanta on 8/13/16.
 */
public class SimpleThread extends Thread {

    private static int count = 0;

    public static void printCount() {
        System.out.println("Count is now " + count);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }
}
