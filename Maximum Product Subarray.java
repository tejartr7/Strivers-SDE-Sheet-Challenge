import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int pro=Integer.MIN_VALUE;
		int i,j;
		for(i=0;i<n;i++)
		{
			int p=1;
			for (j = i; j < n; j++)
			{
				p*=arr.get(j);
				pro=Math.max(pro,p);
			}
		}
		return pro;
	}
}
