package ameneh.week10;


import java.util.ArrayList;

public class arrayListSortAsc {
    //Write a method that can sort the ArrayList in Ascending order without using the sort method

        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add( 5 );
            numbers.add( 2 );
            numbers.add( 9 );
            numbers.add( 1 );
            numbers.add( 7 );

            System.out.println( "Original list: " + numbers );

            sortAscending( numbers );

            System.out.println( "List in ascending order:: " + numbers );
        }

    public static void sortAscending(ArrayList<Integer> list) {

        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get( j ) > list.get( j + 1 )) {

                    int temp = list.get( j );
                    list.set( j, list.get( j + 1 ) );
                    list.set( j + 1, temp );

                }
            }
        }
    }
}


/*
The main method initializes an ArrayList numbers with some integer values and prints the original list.
It then calls the sortAscending method passing the ArrayList numbers as an argument.
The sortAscending method iterates over the ArrayList using nested loops, comparing adjacent elements and swapping them if they are in the wrong order.
The sorted ArrayList is then printed.
Overall, the code sorts the ArrayList numbers in ascending order using the Bubble Sort algorithm.
*/