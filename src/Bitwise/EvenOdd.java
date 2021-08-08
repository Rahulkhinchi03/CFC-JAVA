package Bitwise;

public class EvenOdd {
    public static void main(String[] args) {

       int number = 13;
        System.out.println(isOdd(number));
      }
      public static boolean isOdd(int number) {
          return  (number & 1) == 1;
      }
}
