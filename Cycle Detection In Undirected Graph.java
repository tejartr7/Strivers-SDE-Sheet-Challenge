import java.io.*;
import java.util.*;

public class Solution {
    static boolean found;

    public static void dfs(int par, int i, boolean vis[], HashMap<Integer, List<Integer>> map) {
        if (vis[i])
            return;
        vis[i] = true;
        for (int x : map.get(i)) {
            if (!vis[x]) {
                dfs(i, x, vis, map);
            } else if (x != par) {
                found = true;
                break;
            }
        }
    }

    public static String cycleDetection(int[][] edges, int n, int m) {
        // Write your code here.
        int i, j;
        found = false;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (i = 0; i <=n; i++)
            map.put(i, new ArrayList<>());
        for (i = 0; i < m; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            map.get(x).add(y);
            map.get(y).add(x);
        }
        boolean vis[] = new boolean[n+1];
        for (i = 1;i<=n; i++) {
            if (!vis[i]) {
                dfs(-1, i, vis, map);
            }
        }
        return found ? "Yes" : "No";
    }

}
