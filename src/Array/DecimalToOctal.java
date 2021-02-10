package Array;
/* Decimal to Octal means Limit to 8 where max number is 7
For eg:
 2057: 2*8(power 3) + 0*8(power 2) + 5*8(power 1) + 7*8(power 0)
= 1024 + 0 + 40 + 7
= 1071
*/


import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



// Method 1: Use Method Integer.toOctalString();
        String num = Integer.toOctalString(sc.nextInt());
        System.out.println(num);




    }



}
