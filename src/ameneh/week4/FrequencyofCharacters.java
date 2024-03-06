package ameneh.week4;
public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println( frequencyOfChars( input ) ); // Output: A3B2C1D2
    }
       /*The provided sample input "AAABBCDD" would produce the output "A3B2C1D2"
          since there are 3 'A's, 2 'B's, 1 'C', and 2 'D's in the input. */

    public static String frequencyOfChars(String str) {
        StringBuilder result = new StringBuilder();

       /*This method calculates the frequency of each character in the input string and represents the result as a concatenated string of characters followed by their frequencies.Used to build the final output string.*/

        int[] frequency = new int[256];
        //An array to store the frequencies of characters. It assumes ASCII characters, so the array size is 256.

        for (char ch : str.toCharArray()) {
            frequency[ch]++;
        }
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result.append( (char) i ).append( frequency[i] );
            }
        }
        return result.toString();
    }
}

