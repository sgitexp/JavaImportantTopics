package threads.ch2.demo4;

/**
 * Created by sukanta on 8/13/16.
 */
public class SimpleThread extends Thread{

    private static volatile int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10000 ; i++) {
            count++;
        }
    }

    public static void printCount() {
        System.out.println("Count is now " + count);
    }
}
