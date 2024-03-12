package Vidya.week4;

/*
Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
*/

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.print(foc7("Cydeo is the best place to be for IT career jump start") +"\n\n");
        System.out.print(foc7("jhyiaaiwdjcocihakjdhafsa") +"\n\n");
        System.out.print(foc7("aaabbcdduuuuvvvvvvvvvvvvv") +"\n\n");
        System.out.print(foc7("AAAABBBNNNN") +"\n\n");
        System.out.print(foc7("aaaaSSSScfwwwwDD"));

    }

    public static String foc7(String str)
    {
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] charFreq = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String result= "";
        str = str.trim(); str= str.toLowerCase();
        /*int l = str.length();
        System.out.println("Checking string = " +str);
        char ch;*/
        for (int i= 0; i< str.length(); i++)
        {
//            ch = str.charAt(i);
            for (int j = 0; j< alpha.length; j++)
            {
                if (str.charAt(i)== alpha[j])
                    charFreq[j]++;
            }
        }
        System.out.println("Char- Freq");
        for (int i= 0; i< alpha.length; i++)
        {
            if (charFreq[i] != 0)
            {
//                System.out.println(alpha[i] + "-\t" + charFreq[i]); OR
                result+= (alpha[i] + "- " + charFreq[i] +"\t");
            }
        }
        return result;
    }

}