package iroda.week5;

public class findUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/
    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        for (int i = 0; i < str.length(); i++) {
            int num = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j) && i != j) {//checking if 2 characters are equal
                    num = 1;
                    break;
                }
            }
            if (num == 0) {
                System.out.println(str.charAt(i));

            }
        }





    }

}