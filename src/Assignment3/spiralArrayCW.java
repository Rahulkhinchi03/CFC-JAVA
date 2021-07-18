package Assignment3;
import java.util.Scanner;

public class spiralArrayCW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row: ");
        int row = sc.nextInt();
        System.out.print("Enter Column: ");
        int column = sc.nextInt();
        System.out.println("Enter Matrix: ");
        int[][] arr = new int[row][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Calls
        int minRow = 0;
        int maxRow = arr.length - 1;
        int minColumn = 0;
        int maxColumn = arr[0].length - 1;
        int counter = 0;
        int totalNumberElement = row * column;


while(totalNumberElement>counter) {
    // Left to Right
    for (int i = minRow, j = minColumn; j <= maxColumn; j++) {
        System.out.print(" " + arr[i][j] + " ");
        counter++;
    }
    minRow++;

    // Top to Bottom
    for (int i = minRow, j = maxColumn; i <= maxRow; i++) {
        System.out.print(" " + arr[i][j] + " ");
        counter++;
    }
    maxColumn--;

    // Right to Left
    for (int i = maxRow, j = maxColumn; j >= minColumn; j--) {
        System.out.print(" " + arr[i][j] + " ");
        counter++;
    }
    maxRow--;

    // Bottom to Top
    for (int i = maxRow, j = minColumn; i >= minRow; i--) {
        System.out.print(" " + arr[i][j] + " ");
        counter++;
    }
    minColumn++;
}


            }
        }
