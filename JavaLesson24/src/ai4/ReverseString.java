package ai4;

public class ReverseString {
	
	public static void main(String[] args) {
		
		// Reverse a string
		String orginal = "Apple";
		// Initialize an empty string to hold the reversed string
		String reversed = "";
		
		/* ooriginal.length() gives 5, so original.length() - 1 results in 4, the index of the last character.
		 * The loop starts at index 4 and decrements i until it reaches 0, thus iterating over the string in reverse. 0) */
		for(int i = orginal.length() - 1; i >= 0; i-- ) {
		/* orginal.charAt(i): When i is 4, original.charAt(4) is 'e'.
		 * reversed += original.charAt(i): Appends this character to the reversed string to elppA*/
			reversed += orginal.charAt(i);
		}
		System.out.println("The reversed string is " + reversed);
		
	}

}
