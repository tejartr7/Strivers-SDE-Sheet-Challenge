import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the Binary Tree node structure

    class BinaryTreeNode<Integer> {
        int data;
        BinaryTreeNode<Integer> left;
        BinaryTreeNode<Integer> right;

        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

 *************************************************************/

public class Solution {
    public static boolean helper(BinaryTreeNode<Integer> root,int min,int max)
    {
        if(root==null) return true;
        if(root.data>max) return false;
        if(root.data<min) return false;
        return helper(root.left,min,root.data) && helper(root.right,root.data,max);
    }
    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        // Write your code here
        if(root==null) return true;
        return helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}
