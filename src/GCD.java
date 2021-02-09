public class GCD {
    public static void main(String[] args) {
        int abc = GreatestCommonDivisor(9,18);
        System.out.println(abc);

    }


    public static int GreatestCommonDivisor(int FirstNumber, int SecondNumber ) {

        int Gcd = 0;

        for(int i=1; i<=FirstNumber && i<=SecondNumber;i++) {
            if(FirstNumber % i == 0 && SecondNumber % i == 0 ) {
                Gcd = i;
            }
        }

        return Gcd;
    }
}
