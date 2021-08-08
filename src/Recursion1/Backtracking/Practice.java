package Recursion1.Backtracking;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int n = 4;
        boolean[][] board = new boolean[n][n];
        nQueens(board,0);
    }

    private static void nQueens(boolean[][] board, int row) {

        if(row == board.length) {
            System.out.println(Arrays.deepToString(board));
            return;
        }

            for (int i = 0; i < board.length; i++) {
                if(isSafePlace(board, row, i)) {
                    board[row][i] = true;
                    nQueens(board, row+1);
                    board[row][i] = false;
                }
            }
    }


    private static boolean isSafePlace(boolean[][] board, int row, int column) {

        // Upward
        for (int i = 0; i < row; i++) {
            if(board[i][column]) {
                return false;
            }

            // LeftDiagonal
            int LeftDiagonal = Math.min(row, column);
            for (int j = 1; j <= LeftDiagonal ; j++) {
                if(board[row-1][column-1]) {
                    return false;
                }
            }

            // RightDiagonal
            int RightDiagonal = Math.min(row, board.length-column-1);
            for (int j = 1; j <= RightDiagonal ; j++) {
                if(board[row-1][column+1]) {
                    return false;
                }
            }
        }
        return true;
    }
}





