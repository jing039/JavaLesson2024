package day3;



public class ai2_6 {

	public static void main(String[] args) {
		int cel = celValue(22); // Convert 22�C to Fahrenheit
		System.out.println("The celcius temperature is: " + cel);
	}
	
	public static int celValue(int c) { // Method to convert Celsius to Fahrenheit
		int f;
		f =((c * 9)/5) + 32; // Formula for convertion
		return f; // Returning the Fahrenheit value
	}
		
		

	

}
