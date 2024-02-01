package bilal.week2;
public class printConsecutiveNumbers {
         /*  Write a function: that, given a positive integer N, prints the consecutive numbers from 1 to N,
      each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility,
      Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5,
      it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
      For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible
      by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

        For example, here is the output for N = 24:
        1
        Codility
        Test
        Codility
        Coders
        CodilityTest
        7
        Codility
        Test
        Codi1ityCoders
        11
        CodilityTest
        13
        Codility
        TestCoders
        Codility
        17
*/

    public static void main(String[] args) {


        // consecutiveNumbersWords(-30);  // Invalid entry: -30. Please try with positive numbers!
        // consecutiveNumbersWords(0);    // Invalid entry: 0. Please try with positive numbers!


        consecutiveNumbersWords(60);   //...expected result

    }



    public static void consecutiveNumbersWords (int number) {

        if (number <=0 ) {  // Restriction for 0 and negative numbers
            System.err.println("Invalid entry: " + number +". Please try with positive numbers!");
            System.exit(1);
        }


        for (int i = 1; i <= number ; i++) {

            if ( i % 30 == 0) { // Start with divisible by MAX >>> 2,3,and 5 >>> means divisible by 30
                System.out.println("CodilityTestCoders");
                continue; // Execute "CodilityTestCoders" and SKIP this number

            } else if (i%15==0 && !( i % 2 == 0)) { // continue with divisible by SECOND MAX >> 3 and 5  >>>means divisible by 15
                System.out.println("TestCoders");
                continue;

            } else if (i%10==0  && !(i%3==0) ) { // continue with divisible by THIRD MAX >> 2 and 5  >>>means divisible by 10
                System.out.println("CodilityCoders");
                continue;

            } else if (i%6==0 && !(i%5==0 )) { // .......
                System.out.println("CodilityTest");
                continue;

            } else if (i%5==0 && !( i%3==0 && i%2==0)) { //.....
                System.out.println("Coders");
                continue;

            } else if (i%3==0 && !(i%2==0 && i%5==0)) {  // .....
                System.out.println("Test");
                continue;

            } else if (i%2==0 && !(i%3==0 && i%5==0)) {  //.....
                System.out.println("Codility");
                continue;
            }

            System.out.println(i);
        }

    }
}



