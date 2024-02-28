package bilal.week4;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static void main(String[] args) {


            String str = "@@@XXXXYYZZZZ@@@";
            System.out.println("Unique characters in \"" + str + "\": " + uniqueChars(str));
        }



    public static String uniqueChars(String str) {
        String result = "";  // this empty temporary string helps to store characters which is NOT inside

        for (int i = 0; i < str.length(); i++) {  // i: index number of str
            char each = str.charAt(i);            // each character of the string str

            if (!result.contains("" + each)) {  // if the string result does not contain the character of string yet
                                                //"" + each >>>>> means  >>>> change char method to the String


                result += each; // then we will add the character to string result one by one >>> left to right order
            }
        }

        return result;
    }


}