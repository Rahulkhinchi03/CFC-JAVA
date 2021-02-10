package Basic;

import java.util.Scanner;

public class CfcLeader {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Credit:");
        int Credit = sc.nextInt();
        if(Credit >= 7500) {
            System.out.println("Badge: Tera Leader.");
        }
        if (Credit < 7500 && Credit >=6000) {
            System.out.println("Badge: Gega Leader.");
        }
        if(Credit < 6000 && Credit >= 4500) {
            System.out.println("Badge: Mega Leader.");
        }
        if(Credit < 4500 ) {
            System.out.println("Badge: Rising Star.");
        }

    }
}