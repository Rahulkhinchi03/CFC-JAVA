package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {4, 3, 7, 8, 9, 6, 5, 1,};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search: ");
        int NUMBER = sc.nextInt();

        int abc = SearchingNumber(nums,NUMBER);
        System.out.println(Arrays.toString(new int[] {abc}));

    }

    private static int SearchingNumber(int[] nums, int NUMBER) {

        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i] == NUMBER)  {
                return i;
            }
        }

        return -1;
    }
}
