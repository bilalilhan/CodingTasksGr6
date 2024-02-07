package Vidya.week1;

public class DivisionWithoutOperator {
    //Write a method that can divide two numbers without using division operator
    public static void main(String[] args) {
        divides(10,2);
        divides(12,3);
        divides(43,0);
        divides(0,25);

    }

    public static void divides(int dividend, int divisor) {
        if (dividend<0 || divisor<0) { // added 1 more if statement
            System.err.println("Invalid enter : Please enter positive numbers only");
            System.exit(1);
        }
        else if(divisor==0) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.print(dividend +" divided by "+divisor +" is: ");
        int increament= 0;
        while(dividend >= divisor) {
            dividend -= divisor;
            increament++;
        }
        System.out.println(increament +" and remainder is "+ dividend);
    }

//formula- dividend= quotient* divisor+ reminder



}
