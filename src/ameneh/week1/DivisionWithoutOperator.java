package ameneh.week1;

public class DivisionWithoutOperator {
    //Write a method that can divide two numbers without using division operator

    public static void main(String[] args) {

        int result = divide( 10, 2 );
        System.out.println( "Result: " + result );
    }

//It calls the divide method with arguments 10 and 2, and then prints the result.
// In this example, it's dividing 10 by 2.
    public static int divide(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException( "Cannot divide by zero" );
        }
//This part checks if the divisor (number2) is zero.
// If it is, an ArithmeticException is thrown to handle the case of division by zero.

        int count = 0;

        while (number1 >= number2) {
            number1 -= number2;
            count++;
        }
        return count;
    }
//This section uses a loop to subtract the divisor (number2) from the dividend
// (number1) until the dividend becomes less than the divisor.
// The count variable keeps track of how many times the subtraction occurs,
// effectively giving the result of the division.

}

