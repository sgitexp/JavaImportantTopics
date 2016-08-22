package threads.ch2.demo1;

import java.util.Scanner;

/**
 * Created by sukanta on 8/13/16.
 */
public class Main {
    public static void main(String[] str) {

        SimpleThread t1 = new SimpleThread();
        t1.start();

        System.out.println("Press return to stop....");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        t1.shutdown();
    }
}
