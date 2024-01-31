public class TestClass {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Please provide a message to print.");
            return;
        }

        String message = args[0];

        System.out.println("Message: " + message);

        int result = factorial(message.length());
        System.out.println("Factorial of message length: " + result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
