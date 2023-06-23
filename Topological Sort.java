import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int n, int e) 
    {
        // Write your code here
        int indegree[]=new int[n];
        int i,j;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(i=0;i<n;i++)
        map.put(i,new ArrayList<>());
        int l=edges.size();
        for(i=0;i<l;i++)
        {
            int x=edges.get(i).get(0);
            int y=edges.get(i).get(1);
            map.get(x).add(y);
            indegree[y]++;
        }
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(i=0;i<n;i++)
        {
            if(indegree[i]==0)
            q.offer(i);
        }
        while(!q.isEmpty())
        {
            int top=q.poll();
            ans.add(top);
            for(int x:map.get(top))
            {
                indegree[x]--;
                if(indegree[x]==0)
                q.offer(x);
            }
        }
        //System.out.println(ans);
        return ans;
    }
}
