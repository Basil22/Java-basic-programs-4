package Java_Programs;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public static int solution(String s) {

        int left = 0;
        Set<Character> subSet = new HashSet<>();

        int maxLen = 0;
        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            while (subSet.contains(c)) {
                subSet.remove(s.charAt(left));
                left++;
            }

            int w = right - left + 1;
            maxLen = Math.max(maxLen, w);
            subSet.add(s.charAt(right));
        }
        return maxLen;
    }

    public static void main(String[] args) {

        String inp = "abcabcbb";
        System.out.println(solution(inp));

    }
}
