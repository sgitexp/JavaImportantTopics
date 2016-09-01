package threads.ch8.rentrant.lock;


/**
 * Created by chattops on 8/22/2016.
 */
public class AppForWaitAndNotifyEquivalent {
    public static void main(String[] a) {

        final RunnerWaitAndNotifyEquivalent runner = new RunnerWaitAndNotifyEquivalent();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    runner.firstThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    runner.secondThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        runner.finished();
    }
}
