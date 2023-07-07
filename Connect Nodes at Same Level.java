import java.util.*;
import java.io.*;
/*
    ----------------- Binary Tree node class for reference -----------------

    class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;
	    public BinaryTreeNode<T> next;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	        next = null;
	    }
	};

*/

public class Solution {
	public static BinaryTreeNode<Integer> connect(BinaryTreeNode<Integer> root) {
		if (root == null)
			return root;
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			int n = q.size(), i;
			for (i = 0; i < n; i++) {
				BinaryTreeNode<Integer> temp = q.poll();
				if (i == n - 1)
					temp.next = null;
				else
					temp.next = q.peek();
				if (temp.left != null)
					q.offer(temp.left);
				if (temp.right != null)
					q.offer(temp.right);
			}
		}
		return root;
	}

	public static void connectNodes(BinaryTreeNode<Integer> root) {
		// Write your code here.
		root = connect(root);
	}
}
