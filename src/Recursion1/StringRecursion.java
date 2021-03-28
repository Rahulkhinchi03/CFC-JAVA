package Recursion1;

import Basic.UpperAndLowerCase;

public class StringRecursion {

    public static void main(String[] args) {
        String str = "abc";
        subsequence("",str);

    }


    private static void subsequence(String processed, String Unprocessed) {

        if(Unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = Unprocessed.charAt(0);    // Print first Char a
        Unprocessed = Unprocessed.substring(1);  // After removal of A, now first Str is bc.

        subsequence(processed,Unprocessed);
        subsequence(processed+ch,Unprocessed);










    }
}
