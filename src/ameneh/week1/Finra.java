package ameneh.week1;

public class Finra {
    //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    //print "FIN" instead of the number and
    //for numbers which are a multiple of 5, print "RA" instead of the number.
    //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

    public static void main(String[] args) {
        printFinra();
    }

    public static void printFinra() {
        String result = " - ";
        //After printing each value (number, "FIN", "RA", or "FINRA"),
        // the code appends the string "-" using System.out.print(result);.

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {  // Check if the number is a multiple of both 3 and 5
                System.out.print( "FINRA" ); // If true, print "FINRA"

            } else if (i % 3 == 0) {        // If not, check if the number is a multiple of 3
                System.out.print( "FIN" ); // If true, print "FIN"

            } else if (i % 5 == 0) {        // If not, check if the number is a multiple of 5
                System.out.print( "RA" );  // If true, print "RA"

            } else {
                System.out.print( i );  // If the number is not a multiple of 3 or 5, print the number itself
            }

            if (i < 30) {
                System.out.print( result );
            }
             // Checks if the current value of i is less than 30.
            // If the condition is true, prints the value of the result variable, which is "-".
        }
    }
}
