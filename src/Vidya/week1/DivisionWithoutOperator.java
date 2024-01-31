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
        if(divisor==0) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.print(dividend +" divided by "+divisor +" is: ");
        int quotient= 0;
        while(dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        System.out.println(quotient +" and remainder is "+ dividend);
    }

//formula- dividend= quotient* divisor+ reminder



}
