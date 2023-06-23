import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int n) {
        // Write your code here.
        Arrays.sort(arr);
        int maxi=1;
        int i;
        int cnt=1;
        for(i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            continue;
            else if(arr[i]-1==arr[i-1])
            cnt++;
            else
            {
                maxi=Math.max(maxi,cnt);
                cnt=1;
            }
        }
        maxi=Math.max(maxi,cnt);
        return maxi;
    }
}
