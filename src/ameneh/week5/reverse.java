package ameneh.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

        public static void main(String[] args) {
            String original = "ABCD";
            String reversed = reverseStr(original);
            /*These lines demonstrate the usage of the reverseString method. It initializes a string original with the value "ABCD" and then calls the reverseStr method to get the reversed string.*/

            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reversed);
        }
           //These two lines print the original and reverse strings to the console.

        public static String reverseStr(String input) {
            StringBuilder reversed = new StringBuilder();
            //This line creates a StringBuilder named reversed, which is used to efficiently build the reversedStr.

            for (int i = input.length() - 1; i >= 0; i--) {
                reversed.append(input.charAt(i));
            }
            //This for loop iterates through each character of the input string in reverse order and appends it to the StringBuilder reversed.

            return reversed.toString();
            //This line returns the reversed string as a String by converting the StringBuilder to a string using the toString method.
        }
}

