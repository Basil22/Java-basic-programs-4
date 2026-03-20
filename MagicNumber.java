package Java_Programs;

/*
Magic Number: Sum of all digits = 1
Example: 
    num: 163
    1+6+3 = 10
    1+0 = 1
    hence magic number
 */
public class MagicNumber {
    public static void main(String[] args) {
        int n = 163;
        int sum = 0;

        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n = n / 10;
        }

        if (sum == 1)
            System.out.println("Magic Number");
        else
            System.out.println("Not Magic Number");
    }
}
