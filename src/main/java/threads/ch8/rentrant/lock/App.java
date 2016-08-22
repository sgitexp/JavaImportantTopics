package threads.ch8.rentrant.lock;

import threads.ch7.producerconsumer.model.Processor;

/**
 * Created by chattops on 8/22/2016.
 */
public class App {
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
