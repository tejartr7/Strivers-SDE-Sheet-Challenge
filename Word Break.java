import java.util.*;

public class Solution {
    static int dp[];

    public static boolean helper(int idx, ArrayList<String> list, String target) {
        int n = target.length();
        if (idx >= n) {
            return true;
        }
        if (dp[idx] != -1)
            return dp[idx] == 1;
        for (int i = idx; i <= n; i++) {
            String temp = target.substring(idx, i);
            // System.out.println(temp);
            if (list.contains(temp)) {
                if (helper(i, list, target)) {
                    dp[idx] = 1;
                    return true;
                }
            }
        }
        dp[idx] = 0;
        return false;
    }

    public static Boolean wordBreak(String[] arr, int n, String target) {
        if (target.isEmpty()) {
            return true;
        }
        ArrayList<String> list = new ArrayList<>();
        for (String x : arr) {
            list.add(x);
        }
        dp = new int[target.length()];
        Arrays.fill(dp, -1);
        return helper(0, list, target);
    }
}
