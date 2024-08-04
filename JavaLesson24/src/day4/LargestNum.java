package day4;

public class LargestNum {

	public static void main(String[] args) {

//		int num1 = 309;
//		int num2 = 901;
//		int largest;
//
//		// Using if..else statement to determine the largest number
//		if (num1 > num2) {
//			largest = num1;
//		} else {
//			largest = num2;
//		}
//
//		// Using ternary operator to find the largest number
//        largest = (num1 > num2) ? num1 : num2;
//        System.out.println("The largest number is: " + largest);
        
        
        //Using if...else to find smallest number.
        int n1 = 1;
        int n2 = 50;
        int n3 = 100;
        int smallest; 
        
		if(n1<=n2 && n1<=n3) {
			System.out.println(n1 + " is the smallest number.");
		}else if(n2<=n1 && n2<=n3) {
			System.out.println(n2 + " is the smallest number.");
		}else{
			System.out.println(n3 + " is the smallest number.");
		}
		
		
		
		
		
		
	}
	
	

}
