import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashMap;

public class LexerTest extends TestCase {

    public void testCountWordsNullString() {
        assertEquals(0, Lexer.countWords(""));
    }

    public void testCountWords() {
        assertEquals(6, Lexer.countWords("This sentence is six words long."));
        assertEquals(1, Lexer.countWords("One"));
    }

    public void testWordFrequency() {
        HashMap<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("one", 1);
        expected.put("two", 1);
        expected.put("three", 1);

        assertEquals(expected, Lexer.wordFrequency("One two three"));

        expected.put("three", 2);
        assertEquals(expected, Lexer.wordFrequency("One two three three"));
    }

    public void testWordFrequencyIgnoreSpecialChars() {
        Character[] replace = {'.', ',', '!', '?'};
        HashMap<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("one", 1);
        expected.put("two", 1);
        expected.put("three", 1);

        assertEquals(expected, Lexer.wordFrequency("one. two, three!?",
                replace));

    }

    public void testCountSentences() {
        String paragraph = "This is a sentence. Is this a question? It's only" +
                " intended to handle the most basic of cases. We can refactor" +
                " to handle more complicated sentences.";
        int expected = 4;

        assertEquals(expected, Lexer.countSentences(paragraph));
    }

    public void testSplitSentences() {
        String paragraph = "This is a sentence. Is this a question? It's only" +
                " intended to handle the most basic of cases. We can refactor" +
                " to handle more complicated sentences.";
        ArrayList<String> sentences = Lexer.splitSentences(paragraph);

        assertEquals(true, sentences.contains("This is a sentence."));
        assertEquals(true, sentences.contains("Is this a question?"));
        assertEquals(true, sentences.contains("It's only intended to handle " +
                "the most basic of cases."));
        assertEquals(true, sentences.contains("We can refactor to handle " +
                "more complicated sentences."));
        assertEquals(false, sentences.contains("This is not one of the " +
                "sentences"));
    }
}
