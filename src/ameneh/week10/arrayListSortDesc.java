package ameneh.week10;


import java.util.ArrayList;

public class arrayListSortDesc {
    //Write a method that can sort the ArrayList in descending order without using the sort method


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add( 5 );
        numbers.add( 2 );
        numbers.add( 8 );
        numbers.add( 1 );
        numbers.add( 9 );

        System.out.println( "Before sorting: " + numbers );

        sortDesc( numbers );

        System.out.println( "After order: " + numbers );
    }


    public static void sortDesc(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get( i ) < list.get( j )) {

                    int temp = list.get( i );
                    list.set( i, list.get( j ) );
                    list.set( j, temp );

                }
            }
        }
    }
}

/*
This code defines a method sortDesc that sorts an ArrayList of Integers in descending order without using the built-in sort method. It does so by iterating through the list and comparing elements pairwise, swapping them if they're out of order. The main method demonstrates its usage by creating an ArrayList of integers, printing it before sorting, sorting it in descending order using the sortDesc method, and then printing it again to show the sorted order.
*/