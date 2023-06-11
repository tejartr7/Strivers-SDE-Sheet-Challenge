
public class Solution {

	public static long helper(int idx,int d[],int value,long dp[][])
	{
		if(idx==0)
		return value%d[0]==0?1l:0l;
		if(dp[idx][value]!=-1) return dp[idx][value];
		long notTake=helper(idx-1,d,value,dp);
		long take=0;
		if(d[idx]<=value)
		{
			take=helper(idx,d,value-d[idx],dp);
		}
		return dp[idx][value]=take+notTake;
	}
	public static long countWaysToMakeChange(int denominations[], int value){
        //write your code here
		int i,j,n=denominations.length;			
		long dp[][]=new long[n][value+1];
		for(i=0;i<n;i++)
		{
			for(j=0;j<=value;j++)
			{
				dp[i][j]=-1l;
			}
		}

		long x=helper(n-1,denominations,value,dp);
		return x;
	}
	
}
