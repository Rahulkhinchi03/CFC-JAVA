package Recursion1.Backtracking;

public class PathWithMaximumGold {
    public static void main(String[] args) {


        int[][] maze = {
                          {0,6,0},
                          {5,8,7}
                         ,{0,9,0}};


            int max = 0;
        for (int r = 0; r < maze.length; r++) {
            for (int c = 0; c < maze[0].length ; c++) {
                int result =  mazePath(maze, r, c, 0);
                if(result > max) {
                    max = result;
                }
            }
        }
        System.out.println(max);
    }

    private static int mazePath(int[][] maze, int currentRow, int currentColumn, int total) {

        if(currentRow < 0 || currentColumn < 0 || currentRow >= maze.length || currentColumn >= maze[0].length) {
            return total;
        }

        if(maze[currentRow][currentColumn] == 0) {
            return total;
        }

        int value = maze[currentRow][currentColumn];
        maze[currentRow][currentColumn] = 0;
        int north =  mazePath(maze, currentRow-1, currentColumn, total + value);
        int east = mazePath(maze, currentRow, currentColumn+1, total + value);
        int south = mazePath(maze, currentRow+1, currentColumn, total + value);
        int west = mazePath(maze, currentRow, currentColumn-1, total + value);
        maze[currentRow][currentColumn] = value;

       return  Math.max(Math.max(north,south), Math.max(east,west));
    }
}
