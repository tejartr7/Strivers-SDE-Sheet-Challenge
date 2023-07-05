import java.util.*;
import java.io.*;

/*************************************************************
 * 
 * Following is the Binary Tree node structure:
 * 
 * class BinaryTreeNode {
 * 
 * int data;
 * BinaryTreeNode left;
 * BinaryTreeNode right;
 * 
 * BinaryTreeNode(int data) {
 * this.data = data;
 * left = null;
 * right = null;
 * }
 * }
 * 
 *************************************************************/

public class Solution {
	static ArrayList<Integer> list;

	public static void inorder(BinaryTreeNode root) {
		if (root == null)
			return;
		inorder(root.left);
		list.add(root.data);
		inorder(root.right);
	}

	public static boolean pairSumBst(BinaryTreeNode root, int k) {
		// Write your code here.
		list = new ArrayList<>();
		inorder(root);
		int i = 0, j = list.size() - 1;
		while (i < j) {
			int sum = list.get(i) + list.get(j);
			if (sum == k)
				return true;
			else if (sum < k)
				i++;
			else
				j--;
		}
		return false;
	}
}
