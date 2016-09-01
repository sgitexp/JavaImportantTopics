package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by chattops on 9/1/2016.
 */
public class QuickSortTest {
    @Test
    public void sort() throws Exception {

        Integer a[] = {3, 1, 5, 2, 4, 20, 11, 9, 15, 37, 7, 8, 35, 25, 16, 10};
        Integer b[] = {3, 1, 5, 2, 4, 20, 11, 9, 15, 37, 7, 8, 35, 25, 16, 10};

        System.out.print("Array before: ");
        for (int p : a) {
            System.out.printf("%2d, ", p);
        }

        QuickSort.sort(a);
        Arrays.sort(b);
        System.out.println();

        System.out.print("Array after: ");
        for (int p : a) {
            System.out.printf("%2d, ", p);
        }

        assertTrue(Arrays.deepEquals(a, b));
    }

}