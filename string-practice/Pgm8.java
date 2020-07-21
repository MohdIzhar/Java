import java.util.StringJoiner;

public class Pgm8 {
    public static void main(String[] args) {
        String[] sentence = { "My", "name", "is", "Izhar" };
        String joinSentence = String.join(" ", sentence);
        System.out.println(joinSentence);

        // StringJoiner sj = new StringJoiner(", ", "[", "]");

        StringJoiner sj = new StringJoiner(", ");
        // The last two arguments are optional,
        // they define prefix and suffix for the result string
        sj.add("foo");
        sj.add("bar");
        sj.add("foobar");
        System.out.println(sj); // Prints "[foo, bar, foobar]"
    }
}