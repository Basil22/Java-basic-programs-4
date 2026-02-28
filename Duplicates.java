package Java_Programs;

import java.util.HashMap;
import java.util.Map;

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
    }
}
