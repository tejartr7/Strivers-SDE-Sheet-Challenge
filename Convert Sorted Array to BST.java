import java.util.*;
import java.io.*;
/****************************************************************

    Following is the class structure of the TreeNode class:

    class TreeNode<T> {
        public T data;
        public TreeNode<T> left;
        public TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }


*****************************************************************/

import java.util.ArrayList;

public class Solution {
    public static TreeNode<Integer> creater(int s, int e, ArrayList<Integer> arr, int n) {
        if (s > e)
            return null;
        int m = (s + e) / 2;
        TreeNode<Integer> root = new TreeNode(arr.get(m));
        root.left = creater(s, m - 1, arr, n);
        root.right = creater(m + 1, e, arr, n);
        return root;
    }

    public static TreeNode<Integer> sortedArrToBST(ArrayList<Integer> arr, int n) {
        // Write your code here.
        if (arr.size() == 0)
            return null;
        return creater(0, n - 1, arr, n);
    }
}
