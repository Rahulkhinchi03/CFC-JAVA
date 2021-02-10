package Basic;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int reverse = Number(num);
        System.out.println(reverse);


    }

    public static int Number(int n){


        int reverse = 0;

        while(n>0) {
            int abc = n%10;
            n = n/10;
            reverse = reverse*10 + abc;


        }
        return reverse;
    }
}
