public class Solution {
	public static String longestPalinSubstring(String str) {
		// Write your code here.
		int i, j, x, y, n = str.length();
		if (n == 1)
			return str;
		int ans = 0;
		String temp = "";
		for (i = 0; i < n; i++) {
			x = i;
			y = i;
			while (x >= 0 && y < n) {
				if (str.charAt(x) != str.charAt(y)) {
					break;
				}
				x--;
				y++;
			}
			if (ans < (y - x - 1)) {
				ans = y - x - 1;
				temp = str.substring(x + 1, y);
			}
			if (i == 0)
				continue;
			x = i - 1;
			y = i;
			while (x >= 0 && y < n) {
				if (str.charAt(x) != str.charAt(y)) {
					break;
				}
				x--;
				y++;
			}
			if (ans < (y - x - 1)) {
				ans = y - x - 1;
				temp = str.substring(x + 1, y);
			}
		}
		return temp;
	}
}
