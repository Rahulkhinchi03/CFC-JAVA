package Recursion1.Backtracking;

import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {

        int[][] sudoku = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                         {5, 2, 0, 0, 0, 0, 0, 0, 0},
                         {0, 8, 7, 0, 0, 0, 0, 3, 1},
                         {0, 0, 3, 0, 1, 0, 0, 8, 0},
                         {9, 0, 0, 8, 6, 3, 0, 0, 5},
                         {0, 5, 0, 0, 9, 0, 6, 0, 0},
                         {1, 3, 0, 0, 0, 0, 2, 5, 0},
                         {0, 0, 0, 0, 0, 0, 0, 7, 4},
                         {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        solve(sudoku, 0, 0);
    }


    public static void solve(int[][] sudoku, int row, int column) {

        // Base Condition 1
        if(row == 9) {
            for (int[] rowSudoku : sudoku) {
                System.out.println(Arrays.toString(rowSudoku));
            }
            return;
        }

        // Base Condition 2
        if(column == 9 ) {
            solve(sudoku, row+1, 0);
            return;
        }

        // Base Condition 3
        if(sudoku[row][column] != 0) {
                solve(sudoku, row, column+1);
            }
        else{
            for (int value = 0; value <= 9; value++) {
                if(isSafe(sudoku, row, column, value)) {
                    sudoku[row][column] = value;
                   solve(sudoku, row,column+1);
                    sudoku[row][column] = 0;
                }
            }
        }
     }

    private static boolean isSafe(int[][] sudoku, int row, int column, int value) {

        for (int r = 0; r < 9 ; r++) {
            if(sudoku[r][column] == value) {
                return false;
            }
        }

        for (int c = 0; c < 9 ; c++) {
            if(sudoku[row][c] == value) {
                return false;
            }
        }

        int box_r = (row/3)*3;
        int box_c = (column/3)*3;

        for (int r = box_r; r < box_r+3; r++) {
            for (int c = box_c; c <box_c+3; c++) {
                if(sudoku[r][c] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}


