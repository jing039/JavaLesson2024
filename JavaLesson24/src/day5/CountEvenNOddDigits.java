package day5;

public class CountEvenNOddDigits {

	public static void main(String[] args) {
		
		//Count # of even number in a number.
		int n = 251, oddCnt = 0, evenCnt = 0;
		while(n > 0) {
			int digit = n % 10;
			if(digit % 2 == 0) {
				evenCnt ++; 
			}else {
				oddCnt ++; 
			}
			n /= 10;
		}
		System.out.println("Even count is " + evenCnt);
		System.out.println("Odd count is " + oddCnt);
		
		
		
		
	}
}
