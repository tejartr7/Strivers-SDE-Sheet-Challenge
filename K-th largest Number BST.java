import java.util.* ;
import java.io.*; 
/*************************************************************
    Following is the Binary Search Tree node structure

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

*************************************************************/

import java.util.*;

public class Solution {
	static List<Integer> list;
	public static void helper(TreeNode<Integer> root)
	{
		if(root==null) return ;
		helper(root.left);
		list.add(root.data);
		helper(root.right);
	}
	public static int KthLargestNumber(TreeNode<Integer> root, int k) {
		// Write your code here.
		list=new ArrayList<>();
		helper(root);
		if(k>list.size()) return -1;
		return list.get(list.size()-k);
	}
}
