import java.util.*;
import java.io.*;

/************************************************************
 * 
 * Following is the Binary Tree node structure:
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
 ************************************************************/

public class Solution {
	public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {

		// Write your code here.

		List<List<Integer>> result = new ArrayList<>();

		List<Integer> in = new ArrayList<>();

		List<Integer> pre = new ArrayList<>();

		List<Integer> po = new ArrayList<>();

		solve(root, in, pre, po);

		result.add(in);

		result.add(pre);

		result.add(po);

		return result;

	}

	public static void solve(BinaryTreeNode<Integer> root, List<Integer> in, List<Integer> pre, List<Integer> po) {

		if (root == null)
			return;

		pre.add(root.data);

		solve(root.left, in, pre, po);

		in.add(root.data);

		solve(root.right, in, pre, po);

		po.add(root.data);

	}

}
