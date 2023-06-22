import java.io.*;
import java.util.*;
public class Solution {

	public static int bin(int x, List<Integer> list) {
		int i=0,j=list.size()-1;
		while(i<=j)
		{
			int m=(i+j)/2;
			if(list.get(m)==x)
			return m;
			else if(list.get(m)<x)
			i=m+1;
			else j=m-1;
		}
		return i;
	}

	public static int longestIncreasingSubsequence(int arr[]) {
		// Your code goes here
		int ans = 0;
		int i, j, n = arr.length;
		int dp[] = new int[n];
		List<Integer> list = new ArrayList<>();
		for (i = 0; i < n; i++) {
			if (list.size() == 0 || list.get(list.size() - 1) < arr[i]) {
				list.add(arr[i]);
			} else {
				int x = bin(arr[i], list);
				list.set(x, arr[i]);
			}
		}
		return list.size();
	}

}
