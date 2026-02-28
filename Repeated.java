package Java_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Repeated {
    public static void main(String[] args) {

        // Find duplicated number
        int[] nums = { 1, 2, 3, 3 };

        Set<Integer> duplSet = new HashSet<>();

        int result = Arrays.stream(nums).filter((a) -> !duplSet.add(a)).findFirst().getAsInt();

        System.out.println(result);
    }
}