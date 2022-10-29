package Inheritance;

public class Employee {
	
	int salary;
	String name; 
	String workplace; 
	
	public Employee(int salary, String name, String workplace) {
		this.salary = salary;
		this.name = name;
		this.workplace = workplace; 
	}
	
	public void goingToWork() {
		System.out.println("I am going to work.");
	}

	public void leavingWork() {
		System.out.println("I am leaving work.");
	}
	
	public void takingBreaks() {
		System.out.println("I am taking a break.");
	}
}
