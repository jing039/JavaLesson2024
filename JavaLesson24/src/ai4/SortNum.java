package ai4;

import java.util.Arrays;

public class SortNum {

	public static void main(String[] args) {
		// Q3: Sort number array
		// Define the array
        int[] a = {101, 22, 345, 41, 554, 67, 79, 8, 90, 10};
        
        // Print the original array
        System.out.println("Original array: " + Arrays.toString(a));
        
        // Sort the array
        Arrays.sort(a);
        
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(a));
	}

}
