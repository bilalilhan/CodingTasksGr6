package ameneh.week1;

public class OddOrEven {
    /*Write a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/

    public static void main(String[] args) {
        // Example usage:
        identify(5); // Output: Odd
        identify(6); // Output: Even
    }

    public static String identify(int number) {
        //The identify method is declared. It takes an integer parameter named number and returns a string.
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
            return "Even";
        } else {
            System.out.println(number + " is Odd");
            return "Odd";
        }
        //Inside the identify method, there is an if-else statement to check if the given number is even or odd based on the remainder when divided by 2.
    }
}
