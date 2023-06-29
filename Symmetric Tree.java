/*****************************************************************
 * 
 * Following is the representation for the Binary Tree Node:
 * 
 * class BinaryTreeNode<T> {
 * T data;
 * BinaryTreeNode<T> left;
 * BinaryTreeNode<T> right;
 * 
 * public BinaryTreeNode(T data) {
 * this.data = data;
 * }
 * }
 * 
 ****************************************************************/

public class Solution {
    public static boolean helper(BinaryTreeNode<Integer> a, BinaryTreeNode<Integer> b) {
        if (a == null)
            return b == null;
        if (b == null)
            return a == null;
        if (a.data != b.data)
            return false;
        return helper(a.left, b.right) && helper(a.right, b.left);
    }

    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        // Write your code here.
        if (root == null)
            return true;
        return helper(root.left, root.right);
    }
}
