package mojib.week4;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    public static void main(String[] args) {

        charFrequency("aabbbccc");
        charFrequency("AAABBCDD");
        charFrequency("XYZxyzXYZ");


    }

    public static void charFrequency(String str){
        String result="";

        //str.split("")   ------  System.out.println(Arrays.toString(    str.split("")   ));
        for (String eachC : str.split("")) {

            int frequency=  Collections.frequency(Arrays.asList(str.split("")) , eachC);  // finding frq of each char by using for each Loop (it must be a collection type)
            if (!result.contains(eachC)){
                result+=eachC+frequency;

            }
        }
        System.out.println("Char Frequency  = " + result);
    }

}