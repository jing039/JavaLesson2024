package day4;

public class While {
	
	public static void main(String[] args) {
		//initialization; condition/logic; increment/decrement
		System.out.println("***********Using for loop***********".repeat(2));
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("***********Using while loop***********".repeat(2));
		//Print 1-5 using while loop
		int n=1; 
		while(n<=5) {
			System.out.println(n);
			n++;
		}
		
		System.out.println("***********Using do while loop***********".repeat(2));
		//Print 1-5 using do while loop
		int nbr=1;
		do {
			System.out.println("*****John******");
			nbr++;
		}while(nbr<=5);
		
		//situation 1: Print all number except 6-10
		for(int i=1; i<=10;i++) {
			System.out.println(i);
			//keeping the code intact, excluding 6-10
			if(i==5) {
				break; //Jumping statement(jumps out of the loop)
			}
		}

		//Situation 2: Print all numbers less than 5
		System.out.println("Situation 2");
		for(int i=1; i<=10; i++) {
			if(i==5) {	
				continue; //Skip the current sequence(skip5 and continue)
			}
			System.out.println(i);	
		}
	
		
		
		
	}

}
