import java.util.*;
import java.io.*;
public class Solution {
    static ArrayList<ArrayList<Integer>> ans;
    public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean visited[],ArrayList<Integer> list)
    {
        visited[node]=true;
        //list.add(new ArrayList<>());
        list.add(node);
        for(int x:adj.get(node))
        {
            if(!visited[x])
            {
                dfs(x,adj,visited,list);
            }
        }
    }
    // Function to return a list containing the DFS traversal of the graph.
    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int n, int e, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        int i,j,l=edges.size();
        ans=new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(i=0;i<n;i++)
        list.add(i,new ArrayList<>());
        for(i=0;i<l;i++)
        {
            int x=edges.get(i).get(0);
            int y=edges.get(i).get(1);
            list.get(x).add(y);
            list.get(y).add(x);
        }
        boolean vis[]=new boolean[n];
        for(i=0;i<n;i++)
        {
            if(!vis[i])
            {
                ArrayList<Integer> temp=new ArrayList<>();
                dfs(i,list,vis,temp);
                ans.add(new ArrayList<>(temp));
            }
        }
        return ans;
    }
}
