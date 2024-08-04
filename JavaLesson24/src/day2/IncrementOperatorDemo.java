package day2;

public class IncrementOperatorDemo {

	public static void main(String[] args) {
		// Increment ++. increase by 1 number	
		int a = 10;
		a = a+1; //1)+1=11
		System.out.println(a);
				
		// Post increment(i++): if we want to use the current value, and then we want to increment the value of i by 1.
		int x = 10;
		int result = x++; // 10+0=0
		System.out.println(result);
		
		// Pre-Increment(++i): if we want to increment the value of i by 1 and then use it in our statement.
		int b = 20;
		int result2 = ++b; // 20+1=21
		System.out.println(result2);
		
		
		
	}

}
