package Recursion1;

public class SortedArray {
    public static void main(String[] args) {

        int[] number = {1,2,9,4,5,6,7};
        System.out.println(Sorted(number,0));

    }

    public static boolean Sorted(int[] number, int index) {

        if(index == number.length-1) {   // if Sorted
            return true;
        }
        if(number[index] > number[index+1] ) {
            return false;
        }
        return Sorted(number,index+1);
    }
}
