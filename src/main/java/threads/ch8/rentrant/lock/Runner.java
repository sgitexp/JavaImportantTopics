package threads.ch8.rentrant.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by chattops on 8/22/2016.
 */
public class Runner {

    private int count = 0;

    private Lock lock = new ReentrantLock();

    private void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public void firstThread() throws InterruptedException {
        lock.lock();
        try {
            increment();
        } finally {
            lock.unlock();
        }
    }

    public void secondThread() throws InterruptedException {
        lock.lock();
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
