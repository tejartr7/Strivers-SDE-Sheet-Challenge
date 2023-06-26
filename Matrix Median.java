import java.util.*;

public class Solution {
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix) {
		// Write your code here.
		PriorityQueue<Integer> min = new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		int i, j;
		int m = matrix.size(), n = matrix.get(0).size();
		for (ArrayList<Integer> x : matrix) {
			for (int k : x) {
				max.add(k);
				min.add(max.poll());
				if (max.size() < min.size())
					max.add(min.poll());
			}
		}
		if (min.size() == max.size())
			return (min.peek() + max.peek()) / 2;
		return max.peek();
	}
}
