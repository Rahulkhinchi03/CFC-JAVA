package Array;

public class Inverse {
    public static void main(String[] args) {
        int num = 24135;
        System.out.println(inverse(num));

    }

    private static int inverse(int NUM) {

        int position = 1;
        int result = 0;
         while (NUM > 0 ) {
             int remainder = NUM % 10;
             result = result + position * (int) Math.pow(10,remainder-1);
             NUM/=10;
             position++;


         }
         return result;
    }
}
