package Basic;

import java.util.Scanner;


public class Lcm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1:");
        int num1 = sc.nextInt();
        System.out.print("Enter num2:");
        int num2 = sc.nextInt();


        int lcm = (num1 > num2) ? num1 : num2;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.printf("The LCM  of %d and %d is %d.", num1, num2, lcm);
                break;
            }
            ++lcm;
        }

    }
}

