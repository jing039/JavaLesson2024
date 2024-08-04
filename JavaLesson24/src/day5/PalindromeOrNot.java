package day5;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int original = 11211, reverse = 0;
		System.out.println("The orginal number is " + original);
		int number = original;
	
		while(number !=0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number/10;
		}
		System.out.println("The reverse number is " + reverse);
		
		if(original == reverse) {
			System.out.println("It is palindrome.");
		}else {
			System.out.println("Not a palindrome.");
		}
		
		
	}

}
