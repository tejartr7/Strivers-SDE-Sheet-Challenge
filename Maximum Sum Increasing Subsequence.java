import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int maxIncreasingDumbbellsSum(ArrayList<Integer> rack, int n) {
        // Write your code here.
        int dp[]=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            dp[i]=rack.get(i);
            for(j=i-1;j>=0;j--)
            {
                if(rack.get(i)>rack.get(j))
                {
                    dp[i]=Math.max(dp[i],rack.get(i)+dp[j]);
                }
            }
        }
        int maxi=0;
        for(int x:dp)
        maxi=Math.max(maxi,x);
        return maxi;
    }
}
