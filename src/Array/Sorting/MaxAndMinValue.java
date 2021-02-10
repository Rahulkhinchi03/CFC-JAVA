package Array.Sorting;

import java.util.Arrays;

public class MaxAndMinValue {
    public static void main(String[] args) {

        int[] marks = {66,55,99,43,12,5};
        System.out.println(Arrays.toString(ARRAY(marks)) );
    }



        public static int[] ARRAY (int[] arr) {
            for (int i = 0; i <arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            return arr;

        }


    }

