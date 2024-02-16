package Vidya.week3;

public class primeNumber {
     // Write a method that can check if a number is prime or not
     public static void main(String[] args) {
          PrintprimeNumbersFrom1To100();

     }

     public static void PrintprimeNumbersFrom1To100()
     {
          System.out.println("2 Prime Number");
          for(int i=2; i<100; i++)
          {
               int j=2;
               for(j=2; j<i-1; j++)
               {

                    if(i%j==0)
                    {
                         break;
                    }
               }

               if(i%j!=0)
               {
                    System.out.println(i +" Prime Number");
               }
          }

          /*public static void PrintprimeNumbersFrom1ToNthValue(int n)
          {
               System.out.println("2 Prime Number");
               for(int i=2; i<n; i++)
               {
                    int j=2;
                    for(j=2; j<i-1; j++)
                    {

                         if(i%j==0)
                         {
                              break;
                         }
                    }

                    if(i%j!=0)
                    {
                         System.out.println(i +" Prime Number");
                    }
               }
          }*/
     }




}
