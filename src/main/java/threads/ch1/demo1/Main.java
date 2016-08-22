package threads.ch1.demo1;

/**
 * Created by sukanta on 8/13/16.
 */
public class Main {
    /**
     * Demonstrates creation of two simple threads.
     * Displays the value of a counter
     * @param args
     */
    public static void main(String[] args) {

        Thread t1 = new SimpleThread();
        t1.start();

        Thread t2 = new SimpleThread();
        t2.start();

    }
}
