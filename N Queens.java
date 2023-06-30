import java.io.*;
import java.util.*;

public class Solution {

    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        NQueen(ans, 0, 0, n, board);
        return ans;
    }

    public static void NQueen(ArrayList<ArrayList<Integer>> ans, int row, int qpsf, int tq, boolean[][] board) {
        if (qpsf == tq) {
            ans.add(construct(board));
            return;
        }

        for (int col = 0; col < board[0].length; col++) {
            if (isItSafeToPlaceTheQueen(board, row, col)) {
                board[row][col] = true;
                NQueen(ans, row + 1, qpsf + 1, tq, board);
                board[row][col] = false;
            }
        }
    }

    public static ArrayList<Integer> construct(boolean[][] board) {
        ArrayList<Integer> res = new ArrayList<>();
        for (boolean[] row : board) {
            for (boolean cell : row) {
                res.add(cell ? 1 : 0);
            }
        }
        return res;
    }

    public static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col) {
        int n = board.length;

        // Check vertically upwards
        for (int r = row - 1; r >= 0; r--) {
            if (board[r][col])
                return false;
        }

        // Check horizontally to the left
        for (int c = col - 1; c >= 0; c--) {
            if (board[row][c])
                return false;
        }

        // Check diagonally left-up
        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c])
                return false;
        }

        // Check diagonally right-up
        for (int r = row - 1, c = col + 1; r >= 0 && c < n; r--, c++) {
            if (board[r][c])
                return false;
        }

        return true; // When all the above conditions are false
    }
}
