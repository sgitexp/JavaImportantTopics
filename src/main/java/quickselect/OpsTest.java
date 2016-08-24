package quickselect;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by chattops on 8/24/2016.
 */
public class OpsTest {


    @Test
    public void findKthLargest() throws Exception {


        int[] a = { -1, 3 , 2, 0, 7, 8, 5, 9 };

        int k = 8;
        int kLargest = Ops.findKthLargest( a, k );

        Arrays.sort(a);
        int nLargest = a[ a.length - k ];

        Assert.assertEquals(kLargest,nLargest);

    }

    @Test
    public void findKthLargestException() throws Exception {

        int[] a = { -1, 3 , 2, 0, 7, 8, 5, 9 };
        int k = -1;
        int kLargest = Ops.findKthLargest( a, k );
        Assert.assertEquals(kLargest,Integer.MAX_VALUE);

    }

}