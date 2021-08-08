package Bitwise;

public class NthMagicalNumber {
    public static void main(String[] args) {

        int number = 2;
        System.out.println(MagicalNumber(number));
    }

    private static int MagicalNumber(int number) {

        int place = 5;
        int result = 0;

        while(number > 0) {

            if((number & 1) == 1) {
                result = place + result;
            }
            place *= 5;
            number = number >> 1;
        }
       return result;
    }
}
