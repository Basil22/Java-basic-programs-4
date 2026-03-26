package Java_Programs;

public class MaxAndMinWithoutSorting {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 8, 2 };

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
