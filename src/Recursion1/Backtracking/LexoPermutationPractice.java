package Recursion1.Backtracking;

import java.util.Arrays;

public class LexoPermutationPractice {
    public static void main(String[] args) {

        String str = "abbcccddddeeeeeffffffggggggghhhhhhhh";
        int[] abc = LexoPermute(str);
        System.out.println(Arrays.toString(abc));

        String s = "aaab";
        LexoMatrix(" ", LexoPermutation.FreqMatrix(s) ,s.length());

    }

    public static void LexoMatrix(String process, int[] FreqMatrix, int length) {

        if(length == 0) {
            System.out.println(process);
            return;
        }

        for (int i = 0; i < FreqMatrix.length ; i++) {
            if(FreqMatrix[i] > 0) {
                FreqMatrix[i]--;
                LexoMatrix(process+ (char)(i+'a'), FreqMatrix, length-1);
                FreqMatrix[i]++;
            }
        }
    }

    public static int[] LexoPermute(String str) {

        int[] Freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            Freq[index]++;
        }
        return Freq;
    }
}
