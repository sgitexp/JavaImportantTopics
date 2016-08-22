package threads.ch2.demo3;

/**
 * Created by sukanta on 8/13/16.
 */
public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new SimpleThread());
        Thread t2 = new Thread(new SimpleThread());

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (Exception e) {
            e.printStackTrace();
        }
        SimpleThread.printCount();
    }
}
