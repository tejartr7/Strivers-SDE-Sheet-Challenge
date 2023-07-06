import java.util.*;
import java.io.*;

/*************************************************************
 * 
 * Following is the Binary Tree node structure
 * 
 * class BinaryTreeNode<T>
 * {
 * T data;
 * BinaryTreeNode<T> left;
 * BinaryTreeNode<T> right;
 * 
 * BinaryTreeNode(T data) {
 * this.data = data;
 * left = null;
 * right = null;
 * }
 * };
 * 
 *************************************************************/
public class Solution {

    public static int helper(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        int l = helper(root.left);
        int r = helper(root.right);
        if (l == Integer.MAX_VALUE || r == Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (Math.abs(l - r) > 1) {
            return Integer.MAX_VALUE;
        }
        return Math.max(l, r) + 1;
    }

    public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
        // Write your code here.
        return helper(root) != Integer.MAX_VALUE;
    }
}
