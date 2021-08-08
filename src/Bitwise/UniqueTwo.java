package Bitwise;

public class UniqueTwo {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,8,3,2,1};
        Unique(number);
    }

    private static void Unique(int[] number) {

        int XxorY = 0;
        for(int value: number) {
            XxorY = XxorY ^ value;
        }
        int rmbm = XxorY & -XxorY;   // Right Most Bit Masking

        int x = 0;  // OFF MASK
        int y = 0; // ON MASK

        for(int value: number) {
            if((value & rmbm) == 0) {
                x = x ^ value;
            }
            else{
                y = y ^ value;
            }
        }

        if(x > y) {
            System.out.println(y);
            System.out.println(x);
        }
        else{
            System.out.println(x);
            System.out.println(y);
        }
    }
}
