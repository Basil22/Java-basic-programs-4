package Java_Programs;
// import java.util.ArrayList;

// import java.util.Arrays;
// import java.util.List;

public class Divisible {
    public static void main(String[] args) {

        int[] nums = { 21, 4, 7, 21 };

        // ===== Below works if less numbers of input ===== //

        // int result = Arrays.stream(nums).map(num -> {
        // List<Integer> divisors = new ArrayList<>();

        // for (int i = 1; i <= num; i++) {
        // if (num % i == 0) {
        // divisors.add(i);
        // }
        // }

        // return divisors.size() == 4 ?
        // divisors.stream().mapToInt(Integer::intValue).sum() : 0;
        // }).sum();

        // System.out.println(result);

        // ===== Below for more input ===== //

        int result = 0;

        for (int num : nums) {
            int countOfDivisors = 0;
            int sumOfDivisors = 0;

            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    int d1 = i;
                    int d2 = num / i;

                    if (d1 == d2) {
                        countOfDivisors++;
                        sumOfDivisors += d1;
                    } else {
                        countOfDivisors += 2;
                        sumOfDivisors = d1 + d2;
                    }

                    if (countOfDivisors > 4) {
                        break;
                    }
                }
            }

            if (countOfDivisors == 4) {
                result += sumOfDivisors;
            }

        }

        System.out.println(result);

    }
}
