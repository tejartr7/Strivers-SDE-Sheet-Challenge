import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minSumPath(int[][] grid) {
    	// Write your code here.
        int i,j;
        int m=grid.length,n=grid[0].length;
        for(i=m-1;i>=0;i--)
        {
            for(j=n-1;j>=0;j--)
            {
                if(i==m-1 && j==n-1)
                continue;
                else
                {
                    int a=Integer.MAX_VALUE;
                    int b=Integer.MAX_VALUE;
                    if(i+1<m)
                    a=grid[i+1][j];
                    if(j+1<n)
                    b=grid[i][j+1];
                    grid[i][j]+=Math.min(a,b);
                }
            }
        }
        return grid[0][0];
    }
}
