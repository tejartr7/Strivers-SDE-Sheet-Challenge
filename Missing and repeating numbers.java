import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int xor=0;
        int i,j;
        for(int x:arr)
        xor^=x;
        for(i=1;i<=n;i++)
        xor^=i;
        int c=0,d=0;
        int ans[]=new int[2];
        int x=-1;
        for(i=0;i<32;i++)
        {
            int temp=(xor>>i)%2;
            if(temp==1)
            {
                x=i;
                break;
            }
        }
        for(int k:arr)
        {
            int temp=(k>>x)%2;
            if(temp==1)
            c^=k;
            else d^=k;
        }
        for(int k=1;k<=n;k++)
        {
            int temp=(k>>x)%2;
            if(temp==1)
            c^=k;
            else d^=k;
        }
        if(arr.contains(c))
        {ans[0]=d;
        ans[1]=c;}
        else
        {ans[0]=c;
        ans[1]=d;}
        return ans;
    }
}
