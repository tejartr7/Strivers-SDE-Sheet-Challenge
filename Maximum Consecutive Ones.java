import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		// Write your code here.
		int sum=0;
		int i=0,j=0;
		int maxi=0;
		while(j<n)
		{
			sum+=arr.get(j);
			while(sum+k<j-i+1)
			{
				sum-=arr.get(i);
				i++;
			}
			maxi=Math.max(maxi,j-i+1);
			j++;
		}
		return maxi;
	}
}
