package Java_Programs;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int input = 153;
        int n = input;
        int sum = 0;

        while (n >= 1) {
            sum += Math.pow((n % 10), 3);
            n = n / 10;
        }

        System.out.println(sum == input ? "ArmStrong" : "Not Armstrong");
    }
}
