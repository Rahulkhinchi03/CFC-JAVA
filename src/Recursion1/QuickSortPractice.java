package Recursion1;

import java.util.Arrays;

public class QuickSortPractice {
    public static void main(String[] args) {

        int[] nums = {8,6,4,2,1,5,3,7,9};
        QuickSort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void QuickSort(int[] nums, int start, int end) {

        if(start >= end) {
            return;
        }

        int position = pivot(nums,start,end);
        QuickSort(nums, start, position-1);
        QuickSort(nums, position+1, end);
    }

    private static int pivot(int[] nums, int start, int end) {

        int index = start;

        for (int i = start; i < end ; i++) {

            if(nums[i] < nums[end]) {
                swap(nums, index, i);
                index++;
            }
        }
        swap(nums, index, end);
        return index;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
