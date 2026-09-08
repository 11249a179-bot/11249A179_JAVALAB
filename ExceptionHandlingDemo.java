public class ExceptionHandlingDemo {

    // throws: declares that this method may throw an exception
    static void checkAge(int age) throws Exception {

        // throw: manually throws an exception
        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }

        System.out.println("You are eligible.");
    }

    public static void main(String[] args) {

        try {
            // try: code that may cause an exception
            int a = 10;
            int b = 0;

            System.out.println("Result: " + (a / b));

            // This line will not execute because an exception occurs above
            checkAge(15);
        }

        // catch: handles ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        // catch: handles other exceptions
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // finally: always executes
        finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }
}
