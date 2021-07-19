package Recursion1.Backtracking;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int[] nums = {3,7,9,5,1,8,0,6,4};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));

    }

    public static void reverse(int[] a, int i, int j) {

        int partOne = i;
        int partTwo = j;

        while(partOne < partTwo) {

            int temp = a[partOne];
            a[partOne] = a[partTwo];
            a[partTwo] = temp;

            partOne++;
            partTwo--;
        }
    }

    public static void rotate(int[] nums, int k) {

        k = k % nums.length;

        if(k < 0) {
            k+= nums.length;
        }

        reverse(nums, 0 , nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
}
