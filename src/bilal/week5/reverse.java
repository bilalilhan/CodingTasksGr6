package bilal.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

    public static void main(String[] args) {

        String str1 = "Hello"; // can be a word
        String reversed1 = reverse_AsIs(str1);
        System.out.println("Reversed string for \"" + str1 + "\":      " + reversed1);

        System.out.println("-----------------------------------------------");

        String str2 = "123456"; // can be a number
        String reversed2 = reverse_AsIs(str2);
        System.out.println("Reversed string for \"" + str2 + "\":      " + reversed2);


        System.out.println("-----------------------------------------------");

        String str3 = "ey edip adanada pide ye"; // can be a sentences
        String reversed3 = reverse_AsIs(str3);
        System.out.println("Reversed string for \"" + str3 + "\":     " + reversed3);

        System.out.println("-----------------------------------------------");

        System.out.println(reverse_AsIs("inside the class")); // can use inside the class

        System.out.println("-----------------------------------------------");

        System.out.println(reverse.reverse_AsIs("We do not need to instantiate an object, outside of class")); // can use outside the class
        // Because our method is "static">>>class name and method name is enough to print it.



    }

    public static String reverse_AsIs(String anything) {
        String reverse = ""; //reversed string will be constructed(stored).

        for (int i = anything.length() - 1; i >= 0; i--) {
            reverse += anything.charAt(i); // it appends each character from the input "String anything", starting from the last character and moving towards the first, to the reverse string.
        }

        return reverse;

    }


}
