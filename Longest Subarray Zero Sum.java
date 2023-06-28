import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int maxi = 0;
		int i, n = arr.size();
		int sum = 0;
		for (i = 0; i < n; i++) {
			sum += arr.get(i);
			if (map.containsKey(sum))
				maxi = Math.max(maxi, i - map.get(sum));
			else
				map.put(sum, i);
		}
		return maxi;

	}
}
