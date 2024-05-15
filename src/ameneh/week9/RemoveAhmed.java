package ameneh.week9;


import java.util.ArrayList;
import java.util.List;

public class RemoveAhmed {
    /*Given a list of people names: "Ahmed", "John", Eric", "Ahmed"…
    Write a java operation to remove all the names named Ahmed
    */

    public static List<String> removeAhmed(List<String> names) {
        List<String> result = new ArrayList<>();

        for (String name : names) {
            if (!name.equals( "Ahmed" )) {
                result.add( name );
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add( "Ahmed" );
        names.add( "John" );
        names.add( "Eric" );
        names.add( "Ahmed" );

        System.out.println( "Original list: " + names );

        List<String> namesWithoutAhmed = removeAhmed( names );

        System.out.println( "List after removing Ahmed: " + namesWithoutAhmed );
    }
}