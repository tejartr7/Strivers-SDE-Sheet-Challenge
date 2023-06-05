import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> nums) 
	{
		// Write your code here.
		
		int first_max=0,second_max=0;
        int i,j,n=nums.size();
        int index=-1;
        for(i=n-2;i>=0;i--)
        {
            if(nums.get(i)<nums.get(i+1))
            {
                index=i;
                break;
            }
        }
        if(index==-1)
            Collections.sort(nums);
        else
        {
            for(i=n-1;i>index;i--)
            {
                if(nums.get(i)>nums.get(index))
                {
                    swap(nums,i,index);
                    break;
                }
            }
            int x=index+1,y=n-1;
            while(x<y)
            {
                swap(nums,x,y);
                x++;
                y--;
            }
        }
		return nums;
	}
	public static void swap(ArrayList<Integer> nums,int i,int j)
    {
        int temp=nums.get(i);
		int temp2=nums.get(j);
        nums.set(i,temp2);
		nums.set(j,temp);
    }
   
}
