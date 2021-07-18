package Array;

import java.util.Arrays;

// Sorting Odd first and Even after

public class BubbleSort {
    public static void main(String[] args) {

        int[] number = {4, 2, 1, 8, 5, 3, 0, 6};
        Sorting(number);
        System.out.println(Arrays.toString(number));
    }


    public static void Sorting(int[] number) {
            for (int i = 0; i < number.length; i++) {
                for (int j = 0; j < number.length - i - 1; j++) {

                    if (number[j] > number[j + 1]) {

                        int temp = number[i];
                        number[i] = number[j];
                        number[j] = temp;

                    }
                }
            }
        }

    }



