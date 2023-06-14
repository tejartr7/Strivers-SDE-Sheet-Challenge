import java.util.*;
public class Solution {

	public static int lcs(String s, String t) {
		//Your code goes here
		int m=s.length(),n=t.length();
		int dp[][]=new int[m+1][n+1];
		int i,j;
		Arrays.fill(dp[0],0);
		i=0;
		for(j=0;j<=n;j++)
		dp[0][j]=0;
		for(i=1;i<=m;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(s.charAt(i-1)==t.charAt(j-1))
				{
					dp[i][j]=1+dp[i-1][j-1];
				}
				else{
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		return dp[m][n];
    }

}
