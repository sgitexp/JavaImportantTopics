package threads.ch6.wait.and.notify;

/**
 * Created by chattops on 8/22/2016.
 */
public class Runner {
    static Processor processor = new Processor();
    public static void main(String[] a){

        Thread t1 = new Thread(new Runnable() {
          public void run() {
              try {
                  processor.produce();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    processor.consume();
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

    }
}
