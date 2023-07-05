import java.util.*;
import java.io.*;

public class Solution {
	static int ans = 0;

	public static int helper(TreeNode<Integer> root)

	{
		if (root == null)
			return 0;
		int x = helper(root.left);
		int y = helper(root.right);
		ans = Math.max(ans, x + y);
		return 1 + Math.max(x, y);
	}

	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		// Write your code here.
		ans = 0;
		helper(root);
		return ans;
	}
}
