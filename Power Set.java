import java.util.*;
import java.io.*;

public class Solution {
	static ArrayList<ArrayList<Integer>> ans;

	public static void helper(int idx, ArrayList<Integer> list, ArrayList<Integer> arr) {
		if (idx >= arr.size()) {
			// if(!ans.contains(new ArrayList<>(list)))
			ans.add(new ArrayList<>(list));
			return;
		}
		list.add(arr.get(idx));
		helper(idx + 1, list, arr);
		list.remove(list.size() - 1);
		helper(idx + 1, list, arr);
	}

	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		// WRITE YOUR CODE HERE
		ans = new ArrayList<>();
		helper(0, new ArrayList<>(), arr);
		return ans;
	}
}
