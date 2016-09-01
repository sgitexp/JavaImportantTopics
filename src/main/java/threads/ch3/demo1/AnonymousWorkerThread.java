package threads.ch3.demo1;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by chattops on 8/15/2016.
 */
public class AnonymousWorkerThread {

    Random random = new Random();
    private ArrayList<Integer> list1 = new ArrayList<Integer>();
    private ArrayList<Integer> list2 = new ArrayList<Integer>();

    private void stageOne() {

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list1.add(random.nextInt(100));
    }

    private void stageTwo() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list2.add(random.nextInt(100));
    }

    private void process() {
        for (int i = 0; i < 1000; i++) {
            stageOne();
            stageTwo();
        }
    }

    public void main() {

        System.out.println("Starting ...");

        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                process();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                process();
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

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start));
        System.out.println("List1: " + list1.size() + "; List2: " + list2.size());
    }


}
