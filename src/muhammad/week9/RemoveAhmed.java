package muhammad.week9;


import java.util.ArrayList;
import java.util.List;

public class RemoveAhmed {
    /*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
    */
    public static void main(String[] args) {
        // Given list of names
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");

        // Remove all occurrences of the name "Ahmed"
        List<String> updatedNames = new ArrayList<>();
        for (String name : names) {
            if (!name.equals("Ahmed")) {
                updatedNames.add(name);
            }
        }

        // Print the updated list of names
        System.out.println("Names after removing Ahmed:");
        for (String name : updatedNames) {
            System.out.println(name);
        }
    }

}