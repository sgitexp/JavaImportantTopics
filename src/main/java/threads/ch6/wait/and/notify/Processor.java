package threads.ch6.wait.and.notify;

import java.util.Scanner;

/**
 * Created by chattops on 8/22/2016.
 */
public class Processor {

    public void produce() throws InterruptedException{
        synchronized (this){
            System.out.println("Running producer method through one thread");
            wait();
            System.out.println("Resumed");
        }
    }
    public void consume() throws InterruptedException{

        Scanner s = new Scanner(System.in);
        Thread.sleep(2000);

        synchronized (this){
            System.out.println("Waiting for return key...");
            s.nextLine();
            System.out.println("Return key pressed...");
            notify();
            Thread.sleep(5000);
        }
    }

}
