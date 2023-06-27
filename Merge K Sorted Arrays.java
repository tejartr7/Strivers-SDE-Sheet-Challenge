import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(ArrayList<Integer> x:kArrays)
		{
			for(int temp:x)
			pq.offer(temp);
		}
		ArrayList<Integer> ans=new ArrayList<Integer>();
		while(!pq.isEmpty())
		{
			ans.add(pq.poll());
		}
		return ans;
	}
}
