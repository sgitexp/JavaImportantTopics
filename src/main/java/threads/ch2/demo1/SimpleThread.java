package threads.ch2.demo1;

/**
 * Created by Sukanta on 8/13/16.
 * This set up works but now a good practice,
 * as in some cases if this value is cached by jvm for optimisation
 * the thread will never see a change occuring to running variable
 * can be avoided with volatile keyword
 */
public class SimpleThread extends Thread {

    //private boolean running = true;

    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
