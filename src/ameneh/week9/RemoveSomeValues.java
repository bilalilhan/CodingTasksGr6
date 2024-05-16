package ameneh.week9;


import java.util.ArrayList;
import java.util.List;

public class RemoveSomeValues {
    //Given a list of Integers 1, 2, 3, 4, 5, 6 …etc. remove all values greater than 100.

    public static List<Integer> removeValuesGreaterThan100(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number <= 100) {
                result.add( number );
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 150; i++) {
            numbers.add( i );
        }

        System.out.println( "Original list: " + numbers );

        List<Integer> filteredNumbers = removeValuesGreaterThan100( numbers );

        System.out.println( "List after removing values greater than 100: " + filteredNumbers );
    }
}
