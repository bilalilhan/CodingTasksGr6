package mojib.week4;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/


    public static void main(String[] args) {

       String result= removeDup("AAABBBCCCDDEE");

        System.out.println(result);

        System.out.println(     removeDup("WWWXXXYYYZZZ")    );
    }


    public static String removeDup(String str1) {
        String noneDup = "";

        str1.split("");
        for (String each : str1.split("")) {
            if (noneDup.contains(each)) {
                continue;
            } else {
                noneDup += each;
            }
        }
        return noneDup;
    }



}


