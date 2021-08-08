package Bitwise;

public class CountOneInBits {
    public static void main(String[] args) {

        long a = 2;
        System.out.println(numSetBits(a));

    }
    public static int numSetBits(long a) {

        int count = 0;
        while(a > 0) {
            count++;
          a = a & a-1;
            }
        return count;
    }
}
