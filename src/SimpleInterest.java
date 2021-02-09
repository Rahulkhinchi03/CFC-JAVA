public class SimpleInterest {

    public static void main(String[] args) {
        Calculate(10000, 12, 4);
    }

    public static void Calculate(int amount, int time, int rate) {

        int Si = (amount * time * rate) / 100;
        System.out.println(Si);
    }
}
