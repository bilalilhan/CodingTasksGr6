package mojib.week2;
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




        int number =65;


        for (int i = 1; i <=number; i++) {

            if (i %2 ==0 &&  i%3==0 && i%5==0){
                System.out.println("CodilityTestCoders :"+i);
            } else if ((i %2 ==0 &&  i%3==0) || (i %2 ==0 &&  i%5==0) || (i %3 ==0 &&  i%5==0)) {
                System.out.println("CodilityTest :"+i);
            }else if (i %2 ==0 ||  i%3==0 || i%5==0){
                System.out.println("Codility :"+i);
            }else System.out.println(i);
        }





    }


}
