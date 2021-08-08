package Bitwise;

public class CountSetBits {
    public static void main(String[] args) {

        int number = 17;
        System.out.println(setBits(number));
    }

    public static int setBits(int number) {
        int count = 0;
        while(number > 0) {
            if ((number & 1) == 1) {
                count++;
            }
            number = number >> 1;
        }
        return count;
    }
}

