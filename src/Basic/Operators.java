package Basic;

public class Operators {
    public static void main(String[] args) {

        Result(2,5,'*');

    }

    public static void Result(int n1, int n2, char operator) {

    char multiplication = '*';
    char qoutient = '/';
    char remainder = '%';
    char addition = '+';
    char subtraction = '-';

    if (operator == multiplication) {
       int multiply = n1 * n2;
        System.out.println(" The multiplication of " + n1 + " and " + n2 + " is " + multiply );
    }

    if (operator == qoutient) {
        int qoute = n1 / n2;
        System.out.println(" The qoutient of " + n1 + " and " + n2 + " is " + qoute);
    }

     if (operator == remainder) {
         int remaind = n1 % n2;
         System.out.println(" The remainder of " + n1 + " and " + n2 + " is " + remaind);
     }

     if (operator == addition) {
         int add = n1 + n2;
         System.out.println(" The addition of " + n1 + " and " + n2 + " is " + add);
     }
     if (operator == subtraction) {
         int sub = n1 - n2;
         System.out.println(" The subraction of " + n1 + " and " + n2 + " is " + sub);
     }
  }
}
