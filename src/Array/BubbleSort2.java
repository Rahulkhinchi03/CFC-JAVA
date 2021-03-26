package Array;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {


        int[] arr = {9, 5, 3, 6, 1, 2, 8, 4, 7};
        int temp;
        int natural;

        for (int i = 0; i <arr.length; i++) {
            natural=i;
            for (int j = i+1; j <arr.length; j++) {

                if(arr[j] < arr[natural]) {
                    natural = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[natural];
            arr[natural] = temp;
        }
        for(int e: arr) {
            System.out.print(e + " ");
        }











    }
}
