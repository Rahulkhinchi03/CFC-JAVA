package Recursion1;

public class ArrayRecursion {
    public static void main(String[] args) {

        int[] number = {4,5,6,7,8,3,2,1};
        int target = 3;
        System.out.println(linear(number,target,0));

    }

    private static int linear(int[] number, int target, int index) {
        if (index == number.length) {    // For Out of Bound
            return -1;
        }
        if (number[index] == target) {  // Actual Index to get
            return index;
        }
        return
        linear(number, target, index + 1);   // index + 1 to make loop
    }
}
