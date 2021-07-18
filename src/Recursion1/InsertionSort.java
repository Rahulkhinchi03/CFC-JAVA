package Recursion1;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = { 12, 11, 13, 5, 6 };
        int n = arr.length;

            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;
                while ( j >= 0 && arr[j] > key ) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        for(int e: arr) {
            System.out.print( e + " ");
        }
    }
}
