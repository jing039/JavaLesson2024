package day4;

public class SearchingElementInArray {

	public static void main(String[] args) {
		//Searching an elemnet from an array
		//Create an array
		int a[] = {10,40,20,30,60,50,90,80};
		boolean status = false; //create a status
		//Declare a number to search for 
		int searchNum = 90;
		
		for(int i=0; i<a.length; i++) {
			if(searchNum == a[i]) {
				System.out.println("Element found!");
				status = true;
				break;
			}
		}
		
		if(status == false) {
			System.out.println("Oops! Element not found.");
		}

	}

}
