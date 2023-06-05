import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] nums)
    {
        //Write your code here
        int[] arr = new int[3];
        for (int i : nums){
            arr[i]++;
        }
        int i = 0;
        while (arr[0]>0){
            nums[i++] = 0;
            arr[0]--;
        }
        while (arr[1]>0){
            nums[i++] = 1;
            arr[1]--;
        }
        while (arr[2]>0){
            nums[i++] = 2;
            arr[2]--;
        }
    }
}
