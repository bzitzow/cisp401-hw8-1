import java.util.HashMap;

public class ThreeTextBlocks {

    final static String TEXT1 = "The Internet has vastly become one of the " +
            "most " +
            "prominent ways of communicating amongst one another within the" +
            " last couple of decades. By utilizing tools such as VOIP, social" +
            " media, emailing, instant messenger, etc., humans from all over" +
            " the world have been " +
            "" +
            "" +
            "fsadfsafsadfsadfasdfsadfasdfffaable to share information within " +
            "econds" +
            " with a mere stroke of a key or a click of a mouse. As far as" +
            " personal use of The Internets communicative inhibitors go," +
            " I have used its services to communicate with others through" +
            " mainly VOIP and email. However, on occasion I have also used" +
            " tools such as Skype and Facebook. I have found that by not" +
            " adhering to the advances in communicating via The Internet," +
            " I am restricting my ability to maintain a healthy relationship" +
            " amongst the individuals whom I consider to be important in my" +
            " life. This reliance upon The Internets service is both" +
            " concerning and fascinating at the same time. However, no matter" +
            " what one may feel about the role that The Internet plays in our" +
            " everyday lives, it is no secret that its advances are imminent." +
            " Of course one cannot be certain as to how far The Internets" +
            " evolution will go.";
    final static String TEXT2 = "Search engine: I like to use safari, " +
            "and Google" +
            " chrome. I use safari because I think it is a little more secure" +
            " comparing others due to my protection with apple. But for" +
            " storing my data I prefer store them in Google doc instead of" +
            " usb or other devices. I find Google doc more reliable. I used" +
            " to simply type the keywords on browser that I wanted to find," +
            " but now after taking this course and the lab that we take I" +
            " learned how to classified the searching tools. I like the" +
            " advance search in Google. I'm going to practice it more often.";

    final static String TEXT3 = "This type of activity is EXTREMELY popular " +
            "in many" +
            " areas (search, DB, AI, NLP, etc). Information Science is built" +
            " around this. There are many other methods out there. You may" +
            " want to check wikipedia \"string metric\" for some other ideas." +
            " Often the code is out there as well.";

    public static void main(String[] args) {
        int totalWords          = Lexer.countWords(TEXT1);
        int totalSentences      = Lexer.countSentences(TEXT1);
        int average             = totalWords / totalSentences;
        HashMap wordFrequency   = Lexer.wordFrequency(TEXT1);

        System.out.println("| TEXT BLOCK ONE |");
        System.out.println("------------------------------");
        System.out.println("Total Words:                  " + totalWords);
        System.out.println("Total Sentences:              " + totalSentences);
        System.out.println("Average # Words per Sentence: " + average);

        System.out.println("Word Frequencies: ");
        System.out.println(wordFrequency);
        System.out.println("------------------------------");
        System.out.println("");

        totalWords          = Lexer.countWords(TEXT2);
        totalSentences      = Lexer.countSentences(TEXT2);
        average             = totalWords / totalSentences;
        wordFrequency   = Lexer.wordFrequency(TEXT2);

        System.out.println("| TEXT BLOCK TWO |");
        System.out.println("------------------------------");
        System.out.println("Total Words:                  " + totalWords);
        System.out.println("Total Sentences:              " + totalSentences);
        System.out.println("Average # Words per Sentence: " + average);

        System.out.println("Word Frequencies: ");
        System.out.println(wordFrequency);
        System.out.println("------------------------------");
        System.out.println("");

        totalWords          = Lexer.countWords(TEXT3);
        totalSentences      = Lexer.countSentences(TEXT3);
        average             = totalWords / totalSentences;
        wordFrequency   = Lexer.wordFrequency(TEXT3);

        System.out.println("| TEXT BLOCK THREE |");
        System.out.println("------------------------------");
        System.out.println("Total Words:                  " + totalWords);
        System.out.println("Total Sentences:              " + totalSentences);
        System.out.println("Average # Words per Sentence: " + average);

        System.out.println("Word Frequencies: ");
        System.out.println(wordFrequency);
        System.out.println("------------------------------");
        System.out.println("");
    }
}
