package Java_Programs;

public class CheckRotationOfString {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cdeab";

        if (s1.length() != s2.length()) {
            System.out.println("No Rotation");
            return;
        }

        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Rotation");
            return;
        }

        String t = s2 + s2;

        if (t.contains(s1)) {
            System.out.println("Rotation");
        } else {
            System.out.println("No Rotation");
        }
    }
}
