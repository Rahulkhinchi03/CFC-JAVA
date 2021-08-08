package Recursion1.Backtracking;

import java.util.Arrays;

public class LexoPermutationPractice {
    public static void main(String[] args) {

        String str = "abbcccdddd";
        int[] freq = FreqMatrix(str);
        System.out.println(Arrays.toString(freq));

        String ss = "aab";
        lexoPermute(" ", FreqMatrix(ss), ss.length());
    }

    private static int[] FreqMatrix(String str) {

        int[] freq = new int[26];
        for (int i = 0; i <str.length(); i++) {
            int index = str.charAt(i) - 'a';
            freq[index]++;
        }
        return freq;
    }


    private static void lexoPermute(String process, int[] freqMatrix, int length) {

        if(length == 0) {
            System.out.println(process);
            return;
        }

        for (int i = 0; i < freqMatrix.length; i++) {
            if(freqMatrix[i] > 0) {
                freqMatrix[i]--;
                lexoPermute(process + (char)(i+'a'), freqMatrix, length-1);
                freqMatrix[i]++;
            }
        }
    }
}
