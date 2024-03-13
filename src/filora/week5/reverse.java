package filora.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/
// Method to check if two strings are built out of the same letters
   public static boolean same(String str1, String str2) {
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      java.util.Arrays.sort(charArray1);
      java.util.Arrays.sort(charArray2);

      return java.util.Arrays.equals(charArray1, charArray2);
   }

   // Method to reverse a string
   public static String reverse(String str) {
      return new StringBuilder(str).reverse().toString();
   }

   public static void main(String[] args) {
      // Examples for the 'same' method
      System.out.println(same("abc", "cab")); // Should return true
      System.out.println(same("abc", "abb")); // Should return false

      // Example for the 'reverse' method
      System.out.println(reverse("ABCD")); // Should return DCBA
   }
}