package day2;

public class DecrementOperatorDemo {

	public static void main(String[] args) {
		// Decrement --. decrease by 1 number

		int a = 100;
		a = a - 1;
		System.out.println(a);

		// Post decrement
		int b = 100;
		int result = b--; 
		System.out.println(result); // 100-0=100
		System.out.println(b); // 100-1=99

		// Pre decrement
		int c = 100;
		int result2 = --c; // 100 = 100-1=99
		System.out.println(result2); // 99 = 100-1=99

	}

}
