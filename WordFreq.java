package Java_Programs;

public class WordFreq {
    public static void main(String[] args) {
        String sentence = "Hello there. Its nice to meet you!";

        String[] result = sentence.split(" ");

        System.out.println("number of words: " + result.length);
    }
}
