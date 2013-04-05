import java.util.*;

final public class Lexer {
    public static int countWords(String text) {
        if (text.equals(""))
            return 0;

        return text.split("\\s+").length;
    }

    public static HashMap wordFrequency(String text) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        String[] words = text.toLowerCase().split("\\s+");

        for (String word : words) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }
        }

        return result;
    }

    public static HashMap wordFrequency(String text,
                                        Character[] specialChars) {
        for (Character replace : specialChars) {
                text = text.replace(replace.toString(), "");
        }

        return Lexer.wordFrequency(text);
    }

    public static int countSentences(String text) {
        int y = 0;
        int sentenceCount = 0;
        int start = 0;
        int end = 0;
        while (y != text.length()) {
            if (text.charAt(y)=='.' || text.charAt(y)=='?' || text.charAt(y)
                =='!') {
                sentenceCount += 1;
                start = end + 1;
            }

            end++;
            y++;
        }
        return sentenceCount;
    }

    public static int countSentences(String text, Character[] delimiters) {
        int total = 0;

        return total;
    }

    public static ArrayList<String> splitSentences(String text) {
        ArrayList<String> sentences = new ArrayList<String>();
        int counter = 0;
        int start = 0;
        int end = 1;
        while (counter != text.length()) {
            if (text.charAt(counter)=='.' || text.charAt(counter)=='?'
            || text.charAt(counter) =='!') {
                sentences.add(text.substring(start, end));
                start = end + 1;
            }

            end++;
            counter++;
        }
        return sentences;
    }
}
