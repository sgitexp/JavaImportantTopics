package threads.ch5.synch.locks.with.demo;


/**
 * Created by chattops on 8/19/2016.
 */
public class RunnerWithLocks {
    public static void main(String[] args) {

        Thread t1 = new Thread(new SimpleThreadWithLocks());
        Thread t2 = new Thread(new SimpleThreadWithLocks());

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
        System.out.println(SimpleThreadWithLocks.getCount1());
        System.out.println(SimpleThreadWithLocks.getCount2());
        System.out.println("Time taken : " +( e-s )+ " ms");
    }
}
