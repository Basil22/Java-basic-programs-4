package Java_Programs;

public class Prime {
    public static void main(String[] args) {
        int a = 7;

        if (a <= 1) {
            System.out.println("NotPrime");
        } else {
            boolean isPrime = true;

            for (int i = 2; i < Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.println(isPrime ? "ISPRIME" : "NOTPRIME");
        }
    }
}
