package threads.ch7.producerconsumer.model;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by chattops on 8/22/2016.
 */
public class Processor {

    private final int LIMIT = 10;
    private LinkedList<Integer> list = new LinkedList<Integer>();
    private Object lockObject = new Object();

    public void produce() throws InterruptedException {

        int value = 0;

        while (true) {
            synchronized (lockObject) {
                while (this.list.size() == LIMIT) {
                    lockObject.wait();
                }
                this.list.add(value++);
                lockObject.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        Random random = new Random();
        while (true) {
            synchronized (lockObject) {
                while (list.size() == 0) {
                    lockObject.wait();
                }
                System.out.print("List size is " + list.size());
                int value = this.list.removeFirst();
                System.out.println("; value is " + value);
                lockObject.notify();
            }
            Thread.sleep(random.nextInt(1000));
        }
    }

}
