public class Pgm10 {
    public static void main(String[] args) {
        String str = "Mohd Izhar";
        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}