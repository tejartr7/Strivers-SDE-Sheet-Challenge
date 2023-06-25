import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
      Arrays.sort(arr);
      int i,j;
      for(i=0;i<n-2;i++)
      {
        if(i>0 && arr[i]==arr[i-1]) continue;
        for(j=i+1;j<n;j++)
        {
          if(j>i+1 && arr[j]==arr[j-1]) continue;
          int k=j+1;
          int l=n-1;
          while(k<l){
          int sum=arr[i]+arr[j]+arr[k]+arr[l];
          if(sum==target) return "Yes";
          else if(sum<target)
          k++;
          else l--;
          }
        }
      }
      return "No";
  }
}
