import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long sum=0;
		long maxi=0;
		int i;
		for(i=0;i<n;i++)
		{
			sum+=arr[i];
			if(sum<0)
			sum=0;
			maxi=Math.max(maxi,sum);
		}
		return maxi;
	}

}
