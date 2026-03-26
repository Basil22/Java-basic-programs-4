package Java_Programs;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean isAnagram = Arrays.equals(
                s1.chars().sorted().toArray(),
                s2.chars().sorted().toArray());

        if (isAnagram) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
