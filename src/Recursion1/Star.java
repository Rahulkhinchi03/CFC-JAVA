package Recursion1;

public class Star {
    public static void main(String[] args) {

        int row = 5;
        int column = 0;
        Design(row,column);

    }

    public static void Design(int row, int column) {

        if(row ==0) {
            return;
        }
        if (row == column) {         // 5,5 -- 4,0
            System.out.println();      // leaves a line and print on second line
            Design(row-1,0) ;   /// 5,0 --- 4,0 -- 3,0 -- 2,0
            return;
        }
        System.out.print("*");            /// prints *
         Design(row,column+1);    /// 5,1 --- 5,2 -- 5,3 --- 5,4 --- 5,5
    }
}
