public class Pgm2 {
    public static void main(String[] args) {
        String strObj = new String("Hello!");
        String str = "Hello!";
        if (strObj.equals(str)) {
            System.out.println("The string are equal");
        }
        if (strObj != str) {
            System.out.println("The string are not equal");
        }

        String strIntern = strObj.intern();
        if (strIntern.equals(strObj)) {
            System.out.println("Yes intern string are equal");
        }
    }
}