import java.util.*;
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

import java.util.ArrayList;

class pair {
    TreeNode<Integer> node;

}

public class Solution {
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) {
        // Write your code here.

        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (root == null)
            return ans;
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int i, n = q.size();
            for (i = 0; i < n; i++) {
                TreeNode<Integer> top = q.poll();
                if (i == 0)
                    ans.add(top.data);
                if (top.left != null)
                    q.offer(top.left);
                if (top.right != null)
                    q.offer(top.right);
            }
        }
        return ans;
    }
}
