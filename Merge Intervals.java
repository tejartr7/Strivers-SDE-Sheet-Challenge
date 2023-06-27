import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        int n=intervals.length;
        int dp[][]=new int[n][2];
        int i,j;
        for(i=0;i<n;i++)
        {
            dp[i][0]=intervals[i].start;
            dp[i][1]=intervals[i].finish;
        }
        Arrays.sort(dp,(a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
        List<int[]> ans=new LinkedList<>();
        ans.add(dp[0]);
        for(i=1;i<n;i++)
        {
            int x[]=ans.get(ans.size()-1);
            if(dp[i][0]<=x[1])
            {
                    x[1]=Math.max(x[1],dp[i][1]);
                    ans.get(ans.size()-1)[1]=x[1];
            }
            else
            {
                ans.add(dp[i]);
            }
        }
        List<Interval> res=new LinkedList<Interval>();
        for(i=0;i<ans.size();i++)
        {
            res.add(new Interval(ans.get(i)[0],ans.get(i)[1]));
        }
        return res;
    }
}
