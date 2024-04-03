package Vidya.week9;
/*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
*/

import java.util.ArrayList;

public class RemoveAhmed {
    public static void main(String[] args) {
        try1();

    }

    public static void try1()
    {
        ArrayList<String> names= new ArrayList<>();
//        "Ahmed", "John", Eric", "Ahmed"
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");

        names.add("Ahmed");

        System.out.println(names);

        names.removeIf(p-> p.equalsIgnoreCase("Ahmed"));
        System.out.println(names);



    }



}