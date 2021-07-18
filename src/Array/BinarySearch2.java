package Array;
import java.util.Arrays;

public class BinarySearch2 {
    public static void main(String[] args) {

        int[] nums = {7,6,9,5,1,4,3,2,8};
        Arrays.sort(nums);
        int result = SearchByBinary(nums,6);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(new int[] {result}));
    }


    public static int SearchByBinary (int[] nums, int number) {

        int start = 0;
        int end = nums.length-1;
        int mid;

        while(start <=end) {

            mid = (start + end) / 2;

            if(nums[mid] == number) {
                return mid;
            }
            else if (nums[mid] < number) {
                start = mid + 1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
     }
}


