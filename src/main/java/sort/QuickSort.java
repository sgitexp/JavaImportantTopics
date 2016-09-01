package sort;

/**
 * Created by chattops on 9/1/2016.
 */
public class QuickSort {

    /**
     * Quick sort of Integer object
     *
     * @param a
     */
    public static void sort(Integer[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Integer a[], int low, int high) {

        if (high <= low) return;
        int partitionIndex = partition(a, low, high);
        sort(a, low, partitionIndex - 1);
        sort(a, partitionIndex + 1, high);

    }

    private static int partition(Integer a[], int low, int high) {

        int pIndex = low;

        while (true) {

            while (low <= high && a[low] <= a[pIndex])
                low++;

            while (low <= high && a[high] > a[pIndex])
                high--;

            if (low >= high)
                break;

            swap(a, low, high);
        }

        swap(a, high, pIndex);
        pIndex = high;
        System.out.println("pIndex: " + pIndex);
        return pIndex;

    }

    private static void swap(Integer[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
