package Recursion1;

import java.util.Arrays;

public class MergeSortPractice {
    public static void main(String[] args) {

        int[] nums = {6,3,1,8,4,9,2,0};
       int[] abc = MergeSort(nums);
        System.out.println(Arrays.toString(abc));

        int[] first = {2, 4, 6, 8, 10};
        int[] second = {1, 3, 5, 7, 9};
        int[] third = Sort(first,second);
        System.out.println(Arrays.toString(third));
    }

    public static int[] MergeSort(int[] number) {

        if(number.length < 2) {
            return number;
        }

        int mid = number.length/2;
        int[] First = Arrays.copyOfRange(number, 0, mid);
        int[] Second = Arrays.copyOfRange(number, mid, number.length);

        First = MergeSort(First);
        Second = MergeSort(Second);

       return Sort(First,Second);
    }

    private static int[] Sort(int[] first, int[] second) {
        int[] third = new int[first.length+ second.length];

      int i = 0;
      int j = 0;
      int k = 0;

      while ( i < first.length && j < second.length) {

          if(first[i] < second[j]) {
              third[k++] = first[i++];
          }
          else{
              third[k++] = second[j++];
          }
      }

      while(i < first.length) {
          third[k++] = first[i++];
      }
        while(j < second.length) {
            third[k++] = second[j++];
        }
        return third;
    }
}
