package progs.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by chattops on 8/30/2016.
 */
public class ContiguousSumTest {

    @Test
    public void findSumPositiveCase() throws Exception {

        int a[] = {3, 1, 5, 2, 1, 1, 11, 8, 1, 1, 2, 2, 3, 5};
        int counter = 1;

        System.out.print("Array: ");
        for (int p : a) {
            System.out.printf("%2d, ", p);
        }

        System.out.print("\nIndex: ");

        for (int p : a) {
            System.out.printf("%2d, ", counter++);
        }

        System.out.println("\n-----------------------------------------------");
        Assert.assertTrue(ContiguousSum.findSum(a, 10));
    }

    @Test
    public void findSumNegative() throws Exception {
        int a[] = {3, 1, 5, 2, 1, 1, 10, 8, 1, 1};
        Assert.assertFalse(ContiguousSum.findSum(a, 100));
    }

}