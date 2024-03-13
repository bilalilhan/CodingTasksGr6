package muhammad.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

    public static String reverse(String str) {
        // Check if the input string is null
        if (str == null) {
            return null;
        }

        // Initialize an empty string to store the reversed result
        String reversed = "";

        // Iterate through the characters of the input string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            // Append each character to the reversed string
            reversed += str.charAt(i);
        }

        // Return the reversed string
        return reversed;
    }

    public static void main(String[] args) {
        // Test the reverse method
        String input = "ABCD";
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reverse(input));
    }
}
