package Recursion1.Backtracking;

import java.util.Arrays;

public class LexoPermutation {
    public static void main(String[] args) {

        String str = "abbcccdddddeeeeeefffffffgggggggg";
        int[] freq = FreqMatrix(str);
      System.out.println(Arrays.toString(freq));

        String s = "aab";
        lexoPermute(" ",FreqMatrix(s),s.length());
    }

    public static int[] FreqMatrix(String str) {
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {

            int index = str.charAt(i) - 'a';
            freq[index]++;
        }
        return freq;
    }



    public static void lexoPermute(String process, int[] FreqMatrix, int length) {

        if(length == 0) {
            System.out.println(process);
            return;
        }

        for (int i = 0; i < FreqMatrix.length ; i++) {

            if(FreqMatrix[i] > 0) {
                FreqMatrix[i]--;
                lexoPermute(process + (char) (i+'a'), FreqMatrix, length-1);
                FreqMatrix[i]++;
            }
        }
    }


}
