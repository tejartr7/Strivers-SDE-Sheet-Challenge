import java.util.* ;
import java.io.*; 
/*
    
    Following is the Binary Tree node structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }

*/

public class Solution {
    public static void helper(TreeNode root,List<Integer> list)
    {
        if(root==null) return ;
        helper(root.left,list);
        list.add(root.data);
        helper(root.right,list);
    }
    public static List < Integer > getInOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> list=new ArrayList<>();
        helper(root,list);
        return list;
    }
}
