package threads.ch2.demo2;

/**
 * Created by sukanta on 8/13/16.
 */
public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new SimpleThread());
        t1.start();

        Thread t2 = new Thread(new SimpleThread());
        t2.start();

        SimpleThread.printCount();
    }
}
