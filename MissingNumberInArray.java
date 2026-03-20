package Java_Programs;

import java.util.Arrays;

public class MissingNumberInArray {

    public static int findMissingNum(int[] arr) {

        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(arr).sum();
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] array = { 4, 3, 8, 7, 5, 2, 6 };
        int missingNumber = findMissingNum(array);
        System.out.println("Missing Number is " + missingNumber);
    }
}
