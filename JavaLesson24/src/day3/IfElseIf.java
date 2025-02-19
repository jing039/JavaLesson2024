package day3;

public class IfElseIf {

	public static void main(String[] args) {
		// if result >= 90 grade A
		// if result < 90 >= 70 grade B
		// if result >=60 > 70 grade C
		// rest = grade F

		// If else If statement
//		int result = 95;
//		if(result < 100 && result >= 90) {
//			System.out.println("Grade A.");
//		}else if(result < 90 && result >=70) {
//			System.out.println("Grade B.");
//		}else if(result < 70 && result >= 60) {
//			System.out.println("Grade C.");
//		}else {
//			System.out.println("Grade F.");
//		}
		
		//Use switch statement to find day number in the week based on day week
		String dayName = "monday";
		int dayNum; 
		switch (dayName) {
        
        case "monday":
            dayNum = 1;
            break;
        case "tuesday":
            dayNum = 2;
            break;
        case "wednesday":
            dayNum = 3;
            break;
        case "thursday":
            dayNum = 4;
            break;
        case "friday":
            dayNum = 5;
            break;
        case "saturday":
            dayNum = 6;
            break;
        case "sunday":
            dayNum = 7;
            break;
        default:
            dayNum = -1; // Invalid day name
            break;
    }

    if (dayNum != -1) {
        System.out.println(dayName + " is day number " + dayNum + " of the week.");
    } else {
        System.out.println(dayNum + " is an invalid day name.");
    }
		
	}

}
