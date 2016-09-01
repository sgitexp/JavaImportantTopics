package select;

/**
 * Created by chattops on 8/24/2016.
 */
public class QuickSelect {


    public static int findKthLargest(int[] a, int k) {

        if (k <= 0 || k > a.length)
            return Integer.MAX_VALUE;

        int low = 0;
        int high = a.length - 1;
        int index = a.length - k;

        while (low < high) {

            int pivot = partition(a, low, high);

            if (pivot < index)
                low = pivot + 1;
            else if (pivot > index)
                high = pivot - 1;
            else
                return a[pivot];

        }

        return a[low];
    }

    private static int partition(int[] a, int low, int high) {

        int pIndex = low;

        while (low <= high) {
            while (low <= high && a[low] <= a[pIndex]) low++;
            while (low <= high && a[high] > a[pIndex]) high--;
            if (low > high) break;
            swap(a, low, high);
        }

        swap(a, high, pIndex);
        pIndex = high;

        return pIndex;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
