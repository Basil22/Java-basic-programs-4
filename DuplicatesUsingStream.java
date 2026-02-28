package Java_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesUsingStream {
    public static void main(String[] args) {
        List<Integer> newList = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1, 7, 8);

        Set<Integer> newSet = new HashSet<>();
        Set<Integer> dups = newList.stream().filter(a -> !newSet.add(a)).collect(Collectors.toSet());

        System.out.println(dups);
    }
}
