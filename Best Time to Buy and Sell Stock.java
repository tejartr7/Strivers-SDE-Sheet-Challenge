import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int i,n=prices.size();
        int mini=prices.get(0);
        int maxi=0;
        for(i=1;i<n;i++)
        {
            mini=Math.min(mini,prices.get(i));
            int profit=prices.get(i)-mini;
            maxi=Math.max(maxi,profit);
        }
        return maxi;
    }
}
