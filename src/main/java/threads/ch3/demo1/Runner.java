package threads.ch3.demo1;

/**
 * Created by chattops on 8/15/2016.
 */
public class Runner {

    public static void main(String[] args) {

        AnonymousWorkerThread worker = new AnonymousWorkerThread();
        worker.main();
    }
}
