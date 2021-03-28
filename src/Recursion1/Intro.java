package Recursion1;

public class Intro {
    public static void main(String[] args) {
        print(5);

    }
    public static void print(int n) {

        if(n == 0) {
            return;
        }
        print(n-1);

    }
}
