package Recursion1.Backtracking;

public class RatMazeAllDirection {
    public static void main(String[] args) {

        int row = 4;
        int column = 3;

        int[][] maze = new int[row][column];

        int CurrentRow = 2;
        int CurrentColumn = 1;

        int EndRow = 2;
        int EndColumn = 0;

        mazePath(maze, CurrentRow, CurrentColumn, EndRow, EndColumn, " ");
    }

    private static void mazePath(int[][] maze, int currentRow, int currentColumn, int endRow, int endColumn, String Solution) {

        if(currentRow < 0 || currentColumn < 0 || currentRow >= maze.length || currentColumn >= maze[0].length ) {
            System.out.println(Solution);
            return;
        }

        if(maze[currentRow][currentColumn] == 1) {
            System.out.println(Solution);
            return;
        }

        if(currentRow == endRow && currentColumn == endColumn) {
            System.out.println(Solution);
            return;
        }

        maze[currentRow][currentColumn] = 1;
        mazePath(maze, currentRow-1, currentColumn, endRow,endColumn, Solution+"N");
        mazePath(maze, currentRow, currentColumn+1, endRow,endColumn, Solution+"E");
        mazePath(maze, currentRow+1, currentColumn, endRow,endColumn, Solution+"S");
        mazePath(maze, currentRow, currentColumn-1, endRow,endColumn, Solution+"W");
        maze[currentRow][currentColumn] = 0;
    }
}
