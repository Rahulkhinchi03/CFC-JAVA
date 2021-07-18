package Assignment3;
import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row: ");
        int row = sc.nextInt();
        System.out.print("Enter Column: ");
        int column = sc.nextInt();

        System.out.println("Enter Matrix: ");
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {

            if(j%2==0) {
                for (int i = 0; i < matrix.length; i++) {
                    System.out.print(" " + matrix[i][j] + " ") ;
                }
            }
                else{
                    for (int i = matrix.length-1; i>=0 ; i--) {
                        System.out.print(" " + matrix[i][j] + " ");
                    }
                }
            }
        }
    }
