package ai4;

public class FindEvenAndOdd {

	public static void main(String[] args) {
		int a[] = {101, 22, 345, 41, 554, 67, 79, 8, 90, 10};
		int even = 0;
		int odd = 0;
		
		for(int var: a){
			if(var%2 == 0) {
				even++;
			}else {
				odd++;
		}
	}
		System.out.println("Number of even number is " + even);
		System.out.println("Number of odd number is " + odd);
	

	

	}

}
