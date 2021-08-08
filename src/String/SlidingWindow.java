package String;

public class SlidingWindow {
    public static void main(String[] args) {

        int[] nums = {2,4-1,3,7,0,6,5,4};
        int k =3;
        SumKWithSubArray(nums, k);
    }

    private static void SumKWithSubArray(int[] nums, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int count = 1;
        System.out.println("Sum " + count++ + " = " + sum);

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i-k] + nums[i];
            System.out.println("Sum " + count++ + " = " + sum);
        }
    }
}
