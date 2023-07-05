import java.util.*;
import java.io.*;

public class Solution {

	public static boolean isPal(String temp) {
		int i = 0, j = temp.length() - 1;
		while (i < j) {
			if (temp.charAt(i) != temp.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static int palindromePartitioning(String str) {
		// Write your code here
		int i, n = str.length();
		int mini = Integer.MAX_VALUE;
		if (n == 1)
			return 0;
		if (isPal(str))
			return 0;
		for (i = 0; i < n; i++) {
			String temp = str.substring(0, i + 1);
			if (isPal(temp)) {
				mini = Math.min(mini, 1 + palindromePartitioning(str.substring(i + 1)));
			}
		}
		return mini;
	}
}
