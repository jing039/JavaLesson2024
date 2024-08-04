package ai4;

public class FindLargestAndBiggest {

	public static void main(String[] args) {
		// Find Max and Min Number in an array
		// Define the array
		int[] a = {101, 22, 345, 41, 554, 67, 79, 8, 90, 10};

		// Initialize the largest and smallest variables
		// initialized to the 1st element of the array (a[0]), assuming 1st nbr is largest/smallest.
		int largest = a[0];
		int smallest = a[0];

		// Loop through the array
		for (int i = 1; i < a.length; i++) {
			// checks if the current element (a[i]) is greater than the current value of largest.
			if (a[i] > largest) {  
			/* If the condition is true, then the current element (a[i]) is assigned to largest. 
			This means that largest is updated to the new highest value found. */
				largest = a[i];
			}  if (a[i] < smallest) { 
                smallest = a[i];
			}

		}
		// Print the largest and smallest values
		System.out.println("Largest number in the array is: " + largest);
		System.out.println("Smallest number in the array is: " + smallest);
	}
	
//	public class MaxMin{
//		  int[] arr = { 1, 2, 3, 4, 5 };
//	        int N = arr.length;
//
//	        int mini = arr[0];
//	        int maxi = arr[0];
//
//	        for (int i = 0; i < N; i++) {
//	            if (arr[i] < mini) {
//	                mini = arr[i];
//	            } else if (arr[i] > maxi) {
//	                maxi = arr[i];
//	            }
//	        }
//
//	        System.out.println("Maximum is: " + maxi);
//	        System.out.println("Minimum is: " + mini);
//	}
//	}
	
}
