import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		 Stack<Integer> ans=new Stack<>();
        int []res=new int[n];
        res[n-1]=-1;
       ans.push(arr[n-1]);
        int i;
        for(i=n-2;i>=0;i--)
        {   
           
            
            while(!ans.isEmpty() && ans.peek()<=arr[i])
            {
            ans.pop();
            }
             if(ans.isEmpty())
            {
                res[i]=-1;
                ans.push(arr[i]);
                continue;
            }
            
            res[i]=ans.peek();
            ans.push(arr[i]);
            
        }
        return res;
	}

}
