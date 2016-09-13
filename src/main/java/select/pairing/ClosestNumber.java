package select.pairing;

import java.util.Arrays;


/**
 * Created by chattops on 9/12/2016.
 */
public class ClosestNumber {

    public static void getClosestPair(int a[]){

        if(a== null ||( a!= null &&a.length == 0) || a.length == 1) {
            System.out.println("Need atleast two numbers.");
            return;
        }

        if(a.length == 2) {
            System.out.println(a[0] + ", " + a[1] + " are the closest pair. " );
            return;
        }

        Arrays.sort(a);

        int head = 1;
        int tail = 2;
        int diff = Math.abs(a[head] - a[tail]);

        int fHead = 0;
        int fTail = 0;

        while(tail < a.length) {

            if( diff > Math.abs(a[head] - a[tail])) {
                diff = Math.abs(a[head] - a[tail]);
                fHead = head;
                fTail = tail;
            }
            head++;
            tail++;
        }
        System.out.println( a[fHead] + ", " +  a[fTail]+ " are the closet numbers.");
    }

}
