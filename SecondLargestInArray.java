package Java_Programs;
// import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 6, 7, 3, 4, 2, 3, 4, 5 };

        // Arrays.sort(arr1);

        // Integer result = Arrays.stream(arr1).distinct().boxed().sorted((a, b) -> b -
        // a).skip(1).findFirst().get();

        int largest = 0;
        int secondLarg = 0;
        for (int num : arr1) {
            if (num > largest) {
                secondLarg = largest;
                largest = num;
            } else if (num > secondLarg && num != largest) {
                secondLarg = num;
            }
        }

        System.out.println(secondLarg);
    }
}
