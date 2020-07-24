public class Arg {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int index = 0; index < args.length; index++) {
                System.out.println("Arguments passed are: " + args[index]);
            }
        }
    }
}