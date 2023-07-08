import java.util.*;
import java.io.*;

/************************************************************
 * 
 * Following is the TreeNode class structure:
 * 
 * class BinaryTreeNode {
 * int val;
 * BinaryTreeNode left;
 * BinaryTreeNode right;
 * 
 * BinaryTreeNode(int val) {
 * this.val = val;
 * this.left = null;
 * this.right = null;
 * }
 * }
 * 
 ************************************************************/

class pair {
	BinaryTreeNode node;
	int lvl;

	pair(BinaryTreeNode temp, int x) {
		node = temp;
		lvl = x;
	}
}

public class Solution {
	static Map<Integer, Integer> map;

	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		// Write your code here.
		map = new TreeMap<>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Queue<pair> q = new LinkedList<>();
		q.offer(new pair(root, 0));
		if (root == null)
			return ans;
		while (!q.isEmpty()) {
			pair top = q.poll();
			if (!map.containsKey(top.lvl))
				map.put(top.lvl, top.node.val);

			if (top.node.left != null)
				q.offer(new pair(top.node.left, top.lvl - 1));
			if (top.node.right != null)
				q.offer(new pair(top.node.right, top.lvl + 1));
		}
		for (int x : map.keySet())
			ans.add(map.get(x));
		return ans;
	}
}
