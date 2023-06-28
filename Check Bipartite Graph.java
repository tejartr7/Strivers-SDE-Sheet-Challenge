import java.util.*;

public class Solution {

    public static boolean dfs(int i, boolean vis[], int col, int c[], Map<Integer, List<Integer>> map) {
        if (vis[i])
            return c[i] == col;

        c[i] = col;
        vis[i] = true;

        for (int x : map.get(i)) {
            if (!vis[x]) {
                boolean xx = dfs(x, vis, 1 - col, c, map);
                if (!xx)
                    return false;
            } else if (c[x] == col) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> edges) {
        int n = edges.size();
        boolean vis[] = new boolean[n];
        int c[] = new int[n];
        Arrays.fill(vis, false);
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++)
        map.put(i,new ArrayList<>());
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                if (edges.get(i).get(j) == 1) {
                    map.get(i).add(j);
                    map.get(j).add(i);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                boolean x = dfs(i, vis, 1, c, map);
                if (!x)
                    return false;
            }
        }
        return true;
    }
}
