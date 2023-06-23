import java.util.* ;
import java.io.*; 
public class Solution
{
    public static int findMinimumCoins(int amount)
    {
        int count = 0;
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int n = coins.length-1;
        for(int i=n;i>=0;i--){
            while(amount >= coins[i]){
                amount -= coins[i];
                count++;
            }
        }
        return count;
    }
}
