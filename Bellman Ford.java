import java.util.*;
import java.io.*;

public class Solution {
  static int bellmonFord(int n, int m, int src, int dest, ArrayList<ArrayList<Integer>> edges) {
    // Write your code here.
    int dp[][] = new int[n + 1][n + 1];
    int i, j, k;
    for (i = 0; i <= n; i++) {
      Arrays.fill(dp[i], (int) (1000000000));
    }
    int high = 1000000000;
    for (i = 0; i < m; i++) {
      int x = edges.get(i).get(0);
      int y = edges.get(i).get(1);
      int z = edges.get(i).get(2);
      dp[x][y] = z;
    }
    for (i = 0; i <= n; i++) {
      dp[i][i] = 0;
    }
    for (k = 1; k <= n; k++) {
      for (i = 1; i <= n; i++) {
        for (j = 1; j <= n; j++) {
          if (dp[i][j] > dp[i][k] + dp[k][j]) {
            if (dp[i][k] != high && dp[k][j] != high)
              dp[i][j] = dp[i][k] + dp[k][j];
          }
        }
      }
    }
    boolean isCycle = false;
    for (i = 0; i <= n; i++) {
      for (j = 0; j <= n; j++) {
        if (i == j && dp[i][j] != 0) {
          isCycle = true;
        }
      }
    }

    if (isCycle) {
      return -1;
    }
    return dp[src][dest];
  }

}
