package Array;

import java.util.Scanner;

public class MultipleArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int[] arr = {10, 12, 14, 15, 16, 18, 20, 22, 24, 25, 26, 28, 30, 32, 34, 35, 36, 38, 40};
        int count = 0;

        for (int i : arr) {
            if (i % number == 0) {
                System.out.println(i + " ");
                count++;
            }
        }

        System.out.print("Total Multiple of " + number + " is: " + count + ".");


    }
}


