package mojib.week10;


import java.util.ArrayList;

public class arrayListSortAsc {
    //Write a method that can sort the ArrayList in Ascending order without using the sort method


        public static void main(String[] args) {







            ArrayList<Integer> numbers = new ArrayList<>();

            // Add elements to the ArrayList
            numbers.add(5);
            numbers.add(2);
            numbers.add(8);
            numbers.add(1);
            numbers.add(3);

            // Sort the ArrayList in ascending order
            arrayListSortAscMethod(numbers);

            // Print the sorted ArrayList
            System.out.println("Sorted ArrayList in ascending order: " + numbers);
        }

    public static void arrayListSortAscMethod(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {  // whcih mean arr.length-1
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }
}





