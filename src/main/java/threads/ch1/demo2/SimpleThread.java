package threads.ch1.demo2;

/**
 * Created by sukanta on 8/13/16.
 */

public class SimpleThread implements Runnable{

    public void run() {

        for(int i=0; i<10; i++) {
            System.out.println("Hello " + i );
        }

        try {
            Thread.sleep(10);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
