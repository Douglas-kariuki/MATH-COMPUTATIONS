public class DivisionProgram {
    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; 
        } else {
            return dividend / divisor;
        }
    }

    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 2.0;

        double result = divide(num1, num2);

        System.out.println("Result of division: " + result);
    }
}
