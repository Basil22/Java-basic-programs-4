package Java_Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        String string1 = "oioioioquwksnfrre";

        Map<Character, Integer> duplicatesMap = new HashMap<>();

        for (char c : string1.toCharArray()) {
            duplicatesMap.put(c, duplicatesMap.getOrDefault(c, 0) + 1);
        }

        // System.out.println(duplicatesMap);
        System.out.println("Dupe: ");
        for (Map.Entry<Character, Integer> entry : duplicatesMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

        // JAVA 8 Solution
        string1.chars()
                .mapToObj(c -> (char) Character.toLowerCase(c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c -> c.getValue() > 1)
                .forEach(System.out::println);

    }
}
