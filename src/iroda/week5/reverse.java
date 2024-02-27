package iroda.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

//solution

public static void main(String[] args) {

    String str1 = "ABCD";

    String str2 ="";

    char ch;

    System.out.println("Original word: " + str1);
    for (int i = 0; i < str1.length(); i++) {
        ch = str1.charAt(i);//extract each character
        str2 = ch + str2;//add each character to the existing string
    }
    System.out.println("Reversed word: " + str2);
}
}