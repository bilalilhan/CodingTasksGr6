package filora.week1;

public class DivisionWithoutOperator {
    //Write a method that can divide two numbers without using division operator
   public static void main(String[] args){

      divides(6,2);
      divides(6,0);
      }
      public static void divides(int dividend, int divisor){

      if(divisor==0){
         System.out.println("Can't divide by zero");
         return;
         }
      System.out.println(dividend + " divided by " + divisor + " is ");
      int quotient = 0;
      while(dividend >= divisor){
         dividend -= divisor;
         quotient++;
         }
      System.out.println(quotient + " and remainder is " + dividend);
      }

      }


//formula: dividend = quotient * divisor + reminder
// >: greater than
// <: less than
