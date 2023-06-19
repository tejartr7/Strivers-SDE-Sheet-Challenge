import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		int ans = arr[0];
		int count = 1;

		for(int i = 0; i < n; ++i) {
			if(arr[i] == ans) {
				count++;
			}
			else {
				count--;
			}
			
			if(count == 0) {
				ans = arr[i];
				count = 1;
			}
		}
		
		count = 0;
		for(int i = 0; i < n; ++i) {
			if(arr[i] == ans) {
				count++;
			}
		}
		
		return (count > n / 2) ? ans : -1;
	}
} 
