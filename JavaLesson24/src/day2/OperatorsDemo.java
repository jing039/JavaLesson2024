package day2;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		int a = 20, b = 10;
		
		// Arithmetic:  +, -, *, /, %
		System.out.println("Sum of a and b is: " + (a+b));
		System.out.println("Difference of a and b is: " + (a-b));
		System.out.println("Multiplication of a and b is: " + (a*b));
		System.out.println("Dividion of a and b is: " + (a/b));
		System.out.println("Modulous of a and b is: " + (a%b));

		/* Comparison/relational: ==, !=, >, <, >=, <= 
		 returns value true or false */
		System.out.println(a>b);  //T
		System.out.println(a<b);  //F
		System.out.println(a>=b); //T
		System.out.println(a<=b); //F
		System.out.println(a==b); //F
		System.out.println(a!=b); //T
		
		// Logical: && (AND) , || (OR) , ! (NOT). Returns a boolean value & works between 2 boolean values
		System.out.println("------- Logical operators -------".repeat(3));
		boolean x = true, y = false;
		System.out.println(x&&y); //F
		System.out.println(x||y); //T
		System.out.println(!y); //T
		System.out.println(!x); //F
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
