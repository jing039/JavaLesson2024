package ai4;

public class SumOfElementInArray {

	public static void main(String[] args) {
		// Q1. Find sum of elements in an int Array.

		//declare array list with assigned values
		int n[] = {10, 20, 30, 40, 50};
		//initialize the 1st number to be added in the sum with 0 (we want to add starting with number 0)
		int sum = 0;
		
		/*
		 * s=0 (we start with 1st integer 10
		 * s<n.length (loop will run as long as s is less than the n array list
		 * s++ (when the above condition meets, passes and goes to next round)
		 */
		for (int s=0; s<n.length; s++ ) {
		/*
		 *sum += n[s] (sum = sum + n[s])
		 *In each iteration of the loop, the current element of the array n[s] is added to the current value of sum, 
		 *and the result is stored back in sum.	
		 */
			sum += n[s];		
		}System.out.println("The sum of the array is " + sum);

	}

}
