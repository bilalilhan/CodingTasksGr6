package ameneh.week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        int input = -35;
        int reversedNumber = reverseNegativeNumber(input);
        System.out.println("Input: " + input);
        System.out.println("Reversed Output: " + reversedNumber);
    }

    public static int reverseNegativeNumber(int number) {
        int positiveNumber = Math.abs(number);

        String numberAsString = Integer.toString(positiveNumber);

        String reversedString = new StringBuilder(numberAsString).reverse().toString();

        int reversedNumber = Integer.parseInt(reversedString);

        if (number < 0) {
            reversedNumber = -reversedNumber;
        }

        return reversedNumber;
    }
}
