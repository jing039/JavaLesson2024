package day6;

public class MethodDemo {

	//No params and no return
	
	public void methodOne() {
		System.out.println("Hey, we are learning method!");
	}
	
	//No params and returns values
	public String methodTwo() {
		String a = "Hello";
		String b = "Wasup";
		return a+ b;
	}
	
	//Takes params but no returns
	public void methodThreee(String name) {
		System.out.println(name + ", heyyyy.");
	}
	
	//Takes params and returns values
	public int add(int a, int b) {
		return(a+b);
	}
}
