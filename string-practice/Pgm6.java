import java.util.regex.Pattern;

public class Pgm6 {
    public static void main(String[] args) {
        String linesFromCsvFile = "Mickey,Bolton,12345,121216";
        String[] dataCells = linesFromCsvFile.split(",");
        System.out.println(dataCells);
        for (int element = 0; element < dataCells.length; element++) {
            System.out.print(dataCells[element] + " ");
        }

        String lineFromInput = "What do you need from me?";
        String[] words = lineFromInput.split("\\s+"); // one or more space chars
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }

        /*
         * The following characters are considered special (aka meta-characters) in
         * regex < > - = ! ( ) [ ] { } \ ^ $ | ? * + . To split a string based on one of
         * the above delimiters, you need to either escape them using \\ or use
         * Pattern.quote():
         */
        String s = "a|b|c";
        String regex = Pattern.quote("|");
        String[] arr = s.split(regex);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // OR another solution for above example
        String s2 = "a|b|c";
        String[] arr2 = s2.split("\\|");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}