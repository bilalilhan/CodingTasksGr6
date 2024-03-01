package Rubinah.week4;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str ="AAABBCDD";// I have code with 8 ch,I should get this fre A3B2C1D2

        String result ="";
        //I created this  empty string to store the final  ch A3B2C1D2 output on this result
       // first get this fer 3 2 1 2  and then get ch  A B C D connect each other
        // and get this result  A3B2C1D2.


        for(int j =0; j<str.length(); j++) {
         // this loop help me  find index 0, until the last index this repeat
            char ch = str.charAt(j);
            //this variable give the fre first ch
            // and then the loop execute for second time it will site the zero
            int count = 0;

            //this loop it can find the second ch
            for (int i= 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            // continue method only accept string
            if(result.contains(""+ch)){ //if the ch is already included in the result
                continue;//skip that ch
            }
                     //a
             result += ch + "" + count;
            // I connect empty string, for give  string at end
        }
        System.out.println(result);
    }
}
 /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/