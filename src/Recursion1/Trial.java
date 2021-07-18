package Recursion1;

public class Trial {
    public static void main(String[] args) {

       // Inc(6);
      //  DEC(6);
        // System.out.println(Fibo(5));
        int[] arr = {1,2,5,6};
       PWR(7,arr,0,"");
    }
    public static void PWR(int tar, int[] arr, int sum, String ans) {
        if(sum == tar) {
            System.out.println(ans);
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] + sum <= tar) {
                PWR(tar,arr,sum+arr[i],ans+arr[i]);
            }
        }
    }




















   public static int Fibo(int n) {

        if(n == 0 || n == 1) {
            return 1;
        }
        int a = Fibo(n-1);
        int b = Fibo(n-2);
        return a+b;
    }

    public static void Inc(int n) {

        if(n == 0) {
            return;
        }
        Inc(n-1);
        System.out.print(n + " ");

    }

    public static void DEC(int n) {

        if(n == 0) {
            return;
        }
        System.out.println(n + " ");
    DEC(n-1);


    }

}
