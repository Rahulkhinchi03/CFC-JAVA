package Bitwise;

public class UniqueOne {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,4,3,2,1};
        System.out.println(Unique(number));
    }

    private static int Unique(int[] number) {
        int answer = 0;
        for (int nums: number) {
            answer = answer ^ nums;
        }
        return answer;
    }
}
