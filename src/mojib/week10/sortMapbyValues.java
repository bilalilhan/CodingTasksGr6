package mojib.week10;


import java.util.*;


public class sortMapbyValues {
//Write a method that can sort the Map by values


    public static void main(String[] args) {
        // Sample unsorted map
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Apple", 5);
        unsortedMap.put("Banana", 2);
        unsortedMap.put("Orange", 8);
        unsortedMap.put("Grapes", 1);
        unsortedMap.put("Pineapple", 3);

        System.out.println("Original Map: " + unsortedMap);

        // Sort the map by values
        Map<String, Integer> sortedMap = sortByValues(unsortedMap);

        System.out.println("Sorted Map: " + sortedMap);
    }

    public static <K, V> Map<K, V> sortByValues(Map<K, V> map) {

        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                // Assuming V is Comparable
                if (o1.getValue() instanceof Comparable && o2.getValue() instanceof Comparable) {
                    Comparable<V> value1 = (Comparable<V>) o1.getValue();
                    return value1.compareTo(o2.getValue());
                }
                // Handle case when V is not Comparable
                else {
                    throw new UnsupportedOperationException("Values are not comparable");
                }
            }
        });

        Map<K, V> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
