import java.util.*;
import java.io.*;

public class Solution {
  static Map<Integer, List<Integer>> map;
  static boolean found = false;

  public static boolean dfs(int node, int par, boolean vis[], boolean path[]) {
    vis[node] = path[node] = true;
    for (int x : map.get(node)) {
      if (!vis[x]) {
        if (dfs(x, node, vis, path))
          return true;
      } else if (path[x]) {
        return true;
      }
    }
    path[node] = false;
    return false;
  }

  public static boolean detectCycleInDirectedGraph(int n, ArrayList<ArrayList<Integer>> edges) {
    // Write your code here.
    boolean vis[] = new boolean[n + 1];
    boolean path[] = new boolean[n + 1];
    int i, j, l = edges.size();
    map = new HashMap<>();
    found = false;
    for (i = 1; i <= n; i++) {
      map.put(i, new ArrayList<>());
    }
    for (i = 0; i < l; i++) {
      int x = edges.get(i).get(0);
      int y = edges.get(i).get(1);
      map.get(y).add(x);
    }
    for (i = 1; i <= n; i++) {
      if (!vis[i]) {
        if (dfs(i, -1, vis, path))
          return true;
      }
    }
    return false;
  }
}
