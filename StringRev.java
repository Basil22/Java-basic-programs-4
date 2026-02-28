package Java_Programs;

public class StringRev {
    public static void main(String[] args) {
        String string = "Reverse";

        // String result = "";
        // for (int i = string.length() - 1; i >= 0; i--) {
        // result += string.charAt(i);
        // }

        String result = new StringBuilder(string).reverse().toString();

        System.out.print(result);
    }
}
