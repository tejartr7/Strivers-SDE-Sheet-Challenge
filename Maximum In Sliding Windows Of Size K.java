import java.util.*;
import java.io.*;

public class Solution {

	public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) {
		// Write your code here.
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int i = 0, j = 0, n = nums.size();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		while (j < n) {
			pq.offer(nums.get(j));
			while (j - i + 1 > k) {
				pq.remove(nums.get(i));
				i++;
			}
			if (j - i + 1 == k)
				ans.add(pq.peek());
			j++;
		}
		return ans;
	}
}
