import java.util.*;
import java.io.*;

public class Solution {
    public static long trap(long[] h) {
        long max = 0;
        int n = h.length, i;
        long a[] = new long[n];
        long b[] = new long[n];
        a[0] = h[0];
        b[n - 1] = h[n - 1];
        for (i = 1; i < n; i++)
            a[i] = Math.max(a[i - 1], h[i]);
        for (i = n - 2; i >= 0; i--)
            b[i] = Math.max(b[i + 1], h[i]);
        for (i = 0; i < n; i++) {
            long min = Math.min(a[i], b[i]);
            if (min > h[i])
                max += min - h[i];
        }
        return max;
    }

    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
        return trap(arr);
    }
}
