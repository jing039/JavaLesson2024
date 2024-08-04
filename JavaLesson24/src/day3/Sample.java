package day3;

public class Sample {

	public static void main(String[] args) {
		// Creating an instance of the Sample class
		Sample sample = new Sample();
		// Calling the doPrint method on the sample instance
		sample.doPrint();
		// Calling the doSum method on the sample instance and printing the result
		System.out.println(sample.doSum(7,1));
		
	}
	//Creating doPrint method
	public void doPrint() {
	}
	
	//Method to sum two integers and return the result
	public int doSum(int n1, int n2) {
		// Calculating the sum of n1 and n2
		int result = n1+n2;
        // Returning the result
		return result;
	}
}
