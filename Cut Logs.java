import java.io.*;
import java.util.*;

public class Solution {

    static int dp[][];

    public static int helper(int e, int f) {
        if (f <= 1 || e == 1) {
            return f;
        }

        if (dp[e][f] != -1) {
            return dp[e][f];
        }

        // Use binary search
        int ans = Integer.MAX_VALUE;
        int start = 1, end = f;
        while (start <= end) {
            int mid = (start + end) / 2;

            int BREAK = helper(e - 1, mid - 1);
            int SURVIVE = helper(e, f - mid);

            // Update answer with minimum value
            ans = Math.min(ans, 1 + Math.max(BREAK, SURVIVE));

            if (BREAK < SURVIVE) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        dp[e][f] = ans;
        return ans;
    }

    public static int eggDrop(int n, int k) {
        // Your code here
        dp = new int[n + 1][k + 1];
        for (int x[] : dp)
            Arrays.fill(x, -1);
        return helper(n, k);
    }

    public static int cutLogs(int k, int n) {
        // Write your code here
        return eggDrop(k, n);
    }

}
