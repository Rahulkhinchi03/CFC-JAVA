package Array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {4, 1, 5, 9, 3, 2};
        int temp;
        int natural;


        for (int i = 0; i < arr.length; i++) {
            natural = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[natural]) {
                    natural = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[natural];
            arr[natural] = temp;
        }
            for (int e : arr) {
                System.out.print(e + " ");
            }

    }
}



