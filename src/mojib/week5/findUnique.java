package mojib.week5;

import java.util.Arrays;
import java.util.Collections;

public class findUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/
    public static void main(String[] args) {


        System.out.println(  UniqueChar("AABBCCDDEEFF")            );

    }


    public static String UniqueChar(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String eachChar = str.charAt(i)+"";

            if(!result.contains(eachChar))   {  result += eachChar;  }

        }

        return result;
    }
}