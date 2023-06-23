import java.util.*;
import java.io.*;

public class Solution {
    public static int helper(int i,int dp[][],int amount,int c[])
    {
        if(i==0)
        {
            if(amount%c[i]==0) return amount/c[i];
            return 10000000;
        }
        if(amount<=0) return 0;
        if(dp[i][amount]!=-1) return dp[i][amount];
        int notTake=helper(i-1,dp,amount,c);
        int take=Integer.MAX_VALUE;
        if(amount>=c[i])
        {
            take=1+helper(i,dp,amount-c[i],c);
        }
        return dp[i][amount]=Math.min(take,notTake);
    }
    public static int findMinimumCoins(int amount) {
        // Write your code here.
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
        int dp[][]=new int[coins.length][amount+1];
        int i=0,j;
        int n=coins.length;
        for(j=0;j<=amount;j++)
        {
            if(j%coins[0]==0)
            dp[i][j]=j/coins[0];
            else dp[i][j]=1000_000_000;
        }
        for(i=1;i<n;i++)
        {
            for(j=0;j<=amount;j++)
            {
                int notTake=dp[i-1][j];
                int take=1000_000_000;
                if(j>=coins[i])
                take=1+dp[i][j-coins[i]];
                dp[i][j]=Math.min(take,notTake);
            }
        }
        int x=dp[coins.length-1][amount];
        return x>=1000000000?-1:x;
    }
}
