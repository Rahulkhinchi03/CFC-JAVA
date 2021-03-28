package Recursion1;
public class Star2 {
    public static void main(String[] args) {

        int row = 1;
        int column = 0;
        Design(row,column);

    }

    public static void Design(int row, int column) {

        if(row ==6) {
            return;
        }
        if (row == column) {
            System.out.println();      // leaves a line and print on second line
            Design(row+1,0) ;
            return;
        }
        System.out.print("*");            /// prints *
        Design(row,column+1);
    }
}