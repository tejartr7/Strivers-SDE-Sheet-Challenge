import java.util.* ;
import java.io.*; 
class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    public DisjointSet(int n) {
        for (int i = 0; i <= n; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node;
        }
        int ulp = findUPar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (rank.get(ulp_u) < rank.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
        } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
            parent.set(ulp_v, ulp_u);
        } else {
            parent.set(ulp_v, ulp_u);
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u, rankU + 1);
        }
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
        } else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }
}
class tuple
{
    int wt;
    int a;
    int b;
    tuple(int x,int y,int z)
    {
        wt=x;
        a=y;
        b=z;
    }

}
public class Solution 
{
    public static ArrayList<ArrayList<Integer>> calculatePrimsMST(int n, int m, ArrayList<ArrayList<Integer>> graph)
    {
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        DisjointSet ds = new DisjointSet(n);
         PriorityQueue<tuple> pq=new PriorityQueue<>((p,q)->p.wt-q.wt);
         int i,j;
         int res=0;
         for(i=0;i<m;i++)
         {
             int x=graph.get(i).get(0);
             int y=graph.get(i).get(1);
             int z=graph.get(i).get(2);
             pq.offer(new tuple(z,x,y));
         }
         while(!pq.isEmpty())
         {
             tuple top=pq.poll();
             int wt=top.wt;
             int a=top.a;
             int b=top.b;
             if(ds.findUPar(a)!=ds.findUPar(b))
             {
                ArrayList<Integer> list=new ArrayList<>();
                list.add(a);
                list.add(b);
                list.add(wt);
                ans.add(list);
                ds.unionByRank(a,b);
             }
         }
        return ans;
    }
}
