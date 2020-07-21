public class Pgm1 {
    public static void main(String[] args) {
        String s1 = "Test123";
        String s2 = "Test" + 123;
        if (s1 == s2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        if (s1.equals(s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String s3 = "Test123";
        String s4 = "Test_123";
        if (s3.equals(s4)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}