package Recursion1;

public class Factoriall {
    public static void main(String[] args) {

        System.out.println("The Factoriall of " + 6 + " is " + Factorial(6) );

    }

    public static int Factorial(int n) {
        if(n == 0 ) {
            return 1;
        }
        else {
            return n * Factorial(n-1);
        }
    }
}
