public class Pgm4 {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        String str2 = "Hello";
        String str3 = "helLo";
        System.out.println(str1.contains(str2));
        System.out.println(str1.contains(str3));
        System.out.println(str1.toLowerCase().contains(str3.toLowerCase()));
    }
}