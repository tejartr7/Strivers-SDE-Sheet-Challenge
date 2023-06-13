import java.util.*;

public class Solution {
	public static int helper(int idx,int p[],int n,int dp[][])
	{
		if(idx==0) return p[0]*n;
		if(dp[idx][n]!=-1)return dp[idx][n];

        int notTake=0+helper(idx-1,p,n,dp);

        int take=Integer.MIN_VALUE;

        int rodLength=idx+1;

        if(rodLength<=n){

            take=p[idx]+helper(idx,p,n-rodLength,dp);

        }

        return dp[idx][n]=Math.max(take,notTake);
	}

	public static int cutRod(int price[], int n) {
		// Write your code here.
		int dp[][] = new int[n][n + 1];
		int i;
		for (i = 0; i < n; i++)
			Arrays.fill(dp[i], -1);
		return helper(n - 1, price, n, dp);
	}
}
