package Java_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringToNumToString {
    public static void main(String[] args) {
        // String inp = "fiveplusfour";

        // String inp = "onezerominusfive";

        String inp = "onezeroplustwozero";

        Map<String, String> dict = new HashMap<>();
        dict.put("0", "zero");
        dict.put("1", "one");
        dict.put("2", "two");
        dict.put("3", "three");
        dict.put("4", "four");
        dict.put("5", "five");
        dict.put("6", "six");
        dict.put("7", "seven");
        dict.put("8", "eight");
        dict.put("9", "nine");
        dict.put("+", "plus");
        dict.put("-", "minus");

        List<String> actionList = new ArrayList<>();

        String temp = "";
        for (int i = 0; i < inp.length(); i++) {

            temp += inp.charAt(i);
            if (dict.containsValue(temp)) {
                String currentTemp = temp;
                String key = dict.entrySet()
                        .stream()
                        .filter(a -> a.getValue().equals(currentTemp))
                        .findFirst()
                        .get()
                        .getKey();

                if (key.matches("\\d")) {
                    if (!actionList.isEmpty() && actionList.get(actionList.size() - 1).matches("\\d+")) {
                        actionList.set(actionList.size() - 1,
                                actionList.get(actionList.size() - 1) + key);
                    } else {
                        actionList.add(key);
                    }
                } else {
                    actionList.add(key);
                }

                temp = "";
            }
        }
        if (actionList.isEmpty()) {
            throw new IllegalArgumentException("Invalid input or unsupported number words");
        }

        int result = Integer.parseInt(actionList.get(0));

        for (int i = 1; i < actionList.size(); i += 2) {
            String op = actionList.get(i);
            int num = Integer.parseInt(actionList.get(i + 1));

            if (op.equals("+"))
                result += num;
            else if (op.equals("-"))
                result -= num;
        }

        System.out.println(actionList);

        String resultKey = String.valueOf(result);
        StringBuilder sb = new StringBuilder();
        for (char c : resultKey.toCharArray()) {
            sb.append(dict.get(String.valueOf(c)));
        }
        System.out.println(sb.toString());

    }
}
