public class ExceptionErrorExample {
    public static void main(String[] args) {
        try {
            // This will throw an Exception (ArithmeticException)
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Caught an Exception: " + e.getMessage());
        }

        try {
            // This will throw an Error (StackOverflowError)
            recursiveCall();
        } catch (StackOverflowError e) {
            System.out.println("Caught an Error: " + e.getMessage());
        }
    }

    private static void recursiveCall() {
        recursiveCall(); // causes StackOverflowError
    }
}

