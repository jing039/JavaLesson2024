package day3;

public class Switch {

	public static void main(String[] args) {
		/* conditional statements
		 * if
		 * if else
		 * switch
		 * 		
		 */
		
		
		/** switch(variable) {
		case 1:{
			// code
			break;
		}
		switch(variable) {
		case 1:{
			// code
			break;
		}
		default:
		{
			
		}
		*/
		
		int num = 11;
		switch(num) {
		case 1: {
			System.out.println("Mon");
			break;
		}		
		case 2: {
			System.out.println("Tues");
			break;
		}
		case 3: {
			System.out.println("Wed");
			break;
		}
		case 4: {
			System.out.println("Thur");
			break;
		}
		case 5: {
			System.out.println("Fri");
			break;
		}
		case 6: {
			System.out.println("Sat");
			break;
		}
		case 7: {
			System.out.println("Sun");
			break;
		}
		default:{
			System.out.println("This number is not any day of the week.");
		}
		}
		
		determineBrowser("Firefox");
	}
		
		/** Write a code using switch statement to determin which browser to be launched.
		 * 	options: Chrome, Firefox, Edge
		 * 
		 */
	
		public static void determineBrowser(String browserName) { 
		switch(browserName) {
		case "chrome": {
			System.out.println("Chrome launched.");
			break;
		}		
		case "Firefox": {
			System.out.println("Firefox launched");
			break;
		}
		case "Edge": {
			System.out.println("Edge launched");
			break;
		}
		default:{
			System.out.println("This is browser is not supported.");
		}
		
		}
		
	
		
		
		
		
		
		
				
		
		
		
	}

}
