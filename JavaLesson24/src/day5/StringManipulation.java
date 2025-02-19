package day5;

public class StringManipulation {

	public static void main(String[] args) {
		// Strings are immutable - can not be changed
		
		String s = "Welcome123"; //String literal
		String s2 = new String("Welcome"); //through string object
		
		//Length() -- count all the characters in a string and returns the number
		int length = s2.length();
		System.out.println("The length is " + length); //count length of s2. (7 characters)
		System.out.println(s.length()); //count length of s. (10 characters)
		
		
		//Concat() -- join multiple strings
		String s1 = "Welcome";
		String s3 = " to java";
		String s4 = " programming";
		System.out.println((s1+s3));
		System.out.println(s1.concat(s3).concat(s4));
		
		//trim() -- trim any leading trailing spaces from a string
		s = "		welcome to java		";
		System.out.println(s.length());
		s.trim();
		System.out.println(s.trim().length());
		
		//charAt() -- return a single character out of a string from a specific index
		//index starts from 0
		s = "Java Selenium";
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(5));
		
		//contains() -- returns a boolean(true/false)
		//check if a string is the part of the main string or not
		System.out.println(s.contains("Jav"));	//T
		System.out.println(s.contains("Sel"));	//T 
		System.out.println(s.contains("ium"));	//T
		System.out.println(s.contains("Sli"));	//F
		System.out.println(s.contains("a S"));	//T
		
		//equals(), equalsIgnoreCase() -- compares 2 strings and returns true/false
		s1 = "Welcome";		
		s2 = "Welcome";
		System.out.println(s1.equals("WELCOME")); //F
		System.out.println(s1.equals("Welcome")); //T
		
		//replace() -- replaces a single character or character sequence of a given string
		s = "welcome to java selenium automation";
		System.out.println(s.replace("w", "W"));
		System.out.println(s.replace("java", "python"));
		
		//subString() -- extracts substring from the main string
		System.out.println(s.substring(11)); // shows: java selenium automation
		System.out.println(s.substring(11,15)); //cut out everything before 11 and after 15, only shows string inbetween 11 and 15. (java)
		
		//toUpperCase(),toLowerCase() -- convert cases
		s="Welcome";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//split() -- split or divide orginal string into multiple parts absed on delimiter
		s="abc@xyz";
		String a[] = s.split("@"); //takes out @ in the string
		System.out.println(a[1]); //prints the 2nd part of the string" xyz.(index starts with 0-first string is abx, 1-second string is xyz) 
		s = "welcome to java selenium automation";
		String b[] = s.split(" ");
		System.out.println(b[3]); //split the text, only shows the 3rd string characters: selenium
		
		s="welcom to java selenium sutomation";
		System.out.println(s.replace(" ", "_")); //replaces space with _
		//extract only abc from the following string
		s = "abc,123@m.com";
		String[] c = s.split(","); //takes out ,
		System.out.println(c[0]); //prints the 1st part of the string: abc
			
		
		
		
		
		
		
	}
	

}
