package filora.week9;


public class concat2Arrays {
    //Write a return method that can concatenate two arrays
    public static void main(String[] args) {
       int[] array1 = {1, 2, 3};
       int[] array2 = {4, 5, 6};

       // Concatenate array1 and array2
       int[] concatenatedArray = concatenateArrays(array1, array2);

       // Print the result
       for (int num : concatenatedArray) {
          System.out.print(num + " ");
       }
    }
   /**
    * Concatenates two arrays.
    */
   public static int[] concatenateArrays(int[] arr1, int[] arr2) {
      int[] result = new int[arr1.length + arr2.length];

      int index = 0;
      // Copy elements from the first array
      for (int i = 0; i < arr1.length; i++) {
         result[index++] = arr1[i];
      }
      // Copy elements from the second array
      for (int i = 0; i < arr2.length; i++) {
         result[index++] = arr2[i];
      }

      return result;
   }
}