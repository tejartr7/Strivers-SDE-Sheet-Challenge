import java.util.* ;
import java.io.*; 
public class Solution {
    static ArrayList<Integer> ans;
    public static void helper(int idx,int sum,int num[])
    {
        int n=num.length;
        if(idx>=n) {ans.add(sum);return ;}
        helper(idx+1,sum,num);
        helper(idx+1,sum+num[idx],num);
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ans=new ArrayList<>();
        helper(0,0,num);
        Collections.sort(ans);
        return ans;
    }

}
