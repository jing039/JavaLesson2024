package ai4;

public class RemoveCharacter {

	public static void main(String[] args) {
		// Remove Junk or Special characters from a String.

		String string = "Today is su@per hot";
		System.out.println("Orginal string is: " + string );
		System.out.println("Junk character removed string: "+ string.replace("@", ""));
		

	}

}
