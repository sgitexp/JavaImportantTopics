package progs.array;

/**
 * Created by chattops on 8/30/2016.
 */
public class ContiguousSum {

    /**
     * Given an array of positive integers and integer k, this program prints contiguous elements summing to K.
     *
     * @param a Array of positive integers
     * @param k Target sum
     */
    public static boolean findSum(int a[], int k) {

        int startIndex = 0;
        int endIndex = 0;
        int sum = 0;
        int counter = 0;
        boolean flag = false;

        while (true) {

            while (sum < k  && endIndex < a.length) {
                sum += a[endIndex++];
            }

            while (sum > k && startIndex <= endIndex) {
                sum -= a[startIndex++];
            }

            if (sum < k && endIndex >= a.length) {
                break;
            }

            if (sum == k) {

                counter++;
                System.out.println("Set " + counter + ": From index " + (startIndex + 1) + " through " + endIndex);

                if (!flag)
                    flag = true;

                if ( endIndex >= a.length )
                    break;

                sum += a[endIndex++];
            }
        }
        return flag;
    }
}
