import java.util.*;
import java.io.*;

public class Solution {
	public static int uniqueSubstrings(String s) {
		// write your code here
		int i, j, n = s.length();
		i = 0;
		j = 0;
		int maxi = 0;
		Set<Character> set = new HashSet<>();
		while (j < n) {
			while (set.contains(s.charAt(j))) {
				set.remove(s.charAt(i));
				i++;
			}
			set.add(s.charAt(j));
			maxi = Math.max(maxi, j - i + 1);
			j++;
		}
		return maxi;
	}
}
