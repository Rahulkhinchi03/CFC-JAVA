package Array;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {


        int[] a = {5,7,11,15,3,0,-1,-32};
        int length = a.length;


        for (int i = 0; i < length - 1; i++) {
            int MinimumIndex = i;
            for (int j = i; j < length; j++) {

                if (a[j] < a[MinimumIndex]) {
                    MinimumIndex = j;
                }
            }
            int temp;
            temp = a[i];
            a[i] = a[MinimumIndex];
            a[MinimumIndex] = temp;
        }
        for(int e:a) {
            System.out.print( e + " ");
        }

    }
}
