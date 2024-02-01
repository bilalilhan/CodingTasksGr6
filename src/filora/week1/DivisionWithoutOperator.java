package filora.week1;

public class DivisionWithoutOperator {
    //Write a method that can divide two numbers without using division operator
   public static void main(String[] args){

      divides(6,4);
      divides(8,2);
      divides(10,5);
      divides(-6,2);
      }
      public static void divides(int num1, int num2){

      if(num2==0){
         System.out.println("invalid number");
         return;
         }
      System.out.println(num1 + " divide by " + num2 + " is ");
      int count =0;
      while(num1 >= num2){
         num1 -= num2;
         count++;
         }
      System.out.println(count);
      }

      }

