package day5;

public class FindDayNum {

	public static void main(String[] args) {
		
		String dayName = "MONDay".toLowerCase(); //toLowerCase() accepts lower case string also.
		
		switch(dayName) {
		case "monday":{
			System.out.println("Day 1");
			break;
		}
		case "tuesday":{
			System.out.println("Day 2");
			break;
		}
		case "wednesday":{
			System.out.println("Day 3");
			break;
		}
		case "thursday":{
			System.out.println("Day 4");
			break;
		}
		case "friday":{
			System.out.println("Day 5");
			break;
		}
		case "saturday":{
			System.out.println("Day 6");
			break;
		}
		case "sunday":{
			System.out.println("Day 7");
			break;
		}
		default: {
			System.out.println("Invalide dayName.");
		}
		
	}
		
		
		
		
	}
}
