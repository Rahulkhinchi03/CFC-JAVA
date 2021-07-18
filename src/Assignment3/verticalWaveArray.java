package Assignment3;
import java.util.Scanner;

public class verticalWaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row:");
        int row = sc.nextInt();                       // Takes Row as Input
        System.out.println("Enter Column:");
        int column = sc.nextInt();                    // Takes Column as Input
        int[][] arr = new int[row][column];

        for(int i=0;i<arr.length;i++) {               // I is row

            for (int j = 0; j <arr[0].length; j++) {   // J is Column
                arr[i][j] = sc.nextInt();              // Takes Matrices as Input
            }
        }

        for(int j=0;j<arr[0].length;j++) {                           // Prints Column

            if(j%2==0) {                                             // Even Row: Column Increase
                for (int i = 0; i <arr.length; i++) {                // 0th to 4th row
                    System.out.print(" " + arr[i][j] + " ");
                }
            }

            else{                                                    // Odd Row: Column Decrease
                for (int i = arr.length-1; i>=0 ; i--) {             // 4th to 0th Row
                    System.out.print(" " + arr[i][j] + " ");
                }
            }
        }


        }
    }


