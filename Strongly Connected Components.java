import java.util.*;
import java.io.*;
public class Solution {
    static Map<Integer,List<Integer>> map;
    public static void dfs(int i,boolean vis[],Stack<Integer> stack)
    {
        if(vis[i]) return ;
        vis[i]=true;
        for(int x:map.get(i))
        {
            dfs(x,vis,stack);
        }
        stack.push(i);
    }
    public static void dfs(int i,boolean vis[],List<Integer> list)
    {
        if(vis[i]) return ;
        vis[i]=true;
        list.add(i);
        for(int x:map.get(i))
        {
            dfs(x,vis,list);
        }
        //stack.push(i);
    }
    public static List<List<Integer>> stronglyConnectedComponents(int n, int[][] edges) {
        // Write your code here
        map=new HashMap<>();
        int i,j,l=edges.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(i=0;i<n;i++)
        map.put(i,new ArrayList<>());
        for(i=0;i<l;i++)
        {
            int x=edges[i][0];
            int y=edges[i][1];
            map.get(x).add(y);
        }
        Stack<Integer> stack=new Stack<>();
        boolean vis[]=new boolean[n];
        Arrays.fill(vis,false);
        for(i=0;i<n;i++)
        {
            if(!vis[i])
            {
                dfs(i,vis,stack);
            }
        }
        Arrays.fill(vis,false);
        map.clear();
        for(i=0;i<n;i++)
        map.put(i,new ArrayList<>());
        for(i=0;i<l;i++)
        {
            int x=edges[i][0];
            int y=edges[i][1];
            map.get(y).add(x);
        }
        while(!stack.isEmpty())
        {
            int x=stack.pop();
            if(!vis[x])
            {
                List<Integer> list=new ArrayList<>();
                dfs(x,vis,list);
                ans.add(new ArrayList<>(list));
            }
        }
        return ans;
    }
}
