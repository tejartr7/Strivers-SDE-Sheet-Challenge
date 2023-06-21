import java.util.* ;
import java.io.*; 
class pair
{
	int v;
	int d;
	pair(int a,int b)
	{
		v=a;
		d=b;
	}
}
public class Solution {
	
	public static ArrayList < Integer > dijkstra(ArrayList< ArrayList < Integer > > vec,
	 int n, int edges, int source){
		// Write your code here.
		int dist[]=new int[n];
		Arrays.fill(dist,2147483647);
		dist[source]=0;
		PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->a.d-b.d);
		pq.offer(new pair(source,0));
		Map<Integer,ArrayList<pair>> map=new HashMap<>();
		int i,l=vec.size();
		for(i=0;i<n;i++)
		map.put(i,new ArrayList<>());
		for(i=0;i<l;i++)
		{
			int x=vec.get(i).get(0);
			int y=vec.get(i).get(1);
			int z=vec.get(i).get(2);
			map.get(x).add(new pair(y,z));
			map.get(y).add(new pair(x,z));
		}
		while(!pq.isEmpty())
		{
			pair top=pq.poll();
			for(pair x:map.get(top.v))
			{
				if(top.d+x.d<dist[x.v])
				{
					dist[x.v]=top.d+x.d;
					pq.offer(new pair(x.v,dist[x.v]));
				}
			}
		}
		ArrayList<Integer> list=new ArrayList<>();
		for(int x:dist)
		{
			list.add(x);
		}
		return list;
	}
}
