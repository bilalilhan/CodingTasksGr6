package mojib.week11;

import java.util.LinkedHashMap;
import java.util.Map;

public class mapFrequencyChars {
//Write a method that prints the frequency of each character from a String



    public static void printCharacterFrequency(String input) {
        // Creating a HashMap to store characters and their frequencies
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();


        char[] InputCharArray = input.toCharArray();  //  <---- this will give me char array of the input String

        // Counting frequency of each character
        for (char eachChar : InputCharArray) {   // <--  to get every character of the char Array
            if (frequencyMap.containsKey(eachChar)) {
                // If character already exists in the map, increment its frequency it means add +1 to it
                frequencyMap.put(eachChar, frequencyMap.get(eachChar) + 1);
            } else {
                // If character doesn't exist in the map, add it with frequency 1,  if not then keep it with 1
                frequencyMap.put(eachChar, 1);
            }
        }

        System.out.println("frequencyMap = "+frequencyMap);
    }

    public static void main(String[] args) {
        String input = "AAaZZZZbbYYYCDDeeFFFGGGHHHHHAAiiijklKKKkk";
        printCharacterFrequency(input);

        System.out.println("-----------------------------------");

        printCharacterFrequencyString(input);
    }








    public static void printCharacterFrequencyString(String input) {
        // Creating a HashMap to store characters and their frequencies
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();


        String[] InputStringArray = input.split("");  //  <---- this will give me char array of the input String

        // Counting frequency of each character
        for (String eachChar : InputStringArray) {   // <--  to get every character of the char Array
            if (frequencyMap.containsKey(eachChar)) {
                // If character already exists in the map, increment its frequency it means add +1 to it
                frequencyMap.put(eachChar, frequencyMap.get(eachChar) + 1);
            } else {
                // If character doesn't exist in the map, add it with frequency 1,  if not then keep it with 1
                frequencyMap.put(eachChar, 1);
            }
        }

        System.out.println("frequencyMapString--> = "+frequencyMap);
    }


}

