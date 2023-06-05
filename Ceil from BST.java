import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution {

    public  static int findCeil(TreeNode<Integer> node, int x) {

        // Write your code here
        int ans=Integer.MAX_VALUE;
        while(node!=null)
        {
           // System.out.println("->"+node.data);
            if(node.data>=x)
            {
                ans=Math.min(node.data,ans);
            }
            if(node.data<x)
            {
                node=node.right;
            }
            else
                node=node.left;
        }
        if(ans==Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}
