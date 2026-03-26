package Java_Programs;

public class Factorial {

    public static int getFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int prod = getFactorial(n);
        System.out.println(prod);
    }
}
