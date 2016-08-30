package threads.ch8.rentrant.lock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by chattops on 8/22/2016.
 */
public class RunnerWaitAndNotifyEquivalent {

    private int count = 0;

    private Lock lock = new ReentrantLock();
    private Condition cond = lock.newCondition();

    private void increment() {
        for (int i = 0; i <10000 ; i++) {
            count++;
        }
    }

    public void firstThread() throws InterruptedException {

        lock.lock();
        System.out.println("Waiting.... ");
        cond.await();
        System.out.println("Woke up.... ");

        try {
            increment();
        } finally {
            lock.unlock();
        }
    }

    public void secondThread() throws InterruptedException {

        Thread.sleep(1000);
        lock.lock();
        System.out.println("Enter Return Key");
        new Scanner(System.in).nextLine();
        System.out.println("Got Return Key");
        cond.signal();

        try {
            increment();
        } finally {
            lock.unlock();
        }
    }

    public void finished() {
        System.out.println("Count is " + count);
    }
}
