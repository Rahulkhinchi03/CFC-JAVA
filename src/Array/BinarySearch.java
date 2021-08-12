package Array;


import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] number = {2,4,6,7,8,9,13,15,17,20};
        int answer = SearchByBinary(number,15);
        System.out.println(Arrays.toString(new int[] {answer}));
    }

    public static int SearchByBinary(int[] number, int num) {

        int start = 0;
        int end = number.length-1;
        int mid;

        while(start <= end) {
            mid = (start + end)/2;
            if(number[mid] == num) {
                return mid;
            }
            else if(number[mid] < num)  {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
              return -1;
    }
}
