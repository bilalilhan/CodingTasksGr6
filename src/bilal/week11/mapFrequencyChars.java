package bilal.week11;


import java.util.LinkedHashMap;
import java.util.Map;

public class mapFrequencyChars {
//Write a method that prints the frequency of each character from a String

    public static void main(String[] args) {

        frequencyOfEachCharacter("Group-6 and their instructor Aaron are awesome");


        frequencyOfEachCharacter("@@@@@$$$$$    111111xxxxxxxxxxxxxxxxxxxxxxxxx");
    }
    public static void frequencyOfEachCharacter(String givenStr){

        Map<Character, Integer> characterNumbersInList = new LinkedHashMap<>();
        // key=each char and
        // value = is the frequency of each character
        //LinkedHashMap was chosen here to ensure that the characters are printed in the order they appear in the string, and for efficient iteration over the map entries.

        for(int i = 0; i < givenStr.length(); i++){
            char eachChar = givenStr.charAt(i);

            if(!characterNumbersInList.containsKey(eachChar)){
                characterNumbersInList.put(eachChar, 0);
            }

            characterNumbersInList.put(eachChar, characterNumbersInList.get(eachChar) + 1);

        }

        System.out.println(characterNumbersInList);

    }






}