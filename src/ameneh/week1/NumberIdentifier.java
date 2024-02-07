package ameneh.week1;

public class NumberIdentifier {
    public static void identify(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        identify(5); // Output: Odd
        identify(6); // Output: Even
    }
}
