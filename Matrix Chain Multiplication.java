import java.util.* ;
import java.io.*; 

public class Solution {
	public static int helper(int i,int j,int arr[],int dp[][])
	{
		if(i==j) return 0;
		if(dp[i][j]!=-1) return dp[i][j];
		int mini=Integer.MAX_VALUE;
		int k;
		for(k=i;k<j;k++)
		{
			int steps=(arr[i-1]*arr[k]*arr[j])+helper(i,k,arr,dp)+helper(k+1,j,arr,dp);
			mini=Math.min(mini,steps);
		}
		return dp[i][j]=mini;
	}
	public static int matrixMultiplication(int[] arr , int n) {
		// Write your code here
		int dp[][]=new int[n][n];
		int i;
		for(i=0;i<n;i++)
		Arrays.fill(dp[i],-1);
		return helper(1,n-1,arr,dp);
	}
}
