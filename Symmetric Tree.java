import java.io.*;
public class Solution {
    public static boolean helper(BinaryTreeNode<Integer> a, BinaryTreeNode<Integer> b) {
        if (a == null && b==null)
            return true;
        if (a==null || b==null || a.data != b.data)
            return false;
        return helper(a.left, b.right);
    }

    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        // Write your code here.
        if (root == null)
            return true;
        return helper(root.left, root.right);
    }
}
