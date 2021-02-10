package Array;

public class MaxArrayValue {
    public static void main(String[] args) {

        int[] value = {44,33,77,100,45,22,1,7};
        int max = Integer.MIN_VALUE;

        for(int i=0;i< value.length-1;i++) {
            if (value[i] > max) {
                max = value[i];
            }
        }
        System.out.println("Maximum value is " + max);
    }
}
