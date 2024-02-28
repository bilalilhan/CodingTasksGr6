package bilal.week5;

public class findUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/



    public static String removeSameCharacter(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char eachCharacter = str.charAt(i);

            if(result.contains(""+eachCharacter))   {  continue; }
            else {  result += eachCharacter;  }

        }

        return result;
    }


    public static void main(String[] args) {

        // "static" method benefits

        String str1= "mathematics";
        String uniqueChar1 = removeSameCharacter(str1); // Benefit-1.we can instantiate an object (if we want)
        System.out.println("uniqueChar1 = " + uniqueChar1);

        System.out.println(removeSameCharacter("abcabcdada")); //Benefit-2.we do not need to  instantiate an object
                                                                  // inside class >>> just call the method and print it

        System.out.println(findUnique.removeSameCharacter("GGGGRRR-G--6=RR>BGE6S=T->"));
                                                                // Benefit-3.outside class just call the method under the class name

                                                                // Benefit-4.Memory efficiency
                                                                // Benefit-5.most of utility class created with "static" method >>> because of Benefit-4

    }
}