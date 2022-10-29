package Assignments;

 public class Vehicles {
	
	//Write classes that describe types of vehicles, starting from a base class and extending it
	
	int numberOfWheals; 
	String colour; 
	
	//Encapsulation 
	private String nameOfDriver;
	
	public Vehicles(int numberOfWheals,String colour ) {
		this.numberOfWheals = numberOfWheals;
		this.colour = colour;
	}
	
	
	//Polymorphism
	public void move() {
		System.out.println("It started to move.");
	}
	
	public void stop() {
		System.out.println("It stopped.");
	}
	

	//Encapsulation 
	//the get method is used to read or retrieve the value of a variable.
	public String getNameofDriver() {
		return nameOfDriver;
	}
	//the set method is used to update or allocate a value to a variable 
	public void setNameOfDriver(String newNameOfDriver) {
		nameOfDriver = newNameOfDriver;
	}
}

