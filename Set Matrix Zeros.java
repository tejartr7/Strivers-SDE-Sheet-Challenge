import java.io.*;
import java.util.*;

public class Solution {
    private static void make(int aa[][], int x, int y) {
        int l = aa.length;
        int b = aa[0].length;
        int i;
        for (i = 0; i < l; i++) {
            aa[i][y] = 0;
        }
        for (i = 0; i < b; i++) {
            aa[x][i] = 0;
        }

    }

    public static void setZero(int[][] matrix) {
        int l = matrix.length;
        int b = matrix[0].length;
        int i, j;
        int a[][] = new int[l][b];
        for (i = 0; i < l; i++) {
            for (j = 0; j < b; j++) {
                a[i][j] = matrix[i][j];
            }
        }
        for (i = 0; i < l; i++) {
            for (j = 0; j < b; j++) {
                if (a[i][j] == 0) {
                    make(matrix, i, j);
                }
            }
        }
    }

    public static void setZeros(int matrix[][]) {
        // Write your code here..
        HashSet<Integer> r = new HashSet<>();
        HashSet<Integer> c = new HashSet<>();
        int i, j, m = matrix.length, n = matrix[0].length;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for (int x : r) {
            Arrays.fill(matrix[x], 0);
        }
        for (int x : c) {
            for (i = 0; i < m; i++) {
                matrix[i][x] = 0;
            }
        }
    }

}
