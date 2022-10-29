package Assignments;

public class Main {
	
	public static void main(String args[]) {
		
		Boat b = new Boat();
		Car c = new Car();
		Bicycle bi = new Bicycle();
		
		//Use the interfaces and the base class as types (polymorphism) and write a program that executes various actions on vehicle instances.
		
		b.moveOn();
		b.length();
		
		c.moveOn();
		c.length();
		
		bi.moveOn();
		bi.length();
		
		
	}

}
