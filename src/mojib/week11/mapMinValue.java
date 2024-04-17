package mojib.week11;


import java.util.Map;

public class mapMinValue {
//Write a method that can return the minimum value from a map (DO NOT use sort method)


    public static <K, V extends Comparable<V>> V getMinimumValue(Map<K, V> map) {
        // Check if the map is empty
        if (map.isEmpty()) {
            throw new IllegalArgumentException("Map is empty");
        }

        // Initialize the minimum value as the first value in the map
        V minValue = null;
        boolean firstIteration = true;

        // Iterate through the map to find the minimum value
        for (V value : map.values()) {
            if (firstIteration || value.compareTo(minValue) < 0) {
                // If it's the first iteration or the current value is less than the minimum value
                minValue = value; // Update the minimum value
                firstIteration = false; // Update firstIteration flag
            }
        }

        return minValue;
    }

    public static void main(String[] args) {



        // Example usage
        Map<String, Integer> sampleMap = Map.of("A", 10, "B", 5, "C", 20);
        Integer min = getMinimumValue(sampleMap);
        System.out.println("Minimum value in the map: " + min);
    }
}


}