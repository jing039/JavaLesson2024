package day5;

public class SmallestOfThree {
	
	public static void Main(String[] agrs) {
		
		//Assign values to 3 numbers, and find out the smallest
		int a = 89, b = 67, c = 37, smallest;
		//Compare a & b, then extract the smallest
		int temp = (a<b)? a:b;
		//Compare temp with c and store the result in 'smallest' variable
		smallest = (c<temp)? c:temp;
		
		System.out.println("The smallest number is " + smallest);
		
		//More concise way to compare
		smallest = c<(a<b?a:b)?c:(a<b?a:b);
		System.out.println("The smallest number is " + smallest);
		
	}

}
