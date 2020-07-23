public class Try {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Please Wait while we are loading and checking network connection: ");
        int count = 0;
        while (true) {
            char symbol = '|';
            System.out.print(symbol);
            System.out.print("\b");

            Thread.sleep(500);

            char symbol2 = '/';
            System.out.print(symbol2);
            System.out.print("\b");

            Thread.sleep(500);

            char symbol4 = '-';
            System.out.print(symbol4);
            System.out.print("\b");

            Thread.sleep(500);

            char symbol3 = '\\';
            System.out.print(symbol3);
            System.out.print("\b");
            Thread.sleep(500);
            count++;
            if (count == 10) {
                System.out.println("Network Error!");
                break;
            }

        }
        System.out.println("Check your network connection...");
    }
}