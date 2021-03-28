package Recursion1;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibo(7));

    }

    public static int Fibo(int n) {

        if(n < 2) {
            return n;
        }
        else{
            return Fibo(n-1) + Fibo(n-2);
        }

    }
}
