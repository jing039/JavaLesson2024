package day6;

public class Constructor {
	String name;
	String streetName;
	int houseNumber;
	String zipCode;
	
	public Constructor(String name, String streetName, int houseNumber, String zipCode) {
		this.name = name;
		this.streetName = streetName;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
				
	}
	
	public String declareAddress() {
		return(name + "\n" + houseNumber + ", " + streetName + "\n" + zipCode);
	}

}
