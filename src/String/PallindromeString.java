package String;

import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println(IsPallindrome(str));
    }

    public static boolean IsPallindrome(String str) {

        for(int i=0;i<str.length()/2;i++) {
                if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                    return false;


            }
        }
        return true;

    }

}
