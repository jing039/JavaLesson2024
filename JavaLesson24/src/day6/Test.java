package day6;

public class Test {

	public static void main(String[] args) {
		// create an object of Student class and save it under a reference variable
		Student student1 =  new Student();
		student1.sid = 1204;
		student1.name = "RJ";
		student1.grade = 'A';
		student1.printStudentData();
		
		String s = new String("Welcome");
		s.length(); 
		String Updated = s.replace("W", "x");
		System.out.println(Updated);

		Employee emp1 = new Employee();
		emp1.eid = 309;
		emp1.name = "Shooky";
		emp1.department = "Cooking";
		emp1.salary = 7000000;
		emp1.display();
	
		/* new Employee().name = "Mang"; 
		new Employee().eid = 218;
		new Employee().department = "Human Resource";
		new Employee().salary = 7000000; 
		new Employee().display(); shows 0,null,null,0 */
	}

}
