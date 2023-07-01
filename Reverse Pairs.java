import java.util.* ;
import java.io.*; 


public class Solution 
{
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int i,j,n=arr.size();
        int ans=0;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                if(arr.get(i)>2*arr.get(j))
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}
