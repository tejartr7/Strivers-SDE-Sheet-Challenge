import java.util.Queue;
import java.util.LinkedList;

public class Solution {
	public static int getMaxWidth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);

		int maxWidth = 0;

		while (!q.isEmpty()) {
			int currWidth = q.size();
			if (maxWidth < currWidth) {
				maxWidth = currWidth;
			}
			while (currWidth > 0) {
				TreeNode currNode = q.peek();
				q.poll();
				if (currNode.left != null) {
					q.add(currNode.left);
				}
				if (currNode.right != null) {
					q.add(currNode.right);
				}
				currWidth = currWidth - 1;
			}
		}

		return maxWidth;
	}
}
