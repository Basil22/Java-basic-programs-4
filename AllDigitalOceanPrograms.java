package Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
// import java.util.LinkedList; 
import java.util.List;
// import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AllDigitalOceanPrograms {

    public static void reverseString(String input) {
        System.out.println("Before rev: " + input);
        StringBuilder sb = new StringBuilder(input);
        String result = sb.reverse().toString();
        System.out.println("After rev: " + result);
    }

    public static void numberSwapWithoutThird(int a, int b) {
        System.out.println("Before Swap: " + "A: " + a + " " + "B: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap: " + "A: " + a + " " + "B: " + b);
    }

    public static void isVowelPresentInString(String input) {
        boolean check = input.toLowerCase().matches(".*[aeiou].*");
        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void isPrimeNumber(int n) {
        if (n == 0 || n == 1) {
            System.out.println("NOT PRIME");
            System.exit(0);
        } else if (n == 2) {
            System.out.println("YES PRIME");
            System.exit(0);
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.println("NOT PRIME");
                    System.exit(0);
                }
            }
        }
        System.out.println("YES PRIME");
    }

    public static void printFibonacci(int size) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= size; i++) {
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static void doesOddExist(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        result = list.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        if (result.size() > 0) {
            System.out.println("Contains Odd");
        } else {
            System.out.println("Does not contain odd");
        }
    }

    public static void isPalindrome(String input) {
        StringBuilder sb = new StringBuilder(input.toLowerCase());
        String result = sb.reverse().toString();
        if (result.equals(input.toLowerCase()))
            System.out.println("PALINDROME");
        else
            System.out.println("NOT PALINDROME");
    }

    public static void removeSpaces(String input) {
        // System.out.println(input.strip()); // to remove leading and trailing spaces

        StringBuilder sb = new StringBuilder();
        char[] charArr = input.toCharArray();
        for (char c : charArr) {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }

    public static void sortArray(int[] inputArr) {
        Arrays.sort(inputArr);
        System.out.println(Arrays.toString(inputArr));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void reverseLinkedList(LinkedList<Integer> l1) {
        LinkedList<Integer> reverse = new LinkedList<>();
        l1.descendingIterator().forEachRemaining(reverse::add);
        System.out.println(reverse);

    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        // reverseString("Reverse");

        // numberSwapWithoutThird(5, 6);

        // isVowelPresentInString("TV");

        // isPrimeNumber(5);

        // printFibonacci(10);

        // doesOddExist(Arrays.asList(2, 4, 6));

        // isPalindrome("RaceCAR");

        // removeSpaces(" Hello World ");

        // sortArray(new int[] { 2, 1, 5, 3, 4 });

        // System.out.println(factorial(5));

        // reverseLinkedList(new LinkedList<>(Arrays.asList(1, 2, 3)));

        System.out.println(binarySearch(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 7));

    }
}
