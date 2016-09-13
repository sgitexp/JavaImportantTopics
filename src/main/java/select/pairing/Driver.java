package select.pairing;

import java.util.Scanner;

/**
 * Created by chattops on 9/12/2016.
 */
public class Driver {

    public static void main(String[] args) {

        System.out.println("Enter the number of elements.. ");

        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        int a[] = new int[i];
        System.out.println("Enter elements with spaces in between: ");

        int counter = 0;
        while( counter < i ) {
            a[counter++] = scanner.nextInt();
        }

        ClosestNumber.getClosestPair( a );
        scanner.nextLine();
        scanner.close();

    }
}
