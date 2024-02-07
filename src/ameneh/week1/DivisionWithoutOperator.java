package ameneh.week1;

public class DivisionWithoutOperator {
    public static int divide(int dividend, int divisor) {
        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        return quotient;
    }

    public static void main(String[] args) {
        int result = divide(10, 2); // Output: 5
        System.out.println(result);
    }
}
