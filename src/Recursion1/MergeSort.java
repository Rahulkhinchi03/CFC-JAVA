package Recursion1;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] first = {2, 4, 6, 8, 10};
        int[] second = {1, 3, 5, 7, 9};
        int[] third = merge(first, second);
        System.out.println(Arrays.toString(third));
    }

    private static int[] mergeSort(int[] nums) {

        if(nums.length < 2) {
            return nums;
        }

        int mid = nums.length / 2;

        int[] First = Arrays.copyOfRange(nums, 0, mid);
        int[] Second = Arrays.copyOfRange(nums, mid, nums.length);
        First = mergeSort(First);
        Second = mergeSort(Second);

        return merge(First, Second);
    }



    private static int[] merge(int[] first, int[] second) {

        int i = 0, j = 0, k = 0;
        int[] third = new int[first.length + second.length];

        while ( i < first.length && j < second.length ) {

            if (first[i] < second[j]) {
                third[k++] = first[i++];
            }
            else {
                third[k++] = second[j++];
            }
        }

        while ( i < first.length ) {
           third[k++] = first[i++];
        }

        while ( j < second.length ) {
            third[k++] = second[j++];
        }
          return third;
    }
}

