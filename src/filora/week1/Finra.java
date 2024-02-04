package filora.week1;

public class Finra {
    //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    //print "FIN" instead of the number and
    //for numbers which are a multiple of 5, print "RA" instead of the number.
    //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
   public static void main(String[] args){


FINRA();

   }
   public static void FINRA(){
      String result = " ";
      for(int i = 3;i <= 30; i++){
         if ( i % 5==0 && i % 3==0) //multiple of 3 & 5
            result += "FINRA ";
         else if(i%5==0) // multiple of 5
            result += "RA ";
            else if(i % 3==0) //Multiple of 3
               result+="FIN ";
            else
               result += i+ " ";
            }
         System.out.println(result);

         }
      }

