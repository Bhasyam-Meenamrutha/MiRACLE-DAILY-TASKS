package exception_handling_one;

public class ThrowsEx {
	 static void divide(int a, int b) throws ArithmeticException {
        System.out.println("Result = " + (a / b));
    }

    public static void main(String[] args) {

        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("Program completed");
    }
}
