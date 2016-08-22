package threads.ch4.synch.demo;

/**
 * Created by chattops on 8/19/2016.
 */
public class Runner {

    public static void main(String[] args) {
        process();
        System.out.println(SimpleThread.getCount());
    }

    public static void process() {

        Thread t1 = new Thread(new SimpleThread());
        Thread t2 = new Thread(new SimpleThread());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
