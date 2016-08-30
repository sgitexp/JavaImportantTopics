package progs.array;

/**
 * Created by chattops on 8/30/2016.
 */
public class ContiguousSum {

    /**
     * Given an array of positive integers and integer k, this program prints contiguous elements summing to K.
     * @param a Array of positive integers
     * @param k Target sum
     */
    public static boolean findSum(int a[], int k) {

        int startIndex = 0;
        int endIndex = 0;
        int sum = 0;
        int counter = 0;
        boolean flag = false;

        while ( endIndex < a.length ) {

            if (sum == k) {

                counter++;
                System.out.println("Set " + counter + ": From " + (startIndex + 1) + ", through " + (endIndex));
                sum += a[ ++endIndex ];
                flag = true;

            } else if (sum < k) {

                sum += a[endIndex++];

            } else if (sum > k) {

                // If current element is greater than targetSum then sum of
                // any previous element will be greater than targetSum
                // This logic only works if all array elements are positive

                if ( a[endIndex] > k ) {
                    startIndex = endIndex = endIndex + 1;
                    sum = a[startIndex];
                    continue;
                }

                sum -= a[startIndex++];
                if (startIndex == endIndex) {
                    sum += a[ ++endIndex ];
                }
            }
        }

        if (!flag)
            System.out.println("No elements adds upto " + k);

        return flag;
    }
}
