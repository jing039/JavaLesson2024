package day2;

public class TernaryOperator {

	public static void main(String[] args) {
		// Conditional or tenary operator
		
		int age = 15;
		String result = (age>=18)? "Eligible to vote" : "Not eligible!!";
		System.out.println(result);
		System.out.println((age>=18) ? "Eligible to vote" : "Not eligible!!");
		
		int a=25, b=10;
		System.out.printf("Inital value of a%d and b%d ", a, b);
		System.out.println("Initial value of a is: " + a + " and b is:" + b);
		a=a+b; //25+10=35
		b=a-b; //35-10=25
		a=a-b; //35-25=10
		System.out.printf("Final value of a%d and b%d ", a, b);
		System.out.println("Final value of a is: " + a + " and b is:" + b);
	}

}
