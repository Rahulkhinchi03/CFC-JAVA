package Recursion1;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] nums = {5,4,6,7,3,2,8,1,9};
        Sort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));

    }

    public static void Sort (int[] nums, int start, int end) {

        if(start >= end) {
            return;
        }
        int position = pivot(nums, start, end);
        Sort(nums,start,position-1);
        Sort(nums,position+1, end);
    }


    private static int pivot(int[] nums, int start, int end) {
        int ind = start;

        for (int i = start; i < end ; i++) {
            if(nums[i] < nums[end] ) {
                swap(nums,ind,i);
                ind++;
            }
        }
        swap(nums,ind,end);
        return ind;
    }

    private static void swap(int[] nums, int j, int i) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
