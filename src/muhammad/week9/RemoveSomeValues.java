package muhammad.week9;


import java.util.ArrayList;
import java.util.List;

public class RemoveSomeValues {
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    public static void main(String[] args) {
        // Given list of integers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 150; i++) {
            numbers.add(i);
        }

        // Remove all values greater than 100
        List<Integer> updatedNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number <= 100) {
                updatedNumbers.add(number);
            }
        }

        // Print the updated list of numbers
        System.out.println("Numbers after removing values greater than 100:");
        for (int number : updatedNumbers) {
            System.out.print(number + " ");
        }
    }


}