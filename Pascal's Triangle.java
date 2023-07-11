import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
		// Write your code here.
		ArrayList<ArrayList<Long>> ans = new ArrayList<>();
		if (n == 1) {
			ArrayList<Long> temp = new ArrayList<>();
			temp.add(1l);
			ans.add(new ArrayList<>(temp));
			return ans;
		}
		if (n == 2) {
			ArrayList<Long> temp = new ArrayList<>();
			temp.add(1l);
			ans.add(new ArrayList<>(temp));
			temp.add(1l);
			ans.add(new ArrayList<>(temp));
			return ans;
		}
		ArrayList<Long> temp = new ArrayList<>();
		temp.add(1l);
		ans.add(new ArrayList<>(temp));
		temp.add(1l);
		ans.add(new ArrayList<>(temp));
		int i = 1, j;
		while (i < n-1) {
			temp.clear();
			temp.add(1l);
			for (j = 0; j < ans.get(i).size() - 1; j++) {
				temp.add(ans.get(i).get(j) + ans.get(i).get(j + 1));
			}
			temp.add(1l);
			ans.add(new ArrayList<>(temp));
			i++;
		}
		return ans;
	}
}
