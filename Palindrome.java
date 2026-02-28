package Java_Programs;

public class Palindrome {
        public static void main(String[] args) {
                String string1 = "malayalam";

                String string2 = "reverse";

                String palindrome1 = new StringBuilder(string1).reverse().toString();
                System.out.println(string1.equals(palindrome1) ? "String1 " + string1 + ": yes"
                                : "String1 " + string1
                                                + ": no");

                String palindrome2 = new StringBuilder(string2).reverse().toString();
                System.out.println(string2.equals(palindrome2) ? "String2 " + string2 + ": yes"
                                : "String2 " + string2
                                                + ": no");
        }
}
