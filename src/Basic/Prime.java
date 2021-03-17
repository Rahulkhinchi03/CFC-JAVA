package Basic;

public class Prime {
    public static void main(String[] args) {

        int[] array = {3,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20,21,23,25,24,27,29};
        int Count = 0;

        for (int i = 2; i < array[i] - 1; i++) {
            if(array[i] % i != 0 ) {
                System.out.println("Prime Number: " + i);
                Count++;
            }

        }
        System.out.print("Total Prime Number: " + Count);

        
    }
}



