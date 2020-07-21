import java.util.StringTokenizer;

public class Pgm7 {
    public static void main(String[] args) {
        String str = "the lazy fox jumped over the brown fence";
        StringTokenizer tokenizer = new StringTokenizer(str);
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        String str2 = "jumped over";
        // In this case character `u` and `e` will be used as delimiters
        StringTokenizer tokenizer2 = new StringTokenizer(str2, "ue");
        while (tokenizer2.hasMoreTokens()) {
            System.out.print(tokenizer2.nextToken());
        }
    }
}