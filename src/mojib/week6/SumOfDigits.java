package mojib.week6;

import java.util.Collections;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */

    public static void main(String[] args) {


        System.out.println("sumOfDigits1(b2ook3) = " + sumOfDigits1("b2ook32"));

        System.out.println(sumOfDigits1("a45b5"));
        System.out.println( sumOfDigits1( "12 java 5 apple 3"));




    }


    public static int sumOfDigits1(String str){
        int result=0;


        for (char each : str.toCharArray()) {

            if (Character.isDigit(each)){

                result+=Integer.parseInt(""+each);
            }

        }


        return result;
    }




}
