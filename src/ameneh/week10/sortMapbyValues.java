package ameneh.week10;


import java.util.*;

public class sortMapbyValues {
//Write a method that can sort the Map by values

    public static <K, V extends Comparable<? super V>> Map<K, V> sortMapByValues(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>( map.entrySet() );

        Collections.sort( list, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return o1.getValue().compareTo( o2.getValue() );
            }
        } );

        Map<K, V> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            sortedMap.put( entry.getKey(), entry.getValue() );
        }

        return sortedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put( "apple", 5 );
        unsortedMap.put( "banana", 2 );
        unsortedMap.put( "orange", 8 );
        unsortedMap.put( "grape", 3 );
        unsortedMap.put( "kiwi", 6 );

        System.out.println( "Unsorted Map: " + unsortedMap );

        Map<String, Integer> sortedMap = sortMapByValues( unsortedMap );

        System.out.println( "Sorted Map by Values: " + sortedMap );
    }
}

/*
This Java code defines a method sortMapByValues that sorts a given Map by its values in ascending order. It utilizes a LinkedList to store entries of the map, sorts them using a custom comparator based on the values, and then reconstructs a LinkedHashMap with the sorted entries. The main method demonstrates its usage by creating an unsorted map of strings and integers, sorting it by values, and printing both the unsorted and sorted maps.
*/

