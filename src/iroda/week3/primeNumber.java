package iroda.week3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class primeNumber {
     // Write a method that can check if a number is prime or not
     public static void main(String[] args) {

Scanner sc =  new Scanner(System.in);
         System.out.println("Enter a number");
         int number = sc.nextInt();
         if(isPrime(number)){
             System.out.println(number + " is prime number");
         }else{
             System.out.println(number + " is not a prime number");
         }
    }
   static boolean isPrime(int num){
         if(num <= 1){
             return false;
         }
       for (int i = 2; i < num / 2; i++) {
           if(( num % i ) == 0){

           }
           return true;
       }
       return false;
   }



}
