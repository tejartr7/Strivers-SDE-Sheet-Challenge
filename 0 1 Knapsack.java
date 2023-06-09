import java.util.ArrayList;

public class Solution {
	public static int helper(ArrayList<Integer> values, ArrayList<Integer> weights, int w, int ind, int sum) {
		if (w == 0)
			return sum;
		if (ind == values.size())
			return sum;
		int x = 0, y = 0;
		x = helper(values, weights, w, ind + 1, sum);
		if (w >= weights.get(ind)) {
			y = helper(values, weights, w - weights.get(ind), ind + 1, sum + values.get(ind));
		}
		return Math.max(x, y);
	}

	public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
		// Write your code here.
		int dp[][]=new int[n][w+1];
		int i,j;
		for(i=weights.get(0);i<=w;i++)
		dp[0][i]=values.get(0);
		for(i=1;i<n;i++)
		{
			for(j=0;j<=w;j++)
			{
				int nottake=dp[i-1][j];
				int take=0;
				if(weights.get(i)<=j)
				{
					take+=values.get(i)+dp[i-1][j-weights.get(i)];
				}
				dp[i][j]=Math.max(take,nottake);
			}
		}
		return dp[n-1][w];
	}
}
