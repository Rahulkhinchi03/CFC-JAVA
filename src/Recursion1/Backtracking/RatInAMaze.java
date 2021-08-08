package Recursion1.Backtracking;

public class RatInAMaze {
    public static void main(String[] args) {

        int row = 4;
        int column = 4;
        int COUNT = maze(row, column);
        System.out.println(COUNT);
    }

    private static int maze(int row, int column) {

        int count = 0;

        if(row == 1 || column == 1) {
            return 1;
        }

        count += maze(row-1, column);
        count += maze(row, column-1);
        return count;
    }

}
