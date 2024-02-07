package filora.week2;public class divisibleBy3_5_15 {


 /*  Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5,and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in Divisible By
15 section if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in Divisible By 3' section if the number can be divisible by 5 but cannot be
divisible by 15, then it should only be displayed in Divisible By 5' section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99*/
   // %:	Modulus;	Returns the division remainder
   // ++: Increment; increases the value of a variable by 1


   public static void main(String[] args) {

         // Print numbers divided by 3
         System.out.println("Divided by 3: ");
         for(int i = 1; i <= 100; i++) { //repeat code 100 times divisible by 3 starting with number 1
            if(i % 3 == 0) // if statement checking for numbers divisible by 3 and has remainder of 0
               System.out.print(i + ", "); //Printing
         }
         // Print numbers divided by 5
         System.out.println("\n\nDivided by 5: ");
         for(int i = 1;i<=100; i++) { //repeat code 100 times divisible by 5 starting with number 1
            if(i % 5 == 0) // if statement checking for numbers divisible by 5 and has remainder of 0
            System.out.print(i + ", ");
         }
      // Print numbers divided by 5
      System.out.println("\n\nDivided by 15: ");
      for(int i = 1;i<=100; i++) { //repeat code 100 times starting with number 1
         if(i % 15 == 0) // if statement checking for numbers divisible by 15 and has remainder of 0
            System.out.print(i + ", ");
      }
      System.out.println("\n");
      }
   }



