package threads.ch5.synch.locks.without.demo;

/**
 * Created by chattops on 8/19/2016.
 */
public class RunnerWithoutLocks {
    public static void main(String[] args) {

        Thread t1 = new Thread(new SimpleThreadWithoutLocks());
        Thread t2 = new Thread(new SimpleThreadWithoutLocks());

        long s = System.currentTimeMillis();
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        long e = System.currentTimeMillis();
        System.out.println(SimpleThreadWithoutLocks.getCount1());
        System.out.println(SimpleThreadWithoutLocks.getCount2());
        System.out.println("Time taken : " + (e - s) + " ms");
    }
}
