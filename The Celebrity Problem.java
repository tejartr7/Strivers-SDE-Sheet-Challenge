import java.util.*;
import java.io.*;
/*
	This is signature of helper function 'knows'.
	You should not implement it, or speculate about its implementation.

	boolean knows(int A, int B); 
	Function 'knows(A, B)' will returns "true" if the person having
	id 'A' know the person having id 'B' in the party, "false" otherwise.
	Use it as Runner.knows(A, B);
*/

public class Solution {
	public static int celebrity(int m[][], int n) {
		// code here
		int i, j;
		int k[] = new int[n];
		int x[] = new int[n];
		for (i = 0; i < n; i++) {
			int sum = 0;
			for (j = 0; j < n; j++) {
				sum += m[i][j];
				if (m[i][j] == 1) {
					k[j] += 1;
				}
			}
			x[i] += sum;
		}

		boolean valid = false;
		int cnt = 0;
		for (i = 0; i < n; i++) {
			if (k[i] == n - 1 && x[i] == 0) {
				return i;
			}
		}
		return -1;
	}

	public static int findCelebrity(int n) {
		// Write your code here.
		int i, j;
		int m[][] = new int[n][n];
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (Runner.knows(i, j)) {
					m[i][j] = 1;
				}
			}
		}
		return celebrity(m, n);
	}
}
